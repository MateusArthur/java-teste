class Calcula{
	public double d1;
	public double d2;
	public double d3;

	public Calcula(double n1, double n2, double n3){
		this.d1 = n1;
		this.d2 = n2;
		this.d3 = n3;
	}
	public double resultado(){
		double result;
		result = (this.d1+this.d2+this.d3)/3;
		return result;
	}
}