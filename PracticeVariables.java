package PracticeLearning;

public class PracticeVariables {

    //instance variable
    int Name;
    int Surname;
    int AddressId;

    public static void main(String[] args) {
        //declaring the objects
        PracticeVariables obj = new PracticeVariables();
        obj.Name();
        obj.Surname();
        obj.AddressId();
    }
    { //declaring variables
        this.Name = 0;
        this.Surname = 0;
        this.AddressId = 0;
    }
    public void Name() {
        //this will print name and middle name in 1 line
        System.out.print("Kiran");
        System.out.println(" Kumar");
    }
    public void Surname() {
        // this will print surname
        System.out.println("Valand");
    }
    protected void AddressId() {
        //this will print address, and it is protected so other classes aren't able to access
        System.out.println("15 Brandon Street");
        System.out.println("LE4 6AY");
    }

}