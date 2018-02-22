import java.util.ArrayList;

class Value{
    private int i;
    public void set(int i){this.i=i;}
    public int get(){return i;}
}

public class NoteBook
{
    private ArrayList<String> notes = new ArrayList<String>();//创建顺序容器，存储字符串类型
    
    public void add(String s)
    {
        notes.add(s); //ArrayList自带添加函数
    }
    public void add(String s,int location)
    {
        notes.add(location,s); //自带插入函数
    }
    
    public int getSize()
    {
        return notes.size();//自带测长度函数
    }
    
    public String getNote(int index){
        return notes.get(index); //自带取值函数
    }
    
    public void removeNote(int index){
        notes.remove(index); //自带删除函数，返回删除的内容
    }
    
    public String[] list(){
        String[] a = new String[notes.size()]; //创建字符串的数组a
        /*for(int i=0;i<notes.size();i++)
        {
            a[i]=notes.get(i);
        }*/
        notes.toArray(a);  //自带函数，将notes中的数据逐一复制到a中
        return a;
    }
    
    public static void main(String[] args){
        Value[] a = new Value[10]; //对象数组
        for(int i=0;i<a.length;i++){
            a[i] = new Value();
            a[i].set(i);
        }
        for(Value v:a){
            System.out.println(v.get());
        }
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("third",1);//插入在下标为1的位置
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        //nb.removeNote(1);//返回删除的内容
        //String[] a= nb.list();//将nb中的数据逐一复制到b中
        for(String s:nb.list()){   
            System.out.println(s);
        }
    }
}
