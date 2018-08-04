package keywords;

public class This
{

        int id;
        String name;
        float d;

    This(int a,String same,float d)
    {
        this();
        id=a;
        this.name=same;
        this.d=d;
    }

        This(int n,String name)
        {
            id=n;
            this.name=name;
        }
        void show()
        {
            System.out.println("Roll No : "+id+"  Name : "+name);
        }

        void showThis()
        {
            System.out.println("Emp Id : "+id+"  Emp Name : "+name+"  Float : "+d);
        }

        This()
        {
            this.disply();
            System.out.println("Inside Default Constuctor ");

        }
        void  disply()
        {
            System.out.println("Inside Disply Method");
        }


        public static void main(String[] args)
        {
            This key=new This(101,"Pradip",105.5f);
            This b=new This(102,"Yadav");
            key.showThis();
            b.show();
        }

    }


