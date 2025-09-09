class bike{
    void duke(){
        System.out.println("The fast in speed to spelendor");
    }
}

class platina extends bike{

    @Override
    void duke(){
        System.out.println("The platina is high mileage in duke");
    }
}

public class overRide {
    public static void main(String[] args) {
        bike b = new platina();

        b.duke();
        b.duke();
    }
}
