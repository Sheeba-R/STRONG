class Testcommandlinearg{
public static void main(String[] args){
String s1=args[0];
String s2=args[1];
System.out.println(s1+s2);
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
System.out.println(a+b);
System.out.println(a/b);
}
}