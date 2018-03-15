package livrables;

public  class Dog extends Animal {
    public String sayHello() {
        return "Wouaf!";
    }

    public Dog(String couleur, String nom) {
        this.Pelage = couleur;
        this.Name = nom;
    }

}