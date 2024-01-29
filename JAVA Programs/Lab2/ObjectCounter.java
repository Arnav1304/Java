package Lab2;
public class ObjectCounter {
 private static int numberOfObjects = 0;   
        public ObjectCounter() {
            numberOfObjects++;
        }
    
        public static int getNumberOfObjects() {
            return numberOfObjects;
        }
    
        public static void main(String[] args) {
            ObjectCounter obj1 = new ObjectCounter();
            ObjectCounter obj2 = new ObjectCounter();
            ObjectCounter obj3 = new ObjectCounter();
    
            System.out.println("Number of objects created: " + ObjectCounter.getNumberOfObjects());
       }
    }

