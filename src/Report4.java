
public class Report4 {
    public static void main(String[] args){
        String str=null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("nullです。");
            System.out.println(e.getMessage());
        }
    }
}
