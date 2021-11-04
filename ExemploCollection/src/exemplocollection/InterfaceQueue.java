package exemplocollection;

import java.util.PriorityQueue;

public class InterfaceQueue {

    public static void main(String args[]) {
        
        //InterfaceQueue (filas)
        
        //PriorityQueue
        PriorityQueue<Double> filaDePrioridade = new PriorityQueue<>();
        
        filaDePrioridade.offer(4.9);
        filaDePrioridade.offer(1.9);
        filaDePrioridade.offer(7.3);
        filaDePrioridade.offer(7.9);
        filaDePrioridade.offer(5.9);
        
        System.out.println(filaDePrioridade);
        System.out.println(filaDePrioridade.size());
        System.out.println(filaDePrioridade.poll());
        System.out.println(filaDePrioridade.poll());
        System.out.println(filaDePrioridade.peek());
        System.out.println(filaDePrioridade);
        
        while (filaDePrioridade.size() > 0) {
            System.out.println(filaDePrioridade.peek());
            filaDePrioridade.poll();
        }
        
        System.out.println(filaDePrioridade.peek());
        
    }
}
