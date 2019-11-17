package fr.dauphine.ja.khaldichakib.td01;

public class LigneBrisee {

	private Point[] tab;
	private int index;
	
	
	public LigneBrisee(int tailleMax) {
		this.tab= new Point[tailleMax];
		this.index=-1;	// le tableau est vide ;)
	}
	
	public void add(Point p) {
		if(this.index<this.tab.length-2) {
			this.index++;
			this.tab[this.index]=p;
		}else {
			System.out.println("Erreur d'ajout au tableau -> Capacite maximale atteinte !");
		}
	}
	
	public int pointCapacity() {	return this.tab.length;}
	public int nbPoints() {		return this.index+1;}
	
	public boolean contains(Point p) {
		for(Point point: this.tab) {
			if(point.equals(p))
				return true;
		}
		return false;
	}
	
}
