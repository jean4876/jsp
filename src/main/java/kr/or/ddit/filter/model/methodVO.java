package kr.or.ddit.filter.model;

public class methodVO {

	private String method;
	private String uri;
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	@Override
	public String toString() {
		return "methodVO [method=" + method + ", uri=" + uri + "]";
	}


}
