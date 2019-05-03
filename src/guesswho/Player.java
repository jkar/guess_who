/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesswho;

import java.util.ArrayList;

/**
 *
 * @author yiannis
 */
public class Player {
    
    //oi xarakthres tou kathe tablo
    //Person[] persons = new Person[23];
      Person[] persons = new Person[6];
      
      //o arithmos apo tous 24 paiktes pou dialegei o kathe paikths
    private  int playerToBeFound = -1;
    
    //an einai 1 fainetai h karta sto tablo tou paikth an einai 0 den fainetai giati thn exei katebasei
    //to xrhsimopoiw k gia to comp, oti einai 0 to akurwnei to comp sumfwna me tis erwthseis
    int[] mauresKartes = new int[6];
    
     //arraylist gia no erwthsewn pou exoun ginei
    ArrayList<Integer> erwthseis;

    
    public Player() {
        persons[0] = new Person ("Tyler",true,false,false,true,false,false,true,"brown","black","none","white");
        persons[1] = new Person ("Joseph",false,true,false,true,false,false,false,"blue","red","none","white");
        persons[2] = new Person ("Nick",false,true,false,true,false,true,false,"blue","brown aside","none","white");
        persons[3] = new Person ("Brandon",false,false,true,true,false,false,false,"brown","blonde","blue","white");
        persons[4] = new Person ("Conor",true,false,false,true,false,false,false,"brown","brown","none","black");
        persons[5] = new Person ("Kyle",false,false,false,false,false,false,false,"blue","blonde","none","white");
        
        for (int i=0; i<6; i++) {
            mauresKartes[i] =1;
        }
    }
    //constr gia to comp
     public Player(int j) {
        persons[0] = new Person ("Tyler",true,false,false,true,false,false,true,"brown","black","none","white");
        persons[1] = new Person ("Joseph",false,true,false,true,false,false,false,"blue","red","none","white");
        persons[2] = new Person ("Nick",false,true,false,true,false,true,false,"blue","brown aside","none","white");
        persons[3] = new Person ("Brandon",false,false,true,true,false,false,false,"brown","blonde","blue","white");
        persons[4] = new Person ("Conor",true,false,false,true,false,false,false,"brown","brown","none","black");
        persons[5] = new Person ("Kyle",false,false,false,false,false,false,false,"blue","blonde","none","white");
        
        for (int i=0; i<6; i++) {
            mauresKartes[i] =1;
        }
        erwthseis = new ArrayList<Integer>();
    }
    
    public int getPlayerToBeFound() {
        return playerToBeFound;
    }
    public void setPlayerToBeFound(int pf) {
        playerToBeFound = pf;
    }
}
