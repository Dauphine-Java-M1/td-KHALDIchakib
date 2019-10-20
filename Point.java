package fr.dauphine.ja.khaldichakib.td01;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	private static int nbrPoints=0;

	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		Point.nbrPoints++;
	}
	
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
		Point.nbrPoints++;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public static int getNbrPoints() {
		return nbrPoints;
	}
	
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	
	public static void main(String[] args) {
		Point p=new Point(0,0);
		System.out.println(Point.nbrPoints);
		System.out.println(p);
	}
}
