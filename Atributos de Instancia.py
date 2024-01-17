class Celular:
     def __init__(self,marca,modelo,camara):
        #constructor
        #self.marca = marca + "Hola" definimos aqui la propiedad del objeto
          self.marca = marca
          self.modelo = modelo       
          self.camara = camara 

#creamos dos objetos
celular1 = Celular("Samsung","S23","48MP")
celular2 = Celular("Apple","iPhone 15 Pro","98MP")

#llamamos a sus propiedades
print(celular1.marca)
print(celular2.marca)