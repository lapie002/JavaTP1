/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp1;

/* import toutes les classes du package java.util */
import java.util.*;

/**
 *
 * @author lapie
 */
public class JavaTP1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        // exo 1
        /*
        System.out.println("Veuillez saisir un nombre : ");
        int nb1 = sc.nextInt();
        
        System.out.println("Veuillez saisir un autre nombre : ");
        int nb2 = sc.nextInt();
        
        if(nb1>nb2)
        {
            System.out.println("Le nombre " + nb1 + " est plus grand que " + nb2);
        }
        else if(nb1<nb2)
        {
            System.out.println("Le nombre " + nb2 + " est plus grand que " + nb1);
        }
        else
        {
            System.out.println("Les nombres " + nb1 + " et " + nb2 + " sont egaux.");
        }
        */
        
        // exo 2
        /*
        System.out.println("Veuillez saisir un nombre : ");
        int facto = sc.nextInt();
        int resultat = 1;
        
        //le compteur est utile que pour la boucle while
        int cpt = facto;
       
        //        while(cpt>0)
        //        {
        //           resultat = resultat * cpt;
        //            cpt--;
        //        }
        
        for(int i = facto; i>0 ; i--)
        {
            resultat = resultat * i; 
        }
        
        System.out.println("La factorielle de " + facto + " est " + resultat + ".");
        */
        
        
        //exo 3 
//        float degreeF;
//        float degreeC;
//        float tempConst;
//        
//        System.out.println("Veuillez saisir une temperature en degré Fahrenheit : ");
//        degreeF = sc.nextInt();
//        
//        tempConst = (float) 1.80;
//        degreeC = (degreeF - 32) / tempConst;
//        
//        degreeC = Math.round(degreeC);
//       
//        System.out.println("La temperature de " + degreeF + " est " + degreeC + " en celcius.");
        
        
        //exo 4
//        int nb1 = 0;
//        int sommme = 0;
//        
//        while(nb1>=0)
//        {
//            System.out.println("Veuillez saisir un nombre : ");
//            nb1 = sc.nextInt();
//            
//            sommme = sommme + nb1;
//        }
//        
//        System.out.println("la somme est égale à: " + sommme);

        
        //exo 5 
//        int nbMinutes;
//        System.out.println("Veuillez saisir un nombre de minutes : ");
//        nbMinutes = sc.nextInt();
//        
//        int heures;
//        int minutes;
//        int secondes;
//        
//        heures   =  nbMinutes / 3600;
//        minutes  = (nbMinutes - (heures*3600)) / 60;
//        secondes = (nbMinutes - (heures*3600) - (minutes * 60)) ; 
//               
//        System.out.println("la conversion en : " + heures +" Heures " + minutes + " Minutes " + secondes + " Secondes");
        
        
        //exo 6
//        int nombreA;
//        int nombreB;
//        int nombreC;
//        
//        int temp;
//       
//        System.out.println("Veuillez saisir un nombre : ");
//        nombreA = sc.nextInt();
//        System.out.println("Veuillez saisir un nombre : ");
//        nombreB = sc.nextInt();
//        System.out.println("Veuillez saisir un nombre : ");
//        nombreC = sc.nextInt();
//        
//        int mediane = 0;
//        
//        if(nombreA>nombreB)
//        {
//            temp = nombreB;
//            nombreB = nombreA;
//            nombreA = temp;
//        }
//        if(nombreA>nombreC)
//        {
//            mediane = nombreA;
//        }
//        else
//        {
//            if(nombreC>nombreB)
//            {
//                mediane = nombreB;
//            }
//            else
//            {
//                mediane = nombreC;
//            }
//        }
//
//        System.out.println("la mediane est : " + mediane);

        
      //exo 7
