package studio4;

import java.awt.Color;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Font;

public class Flag {
	public static void main(String[] args) {
	
	StdDraw.setPenColor(Color.red);
	StdDraw.filledSquare(0.5,0.5,1);
		
	
	StdDraw.setPenColor(Color.yellow);
	StdDraw.filledCircle(.5, .5, .3);
	
	StdDraw.setPenColor(Color.white);
	StdDraw.filledCircle(.35, .6, .04);
	
	StdDraw.setPenColor(Color.white);
	StdDraw.filledCircle(.65, .6, .04);
	
	StdDraw.setPenColor(Color.blue);
	StdDraw.filledCircle(.35, .6, .02);
	
	StdDraw.setPenColor(Color.blue);
	StdDraw.filledCircle(.65, .6, .02);
	
	StdDraw.setPenColor(Color.black);
	StdDraw.filledCircle(.35, .6, .01);
	
	StdDraw.setPenColor(Color.black);
	StdDraw.filledCircle(.65, .6, .01);
	
	StdDraw.setPenRadius(.02);
	StdDraw.setPenColor(Color.black);
	StdDraw.arc(.5,.4, .1 , 180, 5);
	
	Font font = new Font("Times New Roman", Font.BOLD, 50);
	StdDraw.setFont(font);
	StdDraw.setPenColor(Color.green);
	StdDraw.text(.5,.9, "I Love WashU");
	
	//StdDraw.
	
	
		
		
		
		
		
		
		
		
		
	}
}