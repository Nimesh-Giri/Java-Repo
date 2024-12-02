package pracitcal1;
import java.util.*;

public class Palindormestring {
    public static void main (String[]args)
    {
        StringCheck c = new StringCheck();
        c.setData();
        boolean res= c.isPalindorme();
        if (res==true)
        {
            System.out.println("palindorme");

        }
        else 
        {
            System.out.println("not palindorme");
        
        }


    }
}

class StringCheck 
{
    private String str;
    public void setData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        str=sc.nextLine();
        sc.close();
    }
    public boolean isPalindorme()
    {
        String rev="";
        for(int i=str.length()-1; i>=0;i--) {
            char ext = str.charAt(i);
            rev = rev+ext;

        }
        if (rev.equalsIgnoreCase(str)){
            return (true);
    
        }
        else{
            return(false);

        }
    }

    }