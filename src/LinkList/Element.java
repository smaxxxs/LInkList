package LinkList;

public class Element<T> {
	T data;
	private Element<?> next;
	private Element<?> previous;

	public Element() {
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Element<?> getNext() {
		return next;
	}

	public void setNext(Element<?> next) {
		this.next = next;
	}

	public Element<?> getPrevious() {
		return previous;
	}

	public void setPrevious(Element<?> element) {
		this.previous = element;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((previous == null) ? 0 : previous.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element<?> other = (Element<?>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return data.toString();
	}

}
