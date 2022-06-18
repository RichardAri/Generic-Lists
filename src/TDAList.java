
public interface TDAList<T> {
	boolean isEmpty();
	boolean search(T serachItem);
	void insertFirst(T newItem);
	void insertLast(T newItem);
}
