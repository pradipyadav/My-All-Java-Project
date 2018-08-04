package string;

public class Methods
{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Pradip");
        sb.insert(1,"Yadav");
        System.out.println(sb);


        StringBuilder delete=new StringBuilder("Pradip");
        delete.delete(1,3);
        System.out.println(delete);

        StringBuilder insert=new StringBuilder("Pradip");
        insert.insert(5,"yadav");
        System.out.println(insert);

        StringBuilder replace=new StringBuilder("Pradip");
        replace.replace(1,5,"Yadav");
        System.out.println(replace);

        StringBuilder reverse=new StringBuilder("Pradip");
        reverse.reverse();
        System.out.println(reverse);

        StringBuilder capacity=new StringBuilder();
        System.out.println(capacity.capacity());
        capacity.append("Pradip");
        System.out.println(capacity.capacity());
        capacity.append("Java is my Favourite Language");
        System.out.println("Capacity is :  "+capacity.capacity());


        System.out.println("Hashcode test of String");
        String s="Pradip";
        System.out.println(s.hashCode());
        s=s+"Yadav";
        System.out.println(s.hashCode());
        System.out.println(s);

        System.out.println("Hashcode test of StringBuilder");
        StringBuilder hash=new StringBuilder("Pradip");
        System.out.println(hash.hashCode());
        hash=hash.append("Yadav");
        System.out.println(hash.hashCode());
        System.out.println(hash);

        System.out.println("Hashcode test of StringBuffer");
        StringBuffer hashc=new StringBuffer("Pradip");
        System.out.println(hashc.hashCode());
        hashc=hashc.append("Yadav");
        System.out.println(hashc.hashCode());
        System.out.println(hashc);

        }
}
