/*
学生成绩的数据结构
通过学生的姓名，可以找到他的所有的成绩，而每一门课的成绩，是由课程名称和分数构成的。
而如果我们还希望这个程序能找出某一门课的全部学生的成绩
 */
import java.util.*;
public class Student  
{
   private String name;//学生姓名
   HashMap<String,Integer> per = new HashMap<String,Integer>();// 学生所选的课程及对应成绩
   public Student(String name){this.name = name;}   //录入名字
   void record(String sub,Integer marks){per.put(sub,marks);}//录入课程及对应成绩
   HashMap<String,Integer> getValue(){return per;}//输出课程+成绩
   String getName(){return name;}//输出名字
   void Show(){System.out.println(per);}//}打印课程名+成绩
   
   public static void main(String[] args){
        subject math = new subject("math");
        subject physics = new subject("physics");
        Student a = new Student("a");
        Student b = new Student("b");        
        math.add(a, 10);
        math.add(b, 20);
        physics.add(a, 30);        
        a.Show();
        System.out.println("---------"); 
        b.Show();        
        System.out.println("---------");        
        math.Show();
        System.out.println("---------"); 
        physics.Show();
    }
}

class subject{
    private ArrayList<Student> st = new ArrayList<Student>();//选该课学生的名单
    private String sub;//课程名
    public subject(String sub){this.sub = sub;}//录入课程名
    void add(Student student,Integer marks)//录入姓名，成绩
    {
        student.record(sub,marks);//录入该学生的课程及对应成绩
        st.add(student);//容器中增加该学生
    }
    void Show()//
    {
        System.out.println(sub +"：");//打印课程名：
        for(Student s:st) System.out.println(s.getName()+":"+s.getValue().get(sub));//逐一打印学生姓名及该课程成绩
    }
}
    
