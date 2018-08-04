package innerClasses;

interface AnnonyInterface
{
  void free();
}
class Interface
{
    public static void main(String[] args) {
        AnnonyInterface i=new AnnonyInterface() {
            @Override
            public void free() {
                System.out.println("Interface Annonymous");
            }
        };
        i.free();
    }
}
