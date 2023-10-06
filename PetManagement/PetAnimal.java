public abstract class PetAnimal {
    String color,gender,type,owner;
    int noOfLegs;
    PetAnimal(String color,String gender,String type,String owner,int noOfLegs){
        this.color = color;
        this.gender = gender;
        this.type = type;
        this.noOfLegs = noOfLegs;
        this.owner = owner;
    }
    abstract void printPetInfo();
    abstract void walk();
    abstract void changeOwner(String name);
}
