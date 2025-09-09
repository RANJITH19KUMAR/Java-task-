class Parent{
    void diplay(){
        System.out.println("I am a Parent");
    }
}
class child extends Parent{
    void show(){
        System.out.println("I am a your Child");
    }
}

public class inheritance {
    public static void main(String[] args) {
        child c = new child();

        c.diplay();
        c.show();
    }
}
