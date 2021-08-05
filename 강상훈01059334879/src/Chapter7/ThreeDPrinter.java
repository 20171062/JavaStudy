package Chapter7;

public class ThreeDPrinter<T> {
	private T material; // Àç·á
	private Powder p;
	private Plastic pt;
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
}