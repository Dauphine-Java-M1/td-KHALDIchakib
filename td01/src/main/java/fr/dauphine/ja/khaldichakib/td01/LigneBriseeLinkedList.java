package fr.dauphine.ja.khaldichakib.td01;

import java.util.LinkedList;

public class LigneBriseeLinkedList {
	
private LinkedList<Point> tab;
	
	
	public LigneBriseeLinkedList() {
		this.tab= new LinkedList<>();
	}
	
	public void add(Point p) {
		this.tab.add(p);
	}
	
	// on aura plus besoin de connaitre la capacite max puisque on a pas un max a respecter !
	//public int pointCapacity() {	return this.tab.length;}
	public int nbPoints() {		return this.tab.size();}
	
	public boolean contains(Point p) {
		return this.tab.contains(p);
	}
	
	public static void main(String[] args) {
		Point p1=new Point(1,2);
		LigneBriseeLinkedList lb = new LigneBriseeLinkedList();
		System.out.println(lb.nbPoints());
		lb.add(p1);
		System.out.println(lb.nbPoints());
		System.out.println(lb.contains(new Point(1,2)));
		lb.tab.remove(p1);
		System.out.println(lb.nbPoints());
		System.out.println(lb.contains(new Point(1,2)));
	}


}
