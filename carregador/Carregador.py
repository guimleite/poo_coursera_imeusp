class IPhone
    ___name__='iPhone'

    def __init__(self):
        self.conectado = False

    def usar_lightning(self):
        self.conectado = True
        print("Conectado ao carregador lightning")

    def recarregar(self):
        if self.conectado:
            print("Carregando...")
            print("Bateria recarregada!")
        else:
            print("Conecte ao carregador lighting antes")

