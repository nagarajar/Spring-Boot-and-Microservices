package my.app;

public class Repository {
	String entity;

	public Repository() {
		super();
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "Repsository [entity=" + entity + "]";
	}
	
	
}
