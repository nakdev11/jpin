package jpin210317;

public class Test implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Test close");
	}

}
