
public class ListOrder<E extends Comparable<E>> extends ListLinked<E> {

	public ListOrder() {
		super();
	}

	public void insertOrder(E x) {
		if(this.first==null || this.first.getData().compareTo(x)>0)
			insertFirst(x);
		else {
			Node<E> aux = this.first;
			while (aux.getNext() != null && aux.getNext().getData().compareTo(x)<=0)
				aux = aux.getNext();
			aux.setNext(new Node<E>(x,aux.getNext()));
		}
	}

	public boolean search(E x) {
		// cambios para que busque eun una lista ordenada
		Node<E> aux = this.first;
		for (; aux != null; aux = aux.getNext())
			if (aux.getData().equals(x))
				return true;
		return false;
	}

	public void remove(E x) {
		// cambios para que elimine en una lista ordenada
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

}
