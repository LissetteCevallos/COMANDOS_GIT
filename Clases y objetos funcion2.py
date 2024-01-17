class Celular:
     def __init__(self,marca,modelo,camara):
        
        #metodo constructor
          self.marca = marca
          self.modelo = modelo       
          self.camara = camara 
          
     def llamar(self): #en el parentesis se pone la referencia del objeto
        print(f'Estas haciendo un llamado desde un : {self.modelo}')# self ponemos para hacer el llamado de nuestro objeto . el objeto self siempre hace referencia
              
     def cortar(self):
        print (f'Cortaste la llamada desde tu :{self.modelo}')

#creamos dos objetos
celular1 = Celular("Samsung","S23","48MP")
celular2 = Celular("Apple","iPhone 15 Pro","98MP")

print(celular2.llamar())