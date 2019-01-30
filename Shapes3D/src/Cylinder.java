
public class Cylinder extends RoundShapes{
	double height;
	public Cylinder(double rad, double ht) {
		super(rad);
		this.height = ht;
	}
	public  double getVolume() {
		return (this.height*(super.getVolume()/(4/3)));
	}
	public  double getSArea() {
		return ((2)*Math.PI*(this.radius)*this.height)+(super.getSArea()/2);
	}
}
