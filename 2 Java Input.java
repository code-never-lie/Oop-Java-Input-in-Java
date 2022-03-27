Java Input
     a) command Line Arguments
     b) Cosole input
     c) Windows Programming
.................................
Command Line Argument
..............................
Practice 1
class Test{
public static void main(String a[]){
String name=a[0];
System.out.println("Hello Mr "+name);
}
}
....................................
Practice 2
Add two numbers
class Test {
public static void main(String o[]){
 int a,b,c;
 a=Integer.parseInt(o[0]);
 b=Integer.parseInt(o[1]);
 c=a+b;
 System.out.println("Sum=" + c);
 }
}
.........................................
Cosole input
.........................................
Practice 1
Get User name
import java.util.*;
class Test {
public static void main(String o[]){
 Scanner s=new Scanner(System.in);
 System.out.println("Enter Name ");
 String name=s.next();
 System.out.println("Hello MR " + name);
 }
}
...........................................

Windows Programming
 1- Dialog Box
 2- Java Frame Input
....................................
Input Through Dialog Box
....................................
JOptionPane.showInputDialog("Enter your Name");

Return Type String
...............................................
Example 1
import javax.swing.*;
class Test{
public static void main(String o[]){
String name;
name=JOptionPane.showInputDialog("Enter Name");
System.out.println("Hello Mr " + name);

}
} 
................................................











