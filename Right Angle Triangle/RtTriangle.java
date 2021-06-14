import java.util.*;
public class RtTriangle{
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
System.out.println("ENTER THE NO OF ROWS");
int x=scan.nextInt();
for(int i=0;i<x;i++){
for(int j=0;j<=i;j++){
System.out.print("*");
}
System.out.println("");
}
}
}