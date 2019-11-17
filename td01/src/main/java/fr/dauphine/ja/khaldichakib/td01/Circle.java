package fr.dauphine.ja.khaldichakib.td01;

public class Circle {
	private Point center;
	private int rayon;
	
	public Circle(int x, int y, int r) {
		this.center = new Point(x,y);
		this.rayon= r;
	}
	
	public Circle(Point p, int r) {
		this.center = p;
		this.rayon= r;
	}
	
	public Point getCenter() {
		return new Point(this.center.getX(),this.center.getY());
	}
	
	public int getRayon() {
		return rayon;
	}
	
	@Override
	public String toString() {
		return "le circle a comme centre "+this.center.toString()+" et son rayon est "+this.rayon +" et a surface est "+this.surface();
	}
	
	public void translate(int dx, int dy) {
		this.center  = this.center.translate(dx, dy);
	}
	
	public double surface() {
		return Math.PI * this.rayon * this.rayon;
	}
	
	public boolean contains(Point p) {
		if( Math.sqrt( Math.pow(this.center.getX()-p.getX(), 2) + Math.pow(this.center.getY()-p.getY(), 2)) <= this.rayon) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Circle ...circles) {
		for(Circle c : circles ) {
			if(c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Circle c=new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c);
		
		Point p=new Point(1,2);
		Circle cc=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(cc+" "+c2);
	}
}
