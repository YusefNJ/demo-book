package classesExcersize.Bookpk;

public class Publisher {
	//state:
	private int id;
	private String publisherName;
	
	//constructor:
	public Publisher(int id, String publisherName) {
		this.id = id;
		this.publisherName = publisherName;
	}
	//behaviour:
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPublisherName() {
		return publisherName;
	}
	
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	@Override
	public String toString() {
		return "Publisher [id= " + id + ", publisherName= " + publisherName + "]";
	}
}
