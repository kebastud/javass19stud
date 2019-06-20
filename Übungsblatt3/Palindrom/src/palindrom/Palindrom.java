package palindrom;
public class Palindrom {
    String name;
    public Palindrom(){
        name = "Anna";
    }
    public  Palindrom(String name){
        name = name;
    }

     void   isPalindrom(String name){
        int j = name.length()-1;
        boolean pd = false;
        for(int i=0;i<= name.length()/2;i++){
            pd = name.toLowerCase().charAt(i) == name.charAt(j);
            j--;
        }
         System.out.printf(pd ? "JA": "NEIN");
    }

}
