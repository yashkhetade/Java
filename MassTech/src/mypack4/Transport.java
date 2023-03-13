package mypack4;



class Vehicle{
	
	private int modelno;
	
	private int regno;
	
    private int  speed ;
	
	private int  fuelcap;
	
    private int fuelconsumption;
	
	
//	1.	Vehicle model
//	2.	Registration number
//	3.	Vehicle speed (km/hour)
//	4.	Fuel capacity (liters)
//	5.	Fuel consumption (kilo meters/liter)
    
    Vehicle(){
    	
    	
    }

	Vehicle(int modelno,int regno,int speed,int fuelcap,int fuelconsumption){
		
		this.modelno=modelno;
		this.regno=regno;
		this.speed=speed;
		this.fuelcap=fuelcap;
		this.fuelconsumption=fuelconsumption;	
		
		
	}
	
	public int getmodelno() {
		return modelno;
		
	}
	
	public void setmodelno(int modelno) {
		this.modelno=modelno;
		
	}
	
	public int getregno() {
		return regno;
		
	}
	
	public void setregno(int regno) {
		this.regno=regno;
		
	}
	
	public int getspeed() {
		return speed;
		
	}
	
	public void setspeed(int speed) {
		this.speed=speed;
		
	}
	
	
	public float getfuelcap() {
		return fuelcap;
		
	}
	
	public void setfuelcap(int fuelcap) {
		this.fuelcap=fuelcap;
		
	}
	
	public int  getfuelconsumption() {
		return fuelconsumption;
		
	}
	
	public void setfuelconsumption(int fuelconsumption) {
		this.fuelconsumption=fuelconsumption;
		
	}
	
	
	public void fuelneeded(int distance) {
		
		int f=distance/fuelconsumption;
		
		System.out.println("fuel needed: "+f);
		
		
		
	}
	
	public void distancecovered(int time) {
		
		int distance=speed*time;
		
		System.out.println("distance covered: "+distance);
	}
	
	public void display() {
		
		System.out.println(" the model no of vehicle is "+modelno);
		
		System.out.println(" the regno no of vehicle is "+regno);
		
		System.out.println(" the speed of vehicle in km/hr is "+modelno);
		
		System.out.println(" fuelcapacity of vehicle in litres is "+modelno);
		
		System.out.println(" fuelconsumption of vehicle in km/litres is "+modelno);
		
		
		
	}
	
		
}

class Truck extends Vehicle{
	
  private int cargoweightlimit;
	
	Truck(int cargo){
		this.cargoweightlimit=cargo;
		
	}
	
	public int getcargoweightlimit() {
		return cargoweightlimit;
		
	}
	
	
	public void setcargoweightlimit(int cargo) {
		this.cargoweightlimit=cargo;
		
	}
	
	public void display() {
		
		super.display();
		
	}
}

class Bus extends Vehicle {
	
	private int noofpassengers;
	
	Bus(int p){
		this.noofpassengers=p;
		
	}
	
	public int getnoofpassengers() {
		return noofpassengers;
		
	}
	
	
	public void setnoofpassengers(int p) {
		this.noofpassengers=p;
		
	}
	
	public void display() {
		
		super.display();
	
		
	}
	
	
}



public class Transport {

	public static void main(String[] args) {
		
		
		
		
		Truck t=new Truck(55);
		
		Bus b=new Bus(30);
		
		t.setmodelno(2143);
		t.setregno(4789);
		t.setspeed(80);
		t.setfuelcap(60);
		t.setfuelconsumption(100);
		t.setcargoweightlimit(45);
		
		
		t.display();
		t.fuelneeded(60);
		t.distancecovered(2);
		
		
		b.setmodelno(2143);
		b.setregno(4789);
		b.setspeed(80);
		b.setfuelcap(60);
		b.setfuelconsumption(100);
		b.setnoofpassengers(30);
		
		
		b.display();
		b.fuelneeded(80);
		b.distancecovered(3);
		

	}
}



