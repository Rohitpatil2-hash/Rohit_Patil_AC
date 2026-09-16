
public class Triangle {
	int side1;
	int side2;
	int side3;
	Triangle(int a,int b,int c) {
		side1 = a;
		side2 = b;
		side3 = c;
		System.out.println("Perimeter of the triangle is : "+ (side1 + side2 + side3) );
		
	}
	float trianglearea(int leng,int breadth) {
		float result =0.5f * leng * breadth;
		return result;
			}
    public static void main(String[] args) {
    	Triangle obj = new Triangle(1,2,3);
		
		System.out.println("Area of the triangle : " +obj.trianglearea(13,34));
		}
    }

		

	
