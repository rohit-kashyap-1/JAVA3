package interfaces;

/**
 * Business
 */
interface Business {
    public void registration();
    public void info();
    public void turnover();
}

interface Industry{
    public void category();
    public void run();
}

class Company implements Business,Industry{
    private String comapny;
    private double finalTurnover;
    private String category;
    public Company(String c,double ft,String cat){
        this.comapny = c;
        this.finalTurnover = ft;
        this.category =cat;
    }
    public void registration(){
        System.out.println("Comapny has been registered");
    }
    public void info(){
        System.out.println(String.format("Comapny Name is "+comapny, comapny));
    }
    public void turnover(){
        System.out.println(String.format("%s's Turnover is Rs."+finalTurnover, comapny));
    }
    public void category(){
        System.out.println(String.format("%s's Category is :"+category, comapny));
    }
    public void run(){
        System.out.println(String.format("%s's is Running Fine", comapny));
    }

}

class Main{
    public static void main(String args[]){
        Company comp = new Company("SwiftInfoCorp Pvt Ltd", 249670005655564d, "Software & IT");
        comp.registration();
        comp.info();
        comp.turnover();
        comp.category();
        comp.run();
    }
}