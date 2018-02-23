# 顺序容器ArrayList

---
## 1.创建
> ArrayList<String> notes = new ArrayList<String>();

类似C中的链表，以存储String类型的数据为例

---
## 2.简单功能
>* 添加数据 `.add(s)`
>* 删除数据 `.remove(index)`
>* 插入数据 `.add(location,s)`
>* 取某位值 `.get(index)`
>* 元素个数 `.size()`
>* 判断是否包含String `.contain("String")`
>* 判断List是否为空 `.isEmpty()`
>* 清空List  `.clear()`

---
## 3.`toArray(a)`用法
``` 
String[] a = new String[arrayList.size()];
arrayList.toArray(a);
```

---
## 4.遍历
- for each循环
``` 
for(String s:arryList)
{   
    System.out.println(s);
}
```

- 索引值遍历(效率最高)
```
for(int a = 0; a < arrayList.size(); a++)
{
    System.out.print(arrayList.get(a) + " ");
}
```
- 迭代器遍历
```
Iterator<String> a = arrayList.iterator();
while(a.hasNext())
{
    System.out.print(a.next() + " ");
}
```
---
<i class="icon-book"></i>附一篇详细关于ArrayList的[学习笔记](http://blog.csdn.net/gongchuangsu/article/details/51514389)











