public class Book{
    private static String title="The configuration";
    private static String author = "Rohit dev";

    static class Demo{
        public void display(){
            System.out.println(author);
            System.out.println(title);
        }
    }
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.display();
        
    }
}

