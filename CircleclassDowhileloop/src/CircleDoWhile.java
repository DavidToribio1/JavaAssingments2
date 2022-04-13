
public class CircleDoWhile {
	
	int radius;
	final static float pI = 3.142f;

	public CircleDoWhile() {
		this.radius=1;
	}
	

	public CircleDoWhile(int radius) {
		this.radius=radius;
	}
	
	public float diameter() {
		
		return this.radius*2;
	}
	
	public float area() {
		
		
		return  pI* this.radius * this.radius ;
	}
	
	public float circumference() {
		
		return 2 * pI * this.radius;
	}

	@Override
	public String toString() {
		return "CircleDoWhile [radius=" + radius + "]";
	}
	
	
	
	

}
