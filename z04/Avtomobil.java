package fikt.inki.oop.z04;

public class Avtomobil {
	public String marka;
	public String model;
	public int kilometraza;
	
	//Default Constructor
	public Avtomobil () {
		
	}
	
	//Dynamic Constructor
	public Avtomobil (String marka, String model, int kilometraza) {
		this.marka = marka;
		this.model = model;
		this.kilometraza = kilometraza;
	}
}


