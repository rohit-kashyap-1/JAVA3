public class Local {
    public class Comparator{
        public void compare(int a, int b){
            if(a>b){
                System.out.println(String.format("%d is Bigger than %d ",a,b));
            }else{
                System.out.println(String.format("%d is Bigger than %d ",b,a));
            }
        }
    }
    public static void main(String args[]){
        Local local =new Local();
        Comparator cmp = local.new Comparator();
        cmp.compare((-(-100)*2),101);
    }
}
