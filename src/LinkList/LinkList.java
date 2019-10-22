package LinkList;

public class LinkList<T> {

	private Element<?> firstElement;
	private int size = 0;

	public void add(Element<?> element) {
		switch (size) {
		case 0:
			setFirstElement(element);
			setSize(1);
			break;

		case 1:
			element.setPrevious(getFirstElement());
			element.setNext(getFirstElement());
			getFirstElement().setNext(element);
			getFirstElement().setPrevious(element);
			setSize(2);
			break;
		default:
			element.setPrevious(getFirstElement().getPrevious());
			element.setNext(getFirstElement());
			getFirstElement().getPrevious().setNext(element);
			getFirstElement().setPrevious(element);
			setSize(getSize() + 1);
			break;
		}
	}

	public void add(T data) {
		Element<T> element = new Element<T>();
		element.setData(data);
		add(element);
	}

	public void delete(T data) {
		Element<T> element = new Element<T>();
		element.setData(data);
		delete(element);
	}

	public boolean delete(Element<?> elementToDelete) {
		boolean success = false;
		Element<?> element = getFirstElement();
		for (int i = 0; i < size; i++) {
			if (element.equals(elementToDelete)) {
				element.getPrevious().setNext(element.getNext());
				element.getNext().setPrevious(element.getPrevious());
				setSize(getSize() - 1);
				success = true;
				break;
			} else
				element = element.getNext();
		}
		return success;
	}

	public void reverse() {
		Element<?> element = getFirstElement();
		setFirstElement(getFirstElement().getPrevious());
		for (int i = 0; i < size; i++) {
			Element<?> bufer = element.getNext();
			element.setNext(element.getPrevious());
			element.setPrevious(bufer);
			element = bufer;
		}
	}

	public void print() {
		Element<?> element = getFirstElement();
		for (int i = 0; i < size; i++) {
			System.out.print(element.getData().toString() + "<-->");
			element = element.getNext();
		}
	}

	public Element<?> getFirstElement() {
		return firstElement;
	}

	public void setFirstElement(Element<?> firstElement) {
		this.firstElement = firstElement;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
