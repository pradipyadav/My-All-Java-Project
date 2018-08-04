package innerClasses;

public class MemberInnerClassDemo
{
    private int b=30;
    void msg()
    {
        String s="Pradip";
        System.out.println("Inside Class: "+s);
    }
    class InsideMember
    {
        void disp()
        {
            msg();
            int a=20;int b=30;
            int c=a+b;
            System.out.println("Addition: "+c+ "\n"+"Private Data: "+b);
        }
    }
    public static void main(String[] args) {
        MemberInnerClassDemo member=new MemberInnerClassDemo();
        MemberInnerClassDemo.InsideMember i=member.new InsideMember();
        i.disp();
    }

}
