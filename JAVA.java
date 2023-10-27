class Pen{
    String Name;
    String Type;
    public void write() {
        System.out.println("Write something");
    }

}

public class JAVA{
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.Name= "Matadore";
        p1.Type= "Ballpoint";


        p1.write();
    }

}