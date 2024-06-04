public class StackStart {
    public static void main(String[] args) {
        Stack stack1 =new Stack();
        stack1.add(801);
        stack1.add(802);
        stack1.add(803);
        stack1.add(804);
        stack1.add(805);
        System.out.println("size = "+stack1.size());
        System.out.println("pop = "+stack1.pop());
        System.out.println("pop = "+stack1.pop());
        System.out.println("peek = "+stack1.peek());
        System.out.println("pop = "+stack1.pop());
        System.out.println("pop = "+stack1.pop());
        System.out.println("size = "+stack1.size());
        System.out.println("is Empty = "+stack1.isEmpty());
        System.out.println("pop = "+stack1.pop());
        System.out.println("is Empty = "+stack1.isEmpty());
        System.out.println("size = "+stack1.size());
    }//end of main

}//end of all