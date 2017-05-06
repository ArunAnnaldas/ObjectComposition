package p1;

public class Runner {

	public static void main(String[] args) {

		int x1=5;
		int y1=5;
		int x2=10;
		int y2=5;
		int x3=10;
		int y3=10;
		int x4=5;
		int y4=10;
		
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		Point p3 = new Point(x3,y3);
		Point p4 = new Point(x4,y4);
		
		Segment s1 = new Segment(p1, p2);
		Segment s2 = new Segment(p2, p3);
		Segment s3 = new Segment(p3, p4);
		Segment s4 = new Segment(p4, p1);
		
		Rectangle rect1 = new Rectangle(s1,s2,s3,s4);
		Rectangle rect2 = new Rectangle(p1,p2,p3,p4);
		Rectangle rect3 = new Rectangle(x1,y1,x2,y2,x3,y3,x4,y4);
		
		System.out.println("P1: " +p1);
		System.out.println("P2: " +p2);
		System.out.println("P3: " +p3);
		System.out.println("P4: " +p4);
		
		System.out.println("S1: " +s1);
		System.out.println("S1: " +s2);
		System.out.println("S2: " +s3);
		System.out.println("S2: " +s4);
		
		System.out.println("Rect1: " + rect1);
		System.out.println("Rect2: " + rect2);
		System.out.println("Rect3: " + rect3);
		
		/*System.out.println("P1: " +p1.getX());
		System.out.println("P1: " +p1.getY());
		System.out.println("P2: " +p2.getX());
		System.out.println("P2: " +p2.getY());
		System.out.println("P3: " +p3.getX());
		System.out.println("P3: " +p3.getY());
		System.out.println("P4: " +p4.getX());
		System.out.println("P4: " +p4.getY());*/
		
		System.out.println("S1: " +s1.getP1());
		System.out.println("S1: " +s1.getP2());
		System.out.println("S2: " +s2.getP1());
		System.out.println("S2: " +s2.getP2());
		System.out.println("S3: " +s3.getP1());
		System.out.println("S3: " +s3.getP2());
		System.out.println("S4: " +s4.getP1());
		System.out.println("S4: " +s4.getP2());
		
		
		

	}

}
