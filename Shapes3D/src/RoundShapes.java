
public class RoundShapes extends ShapesThatAre3d{
	double radius;
	public RoundShapes(double rad ) {
		this.radius = rad; 
	}
	public  double getVolume() {
		return (4/3)*Math.PI*(this.radius)*(this.radius);
	}
	public  double getSArea() {
		return (4)*Math.PI*(this.radius)*(this.radius);
	}
}
