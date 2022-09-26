package my.app;

public class Controller 
{
	Service sob;

	public Controller() {
		super();
	}

	public Service getSob() {
		return sob;
	}

	public void setSob(Service sob) {
		this.sob = sob;
	}

	@Override
	public String toString() {
		return "Controller [sob=" + sob + "]";
	}
	
	
}
