public class ListNode<Object>
{
	private Object val;
	private ListNode next;
	private ListNode prev;
	public ListNode(Object init_val)
	{
		val=init_val;
		next=null;
		prev=null;
	}
	public Object getValue()
	{
		return val;
	}
	public ListNode getNext()
	{
		return next;
	}
	public ListNode getPrev() {
		return prev;
	}
	public void setValue(Object new_val)
	{
		val=new_val;
	}
	public void setNext(ListNode new_next)
	{
		this.next=new_next;
	}
	public void setPrev(ListNode new_prev) {
		this.prev=new_prev;
	}
	public boolean hasNext() {
		if(next!=null) {
			return true;
		}else {
			return false;
		}
	}
	public boolean hasPrev() {
		if(prev!=null) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return val+" ";
	}
}