//      int tab[] = new int[10];
//      int somme = 0;
//      
//      for(int i=0;i<10;i++)
//      {
//        System.out.println("Veuillez saisir un nombre : ");
//        tab[i] = sc.nextInt();
//        somme = somme + tab[i];
//      }
//      System.out.println("la somme est : " + somme);
//      
//      System.out.println("voici vos nombre dans l'ordre d'entrée : ");
//      for(int i=0;i<10;i++)
//      {
//          System.out.print(tab[i]+" ");
//      }
      
      //exo 8
      
//      int tab[] = new int[10];
//      
//      
//      for(int i=0;i<tab.length;i++)
//      {
//        System.out.println("Veuillez saisir un nombre : ");
//        tab[i] = sc.nextInt();
//      }
//      System.out.println("voici vos nombre dans l'ordre d'entrée : ");
//      for(int i=0;i<tab.length;i++)
//      {
//          System.out.print(tab[i]+" ");
//      }
//      
//      int i = 0;
//      boolean trouve = false; 
//      
//      System.out.println(" ");
//      System.out.println("Entrez un nombre à chercher : ");
//      int nb = sc.nextInt();
//      
//      while(i<tab.length && !trouve)
//      {
//          if(tab[i] == nb)
//          {
//              trouve = true;
//          
//          }
//         
//          i++;
//      }
//      System.out.println("le nombre " + nb + " est present au moins une fois : " + trouve);
      
      //exo 9
      
//      int tab[] = new int[10];
//      
//      for(int i=0;i<tab.length;i++)
//      {
//            System.out.println("Veuillez saisir un nombre : ");
//            tab[i] = sc.nextInt();
//      }
//      System.out.println("voici vos nombre dans l'ordre d'entrée : ");
//      for(int i=0;i<tab.length;i++)
//      {
//          System.out.print(tab[i]+" ");
//      }
//      
//      boolean ordreCroisant = true;
//      int valeurTabMax = tab.length - 1;
//      int j = 0;
//      
//      while(j<valeurTabMax && ordreCroisant)
//      {
//          
//          if(tab[j]>tab[j+1])
//          {
//              ordreCroisant = false;
//          }
//          else
//          {
//              j++;
//          }
//      }
//      System.out.println("");
//      System.out.println("le tableau est en ordre crpossant : " + ordreCroisant);
      
      // exo 10
//      /* le premier exemple donne une matrice qui n est pas symetrique */
//      //int Matrice[][] = { {7,8,9,10,0},{4,5,6,0,10},{2,3,0,6,9},{1,0,3,5,8},{0,1,2,4,7} };
//      /* le second exemple donne une matrice qui est symetrique */
//      int Matrice[][] = { {0,1,2,3,4},{1,0,5,6,7},{2,5,0,8,9},{3,6,8,0,10},{4,7,9,10,0} };
//      
//      int i = 0;
//      int j;
//      
//      boolean sym = true;
//      
//      while(i<5 && sym)
//      {
//          j = i + 1;
//          
//          while(j<5 && sym)
//          {
//              if(Matrice[i][j] != Matrice[j][i])
//              {
//                  sym = false;
//              }
//              j++;
//          }
//          i++;
//      }
//      System.out.println("les deux matrices sont symetriques " + sym);

      
      
      // exo 10
//      int matrice[][] = { {7,8,9,10,0},{4,5,6,0,10},{2,3,0,6,9},{1,0,3,5,8},{0,1,2,4,7} };
//        
//      int temp = 0;
//      
//      int i;
//      int j;
//      
//      for(i=0;i<5;i++)
//      {
//            for(j=i+1;j<5;j++)
//            {
//                temp = matrice[i][j];
//                matrice[i][j] = matrice[j][i];
//                matrice[j][i] = temp;
//            }
//      }
//      
//      //affichage
//      for(i=0;i<5;i++)
//      {
//            for(j=0;j<5;j++)
//            {
//                System.out.print(matrice[i][j] + " ");
//            }
//            System.out.println();
//      }
//      
      
      
   } 
}
