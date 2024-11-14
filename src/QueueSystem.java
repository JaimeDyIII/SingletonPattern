import java.util.Deque;
import java.util.LinkedList;

public class QueueSystem{
    private static QueueSystem instance;
    private Deque<Integer> helpDeskQueue = new LinkedList<>();

    private QueueSystem(){    

    }

    public static synchronized QueueSystem getInstance(){
        if(instance == null){
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized void generateNewQueueNumber(){
        if(!helpDeskQueue.isEmpty()){
            helpDeskQueue.add(helpDeskQueue.peekLast()+1);
        } else {
            helpDeskQueue.add(1);
        }
        System.out.println("Current queue length: " + helpDeskQueue.peekLast());
    }

    public synchronized void resetQueueNumber(){
        helpDeskQueue.clear();
    }

    public void showCurrentQueueNumber(){
        if (!helpDeskQueue.isEmpty()) {
            System.out.print("Next in line: #" + helpDeskQueue.peek());
        } else {
            System.out.println("No queue, proceed to the desk.");
        }
    }

    public synchronized void proccessCurrentQueueNumber(){
        if (!helpDeskQueue.isEmpty()) {
            System.out.print("Processed: #" + helpDeskQueue.poll() + 
                             "\nNext in line: #" + helpDeskQueue.peek());
        } else {
            System.out.println("No queue, proceed to the desk.");
        }
    }
}