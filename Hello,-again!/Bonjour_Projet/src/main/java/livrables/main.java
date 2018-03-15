package livrables;
public class main{
    public static void main(String[]args){
        
Animal[] tab ={
        new Human("multicolor en fonction des émotions", "John"),
        new Dog("Gris", "Dog danois"),
        new Lemurian("Noir et blanc", "Maki cata")       
    };
for (Animal animal  : tab) {
    System.out.println("je m'appelle "+animal.Name+" je suis de couleur, "+animal.Pelage+" et pour dire bonjour je fais "+animal.sayHello());
    
}
    }
}