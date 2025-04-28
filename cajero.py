saldo_inicial = 1000
print (" 1. ingresar dinero en la cuenta")
print (" 2. retirar dinero de la cuenta ")
print (" 3. mostra saldo disponible ")
print (" 4. salir")


for opcion in range (4) :
    opcion = int(input("digite un opcion del menu: "))  
    if opcion == 1:
        extra = float(input("digite el saldo a ingresar: "))
        saldo_inicial += extra 
        print (f"el saldo actual es {saldo_inicial}")
    elif  opcion == 2:
        retiro = float(input("digite el monto a retirar: "))
        if retiro > saldo_inicial:
            print ("saldo insuficiente")
        else :
            saldo_inicial -= retiro
            print (f"dinero en la cuenta {saldo_inicial}")
    elif opcion == 3:
        print (f"el saldo es {saldo_inicial}")
    elif opcion == 4 :
        print ("gracias")
        break
    else : 
        print ("error")

    

