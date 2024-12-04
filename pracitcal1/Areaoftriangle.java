package pracitcal1;
import java.util.*;

public class Areaoftriangle {
 public static void main(String[] args){
 Scanner sc= new Scanner(System.in);
System.out.println("Enter a ,b,d for the triangle");
double a =sc.nextDouble();
double b= sc.nextDouble();
double d= sc.nextDouble();
double s= (a+b+d)/2;
double area = Math.sqrt(s*(s-a)*(s-b)*(s-d));
sc.close();
System.out.println("the area of triangle:"+ area);
}

}