package my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hob") //name of bean or object else it will take by default class name
public class HandleInfo 
{
	@Value("data") // assigning value to the variable directly
	private String resolverCode;
	
	@Value("temp")
	private String pathToStore;

	public HandleInfo() {
		super();
	}

	@Override
	public String toString() {
		return "HandleInfo [resolverCode=" + resolverCode + ", pathToStore=" + pathToStore + "]";
	}
	
	
}
