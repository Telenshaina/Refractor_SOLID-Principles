public class PetFood{
    public String eat(Pet pet,String food){
        System.out.println("I am " + pet.getPetName + "my owner is "+pet.getOwner+
        "and i like eating " + food);
        return food;
    }

}