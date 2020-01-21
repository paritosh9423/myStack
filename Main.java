class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    myStack ms = new myStack();

    ms.push(1);
    ms.push(2);
    ms.push(3);
    ms.printStack();
    //ms.peek();
    System.out.println();
    ms.pop();
    ms.pop();
    ms.pop();
    ms.pop();
    ms.printStack();

  }
}