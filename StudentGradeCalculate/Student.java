public class Student
{
    private int id;
    private String name;
    private int marks[];
    private float average;
    private char grade;
    public Student(int a,String b,int[] c)
    {
        id=a;
        name=b;
        marks=c;
    }
    public void setId(int n)
    {
        id=n;
    }
    public int getId()
    {
        return id;
    }
    public void setMarks(int[] marks)
    {
        this.marks=marks;
    }
    public int[] getMarks()
    {
        return marks;
    }
    public void setName(String n)
    {
        name=n;
        
    }
    public String getName()
    {
        return name;
    }
    public void setAverage(float n)
    {
        average=n;
    }
    public float getAverage()
    {
        return average;
    }
    public void setGrade(char n)
    {
        grade=n;
    }
    public char getGrade()
    {
        return grade;
    }
    public void calculateAvg()
    {
        float a1=0.0F;
        for(int a=0;a=80 && this.getAverage()<=100)
        {
            this.setGrade('O');
        }
        else
        {
            this.setGrade('A');
        }
    }
}
