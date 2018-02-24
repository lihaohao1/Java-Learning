# 顺序容器ArrayList

---
## 1.创建
    ArrayList<type> arraylist = new ArrayList<type>();

类似C中的链表，存储任一类型


## 2.功能
>* 添加数据 `.add(s)`
>* 删除数据 `.remove(index)`
>* 插入数据 `.add(location,s)`
>* 取某位值 `.get(index)`
>* 元素个数 `.size()`
>* 判断是否包含某值 `.contains(s)`
>* 判断List是否为空 `.isEmpty()`
>* 清空List  `.clear()`


## 3.toArray(a)用法
``` 
Object[] a = new Object[arraylist.size()];
arraylist.toArray(a);
```


## 4.遍历
- for each循环
``` 
for(String s:arrayList)
{   
    System.out.println(s);
}
```

- 索引值遍历(效率最高)
```
for(int a = 0; a < arraylist.size(); a++)
{
    System.out.print(arraylist.get(a) + " ");
}
```
- 迭代器遍历
```
Iterator it = arraylist.iterator();
while(it.hasNext())
{
    System.out.print(it.next() + " ");
}
```
## 5.代码示例
```java
public class NoteBook
{
    private ArrayList<String> notes = new ArrayList<String>();//创建顺序容器，存储字符串类型
    
    public void add(String s)
    {
        notes.add(s); 
    }
    public void add(String s,int location)
    {
        notes.add(location,s); 
    }
    
    public int getSize()
    {
        return notes.size();/
    }
    
    public String getNote(int index){
        return notes.get(index); 
    }
    
    public void removeNote(int index){
        notes.remove(index); 
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
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("third",1);//插入在下标为1的位置
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        nb.removeNote(1);//返回删除的元素 非Boolean型
        String[] a= nb.list();//将nb中的数据逐一复制到a中
       /*for(String s:nb.list()){   
            System.out.println(s);
        }*/
        
       /*Iterator it = nb.notes.iterator();
        while( it.hasNext())
        {
            System.out.println(it.next()+" ");
        }*/
    }
}
```

<i class="icon-book"></i>附一篇详细关于ArrayList的[学习笔记](http://blog.csdn.net/gongchuangsu/article/details/51514389)











