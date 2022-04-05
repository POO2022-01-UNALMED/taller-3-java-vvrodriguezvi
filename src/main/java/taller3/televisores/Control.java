package taller3.televisores;

public class Control {
	TV tv;
	
	// Constructor
	
	public Control(TV tv) {
		this.tv = tv;
	}
	
	//getter and setter
	
		public void setTv(TV tv) {
			this.tv = tv;
		}
		
		public TV getTv() {
			return this.tv;
		}	

	
	// metodo enlazar tv y control

	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
	
	// metodos
	
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	
}
