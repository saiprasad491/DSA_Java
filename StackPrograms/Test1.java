
class StackLL
{
  private int size = 0;
  Node head;
  class Node{
    int data;
    Node next;
    Node(int value){
      this.data = value;
      this.next = null;
    }
  }
  int getSize(){
    return this.size;
  }
  boolean isEmpty(){
    return this.size==0;
  }
  void push(int value){
    Node temp = new Node(value);
    size++;
    if(head==null){
      head = temp;
      return;
    }
    temp.next = head;
    head = temp;
  }
  int peek(){
    if(getSize()==0){
      System.out.println("Stack under flow");
      return -1;
    }
    return head.data;
  }

  int pop(){
    if(getSize()==0){
      System.out.println("Stack under flow");
      return -1;
    }
    size--;
    int ele = head.data;
    head = head.next;
    return ele;
  }
  
  void print(){
    if(getSize()==0){
      System.out.println("Stack under flow");
      return;
    }
    Node curr = head;
    while(curr!=null){
      System.out.print(curr.data+"-->");
      curr = curr.next;
    }
    System.out.println();
  }
  String search(int val){
    Node curr=head;
    while(curr!=null){
      if(curr.data==val){
        return val+" found";
      }
      curr = curr.next;
    }
    return val+" not found";
  }
}

class Test1
{
  public static void main(String[] args) {
    StackLL st = new StackLL();
    System.out.println(st.getSize());
    st.print();
    st.push(111);
    st.push(222);
    st.push(333);
    st.push(444);
    st.print();
    System.out.println(st.search(111));
    System.out.println(st.search(555));
    while(st.getSize()!=0){
      System.out.println(st.pop());
    }
    

  }
}