package string;

public class StringBufferDemoPrac
{
    void strinbuffer()
    {
        StringBuffer stringBuffer=new StringBuffer("Pradip");
        for (int i=0;i<10000;i++)
        {
            stringBuffer.append("Yadav");
        }
    }

    void stringbuilder()
    {
        StringBuilder stringBuilder=new StringBuilder("Pradip");
        for (int i=0;i<10000;i++);
        {
            stringBuilder.append("Yadav");
        }
    }
    void string()
    {
        String s="Pradip";
        s=s.concat("Yadav");
        for (int i=0;i<10000;i++);
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
