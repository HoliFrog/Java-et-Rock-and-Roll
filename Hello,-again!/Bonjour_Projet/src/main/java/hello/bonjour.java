package main.java.hello;
public class bonjour {

    public static void main(String[] args) {
        Ville[] tab ={ 
            new Ville("Grenoble", "France", 1000),
            new Ville("Madrid", "Espagne", 200001),
            new Ville("Madrid", "Espagne", 200001),
            new Ville("Madrid", "Espagne", 200001)};
        
            for (Ville ville : tab) {
                ville.PrintVilleInfo();
            }

        // ville.PrintVilleInfo();
        // ville2.PrintVilleInfo();

        


        //Vos données, variables, différents traitements…
    }
    //Fin de la méthode main

}
//Fin de votre classe