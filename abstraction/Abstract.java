package abstraction;

abstract class Abstract {
    public abstract  void dump();
    public void makeSound(){
        System.out.println("Making soundss......");
    }
}

class Main extends Abstract{
    public void dump(){
        System.out.println("Dumping with 90 degree angle");
    }

    public static void main(String args[]){
        Main m = new Main();
        m.makeSound();
        m.dump();
    }
}