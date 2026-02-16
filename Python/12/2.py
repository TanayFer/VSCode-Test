def data(id="NULL", name = "NULL" , sal = 0):
    print("===========User Data===========")
    print(f"ID : {id}")
    print(f"Name : {name}")
    print(f"Salary : {sal}")

#Default
data("56")

#Keyword
data(id = "56", name="Tanay", sal=125000)

#Positional
data(56 , "Tanay" , 125000)
