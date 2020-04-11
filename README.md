# STIA1123_Exercise4
# Question 1
    What will be the output from the following code?
```java
    class QuestionOne {
	private int count;
	
	public void init(){
		count = 1;
	}
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
} 
    public class Q1Main {
	  public static void main (String []arg) {
		QuestionOne q1;
		q1 = new QuestionOne();
		q1.init();
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}
```
Output: 3

	Next, replace the init() method with a constructor. Modify the main() method.
```java

package exercise4;

/**
 * @author Amirul Luqman
 */
class QuestionOne {
    	private int count;
        
        public QuestionOne(int x){
            count = 1; // Method init() change into a constructor
        }
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
}
    public class Q1Main {
	  public static void main (String []arg) {
		QuestionOne q1;
		q1 = new QuestionOne(1); // Pass the integer parameter from line 42 & 43
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}
	
```
# Question 2
	Draw a UML class diagram for Staff class
https://github.com/miyodeskun/STIA1123_Exercise4/blob/master/E4.2.PNG

# Question 4
https://github.com/miyodeskun/STIA1123_Exercise4/blob/master/E4.4.PNG
  
