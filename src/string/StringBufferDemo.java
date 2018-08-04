package string;

public class StringBufferDemo {

    void checkStringBuff()
    {
        StringBuffer stringBuffer=new StringBuffer("pradip");
        for (int i=0;i<10000;i++)
        {
            stringBuffer.append("yadav");
        }
    }
    void checkStringBuilder()
    {
        StringBuilder stringBuilder=new StringBuilder("pradip");
        for (int i=0;i<10000;i++)
        {
            stringBuilder.append("yadav");
        }
    }
    void checkString()
    {
        String s="pradip";
        for(int i=0;i<10000;i++)
        {
            s=s.concat("yadav");
        }
    }

    public static void main(String[] args) {
        StringBufferDemo demo=new StringBufferDemo();
        long t1=System.currentTimeMillis();
        demo.checkStringBuff();
        System.out.println(System.currentTimeMillis()-t1);

        long t2=System.currentTimeMillis();
        demo.checkStringBuilder();
        System.out.println(System.currentTimeMillis()-t2);

        long t3=System.currentTimeMillis();
        demo.checkString();
        System.out.println(System.currentTimeMillis()-t3);
    }
}
