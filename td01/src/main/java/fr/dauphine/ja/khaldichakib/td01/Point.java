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
	

	public boolean isSameAs( Point p){
		if(this.x==p.x && this.y==p.y)
			return true;
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(!(o instanceof Point))
			return false;
		Point p= (Point) o;
		if(this.x==p.x && this.y==p.y)
			return true;
		return false;
	}
	
	public Point translate(int dx, int dy) {
		return new Point(x+dx,y+dy);
	}
	
	
	public static void main(String[] args) {
		Point p=new Point(0,0);
		System.out.println(Point.nbrPoints);
		System.out.println(p);
		
		Point p1 = new Point(1,2);
		Point p2=p1;
		Point p3= new Point(1,2);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		System.out.println(Point.nbrPoints);
		
	}
}
