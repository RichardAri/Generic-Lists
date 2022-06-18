
public class ListLinked<E> implements TDAList<E> {

	protected Node<E> first;

	public ListLinked() {
		this.first = null;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public boolean search(E x) {
		Node<E> aux = this.first;
		for (; aux != null; aux = aux.getNext())
			if (aux.getData().equals(x))
				return true;
		return false;
	}

	public void insertFirst(E x) {
		this.first = new Node<E>(x, this.first);
	}

	public void insertLast(E x) {
		if (isEmpty()) {
			this.insertFirst(x);
		} else {
			Node<E> aux = this.first;
			while (aux.getNext() != null)
				aux = aux.getNext();
			aux.setNext(new Node<E>(x));
		}
	}

	public void remove(E x) {
		if (this.first != null && this.first.getData().equals(x))
			this.first = this.first.getNext();
		else {
			Node<E> aux = this.first;
			while (aux.getNext() != null && !aux.getNext().getData().equals(x))
				aux = aux.getNext();

			if (aux.getNext() != null)
				aux.setNext(aux.getNext().getNext());
		}
	}

	@Override
	public String toString() {
		String str = "";
		Node<E> aux = this.first;
		for (; aux != null; aux = aux.getNext())
			str += aux.getData() + ", ";
		return str;
	}

}
