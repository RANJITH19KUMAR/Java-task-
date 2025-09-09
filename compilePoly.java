class Calulator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

}

public class compilePoly {
    public static void main(String[] args) {
        Calulator c = new Calulator();
        System.out.println(c.add(20,30));
        System.out.println(c.add(30.7,40.23));
    }
}
