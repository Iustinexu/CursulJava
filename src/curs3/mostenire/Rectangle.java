package curs3.mostenire;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle() {
		
	}
	
    public Rectangle(int lt, int wd) {
    	setLength(lt);
    	setWidth(wd);
		
	}
	
	public int getLength() {
		return length;
	}
	private void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	private void setWidth(int width) {
		this.width = width;
	}
	
	public int calculateArea() {
		return length*width;
		
	}
	
}
