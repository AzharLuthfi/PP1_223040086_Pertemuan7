package pertemuan7;

public class Node {
	private Matakuliah data;
	  private Node next;

	  public Node(Matakuliah data) {

	    this.data = data;

	  }

	  //setter getter//

	public void setData(Matakuliah data) {
	  this.data = data;
	}

	  public Matakuliah getData() {
	    return data;
	}



	public void setNext(Node next) {
	  this.next = next;
	}


	public Node getNext() {
	    return next;
	}


}
