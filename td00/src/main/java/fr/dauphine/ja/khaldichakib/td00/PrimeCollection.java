package fr.dauphine.ja.khaldichakib.td00;

import java.util.*;

public class PrimeCollection {

	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		this.numbers = new ArrayList<Integer>();
	}
	
	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}
	
	public void initRandom(int n, int m) {
		// s' assurer que la liste est de taille m
		//this.numbers = new ArrayList<Integer>(m);
		Random rand = new Random();
		
		for(int i=0; i<n; i++) {
			//this.numbers.set(i,(Integer) rand.nextInt(m+1));
			this.numbers.add(rand.nextInt(m+1));
		}
	}
	
	private boolean isPrime(Integer p){
		if(p<=1) return false;
		for(int i = 2;i*i<=p;i++){
			if (p%i ==0)
				return false;
		}
		return true;
	}
	
	
	public void affhicher() {
		for(Integer i: this.numbers) {
			System.out.println(i);
		}
	}
	
	public void printPrimes() {
		for(Integer i: this.numbers) {
			if(isPrime(i))
				System.out.println(i);
		}
	}

	
	
	public static void main(String[] args) {
		PrimeCollection pc = new PrimeCollection();
		//System.out.println(pc.numbers.size());
		pc.initRandom(100, 1000);
		System.out.println("La liste est:");
		pc.affhicher();
		System.out.println();
		System.out.println("Les premiers sont:");
		pc.printPrimes();
	}
}
