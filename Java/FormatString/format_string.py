def namelist(names):
    length = len(names);
    name = ""
    for i in range(length):
        if (i == length - 2):
            name += names[i].get('name') + " & "
        else:
            if (i == length - 1):
                name += names[i].get('name')
            else:
                name += names[i].get('name') + ", "
    print(name)
    return name

namelist([{'name': 'Bart'},{'name': 'Lisa'},{'name': 'Maggie'},{'name': 'Homer'},{'name': 'Marge'}])