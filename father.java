//Father is the basic class
class Father{
void job(){

System.out.println("retireed professor");
}
void hobby(){

System.out.println("news paper TV watching");
}
void property(){
System.out.println("a house in native village");
}

}
class Daughter extends Father{
public static void main(String[]args){
Father f1=new Father();
f1.job();
f1.hobby();
f1.property();
Daughter d=new Daughter();
d.job();
d.hobby();
d.property();
}

}