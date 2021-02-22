package jpin210217;

public class A {

	int num;

	public A(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof A == false) {
			return false;
		}
		A target = (A)obj;
		return this.num == target.num;
	}



}
