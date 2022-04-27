package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;



public class NematodeVisualiser extends PApplet
{

	Table table;
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public float border;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
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
		
		nematodes.get(5).render(this);
	}
}
