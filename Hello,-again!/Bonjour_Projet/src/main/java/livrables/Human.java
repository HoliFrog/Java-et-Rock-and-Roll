package livrables;

public class Human extends Primate {
    @Override
    public String sayHello() {
        return " Bonjour chers cousins Lémuriens et chiens!!";
    }

    public Human(String couleur, String nom) {
        this.Pelage = couleur;
        this.Name = nom;
    }
}

//Couleur = "multicolor en fonction des émotions";