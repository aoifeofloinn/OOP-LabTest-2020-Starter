package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	ArrayList<Task> tasks = new ArrayList<Task>();

	public void loadTasks()
	{
		Table table = loadTable("tasks.csv", "header");
		for(TableRow row:table.rows())
		{
			Task t = new Task(row);
			tasks.add(t);
		}
	}

	public void settings()
	{
		size(800, 600);
	}

	public void printTasks()
	{
		for(Task t:tasks)
		{
			System.out.println(t);
		}
	}

	public void displayTasks()
	{
		float xborder = width * 0.10f;
		float yborder = height * .05f;
		int counter = 1;
		int gradiant = 29;
		float gradArray[] = new float[20];
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");
		displayTasks();	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
		displayTasks();
	}
	
	public void setup()
	{
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
		displayTasks();
	}
}
