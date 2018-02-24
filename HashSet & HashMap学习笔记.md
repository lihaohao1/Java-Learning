# HashSet & HashMap

---
## HashSet
所有的元素都具有唯一的值，元素在其中没有顺序
### 1.创建
    HashSet<type> hashset = new HashSet<type>(); 
    //创建时必须要有type，int、String、Object...


### 2.功能
>* 添加数据`.add(x)` //添加String、int、int[]、自定义对象
>* 删除数据`.remove(Object o)` //boolean
>* 判断是否包含某内容`.contains(Object o)`
>* 判断是否为空`.isEmpty()`
>* 清空 `.clear()`
>* 集合元素个数 ` .size()`

### 3.遍历
* 迭代器遍历
```java
Iteraor it = hashset.iterator();
while (it.hasNext())
{
     System.out.println(it.next());
}
```
* foreach循环
```java
for(Object k : hashset)
{
     System.put.println(k);
}
```
### 4.代码示例
```java
public class hashset
{
public static void main(String[] args){
     HashSet<Object> hs =  new HashSet<Object>();
     hs.add(0);
     hs.add("1");
     hs.add(2);
     hs.add("abc");
     hs.add("abcd");
     System.out.println(hs.size()); //5
     System.out.println(hs.remove("1")); //true
     System.out.println(hs.isEmpty());//false
     System.out.println(hs.contains(2));//true
     System.out.println("======================");
     System.out.println(hs.remove("1"));//false
     System.out.println("======================");
     hs.clear();  
     System.out.println("======================");
     /*for(Object k:hs)
     {
          System.out.println(k);
         }*/
         
     /*Iterator it = hs.iterator();
     while(it.hasNext())
     {
          System.out.println(it.next()+" ");
         }*/
}
}
```
<i class="icon-book"></i>附一篇详细关于[HashSet的介绍](http://blog.csdn.net/tingzhiyi/article/details/52152487)

---
## HashMap
Hash表，有的地方翻译为散列表。
传统意义上的Hash表，是能以int做值，将数据存放起来的数据结构。Java的Hash表可以以任何实现了hash()函数的类的对象做值来存放对象。
HashMap<K,V> 一个key只对应一个值

### 1.创建
    HashMap<type,type> hashmap = new HashMap<type,type>();
    
### 2.功能
>* 添加数据`.put(x)` 
>* 得到数据`.get(key)`
>* 删除数据`.remove(key)` //boolean
>* 判断是否包含某内容`.containsKey(key)`
>* 判断是否为空`.isEmpty()`
>* 清空 `.clear()`
>* 元素个数 ` .keySet().size()` //keySet()是个集合，包含所有的key

### 3.遍历
* 迭代器遍历
```java
Iterator it = hashmap.keySet().iterator();
while(it.hasNext())
{
     Integer key=(Integer)it.next();
     System.out.println(key);
     System.out.println(hashmap.get(key));
}
```
* entrySet()
```java
Iterator<Map.Entry<Integer,String>>iterator = hm.entrySet().iterator();
while(iterator.hasNext())
{
     Map.Entry<Integer,String>entry = iterator.next();
     System.out.println(entry.getKey());
     System.out.println(entry.getValue());
}
```

### 4.代码示例
```java
public class hashmap
{
   public static void main(String[] args)
   {
       HashMap<Integer,String> hm = new HashMap<Integer,String>();
       hm.put(1,"a");
       hm.put(2,"b");
       hm.put(3,"c");
       System.out.println(hm);//{1=a, 2=b, 3=c}
       System.out.println(hm.keySet());//[1, 2, 3]
       System.out.println(hm.remove(1));//a
       System.out.println(hm.containsKey(1))//false;
       System.out.println(hm.containsKey(2));//true
       System.out.println(hm.get(3));//c
       System.out.println(hm.isEmpty());//false
      //迭代器
      /* Iterator it = hm.keySet().iterator();
       while(it.hasNext())
       {
           Integer k=(Integer)it.next();
           System.out.println(k);
           System.out.println(hm.get(k));
        }*/
      //entrySet()
        /*
        Iterator<Map.Entry<Integer,String>>iterator = hm.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer,String>entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
    }
}
```


<i class="icon-book"></i>附一篇关于[遍历HashMap的方式](http://blog.csdn.net/u010127245/article/details/50937384)以及关于[entrySet遍历的分析](https://www.cnblogs.com/aquastone/p/java-hashmap-entryset.html)








