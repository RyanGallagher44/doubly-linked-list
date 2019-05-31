
public class DoublyLinkedList<Object> {
	
	ListNode<Object> root;
	ListNode<Object> end;
	int size;

	public DoublyLinkedList() {
		root=null;
		end=null;
		size=0;
	}
	
	//done
	public boolean isEmpty() {
		return root==null;
	}
	
	//done
	public Object getNext() {
		root = root.getNext();
		return root.getValue();
	}
	
	//done
	public void add(Object element) {
		ListNode<Object> node = new ListNode(element);
		if(isEmpty()) {
			root=node;
		}else {
			end.setNext(node);
			node.setPrev(end);
		}
		end=node;
		size++;
	}
	
	//done
	public void add(int index, Object element) {
		ListNode<Object> newNode = new ListNode(element);
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		}
		else if(index == size) {
			add(element);
		}
		else if(index == 0) {
			newNode.setNext(root);
			root.setPrev(newNode);
			root = newNode;
			size++;
		}else {
			ListNode<Object> current = root;
			for(int i = 0; i < index; i++) {
				current = current.getNext();
			}
			ListNode<Object> temp = current.getPrev();
			newNode.setPrev(temp);
			newNode.setNext(current);
			temp.setNext(newNode);
			current.setPrev(newNode);
			size++;
		}
	}
	
	//done
	public Object getRoot() {
		return root.getValue();
	}
	
	//done
	public Object getEnd() {
		return end.getValue();
	}
	
	//done
	public Object get(int index) {
		try {
			ListNode<Object> temp = root;
			ListNode<Object> element = null;
			for(int i = 0; i <= index && i <= size-1; i++) {
				if(index == 0) {
					element = root;
				}
				if(i >= 1 && temp.hasNext()) {
					temp = temp.getNext();
				}
				if(i == index && i != 0) {
					element = temp;
				}
			}
			return element.getValue();
		}catch(Exception e) {
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		}
	}

	//done
	public int size() {
		return size;
	}

	//done
	public void remove(int index) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		}
		else if(index == size-1) {
			end = end.getPrev();
			size--;
		}
		else if(index == 0) {
			root = root.getNext();
			if(index == 1) {
				root.setPrev(null);
			}
			size--;
		}
		else {
			ListNode<Object> current = root;
			for(int i = 0; i < index; i++) {
				current = current.getNext();
			}
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			size--;
		}
	}
	
	//done
	public void clear() {
		root=null;
	}
	
	//done
	public boolean contains(Object o) {
		ListNode<Object> node = new ListNode(o);
		ListNode<Object> temp = root;
		for(int i = 0; i <= size-1; i++) {
			if(i >= 1 && temp.hasNext()) {
				temp = temp.getNext();
			}
			if(temp.getValue() == node.getValue()) {
				return true;
			}
		}
		return false;
	}
	
	//done
	public String toString() {
		String list = "";;
		if(root==null) {
			list = "[]";
		}
		if(root != null) {
			list = "["+root.getValue()+", ";
			ListNode<Object> temp = root;
			for(int i = 0; i <= size-2; i++) {
				if(temp.hasNext()) {
					temp=temp.getNext();
				}
				if(i == size-2) {
					list+=temp.getValue()+"]";
				}
				if(i != size-2) {
					list+=temp.getValue()+", ";
				}
			}
		}
		return list;
	}
	
	//done
	public String toReversedString() {
		String list = "";;
		if(root==null) {
			list = "[]";
		}
		if(root != null) {
			list = "["+end.getValue()+", ";
			ListNode<Object> temp = end;
			for(int i = 0; i <=size-2; i++) {
				if(temp.hasPrev()) {
					temp=temp.getPrev();
				}
				if(i == size-2) {
					list+=temp.getValue()+"]";
				}
				if(i != size-2) {
					list+=temp.getValue()+", ";
				}
			}
		}
		return list;
	}
	
}
