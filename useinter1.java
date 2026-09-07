/* INTERFACE
two unrelated objects can be communicate
language,gestures,bell in school or college,
whistle in bus by conductor
java-many interfaces and abstract classes are there
in jdk
thin client
only method definitions
implementations can be done in classes
all methods are public abstract
to implementing class must override the methods and must declare
public
jdk 8 functional interfaces-an interface with a method with body
only one method
*/
interface inter1{
//public abstract
void add(int a,int b);
}
interface inter2{
void sub(int a,int b);
}

class useinter1 implements inter1,inter2{
public void add(int a,int b){
System.out.println(a+b);
}
public void sub(int a,int b){
System.out.println(a-b);
}
public static void main(String[] ar){
inter1 i=new useinter1();
i.add(12,23);
inter2 i2=new useinter1();
i2.sub(12,2);
useinter1 u=new useinter1();
u.add(12,23);
u.sub(12,1);
}
}