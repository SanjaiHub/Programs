print("This is Calculator")
Ram= int(input("input first variable="))
Syam= int(input("input second variable="))
op= input("Choose operator")
if op == "+":
  print(f"sum of{Ram} + {Syam} = {Ram+Syam}")    
elif op == "-":
  print(f"Substract of{Ram} - {Syam} = {Ram-Syam}")
elif op == "*":
  print(f"multiply of {Ram} * {Syam} = {Ram*Syam}")
elif op == "/":
  print(f"divide of {Ram} / {Syam} = {Ram/Syam}")

