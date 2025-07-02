
class geometry{


int r;
int l,b;
int h;
}


class circle extends geometry{
	void area(){
		System.out.println(3.14*r*r);
	}

	public static void main(String[] args) {
		circle c = new circle();
		c.r=4;
		c.area();
	}
}

class rectangle extends geometry{

	void area1(){
		System.out.println(l*b);
	}
	public static void main(String[] args) {
		rectangle r1 = new rectangle();
		r1.l=5;
		r1.b=5;
		r1.area1();
	}
}

class triangle extends geometry{

	void area2(){
		System.out.println(0.5*b*h);
	}

	public static void main(String[] args) {
		
		triangle t = new triangle();
		t.b=4;
		t.h=3;
		t.area2();
	}
}