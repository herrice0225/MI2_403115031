/*
 * [A]100
 * [TA's advise]
 * 1.寫的很好也感覺得出你的細心, 強制轉型的概念很好, 不過當你已經預期的到method的回傳的資料型態, 那此時強制轉型是否會有所多於呢?
 * 2.Good Job!
 * */

class Rectangle {
	double x, y, width, height;

	Rectangle() {
		// this(-1,-1,-1,-1);//加上這一行會讓你程式更好.
	}

	Rectangle(double _x, double _y, double _width, double _height) {
		this.x = _x;
		this.y = _y;
		this.width = _width;
		this.height = _height;
	}

	double getWidth() {
		return this.width;
	}

	double getHeight() {
		return this.height;
	}

	public String toString() {
		return "java.Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + "]";
	}

}

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(15, 25, 57, 18);
		Rectangle rectangle2 = new Rectangle(0, 12, 60, 47);
		double width1 = (double) rectangle1.getWidth();
		double height1 = (double) rectangle1.getHeight();

		double width2 = (double) rectangle2.getWidth();
		double height2 = (double) rectangle2.getHeight();

		System.out.println(rectangle1.toString());
		System.out.println("Area = " + width1 * height1);
		System.out.println("Perimeter = " + (width1 + height1) * 2);
		System.out.println();
		System.out.println(rectangle2.toString());
		System.out.println("Area = " + width2 * height2);
		System.out.println("Perimeter = " + (width2 + height2) * 2);
		System.out.println();
		System.out.println("End of Output!");

	}

}
