package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;



public class NematodeVisualiser extends PApplet
{

	Table table;
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();
	Nematode current;

	public float border;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			int find = nematodes.indexOf(current);
			if(find > nematodes.size()-2){
				current = nematodes.get(0);
			}else{
				current = nematodes.get(find+1);
			}
		}	
		if (keyCode == RIGHT)
		{
			int find = nematodes.indexOf(current);
			if(find == 0){
				current = nematodes.get(12);
			}else{
				current = nematodes.get(find-1);
			}
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		loadNematodes();
		current = nematodes.get(0);
		
		border = width * 0.1f;
	}
	

	public void loadNematodes()
	{
		table = loadTable("nematodes.csv", "header");
		for(TableRow row :table.rows()){
			nematodes.add(new Nematode(row));
		}
		
	}


	public void draw()
	{	
		background(0);
		current.render(this);
	}
}
