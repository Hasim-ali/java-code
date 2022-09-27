class student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    student(student s2){
       this.name=s2.name;
       this.age=s2.age;
    }

    // copy constructer
    student(){

    }
}


public class Constructer {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="hasim";
        s1.age=23;
        student s2=new student(s1);
        // s1.PrintInfo();
        s2.PrintInfo();
        
    }
}
