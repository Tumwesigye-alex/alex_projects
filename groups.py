f=open("numbers.txt","r+")
# we can write into the file and edit and also creates a new file and it overrides any method existing with the same name

content=f.readlines()
sum=0
for ben in content:
   print(ben,end="")
   n=int(ben)
   sum=sum+n
print(f"The sum is {sum}")

f.close()
"""

with open("numbers.txt", "r") as f:
    for line in f:          # simpler loop
        print(line.strip())
        count=0;
        try:
            # move this inside the loop
            
            count=count+int(line)
        except Exception as err: # you may only want to catch ValueErrors here
            print(err)

    print(count
"""
