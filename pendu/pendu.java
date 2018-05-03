package pendu;

import java.io.BufferedReader;
import java.io.FileReader;


public class pendu {
   

    public static void OuvrirFichier () {
       
         try {
                FileReader c = new FileReader("dictionaire.txt");
                BufferedReader lecteur = new BufferedReader(c);
         
                String line = lecteur.readLine();//On insère dans la variable motAdeviner le mots qui a été tiré au hasard
                    
                    while (line != null) {
                        line = lecteur.readLine();
                    }
         
                    lecteur.close();
         
                } catch (Exception e) {
                    throw new Error(e);
                }
    }
   
    public static void initialiserAlphabet(char[] lettre){
       
        lettre[0] = 'a';
        lettre[1] = 'b';
        lettre[2] = 'c';
        lettre[3] = 'd';
        lettre[4] = 'e';
        lettre[5] = 'f';
        lettre[6] = 'g';
        lettre[7] = 'h';
        lettre[8] = 'i';
        lettre[9] = 'j';
        lettre[10] = 'k';
        lettre[11] = 'l';
        lettre[12] = 'm';
        lettre[13] = 'n';
        lettre[14] = 'o';
        lettre[15] = 'p';
        lettre[16] = 'q';
        lettre[17] = 'r';
        lettre[18] = 's';
        lettre[19] = 't';
        lettre[20] = 'u';
        lettre[21] = 'v';
        lettre[22] = 'w';
        lettre[23] = 'x';
        lettre[24] = 'y';
        lettre[25] = 'z';

    }
   
    public static void afficheTableau(char [] tab){

        int i;
        for (i = 0 ; i < tab.length ; i++ ){

            System.out.print(tab[i]+" ");

        }

        System.out.println();

    }
   
    public static int MotADeviner(char[] mot) {

        int i = 0 ;
        char lettre ;
        System.out.println("Saisissez les lettres une par une et finir par # lorsque que le mot est termine");
        lettre = Lirelettre();
      
        while (lettre != '#'){

            mot[i] = lettre ;

            i = i+1 ;

            System.out.println("Entrez la lettre "+ (i+1));

            lettre = Lirelettre();

        }

        return i ;

    }
   
    public static char Lirelettre(){
       
        char lettre = 0;

        System.out.println("proposez une lettre de l'alphabet (a-z)");

        // on pourrais ajouter ici un test de validite de saisie

        System.out.println("Lettre : " + lettre);
       
        return lettre;

    }
   
    public static boolean calculerResultat(char Lettre, char[]MotADeviner,char [] proposition){
        
        boolean trouve = false ;
        int i ;
       
        for (i= 0 ; i < proposition.length ; i++){
       
            if (MotADeviner[i] == Lettre) {
                if (trouve == false){
                    trouve = true;
                }
                proposition[i] = Lettre ;
           
            }
           
        }

        return trouve ;

    }
   
    public static void initialiserTableau(char [] tab, char caractere){

        int i ;

        for (i=0 ; i < tab.length ; i++){

            tab[i]= caractere;

        }

    }
   

    public static boolean MotDevine(char [] tab){

          int i = 0;
          boolean MotDevine = true;

          while ((MotDevine == true) && (i < tab.length)){

              if (tab[i] == '_'){
                  MotDevine = false ;

              }

           i++;

          }
          return MotDevine;
    }
   
    public static void MiseAJourAlphabet(char [] alpha, char lettre){

        int i = 0;

        boolean trouve = false ;

        while ((trouve ==  false) && (i<alpha.length)) {

            if (alpha[i] == lettre){

                alpha[i] = ' ';
                trouve = true;

            }

            i++;

        }
    }
   
    public static void afficherPendu(int nberreur, char [] lettre){

        System.out.println("Afficher le pendu pour le nombre d'erreurs : "+ lettre);

        switch (nberreur) {

        case 0 : // que la potence

            System.out.println("    ___________");

            System.out.println("    |          |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("----------------------");


        case 1 : // et la tete

            System.out.println("    ___________");

            System.out.println("    |          |");

            System.out.println("   | |         |");

            System.out.println("    -          |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("----------------------");

            break;

        case 2 : // et le corps

            System.out.println("    ___________");

            System.out.println("    |          |");

            System.out.println("   | |         |");

            System.out.println("    -          |");

            System.out.println("    |          |");

            System.out.println("    |          |");

            System.out.println("    |          |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("               |");

            System.out.println("----------------------");
    
            break;

        case 3 : // et les jambes

            System.out.println("    ___________");

            System.out.println("    |          |");

            System.out.println("   | |         |");

            System.out.println("    -          |");

            System.out.println("    |          |");

            System.out.println("    |          |");

            System.out.println("    |          |");

            System.out.println("   /\\          |");

            System.out.println("  /  \\         |");

            System.out.println("               |");

            System.out.println("----------------------");

            break;

        case 4 : //et les bras

            System.out.println("    ___________");

            System.out.println("    |          |");

            System.out.println("   | |         |");

            System.out.println("    -          |");

            System.out.println("    |          |");

            System.out.println("  --|--        |");

            System.out.println("    |          |");

            System.out.println("   /\\          |");

            System.out.println("  /  \\         |");

            System.out.println("               |");

            System.out.println("----------------------");

            break ;

        case 5 : // et les pieds

            System.out.println("    ___________");

            System.out.println("    |          |");

            System.out.println("   | |         |");

            System.out.println("    -          |");

            System.out.println("    |          |");

            System.out.println("  --|--        |");

            System.out.println("    |          |");

            System.out.println("   /\\          |");

            System.out.println(" _/  \\_        |");

            System.out.println("               |");

            System.out.println("----------------------");

            break ;

            default :

            break ;

        }

    }
   
    public static void devinerMot(char [] lettre, char [] MotADeviner, int taille){

        char [] proposition = new char[taille];
        boolean trouve = false;
        boolean pendu =  false ;
        boolean bon ;
        char lettreProposee ;
        int nombrebEssai = 0 ;
        int nombrebMaxEssai = 5 ;
        initialiserTableau(proposition, '_');
        while ((trouve == false) && (!pendu)){

            afficherPendu(nombrebMaxEssai, lettre);
            lettreProposee = Lirelettre();
            MiseAJourAlphabet(lettre, lettreProposee);
            bon = calculerResultat(lettreProposee, MotADeviner, proposition);
            afficherPendu(nombrebMaxEssai, proposition);          

                if (bon == true) {
   
                      System.out.println("bon choix !!!");
                      trouve =  MotDevine(proposition);

                }else {
   
                      nombrebEssai = nombrebEssai + 1;
                      System.out.println("Erreur!!!");
                      afficherPendu(nombrebEssai, proposition);

                }
   
                if (nombrebEssai == nombrebMaxEssai){
   
                    pendu = true ;
   
                }

        }

        if (trouve == true) {

            System.out.println("gagne, felicitations !!!");

        }else{

            System.out.println("Perdu et pendu !!");

        }

    }


}
