package jpin210217;

public abstract class Template {

	public void execute() {
		System.out.println("start");
		this.perform();
		System.out.println("end");
	}

	protected abstract void perform();

}
