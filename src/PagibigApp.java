public class PagibigApp{
    public static void main(String[] args) {
        QueueSystem queueSystem = QueueSystem.getInstance();

        queueSystem.generateNewQueueNumber();
        queueSystem.generateNewQueueNumber();
        queueSystem.generateNewQueueNumber();
        queueSystem.showCurrentQueueNumber();
        System.out.println();
        queueSystem.proccessCurrentQueueNumber();
        queueSystem.resetQueueNumber();
        System.out.println();
        queueSystem.showCurrentQueueNumber();
    }   
}