public class QueueStart {
    public static void main(String[] args) {
        Queue queue1 =new Queue();
        queue1.add(801);
        queue1.add(802);
        queue1.add(803);
        queue1.add(804);
        queue1.add(805);
        System.out.println("size = "+queue1.size());
        System.out.println("pop = "+queue1.pop());
        System.out.println("pop = "+queue1.pop());
        System.out.println("peek = "+queue1.peek());
        System.out.println("pop = "+queue1.pop());
        System.out.println("pop = "+queue1.pop());
        System.out.println("size = "+queue1.size());
        System.out.println("is Empty = "+queue1.isEmpty());
        System.out.println("pop = "+queue1.pop());
        System.out.println("is Empty = "+queue1.isEmpty());
        System.out.println("size = "+queue1.size());
    }//end of main

}//end of all