public class Messaggio
{
     private String toPrint;

     public Messaggio(String print)
     {
          this.toPrint = print;
     }

     public void print()
     {
          System.out.println(this.toPrint);
     }

     public static void main(String args[])
     {
          Messaggio ciaoMondo = new Messaggio("Statv Bune!!");
          ciaoMondo.print();
     }
}