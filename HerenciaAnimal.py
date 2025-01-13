class Animal:
    def __init__(self, nombre):
      self.nombre = nombre

    def hacerSonido(self):
      print('Hace un sonido')

class Vaca(Animal):
    def __init__(self, nombre, apellido):
      self.apellido = apellido
      super().__init__(nombre)

    def imprimirCaracteristica(self):
        print('La vaca tiene cachos y se llama: ', self.nombre, self.apellido)


animal = Animal('vaca')
animal.hacerSonido()

vaca = Vaca('lola', 'manchas')
vaca.imprimirCaracteristica()
vaca.hacerSonido()