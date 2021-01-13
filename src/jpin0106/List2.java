package jpin0106;

public class List2 {

	String value;
	int index;
	List2 next;

	public List2() {
		this.value = null;
		this.index = 0;
		this.next = null;
	}
	
	private List2(int index) {
		if (this.index == index) {
			
		}
		
	}
	
	public add(String value) {
		if (this.value == null) {
			this.value = value;
			return;
		}
		if (this.next != null) {
			
		}
	}



}
