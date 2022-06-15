// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int y = Integer.parseInt(br.readLine());
            
            if(y%400==0)
                System.out.println("Leapyear");
            else if(y%100==0)
                System.out.println("Not leapyear");
            else if(y%4==0){
                System.out.println("Leapyear");
            }
            else
                System.out.println("Not leapyear");
            
        }
        catch(Exception e){}
    }
}