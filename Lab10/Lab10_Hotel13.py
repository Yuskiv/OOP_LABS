import csv
print ("Print: 'help()'")
def help():
    print("help()\nregistration()\nopen()")
def registration():
    print("Best Hotel In The World!")
    print("Please, enter your ID info")
    name = input("Ім'я: ")
    born = input("Дата народження: ")
    number = input("ID номер: ")
    print()
    print("Коли ви приїжджаєте та від'їжджаєте?")
    arrival = input("Приїзд: ")
    depar = input("Від'їзд: ")
    print()
    clas = input("Який номер Ви бажаєте: 'Standart' чи 'Royal'? ")
    people = input("Скільки Вас буде: ")
    print()
    print("І на кінець, скажіть, будь ласка, чому ви обрали 'Best Hotel In The World!'?")
    why = input()
    
    hotel = {'ID': {'Name': name, 'Birthday' : born, 'ID number': number},
             'Arrival': arrival, 'Departure': depar, 'Room': clas, 'People':people,
             'Why?': why}
    print(hotel.items())
    with open('test.txt', 'w') as file:
        file.write("Name: ")
        file.write(name)
        file.write("\nBirthday: ")
        file.write(born)
        file.write("\nID number: ")
        file.write(number)
        file.write("\nArrival: ")
        file.write(arrival)
        file.write("\nDeparture: ")
        file.write(depar)
        file.write("\nRoom: ")
        file.write(clas)
        file.write("\nPeople: ")
        file.write(people)
        file.write("\nWhy?: ")
        file.write(why)
        file.write("\n")
def toString():
    f = open('test.txt')
    for line in f:
        print(line, end = "")
def add(x):
    with open('test.txt', 'a') as file:
        file.write(x)
def clear():
    with open('test.txt', 'w') as file:
        file.write('')
def remove(x):
    f = open("test.txt","r+")
    d = f.readlines()
    f.seek(0)
    for i in d:
        if i != x:
            f.write(i)
    f.truncate()
    f.close()
    

