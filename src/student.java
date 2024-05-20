//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class student {


//attributes
    String id;
    String name;
    int number;
    String email;

    //constructor
    //syntax of constructor  className + (pass attribute) + {this.attributeName=attributeName;}
    student(String id,String name,int number,String email){
        this.id=id;
        this.name=name;
        this.number=number;
        this.email=email;

    }

    //method
    //syntax of method= return type + method name + () + {}

    //study
    //read
    //eat

    void study(){
        System.out.println("Student can study");

    }

    void read(){
        System.out.println("Student can read");
    }

    void eat(){
        System.out.println("Studentb can eat");
    }

    void details(){
        System.out.println("student details");
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
        System.out.println(email);

    }
}