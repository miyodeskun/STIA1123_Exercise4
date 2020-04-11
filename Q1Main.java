
package exercise4;

/**
 *
 * @author Amirul Luqman
 */
class QuestionOne {
    	private int count;
        
        public QuestionOne(int x){
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
		q1 = new QuestionOne(1);
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}
