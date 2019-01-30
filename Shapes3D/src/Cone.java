
public class Cone extends Cylinder{
	double height;
	double radius;
	public Cone(double rad, double ht) {
		super(rad,ht);
	}
	public  double getVolume() {
		return (super.getVolume()/3);
	}
	public  double getSArea() {
		return (Math.PI*(this.radius)*((this.radius)+ Math.sqrt((this.height)*(this.height)+(this.radius)*(this.radius))));
	}
}
