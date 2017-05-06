package p1;

public class Rectangle
{
	private Segment s1;
	private Segment s2;
	private Segment s3;
	private Segment s4;
	
	Rectangle(){}
	
	Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
	{
		s1 = new Segment(x1,y1,x2,y2);
		s2 = new Segment(x2,y2,x3,y3);
		s3 = new Segment(x3,y3,x4,y4);
		s4 = new Segment(x4,y4,x1,y1);
	}
	
	Rectangle(Segment s1, Segment s2, Segment s3, Segment s4)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}
	
	Rectangle(Point p1, Point p2, Point p3, Point p4)
	{
		s1 = new Segment(p1,p2);
		s2 = new Segment(p2,p3);
		s3 = new Segment(p3,p4);
		s4 = new Segment(p4,p1);
	}

	public Segment getS1() {
		return s1;
	}

	public void setS1(Segment s1) {
		this.s1 = s1;
	}

	public Segment getS2() {
		return s2;
	}

	public void setS2(Segment s2) {
		this.s2 = s2;
	}

	public Segment getS3() {
		return s3;
	}

	public void setS3(Segment s3) {
		this.s3 = s3;
	}

	public Segment getS4() {
		return s4;
	}

	public void setS4(Segment s4) {
		this.s4 = s4;
	}	
	
	public String toString()
	{
		return "S1: " + s1.toString()+
				" S2: " + s2.toString()+
				" S3: " + s3.toString()+
				" S4: " + s4.toString();
	}
	
	
}

class Segment {

	private Point p1;
	private Point p2;

	Segment() {
		p1 = new Point();
		p2 = new Point();
	}

	Segment(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}

	Segment(Point p1, Point p2) {
		
		this.p1=p1;
		this.p2=p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public String toString()
	{
		return  "P1: " + p1.toString() + 
				" P2: " + p2.toString();
	}
	
	
	
}

class Point {
	
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return  "X: " + x +
				" Y: " + y;
	}
}
