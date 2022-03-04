import sys
import math


def area_of_circle():
    try:

        a=float(input("Enter the radius of the circle"))
        area=math.pi**2
    
        print(f"The area of the circle is\t{area}\n")
    except:
        print("Wrong choice ")

    
def area_of_rectangle():
    try:


        b=float(input("Enter the length of the rectangle"))
        c=float(input("Enter the width of the rectangle"))
        rect=b*c
    
        print(f"The area of the rectangle is \t{rect}\n")
    except:
        print("Invalid  input")
    
def volume_of_box():
    try:
        print("Lets calculate the volume of a box")
    
        d=float(input("Enter the length of the box"))
        e=float(input("Enter the width of the box"))
        b=float(input("Enter the height of the box"))
        volume=d*e*b
    
        print(f"The volume of the box is\t {volume}")

    except:
        print("Invalid  input")
        
    
def area_of_sphere():
    

    print("Lets calculate volume of the sphere together")
    radius=float(input("Enter the radius of the sphere")
        
    
       # print(f"The volume of the sphere is \t{sphere}")
    
    
    
def Exit():
    sys.exit("You have exited")
    
    
    
def main():
    print("**********************Welcome to the Geometry solver******************** ")
    print("1. Calculate the area of a circle")
    print("2. Calculate the area of the rectangle")
    print("3. Calculate the volume of the box")
    print("4. Calculate the area of a circle")
    print("5. Exit")
    choice=int(input("Tell us what you really want us to calculate for you\n>>>>>>>>>>\t"))
    
    if choice==1:
        area_of_ircle()
    elif choice==2:
        
        area_of_rectangle()
    elif choice==3:
        volume_of_box()
    elif choice==4:
        volume_of_sphere()
    elif choice==5:
        sys.exit(0)
    else:
        
        print("Invalid  input")

while True:
    main()