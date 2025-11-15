import java.util.Scanner;

class StackArray
{
int top = -1;
int size = 5;
int data[];

StackArray()
{
 data = new int[size];
}

boolean isEmpty()
{
return this.top == -1;
}

int getSize()
{
return top+1;
}

void print()
{
if(isEmpty())
{
System.out.println("Stack is empty");
return;
}
for(int i=0;i<top+1;i++)
{
System.out.print(data[i]+" ");
}
System.out.println();
}

void push(int value)
{
if(getSize()==data.length)
{
System.out.println("Stack over flow");
return;
}

top++;
data[top] = value;

}

int pop()
{
if(top==-1)
{
System.out.println("Stack under flow");
return -1;
}
int value = data[top];
top--;
return value;
}

int peek()
{
if(top==-1){
System.out.println("Stack under flow");
return -1;
}
return data[top];
}

boolean search(int value)
{
if(isEmpty())
{
System.out.println("Stack under flow");
return false;
}
for(int i=0;i<=top;i++)
{
if(data[i]==value)
{
return true;
}
}
return false;
}

}

class Test
{

public static void main(String ...args)
{

Scanner sc = new Scanner(System.in);

StackArray st = new StackArray();
st.print();
st.push(4);
st.push(1);
st.push(7);
st.push(0);
st.push(5);
st.print();
st.push(1);
st.print();

System.out.println("Size  = "+st.getSize());

int x = st.pop();
System.out.println(x!=-1?"Poped element "+x:"");
x = st.pop();
System.out.println(x!=-1?"Poped element "+x:"");
x = st.pop();
System.out.println(x!=-1?"Poped element "+x:"");
x = st.pop();
System.out.println(x!=-1?"Poped element "+x:"");
x = st.pop();
System.out.println(x!=-1?"Poped element "+x:"");
x = st.pop();
System.out.println(x!=-1?"Poped element "+x:"");

System.out.println("Size  = "+st.getSize());
st.push(444);
st.push(111);
st.push(777);
st.push(000);
st.push(555);
System.out.println("Size  = "+st.getSize());
/*
for(;0!=st.getSize();)
{
System.out.println("Top of the stack is "+st.pop());

}
*/


System.out.println(st.search(999)?"Found":"Not found");
System.out.println(st.search(111)?"Found":"Not found");


}

}
/*
Stack is empty
4 1 7 0 5
Stack over flow
4 1 7 0 5
Size  = 5
Poped element 5
Poped element 0
Poped element 7
Poped element 1
Poped element 4
Stack under flow

Size  = 0
Size  = 5
Not found
Found
*/