package my.app;

public class Info 
{
	int id;

	public Info() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + "]";
	}
	
	
}
