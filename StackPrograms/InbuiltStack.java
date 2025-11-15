import java.util.Stack;
public class InbuiltStack {
  public static void main(String[] args) {
    Stack<String> st = new Stack<String>();
    System.out.println("Is empty "+st.empty()); //Is empty true
    System.out.println("Is empty "+st.isEmpty()); //Is empty true
    System.out.println("size "+st.size());  //size 0
    st.push("Sai");
    st.push("Kunal");
    st.push("Situ");
    st.push("Rajkumar");
    System.out.println(st); //[Sai, Kunal, Situ, Rajkumar]
    System.out.println(st.pop()); //Rajkumar
    System.out.println(st); //[Sai, Kunal, Situ]
    System.out.println(st.peek());  //Situ
    System.out.println(st); //[Sai, Kunal, Situ]
    System.out.println("searching Sai "+st.search("Sai"));  // searching Sai 3
    System.out.println("searching Rajkumar "+st.search("Rajkumar"));  //searching Rajkumar -1
    System.out.println(st); //[Sai, Kunal, Situ]
  }
}
