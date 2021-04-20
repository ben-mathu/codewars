class HouseNumbering:
    def prepareDigits(self, firstHouse, numberOfHouses):
        digits = [0,0,0,0,0,0,0,0,0,0]
        for i in range(firstHouse, firstHouse + (numberOfHouses * 2), 2):
            number = list(str(i))
            for x in number:
                digits[int(x)] += 1
        print(digits)
        return digits
        
h = HouseNumbering()
h.prepareDigits(1, 9)
