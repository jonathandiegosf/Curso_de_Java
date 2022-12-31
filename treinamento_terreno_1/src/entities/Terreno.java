package entities;

public class Terreno {
	
	public double largura;
	public double comprimento;
	public double valorm2;
	
	public double areaTerreno() {
		return largura * comprimento;
	}
	
	public double precoTerreno() {
		return areaTerreno() * valorm2;
	}

}
