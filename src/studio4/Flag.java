package studio4;
import java.util.Scanner;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
		
		StdDraw.setPenColor(0, 255, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.05, 0.25);
		
		StdDraw.setPenColor(255, 0, 255);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.05);
		
		StdDraw.setPenColor(255, 200, 0);
		StdDraw.filledRectangle(0.6, 0.5, 0.05, 0.25);
		
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0.4, 0.5, 0.05, 0.25);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.25);
		    
	}
}