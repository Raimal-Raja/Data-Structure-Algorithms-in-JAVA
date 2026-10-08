public class QueueY {
    static class Queue {

        int arry[];
        int size;
        int rear = -1;

        Queue(int n) {
            arry = new int[n];
            this.size = n;

        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public int peek() {
            return isEmpty() ? -1 : arry[0];
        }

        //enqueue
        public void add(int data){
            if (rear ==size-1){
                System.out.println("full queue");
                return;
            }
            
            rear ++;
            arry[rear] =data;
        }
        //dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
             return -1;   
            }
            int front = arry[0];
            for(int i = 0; i<rear; i++){
                arry[i] = arry[i+1];
            }
            rear --;
           return front;
        }
       
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
