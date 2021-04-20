// Counters A, B and C same size 5

// if same size refer to any of the counters
// otherwise refer to one with min size
// refer customer to any one counter of two with min size
// if all full customer should wait 

#include <iostream>
#include <stdlib.h>
#include <algorithm>
#include <map>
#include <time.h>
#include <queue>

using namespace std;

class CountersManager
{
    private:
        map<int, queue<int>> counterMap;
        queue<int> waitQueue;
        int customerCount = 0;
    public:
        int findQueueWithMinSize();
        int getTicketNumber(int ticketNumber);
        void handleCustomerAdditionToQueues(int index, int ticketNumber);
        void manageQueues();
        CountersManager();
        ~CountersManager();
};

CountersManager::CountersManager()
{
    queue<int> counter;
    queue<int> counter2;
    queue<int> counter3;
    counterMap.insert(pair<int, queue<int>>(1, counter));
    counterMap.insert(pair<int, queue<int>>(2, counter2));
    counterMap.insert(pair<int, queue<int>>(3, counter3));
}

CountersManager::~CountersManager() {}

void CountersManager::handleCustomerAdditionToQueues(int index, int ticketNumber)
{
    counterMap.at(index).push(ticketNumber);
}

int CountersManager::getTicketNumber(int ticketNumber)
{
    if (ticketNumber == 6000)
    {
        return 1111;
    } else {
        return ++ticketNumber;
    }
}

int CountersManager::findQueueWithMinSize()
{
    int index = 1;
    int sizeTemp = counterMap.at(1).size();
    int numberOfQueuesFull = 0;
    for (int i = 1; i <= 3; i++)
    {
        int size = counterMap.at(i).size();
        if (size < sizeTemp && size != 5)
        {
            sizeTemp = counterMap.at(i).size();
            index = i;
        }
        else if (size == 5)
        {
            ++numberOfQueuesFull;
        }
    }

    if (numberOfQueuesFull == 3)
    {
        numberOfQueuesFull = 0;
        return 0;
    }
    
    return index;
}

void CountersManager::manageQueues()
{
    int inputCode;
    int ticketNumber = 1110;
    for (int i = 0; ; i++) {
        cout << "Select one of the options bellow:" << endl;
        cout << "\t 1. Get ticket." << endl;
        cout << "\t 2. Print Customer ticket." << endl;
        cout << "\t 0. Exit." << endl;

        cin >> inputCode;

        if (inputCode && inputCode == 1)
        {
            int index = findQueueWithMinSize();
            if (waitQueue.size() > 0)
            {
                if (index != 0)
                {
                    int waitTicket = waitQueue.front();
                    handleCustomerAdditionToQueues(index, waitQueue.back());
                    waitQueue.pop();
                }
                
            }
            
            ticketNumber = getTicketNumber(ticketNumber);
            
            // get min size and add user to queue with ticket
            index = findQueueWithMinSize();
            if (index != 0)
            {
                // pick a random queue and simulate customer service completion
                handleCustomerAdditionToQueues(index, ticketNumber);
            }
            else
            {
                waitQueue.push(ticketNumber);
            }

            // pick a random queue and simulate customer service completion
            if (customerCount > 15)
            {
                srand(time(0));
                int genIndex = rand() % 3 + 1;
                counterMap.at(genIndex).pop();
                --customerCount;
            }
            else
            {
                ++customerCount;
            }
        }
        else if (inputCode == 2)
        {
            for (int i = 1; i <= 3; i++)
            {
                if (counterMap.at(i).size() == 0)
                {
                    cout << "Queue: " << i << " is empty." << endl;
                }
                else
                {
                    cout << "Queue: " << i << " Number of customers left: " << counterMap.at(i).size() << endl;
                }
            }
            cout << endl;
            cout << "Number of cutomers in waiting queue: " << waitQueue.size() << endl;
            cout << endl;
        }
        else if (inputCode == 0) {
            break;
        }
        else
        {
            cout << "\nInvalid input!" << endl;
            cout << endl;
        }
        
    }
}

int main(int argc, char const *argv[])
{
    // customers take tickets to for empty queues initially
    // customers later take tickets for queues with min size
    // simulate time of service to random time between 5 - 10 seconds,
    // then customers whose services have been completed leave a counter to assign another customer

    CountersManager* cm = new CountersManager;
    cm->manageQueues();
    return 0;
}

