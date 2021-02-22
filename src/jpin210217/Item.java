package jpin210217;

public class Item {

	int id;
	String name;

	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Item == false) {
			return false;
		}
		Item target = (Item)obj;
		return this.id == target.id;
	}



}
