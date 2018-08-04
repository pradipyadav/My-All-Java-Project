package string;

public class StringDemo {

    void stringCheck()
    {

        String s;
        s="rajan";
        //System.out.println(s.length());
        System.out.println(s.hashCode());

        String s2;
        s2="rajan";
        s.concat("saindane");
        System.out.println(s2);

        StringBuffer stringBuffer=new StringBuffer("rajan");
        stringBuffer.append("saindane");
        System.out.println(stringBuffer);


        String s3=new String("pradip");
        System.out.println("new s : "+s3.hashCode());

        if(s==s2)
        {

            System.out.println("equal");
        }

        else
        {
            System.out.println("Not Equal");
        }


    }

    public static void main(String[] args) {

        new StringDemo().stringCheck();



//        String s1=new String();
//        s1="rajan";
//        s1=s1.concat(" "+"saindane");
//        System.out.println(s1);

    }

}
