class Digits
{
public static void main(String args[]){
int a=985;
int last=a%10;
a=a/10;
int middle=a%10;
int first=a/10;
System.out.println("first="+first+" "+"middle="+middle+" "+"last="+last);
}
}