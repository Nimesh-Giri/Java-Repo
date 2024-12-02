package pracitcal1;
import java.util.*;

public class Areaoftriangle {
 public static void main(String[] args){
 Scanner sc= new Scanner(System.in);
System.out.println("Enter a ,b,c for the triangle");
double a =sc.nextDouble();
double b= sc.nextDouble();
double c= sc.nextDouble();
double s= (a+b+c)/2;
double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
sc.close();
System.out.println("the area of triangle:"+ area);
}

}