
public class AngularPrism extends ShapesThatAre3d {
	double height;
	double width;
	double length;
	
	public AngularPrism(double height, double width, double length ) {
		this.height = height; 
		this.width = width;
		this.length = length;
	}
	public  double getVolume() {
		return (this.height*this.width*this.length);
	}
	public  double getSArea() {
		return (2*(this.width*this.length + this.height*this.length + this.height*this.width));
	}
}
