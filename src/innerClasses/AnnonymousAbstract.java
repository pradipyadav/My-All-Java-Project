package innerClasses;

abstract class Annonymous
{
    abstract void show();
}
class Anather{
    public static void main(String[] args) {
        Annonymous a=new Annonymous()
        {
            @Override
            void show() {
                System.out.println("Display Data");
            }
        };
        a.show();
    }
}
