import java.util.ArrayList;

public class TestaAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<Animal>();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        Peixe peixe1 = new Peixe();
        Peixe peixe2 = new Peixe();

        Bovino bovino1 = new Bovino();
        Bovino bovino2 = new Bovino();
        Bovino bovino3 = new Bovino();


        animal.add(animal1);
        animal.add(animal2);

        animal.add(peixe1);
        animal.add(peixe2);


        animal.add(bovino1);
        animal.add(bovino2);
        animal.add(bovino3);

        for(int i = 0; i < animal.size(); i++){
            if(animal.get(i) instanceof Animal){
                System.out.println("Animal");
            }
            if(animal.get(i) instanceof Bovino){
                System.out.println("Bovino");
            }
            if(animal.get(i) instanceof Peixe){
                System.out.println("Peixe");
            }
        }
    }
}
