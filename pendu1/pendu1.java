package pendu1;
import java.lang.String;

public class pendu1 {

  public static String alphabet(){
    return "абвгдежзийклмнопрстуфхцчшщъыьэюя";
    // Désolé, je suis faignant.
  }


  public static void testAlphabet(){
    String lettres=alphabet();
    System.out.println("Alphabet : "+lettres);
    assert(lettres.length()>3);
  }
          

  public static void main(String[] args){
    testAlphabet();
  }
  
}


