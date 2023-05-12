 # Collection Framework 컬렉션 프레임워크 
_Assembled by yunjin (2023-01-01)_

</br>

<details>
<summary>🔎요약</summary>
<div markdown="1">

#### 🕵🏻‍♂️ Collection Framework 
> - `다수의 객체(데이터)를 다루기 위함` 
> 	
> #### Collection
> - 사전적의미론 여러 객체(데이터)를 모아 놓은 것을 의미함
> - `List, et의 공통 부분만 뽑아 놓은 Collection 인터페이스`라고함 (Map 제외)
> - List, Set은 Collection의 자손이기 때문에 collection 인터페이스가 가지고 있는 모든 메서드를 가지고 있음
> - Collection 인터페이스를 구현한 클래스를 List, Set 이라고 보면 됨
> 
> #### Framework
> - 프로그램을 만들 때 정해진 툴

#### List, Set, Map 간단 정리
> - `데이터를 다루기 위한 컬렉션 프레임워크`의 핵심 인터페이스는 크게 3가지 존재
> #### List 
> - `순서 유지O, 중복 허용 O`
> - ArrayList, LinkedList (List 인터페이스를 구현한 핵심 클래스)
>
> #### Set
> - `순서 유지X, 중복 허용 X`
> - HashSet, TreeSet (Set 인터페이스를 구현한 핵심 클래스)
> - 집합과 관련된 메서드 존재  
>	→ addAll(합집합), containsAll(부분집합), removeAll(차집합), retainAll(교집합)
> 
> #### Map
> - `순서 유지X, Key-중복 허용 X, Value-중복 허용 O`
> - HashMap, TreeMap (Map인터페이스를 구현한 핵심 클래스)
> - LinkedHashMap은 순서가 있음
> - HashMap 동기화 X, HashTable 동기화 O (13장 쓰레드)
> - entrySet() key-value 쌍을 Map.Entry타입의 객체로 저장함
> - values() return 타입이 Collection    
>	→ Collectoin은 List, Set 모두 포함되어 있어서 중복이 있어도 되고, 없어도 됨
>	
> #### 자료구조
> - 이 외에도 여러가지 컬렉션에 있고 `데이터를 잘 다루기 위해서는 어떤 식으로 저장 해야 되는 지 어떤 구조로 저장해야 되는 지` 정리해 놓은 학문이 자료구조임
> - 모든 Data Structure는 배열(연속)/연결(비연속)기반으로 되어 있음	
> 
</div>
</details>
 
<details>
<summary>🔎상세</summary>
<div markdown="1">     
	
