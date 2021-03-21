package jpin210317;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

class ItemCatalog {

	List<Item> list = new ArrayList<>();

	ItemCatalog() {
		String line = null;
		try (Reader reader = new FileReader("data.txt")) {
			BufferedReader in = new BufferedReader(reader);
			while ((line = in.readLine()) != null) {
				String[] data = line.split(",");
				Item item = new Item(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
				list.add(item);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Item> getItemCatalog() {
		return list;
	}

}
