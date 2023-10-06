
public class PetStoreMain{
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit(" white "," male "," rabbit "," Saif ",4);
        rabbit.printPetInfo();
        Duck duck = new Duck(" Ash "," female "," duck "," Robin ",2);
        duck.printPetInfo();
        rabbit.walk();
        duck.walk();
        duck.changeOwner(" Saif ");
        duck.printPetInfo();
    }
}