#### 🕵🏻‍♀️ Collection Framework 
> - 다수의 객체(데이터)를 다루기 위함 
> - 정형화된 lib를 이용해 수월한 프로그래밍 하기 위함 
> - 프레임워크를 사용하면 생산성이 올라가고, 유지보수에 용이함 
> - java.util 패키지에 포함되어 있고, jdk1.2부터 제공되어 있음 
> - 검색, 저장, 정렬, 삭제 
>
> ##### Collection 기본 메서드
> - add(), remove(), size(), isEmpty(), iterator(), clear(), equals(), hashCode(), toArray(), contains(), retain() 등
> 
> ##### [`+여기서 잠깐`]() 객체를 다룬 다는 것은?   	
>  - 데이터를 저장,삭제,검색,정렬을 하는 것을 의미함    
>
> ##### [`+여기서 잠깐`]() 객체를 다룬 다는 것은?  	 
>  - lib란 : 기능을 의미   	 
>	
> #### List, Set, Map 
> - List : 순서가 있고 데이터의 중복 허용함    
> 	→ 구현 클래스 : ArrayList, LinkedList, Stack, Vector 등
> - Set : 순서를 유지하지 않고 데이터의 중복 허용안함   
> 	→ 구현 클래스 : HashSet, TreeSet 등  
> - Map : 키(key)와 값(value)이 한 쌍으로 이루어진 데이터 집합   
>	순서는 유지하지 않음. 키는 중복 허용하지 않고, 값은 중복을 허용함   
> 	→ 구현 클래스 : HashMap, TreeMap, HashTable, Properties 등 
> - List, Set의 공통 부분을 뽑아서 Collection이라는 인터페이스를 따로 정의함
> 
> 
> #### Collection
> - 여러 객체(데이터)를 모아 놓은 것을 의미
> 
> #### Framework
> - 프로그램을 만들 때 정해진 툴
> 
#### List 
>
>
>                      List
>        ↗              ↑             ↖
>     Vector(old) | *ArrayList(new) | *LinkedList
>        ↑
>     Statck
>	
> - Vector(old) ≒ ArrayList(new)    
> - Vector(old) : 동기화 O
> - ArrayList(new) : 동기화 X   
> - List 인터페이스는 순서 유지 O, 중복 허용 O  
>     
> #### 메서드
> - 추가 add, 
> - 삭제 remove
> - 검색 indexOf, lastIndexOf
> - 변경 set
> - 정렬 sort
> - 읽기 get, subList
> 
> #### ArrayList (배열기반)
>> - List 인터페이스 구현함   
>>    → List가 붙으면 List 인터페이스 구현했구나 알 수 있음
>> - 저장 순서가 유지되고, 중복을 허용함
>> - Array 배열로 데이터 저장공간은 배열을 사용함 (배열기반)
>>    → 데이터 크기 가변
>>
>> #### Vector
>>> - Vector 클래스를 안을 보면 객체배열이 있고, 자체적으로 동기화 처리 되어 있음  
>>> - Object[] 객체배열에는 모든 객체의 배열을 저장할 수 있음 (다형성)    
>>> 	→ 다형성 : 조상 타입의 참조변수로 자손 객체를 다를 수 있음 
>> 
>> #### Array 장단점
>>> ##### 장점
>>> - 순차적인 데이터 추가/삭제 빠름 (끝에 추가, 삭제) 
>>> - 배열은 구조가 간단하고, 데이터를 읽는 데 걸리는 시간(접근시간, access time)이 짧음  
>>> ##### 단점	
>>> - 크기변경 불가(데이터 크기 불변), 데이터 중간에 조작하는 추가/삭제 시간 많이 걸림 	
>>> - 비순차적인 데이터의 추가, 변경, 삭제 시간이 많이 걸림 
>>> * 크기를 변경해야 하는 경우 (새로운 배열 생성 후 데이터 복사)  
>>> 	1. 더 큰 배열 생성 
>>> 	2. 내용 복사 
>>> 	3. 참조변경 
>>> * 크기 변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리 낭비됨
> 
>  #### LinkedList (연결기반) 
>> - 배열의 단점을 보완
>> - 불연속적 (불연속적으로 존재하는 데이터를 연결, 노드마다 연결)
>> - 다음요소, 다음노드만 참조함 (next)
>> - 데이터 접근 시간복잡도 : O(n) - 맨 첫번째 노드부터 원하는 값을 찾을 때까지 자료 구조를 전체를 순회
>> - 데이터 추가,삭제 시간복잡도 : O(1) - 노드의 next(다음 노드의 레퍼런스)를 교체
>> 
>> ##### 장점
>> - 변경에 유리
>> - 데이터의 추가 (한 번의 노드객체 생성과 두 번의 참조변경만으로 가능)	
>> - 데이터의 삭제 (한 번의 참조변경만으로 가능)
>>
>> ##### 단점	
>> - 접근성이 나쁨
> 
> #### Doubly LinkedList (이중 연결리스트)
>> - 연결리스트 단점을 보완해 접근성을 향상 시킴
>> - 장점 : 접근성 향상, 바로 앞뒤 이동 좋음. 이전/다음 노드 참조 (next, previous)
>> - 단점 : 한번에 2-3개 요소를 건너 뛸 수 없음
> 
> #### Doubly Circular LinkedList (이중 원형 연결리스트)
>> - 맨 앞/뒤 요소 연결됨 (ex, TV채널 0번, 99번..)  
>> - 이중 연결리스트로 구현되어 있음  
> 
> #### ArrayList vs LinkedList 기본비교
>>
>> |**Collection**|읽기(접근시간)|변경(추가/삭제)|단점|비고|
>> |:---:|---:|---|:---|:---|
>> |ArrayList|⭐빠름|느림(순차적인 추가/삭제 빠름⭐)|비효율적인 메모리 사용|배열기반,순차적,연속적
>> |LinkedList|느림|빠름⭐|데이터가 많을 수록 접근성이 떨어짐|연결기반,비순차적,비연속
>>
>> * ArrayList 비효율적인 메모리 사용   
>>   → 성능을 높히기 위해서 배열의 크기를 높게 잡을 때, 배열의 단점이 복사/이동이 문제임   
>>   그걸 적게 일어나게 하려면 크기를 크게 잡아야 해서 비효율적임
>
> #### ArrayList vs LinkedList 성능비교
>> - 순차 데이터 추가/삭제 : ArrayList 승
>> - 비순차 데이터 추가/삭제 : LinkedList 승 (20배 차이)
>> - 접근시간 (access time) : ArrayList 승   
>> - 인덱스가 n인 데이터의 주소 = 배열의 주소 + n*데이터 타입의 크기
>> 
> #### ArrayList 데이터 주소 및 접근시간 구하기
>> - 저장된 주소 찾기  
>>  ArrayList {1, 2, 3, 4}  
>>   
>>  배열의 주소가 1001인 배열
>>  [][][][] => 1 : 1001 ~ 1004  
>>  [][][][] => 2 : 1005 ~ 1008  
>>  [][][][] => 3 : 1009 ~ 1012  
>>  [][][][] => 4 : 1013 ~ 1016  
>>
>>  배열의 주소 + n*데이터 타입의 크기  
>>  1001 + 0 * 4 : 1001  
>>  1001 + 1 * 4 : 1005  
>>  1001 + 2 * 4 : 1009  
>>  1001 + 3 * 4 : 1013  
>>  
>> - 접근시간  
>> O(1)
>
> #### Stack
>> - LIFO 구조 (Last In First Out)   
>> - 마지막에 저장된 것을 제일 먼저 꺼내게 됨
>> - 제일 처음 저장된 것을 마지막에 꺼내게 됨  
>> - 저장(push), 추출(pop)   
>> - 스택을 구현할 때 배열(Array) 적합함  
>>	→ 이유? 순차적인 추가/삭제에 용이하기 때문 
>>  	
>> #### 메서드  
>> - boolean empty() : 스택이 비어있는 지 알려줌  
>> - Object peek() : 스택의 맨 위에 저장된 객체 반환. Exception 발생 (try-catch체크)  
>> - Object pop() : 스택 맨 위에 저장된 객체를 반환. Exception 발생 (try-catch체크)  
>> - Object push(Object item) : 스택에 객체를 저장  
>> - int search(Object o) : 객체를 찾아 위치 반환, 못찾으면 -1 (배열과 달리 위치는 0이 아닌 1부터 시작)  
>> - `스택은 클래스임(구현체)`. 큐는 인터페이스  
> 
> #### Queue(큐)
>> - FIFO 구조 (First In First Out)
>> - 제일 먼저 저장한 것을 제일 먼저 꺼내게 됨  
>> - 마지막에 저장된 것이 마지막에 꺼내게 됨  
>> - 저장(offer), 추출(poll) 
>> 
>> - 큐를 구현할 때 배열(LinkedList) 적합함    
>>	→ 이유? 요소를 삭제하면 앞뒤 자리 이동없이 주소만 연결해주면 되기 때문에 링크드리스트가 용이함   
>> #### 메서드
>> - boolean add() : 추가, 저장공간 부족하면 Exception 발생 (try-catch체크)
>> - Object  remove() : 삭제, 비어있으면 Exception 발생 (try-catch체크)
>> - Object element() :  삭제없이 요소를 읽어옴. Exception 발생
>> - boolean offer(Object o) : 큐에 객체를 저장
>> - Object poll() : 삭제, 비어 있으면 null 반환 (if로 null 체크)
>> - Object peek() : 삭제없이 요소를 읽어온다. 큐가 비어 있으면 null 반환
>> - `큐는 인터페이스`이다. 그러므로 큐를 구현하는 방법은
>>    1. Queue 직접구현
>>    2. Queue 구현한 클래스 사용 ex) queue q = new LinkedList(); 
>>   
> #### Stack vs Queue 비교
>> |**List**|구현체|장단점| 
>> |:---:|:---|:---| 
>> |Stack|ArrayList 구현하는 게 유리함|중간에 추가와 삭제하면 자리 이동해야되서 비효율적 
>> |Queue|LinkedList 사용하면 적합함|중간에 추가와 삭제할 때 자리이동 안해도 되서 유리함	 
>
>
#### 🕵 Collection Framework 데이터 읽기  
> #### Iterator, ListIterator, Enumeration  
>> - 컬렉션에 저장된 데이터를 읽는데 사용되는 `인터페이스`   
>> - 컬렉션 종류마다 읽어오는 방법이 다른데 iterator의 `표준화`된 방법을 통해 요소를 읽어옴  
>> - Enumeration은 Iterator의 구버전   
>> 	
>> #### 메서드  
>> - boolean hasNext() : 읽어 올 요소가 남아있는 지 확인함  
>> - Object next() : 다음 요소를 읽어 옴  
>	
> #### Iterator 
>> - Iterator는 단반향으로 데이터를 읽음
>> - `컬렉션(List/Set/Map)마다 구조가 달라 읽어오는 방법이 다름`  
>>	→  `저장된 요소들을 읽어오는 방법을 Iterator로 표준화 한 것` 
>	
> #### Iterator (1회용)	
>> - Iterator는 `1회용`이라 다 쓰고 나면 다시 얻어와야 해서 `새로운 Iterator를 만들`어야 함  
>> ```    
>> ListIterator it = tmp.listIterator();
>>
>> while(it.hasNext()) {
>>      System.out.println(++i + "." + it.next());
>> }
>>
>>
>> ListIterator it2 = tmp.listIterator();
>>
>> while(it2.hasNext()) {
>>      System.out.println(++i + "." + it2.next());
>> }  
>> ```
>	
> #### ListIterator 양방향
>> - ListIterator는 `양방향`으로 데이터를 읽어 옴
>> - 이전 요소 읽어올 수 있음 
>> - ex) LinkedList 데이터 요소를 읽어 올 때 listIterator() 메서드를 이용함 	
> 
> #### Map
>> - `Collection 자손이 아니기 때문에 Iterator 메서드가 없음`
>> - Map에서 데이터를 불러오려면 (Set type)KeySet(), (Set type)entrySet(), (Collections)values() 호출
>> 
>> #### 메서드 
>> - keySet() 
>> - entrySet()  
>> - values()    
>>	→ `KeySet(), entrySet(), values()를 이용해 Set(KeySet,entrySet)이나 Collection(values) 얻어 온 후 Iterator를 호출`해야 함 
>>	
>> ##### [`+여기서 잠깐`]() entry란?   
>> 	- k,v 한쌍을 의미함   
> 
> 
> #### Array 
>> - 배열을 다루기 편리한 메서드(static) 제공 
>> - Objects, Collections, Math  
>> 	→ 위 3개 클래스는 static 메서드를 제공하고, util 클래스라고 부름
>> 
>> #### 배열의 출력 
>> - toString() 
>> 
>> #### 배열의 복사 
>> - copyOf() // end 
>> - copyOfRange() // from-to범위 
>> 
>> #### 배열 채우기 
>> - fill() // 특정값을 채움 
>> - setAll() // 람다식을 이용해서 채움
>> 
>> #### 배열의 정렬과 검색   
>> - sort()   
>> - binarySearch()   
>>	→ 이진탐색(이진검색/이분검색)은 정렬 되어 있을 때만 가능함  
>>	→ 1. 정렬(sort) 2. binarySearch() 메서드 사용  
>> - 순차검색(탐색)  
>>	→ 순서대로 찾음   
>> #### 다차원 배열의 출력  
>> - deepToString() 
>> - deepEquals() 
> 
> 
> ### List vs 배열 차이 
>> List : 읽기 전용 
>> Array : 읽기, 변경 가능 
>> ``` 	
>> 읽기전용
>> List list = Arrays.asList(new Integer[]{1,2,3,4,5,});
>> List list = Arrays.asList(1,2,3,4,5)
>> 
>> 
>> 변경가능
>> List list = new ArrayList(Arrays.asList(1,2,3,4,5));
>> ``` 
>
>	
> #### Comparator와 Comparable
>> - `정렬기준 제공하는 인터페이스` 
>> - 객체 정렬에 필요한 메서드(정렬기준)를 정의한 인터페이스  
>> ※ 인터페이스로 기본클래스에 구현된 경우도 있고 추가 구현 시, 추상메서드만 존재하여 오버라이딩 해야함  
>> 
>> #### Comparator 
>> - int compare(Object o1, Object o2); // o1,o2 두 객체 비교  
>> - boolean equals(Object obj); // 오버라이딩  
>> 
>> #### Comparable  
>> - int compareTo(Object o); // 주어진 객체 o와 자신(this) 비교   
>> 
>> #### compare()와 compareTo() 메서드  
>> - 두 대상을 비교 후 결과에 따라 같으면 0, 왼쪽이 크면 양수, 오른쪽 크면 -1로 반환 
>> - ex) 3<9 (-) | 9>3 (+) 
>>
>> ##### [`+여기서 잠깐`]() 정렬 sort() 방법 
>> 	1. 두 대상 비교 (대상) 
>>	2. 자리바꿈 (기준) 
>>	→ 오름차순, 내림차순에 따라 자리 변동 
>>	3. 1,2번 반복 (반복)            
>>    - 정렬 방법은 똑같다. 단, 전략이 다르다. (정렬기준 등)
>>    
#### Set
>
>                 Set
>        ↗         ↑
>     HashSet*   SortedSet
>                   ↑
>                TreeSet*
>  
> - Set 인터페이스 - 순서 X, 중복 X
> 
> #### 집합관련 메서드
> - addAll(합집합), containsAll(부분집합), removeAll(차집합), retainAll(교집합)
>
> #### HashSet
>> - `순서를 유지하지 않고 중복을 허용하지 않음`
>> - `Set 인터페이스를 구현`한 대표적인 컬렉션 클래스
>> - `순서를 유지하려면, LinkedHashSet`클래스를 사용하면 된다.
>>
>> #### 주요 메서드
>> - HashSet()
>> - HashSet(Collection c) 생성자
>> - HashSet(int initialCapacity) 초기용량
>> - HashSet(int initialCapacity, float loadFactor) 조건 0.8이면 80%차면 언제로 2배로 늘릴 것인지. (언제)
>> - 보통 컬렉션 클래스들은 공간이 부족하면 스스로 늘리지만, loadFactor 통해 설정할 수 있음
>> 
>> 
>> ##### 추가
>> - boolean add(Object o)
>>   - HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는 지 확인
>>   - 같은 객체가 없으면 저장하고, 있으면 저장하지 않음
>>   - add() 메서드 실행 시, equals(), hashCode() 호출해서 중복 유무 확인함
>>   - equals(), hashCode()는 Object클래스에 있음
>>   - equals(), hashCode()를 overriding 하지 않으면 HashSet이 제대로 동작안함
>> - boolean addAll(Collection c) 합집합
>>
>> ##### 삭제
>> - boolean remove(Object o)
>> - boolean removeAll(Collection c) 교집합
>> - boolean retainAll(Collection c) 차집합
>> - void clear() 모두삭제
>> 
>> ##### 포함여부
>> - boolean contains(Object o)
>> - boolean containsAll(Collection c) Collection에 담긴 여러객체 모두 포함되어 있는 지
>> - Iterator iterator()
>> 
>> ##### 기타
>> - boolean isEmpty() 비어 있는 지 확인
>> - int size()
>> - Object[] toArray() 객체 배열로 반환
>> - Object[] toArray(Object[ ] a)
>
> #### TreeSet
>> - `범위 검색와 정렬에 유리한` 컬렉션 클래스
>> - `HashSet보다 데이터 추가, 삭제에 시간 소요`됨
>> - 이진 탐색 트리(binary search tree)로 구현됨
>>   - 이진 트리는 모든 노드가 최대 0~2개인 하위 노드를 갖음
>>   - 각 요소(node)가 나무(tree)형태로 연결 (LinkedList의 변형)
>>   - 루트(root)부터 시작됨
>> 
>> ##### 주요 메서드
>> - TreeSet() 기본 생성자
>> - TreeSet(Collection c) 주어진 컬렉션을 저장하는 TreeSet을 생성
>> - TreeSet(Comparator comp) 주어진 `정렬기준`으로 정렬하는 TreeSet을 생성
>> 
>> ##### 검색
>> - SortedSet subSet(Object fromElement, Object toElement) 범위 검색의 결과 반환 (끝 범위 포함 안함)
>> - SortedSet headSet(Object toElement) 지정된 객체보다 작은 값의 객체들을 반환
>> - SortedSet tailSet(Object fromElement) 지정된 객체보다 큰 값의 객체들을 반환
>> 
>> ##### 이진 탐색 트리(Binary Search Tree)
>> - 부모보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장
>> - `데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림 (왜? 비교 횟수가 증가하기 때문)`
>> - 이진트리 종류 중 하나임
>>
>> ##### 트리 순회(Binary Tree Travelsal)
>> - 이진 트리의 모든 노드를 한번씩 읽는 것을 트리 순회라함
>> - 전위(pre order), 중위(in order), 후위(post order), 레벨(level order) 순회법이 있음
>> - 중위 순위면 오름차순으로 정렬됨
>> ##### TreeSet 데이터 저장
>> - 데이터 저장 시, 중복을 허용하지 않기 하기 위해 비교기준을 줘야 함
>> - 방법1
>>   - add(Object o) : 저장하는 o 객체가 Comparable 구현
>>   - 저장하는 객체에 Comparable 인터페이스를 구현하여 compareTo(Object o) 메서드 오버라이딩
>> - 방법2
>>   - TreeSet(Comparator comp) : 
>>     TreeSet() 생성자에 정렬기준을 갖는 Comparator 인터페이스를 구현하는 클래스 생성 및 compare(Object o1, Object o2) 오버라이딩
>
> #### TreeSet vs HashSet 요약 비교
>> ##### TreeSet vs HashSet 특징 비교
>> - TreeSet : 범위검색, 정렬에 유리한 클래스
>> - HashSet :  TreeSet보다 데이터 추가, 삭제에 유리한 클래스이나
>>   HashSet은 정렬 필요 (List 생성 후 sort() 해야함)
>>
>> ##### HashSet vs TreeSet add()시 정렬비교
>> - HashSet  :  저장하는 객체에 equals(), hashCode() 오버라이딩 
>> - TreeSet :  비교기준 Comparator 가 없으면 저장하는 객체 Comparable 구현 compareTo() 오버라이딩. 
>>   비교기준 Comparator 구현할 때 compare() 오버라이딩
>> 
>> ※ 기본 및 자체 클래스에 구현되어 있는 경우도 있고, 없는 경우는 추가 구현 및 비교기준 메서드 오버라이딩 해야한다. 
>> add() 메서드는 바로 데이터를 저장하는 게 아니고 내부적으로 데이터들을 비교하면서 저장합니다. 
>> 비교할 때 비교 기준이 있어야 하는데, 그 비교 기준을 제공하는 Comparator가 있습니다.
>> Comparator 기준이 없으면 저장하는 객체의 Comparable를 사용합니다.
>> 원래는 비교 기준이 필수 이다. 안주면 저장하는 객체의 Comparable 이용합니다.
>
#### Map 
>
>
>	                       Map
>          ↗              ↑               ↖
>     HashTable(old)  HashMap(new)*     SortedMap
>                         ↑                ↑
>                    LinkedHashMap     TreeMap*
>                     (순서 o)
>
>     HashTable 동기화 o
>     HashMap 동기화 x
> 
> - 인터페이스 - 순서 X, 중복(키X, 값o)
> - Map 인터페이스 구현, 데이터를 키와 값의 쌍으로 저장
> - HashMap(동기화x)은 Hashtable(동기화O)의 신버전
> - 순서를 유지하려면, LinkedHashMap 클래스를 사용하면 됨
>  
> ##### Map 주요 메서드
> - 삭제 clear, remove 
> - 검색 get, containsKey, containsValue
> - 저장 put
> - 읽기 entrySet, keySet, values
> 
> ##### HashMap
> - Map 인터페이스 구현한 대표적인 컬렉션 클래스
> - 순서를 유지하지 않고, 키는 중복을 허용하지 않으며 값은 중복을 허용함
> - 해싱(Hashing)기법으로 데이터 저장. 데이터가 많아도 검색이 빠름
> 
> ##### HashMap 주요 메서드
> - HashMap()
> - HashMap(int initialCapacity) //배열의 초기용량
> - HashMap(int initialCapacity, float loadFactor)
> - HashMap(Map m)
>
> ##### 해싱 hashing
> - 해시함수로 해시 테이블에 데이터 저장, 검색
> - 키를 넣으면 해시함수로부터 해시코드(저장위치)가 나옴
> - 해당 저장위치에 저장되어 있는 데이터들을 해시 테이블(hash table)이라고 함
> - 해시 테이블은 배열과 링크드 리스트가 조합된 형태
> - 배열의 접근성(인덱스 위치로 데이터 찾음) + 링크드리스트의 변경하기 유리한 장점이 섞인 것
> - 해시함수는 Object.hash() 메서드를 이용하면 됨
> - 해시함수를 사용한 클래스 : HashTable, HashMap, HastSet
> 
> ##### TreeMap
> - 범위 검색과 정렬에 유리한 컬렉션 클래스
> - HashMap보다 데이터 추가, 삭제에 시간이 더 걸림 (왜? 비교 횟수 증가로)
> - TreeSet과 같은 특성을 가짐. 이진 탐색 트리로 구현되어 있음 
> 
> ##### 해싱 (해시 테이블에서 저장된 데이터 가져오는 과정)
> 1. 키로 해시함수를 호출해서 해시코드(배열의 index)를 받환 받음
> 2. 해시코드(해시함수의 반환값)에 대응하는 링크드리스트를 배열에서 찾음
> 3. 링크드리스트에서 키와 일치하는 데이터를 찾음
> ※ 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야함
> ※ 서로다른 키일지라도 같은 값의 해시코드를 반환할 수도 있음
> 
#### Collections
> - 컬렉션을 위한 메서드(static) 제공
> - fill(), copy(), sort(), binarySearch()
> - singletonXXX(), checkedXXX()
>
#### 컬렉션 클래스 정리 및 요약


</div>
</details> 
  




