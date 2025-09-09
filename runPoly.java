class Bank{
    double getRateOfInterest(){
        return 5;
    }
}
class Sbi extends Bank{
    @Override
    double getRateOfInterest() {
        return 2.9;
    }
}

class Cbi extends Bank{
    @Override
    double getRateOfInterest() {
        return 4.7;
    }
}

public class runPoly {
    public static void main(String[] args) {
        Bank  b;
        b=new Sbi();
        System.out.println("SBI Rate " + b.getRateOfInterest());

        b=new Cbi();
        System.out.println("CBI Rate " +b.getRateOfInterest());
    }
}
