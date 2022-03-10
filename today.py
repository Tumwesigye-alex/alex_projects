import math
import sys
def area_of_circle():
    try:
       rad=float(input("Enter the radius of the circle\n"))
       z=math.pi*rad**2
       print(f"The area of the circle is \t {z}")
    except:
        print("Invalid entry")



def area_of_rectangle():
    try:
       leng=float(input("Enter the  of the length of the rectancle\n"))
       wid=float(input("Enter the width of the rectanglr\n"))
       reca=leng*wid
       print(f"The area of the circle is \t {reca}")
    except:
        print("Invalid entry")

def volume_of_box():
    try:
        length=float(input("Enter the length of the box\n"))
        width=float(input("Enter the width of the box\n"))
        height=float(input("Enter the length of the box\n"))
        vbox=length*width*height

        print(f"The volume of the box is \t{vbox}")
    except:
        print("Invalid entry")
        
def volume_of_sphere():
    try:
        q=4/3
        radii=float(input("Enter the radius of the sphere\n"))
        
        asphere=q*radii**3

        print(f"The volume of the sphere is \t{asphere}")
    except:
        print("Invalid entry")
        
        
def main():
    print("**********************Welcome to the Geometry solver******************** \n")
    print("**********************Which geometric calculation do you want to solve******************** ")
    print("1). Calculate the area of a circle")
    print("2). Calculate the area of the rectangle")
    print("3). Calculate the volume of the box")
    print("4). Calculate the area of a circle")
    print("x). Exit")
    choice=int(input("Tell us what you really want us to calculate for you\n>>>>>>>>>>\t"))
    
    if choice==1:
        area_of_circle()
    elif choice==2:
        
        area_of_rectangle()
    elif choice==3:
        volume_of_box()
    elif choice==4:
        volume_of_sphere()
    elif choice==x:
        exit()
    else:
        
        print("Invalid  input")

while True:
    main()
