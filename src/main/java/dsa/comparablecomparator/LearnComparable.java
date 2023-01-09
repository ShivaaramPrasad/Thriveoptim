package dsa.comparablecomparator;

public class LearnComparable  implements Comparable<LearnComparable>{

    private int marks;
    private String name;
    private String subject;

    // Used to sort mark by year
    public int compareTo(LearnComparable m)
    {
        return this.marks - m.marks;
    }
    // Constructor
    public LearnComparable(String nm, String rt, int mar)
    {
        this.name = nm;
        this.subject = rt;
        this.marks = mar;
    }
	
    

}
