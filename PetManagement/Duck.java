public class Duck extends PetAnimal{
    Duck(String color,String gender,String type,String owner,int legs){
        super(color,gender,type,owner,legs);
    }
    void printPetInfo() {
        System.out.println("Properties: color ->" +color+ "Gender ->" +gender+ "Type ->" +type+ "Owner: " +owner+ "and Legs:" +noOfLegs);
    }
    void walk(){
        System.out.println("Duck is walking");
    }

    void changeOwner(String name){
        this.owner = name;
    }
}
