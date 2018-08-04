package innerClasses;

abstract public class AnnonyamousInnerClass {
    abstract void showData();

}

class CheckAnnonymous
{
    public static void main(String[] args) {
        AnnonyamousInnerClass annonyamousInnerClass=new AnnonyamousInnerClass() {
            @Override
            void showData() {
                System.out.println("inside annonymous ");

            }
        };
        annonyamousInnerClass.showData();

    }
}
