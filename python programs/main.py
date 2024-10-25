'''
this a smimple calcutor
this 
lalal
kakka
'''
# print(x)
print("This is  Calculator")
num1= int(input("input variable first: "))
num2= int(input("input variable second: "))
opt= input("choose your operator(+, -, *, /): ")
if opt == "+": #we have run a loop here
    print(f"Sum of {num1} + {num2} = {num1+num2}")
elif opt == "-":
    print(f"Diffrence of {num1} - {num2} = {num1-num2}")
elif opt == "*":
    print(f"Product of {num1} * {num2} = {num1*num2}")
elif opt == "/":
    print(f"Division of {num1} / {num2} = {num1/num2}")
else:
    print("[!] Invalid Opreater")
