#authored by Seaghan Ennis
#last change on 1-18-2022

#make a dog class
class Dog():
    def speak(self):
        print("Woof")
    def height(self):
        print("7")

#make a cat class
class Cat():
    def speak(self):
        print("Meow")
    def height(self):
        print("8")

#instantiate both a dog and a cat
aDog = Dog()
aCat = Cat()

# demonstrate polymorphism
for animal in (aDog, aCat):
    animal.speak()
    animal.height()

