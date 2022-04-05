package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int volumen = 1;
	private boolean estado;
	private int precio = 500;
	Control control;
	private static int numTV;
	
	
	//Constructor 
	
	public TV(Marca marca,boolean estado) { 
		this.marca = marca;
		this.estado = estado;
		numTV += 1;
	}
	
	//Getter and setters
	public void setMarca(Marca marca) {
		this.marca = marca;	
	}	
	public void setControl(Control control) {
		this.control = control;	
	}

	public void setVolumen(int volumen) {
		if(this.estado == true && volumen >= 0 && volumen <= 7) {
		this.volumen = volumen;	
		}
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;	
	}
	public void setCanal(int canal) {
		if(this.estado == true && canal >= 1 && canal <= 120) {
		this.canal = canal;
		}
	}
	public static void setNumTV(int numero) {
		numTV = numero;	
	}
	
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return this.control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	// Metodos
	
	//Subir Volumen
	
		public void volumenUp() {
			if(this.estado == true && volumen >= 0 && volumen < 7){
				volumen += 1;
			}		
		}
		
		//Bajar volumen
		
		public void volumenDown() {
			if(this.estado == true && volumen > 0 && volumen <= 7){
				volumen -= 1;
			}
		}
		
	// Regresar canal anterior
		public void canalDown() {
			if(this.estado == true && canal > 1 && canal <= 120){
				canal -= 1;
			}
			
		}
		
	//Adelanatar un canal
	
	public void canalUp() {
		if(this.estado == true && canal >= 1 && canal < 120){
			canal += 1;			
		}
	}
	
	
}

