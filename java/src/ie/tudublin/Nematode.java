package ie.tudublin;

import processing.data.Table;
import processing.data.TableRow;

public class Nematode {
    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    public Nematode(){
        this.name = "Default";
        this.length = 0;
        this.limbs = 0;
        this.gender = "n";
        this.eyes = 0;
    }
    public Nematode(TableRow tr){
        this.name = tr.getString("name");
        this.length = tr.getInt("length");
        this.limbs = tr.getInt("limbs");
        this.gender = tr.getString("gender");
        this.eyes = tr.getInt("eyes");
    }

    public String getName(){
        return this.name;
    }
    public int getlength(){
        return this.length;
    }
    public int getLimbs(){
        return this.limbs;
    }
    public String getGender(){
        return this.gender;
    }
    public int getEyes(){
        return this.eyes;
    }

    public String toString(){
        return "Name \t " + this.name + ", Length \t " + this.length + ", Limbs \t " + this.limbs
        + ", Gender \t " + this.gender
        + ", Eyes \t " + this.eyes ;
    }
}
