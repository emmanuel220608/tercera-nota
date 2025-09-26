import java.util.Arrays;

public class Anagrama {
  public static void main(String[] args) {
    //Crear dos cadenas de texto
    String str1 = "Race";
    String str2 = "Care";
    //Pasar a minusculas
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Si tienen el mismo tamaño
    if(str1.length() == str2.length()) {

      // convertir strings a char 
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // ordenar 
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // si son o no son 
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(" are anagram.");
      }
      else {
        System.out.println(" are not anagram.");
      }
    }
    else {
      System.out.println(" are not anagram.");
    }
  }
}