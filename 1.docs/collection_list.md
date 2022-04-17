# List
集合操作不外乎几种类型的操作:
- 创建集合
- 查询
- 修改(添加/删除)
- ...  
1.Interface Iterable(可迭代)
```text
Iterator<T> iterator(); 返回T类型的迭代器(Iterator)

default void forEach(Consumer<? super T> action) {
    Objects.requireNonNull(action);
    for (T t : this) {
    action.accept(t);
    }
}

default Spliterator<T> spliterator() {
    return Spliterators.spliteratorUnknownSize(iterator(), 0);
}
```

2.Interface Collection
```text
//查询操作
int size();  返回集合元素个数
boolean isEmpty();  集合是否为空
boolean contains(Object o); 是否包含元素o
Iterator<E> iterator(); ↑Iterable
Object[] toArray(); 返回所有元素的数组
<T> T[] toArray(T[] a);
//修改操作
boolean add(E e); 增加元素e
boolean remove(Object o); 删除元素o
//批量操作
boolean containsAll(Collection<?> c); 是否为子集
boolean addAll(Collection<? extends E> c);  批量添加
boolean removeAll(Collection<?> c); 批量删
default boolean removeIf(Predicate<? super E> filter) {
    Objects.requireNonNull(filter);
    boolean removed = false;
    final Iterator<E> each = iterator();
    while (each.hasNext()) {
        if (filter.test(each.next())) {
            each.remove();
            removed = true;
        }
    }
    return removed;
}
boolean retainAll(Collection<?> c); 保留集合c与当前集合的公共元素
void clear(); 移除所有元素
//比较和hash
boolean equals(Object o); ↑Object
int hashCode(); ↑Object
default Spliterator<E> spliterator() {  ↑Collection
    return Spliterators.spliterator(this, 0);
}
default Stream<E> stream() {
    return StreamSupport.stream(spliterator(), false);
}
default Stream<E> parallelStream() {
    return StreamSupport.stream(spliterator(), true);
}
```
3.Interface List


## ArrayList
```text
class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Java.io.Serializable{
    //默认容量(psf=public static final)
    psf int  DEFAULT_CAPACITY = 10; 默认容量10
    psf Object[] EMPTY_ELEMENTDATA = {};  用于空实例的共享数组实例
    psf Object[] DEFAULTTCAPACITY_EMPTY_ELEMENTDATA={}; 
    transient Object[] elementData; 存储数据的数组缓冲区，容量就是这个数组长度
    private int size;  大小，元素的数量
    
    //构造函数
    public ArrayList(int initialCapacity);
    public ArrayList();
    public ArrayList(Collection<? extends E> c);
}
```
### ArrayList() 源码分析
```text
1.将默认的数组赋给 elementData
public ArrayList() {
    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
}

此时ArrayList 实例的属性为:
elementData=Object[] 空数组
size=0
modCount=0
```
### ArrayList(int initialCapacity) 源码分析
```text
1.如果指定的容量大于0，则创建一个新的指定容量大小的数组
如果容量为0，则按照无参构造方式，将默认的空数组赋值给elementData
如果指定容量小于0，抛出异常
public ArrayList(int initialCapacity) {
    if (initialCapacity > 0) {
        this.elementData = new Object[initialCapacity];
    } else if (initialCapacity == 0) {
        this.elementData = EMPTY_ELEMENTDATA;
    } else {
        throw new IllegalArgumentException("Illegal Capacity: "+
                                           initialCapacity);
    }
}
```
### ArrayList(Collection c) 源码分析
```text
1.
    public ArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData = EMPTY_ELEMENTDATA;
        }
    }
```