public class myStack{

 class Node {
   int value;
   Node next ;
   public Node(int value){
     this.value = value;
   }
 }
 
Node top;
Node bottom;
int length ;
 public myStack(){
   this.top=null;
   this.bottom = null;
   this.length = 0;
 }

 void peek(){
   if(this.length>0)
    System.out.println(top.value);
   else
    System.out.println("null");
 }

  void push(int val){
    if(this.length==0)//First Element
    {
      Node n = new Node(val);
      top = n;
      top.next = null;
      bottom=top;
      this.length++;
    }
    else{
      Node newNode = new Node(val);
      newNode.next = top;
      top = newNode;
      this.length++;
    }
  }

 void pop(){

   if(this.length>0){
    if(top.next==null){
      top=null;
      bottom = null;
      length =0 ;
    }
    else{
      Node n = top.next;
      top = n;
      length--;
    }
   }
   else
    System.out.println("Nothing to Pop");
   
 }

 void printStack(){
   Node n = top;
   while(this.length!=0 && n!=null){
     
     System.out.println(n.value);
     n=n.next;

   }
 }

}