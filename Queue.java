import java.util.Scanner;
    public class Queue
    {
        static int[] queue = new int[50];
        static int front = -1, rear = -1;
        static int size;
        static Scanner sc = new Scanner(System.in);

    Queue() {

    }

    Queue(int x) {

    }

    public static int isFull() 
    {
        if (front == 0 && rear == size - 1) 
            return 1;
        else 
            return -1;
        
    }

    public static int isEmpty()
    {
        if ( front==rear)
            return 1;
        else 
            return -1;
     }

    public static void enqueue(int data) 
    {
        if (isFull()==1) 
           System.out.println(" Queue Overflow detected ");
       else
      {
         if(front==-1)
            front=0;
        }
            rear++;
            queue[rear] = data;
     }
      

    

    public static void dequeue() {
        if (isEmpty() == 1) 
            System.out.println(" Queue Underflow detected ");
         else {
            System.out.printf("Element deleted from queue is : %d\n", queue[front]);
            front ++;
        }

    }

    public static void display()
    {
        int i;
        if (rear < front)
        {
            System.out.println("Queue is empty");
        }
        else
        {
          System.out.println("Queue elements : ");
          for(i=front;i<=rear;i++)
              System.out.println( queue[i]);
        }
     }

    public static void main(String[] args)
    {
        int data, n;
        System.out.println("enter the size of the array ");
        size= sc.nextInt();
        do
        {
          System.out.println("  MENU");
          System.out.println("1.Insert");
          System.out.println("2.Delete");
          System.out.println("3.Display");
          System.out.println("4.Quit");
          System.out.println("Enter a choice 1,2,3 or 4  ");
          n = sc.nextInt();
          switch (n)
          {
             case 1:
               System.out.println("enter the element to be inserted in queue : ");
               data= sc.nextInt();
               enqueue(data);
               break;
            case 2:
               dequeue();
               break;
            case 3:
               display();
               break;
            case 4:
               break;
           default:
            System.out.printf("Wrong choice\n");
        }
      } while (n != 4);

    
    }

}