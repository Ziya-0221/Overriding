
package overriding;

/**
 *
 * @author indi
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek class Overriding
        Overriding io = new Overriding();
        //objek class Anaknya
        Anaknya hewan = new Anaknya();
        //memanggil method
        io.karnivora();
        hewan.karnivora();
        System.out.println(" ");
        io.herbivora();
        hewan.herbivora();
     
    }
    //method static karnivora
    String karnivora(){
        System.out.println("Contoh hewan karnivora");
        return null;  
    }
    //method static herbivora
    String herbivora(){
        System.out.println("Contoh hewan herbivora");
        return null;  
    }
}
