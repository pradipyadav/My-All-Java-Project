package polymorphism;

public class Overriding
{

}
class Rbi extends Overriding
{
    int interest()
    {
        return 12;
    }
}


class Bom extends Overriding
{
    int interest()
    {
        return 15;
    }
}
class Boi extends Overriding
{
    int interest()
    {
        return 10;
    }
}
class Bob extends Overriding {
    int interest() {
        return 14;
    }

}
class Sbi extends Overriding
{
    int interest()
    {
        return 5;
    }


    public static void main(String[] args) {

        Bob b=new Bob();
        Boi bi=new Boi();
        Bom bm=new Bom();
        Rbi r=new Rbi();
        Sbi s=new Sbi();
        System.out.println("RateOfInterest Bob : "+b.interest());
        System.out.println("RateOfInterest Boi : "+bi.interest());
        System.out.println("RateOfInterest Bom : "+bm.interest());
        System.out.println("RateOfInterest Sbi : "+s.interest());
        System.out.println("RateOfInterest Rbi : "+r.interest());

    }
}