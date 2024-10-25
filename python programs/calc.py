#this is a calculator
num1=int(input("Enter the No. 1:"))
num2=int(input("Enter the No. 2:"))
op=input("Enter the Operator:")
if op=='+':
    print(f"addition is {num1+num2}")
elif op=='-':
    print(num1-num2)
elif op=='*':
    print(num1*num2)
elif op=='/':
    print(num1/num2)
elif op=='%':
    print(num1%num2)
else :
    print('invalid')





