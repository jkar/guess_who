/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesswho;
/**
 *
 * @author yiannis
 */
public class Person {
    
    private String name;
    private boolean hasMoustache;
    private boolean wearGlasses;
    private boolean wearHat;
    private boolean isMale;
    private boolean hasBeard;
    private boolean isBald;
    private boolean bigEyeBrows;
    private String eyesColor;
    private String hairColor;
    private String hatColor;
    private String skinColor;
    
    public Person (String name,boolean hm,boolean wg,boolean wh,boolean m, boolean hb,boolean ib,boolean beb,String eyesc,String hairc,String hatc,String skinc){
        this.name = name;
        hasMoustache = hm;
        wearGlasses = wg;
        wearHat = wh;
        isMale = m;
        hasBeard = hb;
        isBald = ib;
        bigEyeBrows = beb;
        eyesColor = eyesc;
        hairColor = hairc;
        hatColor = hatc;
        skinColor = skinc;
    }
    
    //getters
    public String getName() {
        return name;
    }
    public boolean getHasMoustache() {
        return hasMoustache;
    }
    public boolean getWearGlasses() {
        return wearGlasses;
    }
    public boolean getWearHat() {
        return wearHat;
    }
    public boolean getIfMale() {
        return isMale;
    };
    public boolean getHasBeard() {
        return hasBeard;
    }
    public boolean getIsBald() {
        return isBald;
    }
    public boolean getBigEyeBrows() {
        return bigEyeBrows;
    }
    public String getEyesColor() {
        return eyesColor;
    }
    public String getHairColor() {
        return hairColor;
    }
    public String getHatColor() {
        return hatColor;
    }
    public String getSkinColor() {
        return skinColor;
    }
    
}
