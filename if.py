"""
num1=10
num2=20
num3=25
if num1 > num2 and num2 < num3:
    print("Its true the first number is lesser than the second number")
else:
    print("Waaaa You are just lieing")

name = "My favorite name is Rwakibi kindi"
 
if "kindi" in name:
     print("Smile you are a liar")


#syntanx for if else
if <condition>:
    statement
else:
    statement
"""
print("********** QUIZ GAME *********")
question="What is the longest mountain  in Uganda"
print(question)
print("1.Mount Rwenzori\n2. Mount Elgon\n3. Mount Moroto\n4.Mount Mufumbiro")

answer="Rwenzori"
choice=input("Enter your answer\n\n")

if choice.lower() == answer.lower():
    print(f"Wawoo Your {choice} is correct")
else:
    print(f"Sorry your {choice} is wrong")

question1="Who discovered the source of the Nile"
print(question1)
print("1.John Speke\n2. Alex Tumwesigye\n3. Mweru Brian\n4.Ludwig Krapf")

answer1="John Speke"
choice1=input("Enter your answer\n\n")

if choice1.lower() == answer1.lower():
    print(f"Wawoo Your {choice1} is correct")
else:
    print(f"Sorry your {choice1} is wrong")

