# python program to find prime oor composite number 
#  prime is 2,3,5,7,11 etc.
# composite is 4,6,8,9 etc.
num=int(input("Enter the no.="))
count=0
i=1
while i<=num:
    if num%i==0:
        count=count+1
    i=i+1
if count==2:
    print(" Its a Prime No.:")
elif count>2:
    print("Its  Composite No.")
else:
    print("The number is neither Prime nor Composite")

