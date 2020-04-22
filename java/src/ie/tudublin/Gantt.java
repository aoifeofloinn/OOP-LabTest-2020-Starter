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
		int space = 30;
		float xaxis = width * 0.25f;
		float yaxis = height * 0.05f;
		int a = 1;
		float array[] = new float[31];

		stroke(255);
		fill(255);

		for( int i = 0; i < space; i++){
			float y = map(i, 0,5)
		}

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
