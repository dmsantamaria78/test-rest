package testing;

import java.util.*;

public class Service {
	
	private String path;
	
	private String method;
	
	private List parameters;
	
	private Response response;
	
	
	public Service(String path, String method, List parameters) {
		this.path = path;
		this.method = method;
		this.parameters = parameters;
		this.response = null;
	}
	
	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public String getMethod() {
		return method;
	}


	public void setMethod(String method) {
		this.method = method;
	}


	public List getParameters() {
		return parameters;
	}


	public void setParameters(List parameters) {
		this.parameters = parameters;
	}


	public Response getResponse() {
		return response;
	}

}
