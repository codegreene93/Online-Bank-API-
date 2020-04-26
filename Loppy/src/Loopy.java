public class Loopy {
    public static void main(String[] args) {
        // TODO code application logic here
        loopy();
    }
   
  public static void loopy(){
        for (int i =0; i <10;){
            System.out.println("before");
            i = ++i;
            //i += i
            System.out.println("after");
            System.out.println(i);
        }
    }
}
