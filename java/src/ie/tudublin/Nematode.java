package ie.tudublin;

import processing.data.Table;
import processing.data.TableRow;
import processing.core.PApplet;

public class Nematode {
    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    private int halfW = 400;
    private int halfH = 400;

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

    public void render(NematodeVisualiser pa)
    {
        
        
        pa.stroke((this.name.length()*8),255,255);
        pa.fill((this.name.length()*8),255,255);
        pa.textSize(20);
        pa.text(name, halfW-(name.length()*4), 200);
        pa.strokeWeight(2);

        int y = 250;
        

        if(this.eyes == 1){
            pa.line(halfW+15, y-15, halfW+35, y-30);
            pa.circle(halfW+35, y-30, 5);
            pa.line(halfW-15, y-15, halfW-35, y-30);
            pa.circle(halfW-35, y-30, 5);
        }

        for(int i=0;i < this.length;i++){
            
            pa.noFill();
            pa.circle(halfW, y, 40);
            if(this.limbs == 1){
                pa.line(halfW+20, y, halfW+40, y);
                pa.line(halfW-20, y, halfW-40, y);
            }
            
            y+=40;
        }

        if(this.gender.equals("m")){
            pa.line(halfW, y-20, halfW, y);
            pa.circle(halfW, y, 5);
        }
        else if(this.gender.equals("f")){
            pa.noFill();
            pa.circle(halfW,y-40,20);
        }
        else if(this.gender.equals("h")){
            pa.line(halfW, y-20, halfW, y);
            pa.circle(halfW, y, 5);
            pa.noFill();
            pa.circle(halfW,y-40,20);
        }

        pa.stroke(120);
        
        
        
       
        
    }
}
