package innerClasses;

public class MemberInnerClass {

    void showData()
    {
        System.out.println("inside outer class");
    }

    class InnerMember
    {
        void display()
        {
            showData();
            System.out.println("inside inner class");
        }
    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass=new MemberInnerClass();
        MemberInnerClass.InnerMember innerMember=memberInnerClass.new InnerMember();
        innerMember.display();
    }
}
