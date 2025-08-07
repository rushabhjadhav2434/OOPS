public class More_para{
int roll;
String name;
char section;

public More_para(){
roll=29;
name="amogh";
System.out.println("roll:"+roll+" name:"+name);
}


public More_para(int r,String n){
roll=r;
name=n;
System.out.println("roll:"+roll+" name:"+name);
}

public More_para(int r,String n,char s){
roll=r;
name=n;
section=s;
System.out.println("roll:"+roll+" name:"+name+" section:"+section);
}

public static void main(String[] args){

More_para e=new More_para();
More_para e1=new More_para(39,"rushabh");
More_para e2=new More_para(36,"saurabh",'A');
}
}



