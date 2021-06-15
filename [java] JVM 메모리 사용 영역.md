# JVM 메모리 사용 영역(Runtime Data Area)
</br>

## :zap: 요약
- **JVM**   
  \- 바이트 코드를 실행시키기 위한 가상머신입니다.  
- **메서드 영역**  
  \- JVM이 구동될 때 생성되며, 클래스에 대한 정보와 클래스 변수(static variable) Static, final, String문자열 상수가 저장되는 영역이다.  
- **힙 영역**  
  \- 객체와 배열이 생성되는 영역으로 new 키워드를 통해 생성된 인스턴스의 정보가 저장되며, GC을 수행합니다.
- **스택 영역**    
  \- 스레드가 시작할때 할당되며 메서드가 호출되면, 메서드의 매개변수와 저장되는 영역이다.  
</br>

## JVM
- 자바 가상 기계 Java Virtual Machine
- 바이트 코드 파일을 해당 운영체제에서 실행 가능한 기계어로 변역 후 실행할 수 있게 해주는 가상의 운영체제입니다.
- 메모리 관리 및 Garbage Collection을 수행합니다.

## 바이트 코드(Byte Code) 파일
- .Class 확장자이며 자바 소스 파일을 javac에 의해 컴파일된 파일입니다.
- 바이트 코드 파일은 운영체제에서 바로 실행할 수 없고, JVM을 통해 번역이 필요합니다.

## GC
- 쓰레기 수집기 Garbage Collection
- 자바 메모리 관리 기법 중 하나로, 자바에선 JVM GC를 이용해 사용하지 않는 객체를 메모리에서 자동으로 제거해줍니다.

</br>

## JVM 메모리 구조
<img src="https://user-images.githubusercontent.com/28051638/122005124-37fb6700-cdf0-11eb-9c87-254e54486d3e.jpg"  width="100%" alt="jvm"></img>
- java.exe로 JVM이 시작되면 JVM은 운영체제에서 할당받은 메모리 영역(Runtime Data Area)을 다음 아래와 같이 세부 영역으로 구분하여 사용합니다.
</br></br>

### 메소드(Method) 영역 (Static)
> \- JVM이 구동될 때 생성되며 모든 스레드가 공유하는 영역     
> \- JVM이 읽어들인 클래스, 인터페이스에 대한 런타임 풀 상수, 메소드와 필드, Static 변수, 메소드 변수, 생성자(Constructor)등 저장  
>
> * Field Information  
>  \- 멤버변수 접근 제한자, 데이터 타입, 이름에 대한 정보  
>
> * Method Information  
>  \- 메서드 접근 제한자, 리턴타입, 이름, 매개변수에 대한 정보  
>
> * Type Information  
>   \- Type의 속성이 Class인지 Interface인지 여부 저장  
>   \- Type의 전체이름(패키지명 + 클래스명)  
>
> * Static Variable  
>   \- 모든 객체가 공유할 수 있고, 객체 생성없이 접근 가능.  
>
> * constant Pool(상수 풀)  
>   \- Type에서 사용된 상수를 저장하는 곳 (중복이 있을 시 기존 상수 사용)  
>   \- (String)문자 상수, 타입, 필드, Method의 Symbolic reference(객체 이름으로 참조하는 것)도 상수 풀에 저장  
>   \- final class 변수의 경우에도 상수풀 값에 복사  

  * final 변수  
    \- final로 선언된 변수가 할당되면 항상 같은 값을 가진다.
</br>

### 힙(heap) 영역
> \- 객체와 배열이 생성되는 영역 (참조형 referense type의 데이터 타입을 갖는)  
> \- 해당 영역에 생성된 객체, 배열은 JVM 스택(Stack) 영역의 변수나 다른 객체의 필드에서 참조한다.  
> \- 참조하는 변수나 필드가 없다면 GC에 의해 자동으로 제거한다.  
> \- 프로그램 실행 중 생성되어 동적할당됨.   
> 
> * Young Generation(Eden, surv1, surv2)  
> \- 생성된지 얼마 안되는 객체가 저장되는 공간  
> \- 시간이 지남에 따라 우선순위가 낮아지면 Old 영역으로 옮겨진다.  
> \- 객체가 사라질때 Minor GC 발생  
> 
> * Old Generation  
> \- YG 영역에서 저장된 객체 중 오래된 객체가 이동되어서 저장되는 영역  
> \- 객체가 사라질때 Major GC(Full GC) 발생  
> 
> * Pem(Permanent) 영역  
> \- Class Loader에 의해 Load되는 class, method 등에 대한 Meta 정보가 저장되는 영역으로, JVM에 의해서 사용됩니다.  

  * 필드(field)  
   \- 클래스 내부 멤버입니다. 클래스 안에 독립적으로 선언된 변수입니다. 메소드 밖에 정의됨.  
   \- 클래스 변수, 멤버 변수라고 함. 

  * 동적할당  
   \- 프로그래밍 실행 시간 동안 사용할 메모리 공간을 할당하는 것을 말합니다.  
</br>

### JVM 스택(Stack) 영역
> \- 메서드 안에서 사용되는 값들을 저장 (메서드 정보, 매개변수, 지역변수, 연산 중 발생하는 임시 데이터)  
> \- 메서드 호출 시 생성되는 스레드 수행 정보를 기록하는 프레임(Frame) 생성  
> \- 메스드 수행이 끝나면 프레임(Frame)별로 삭제.  
> \- 메서드를 호출 시 프레임(Frame)을 추가(Push)하고 메서드가 종료되면 해당(Frame)을 제거(Pop)한다.  
> \- 실행 순서에 따라 생성되고 소멸된다. Last In First Out(LIFO) 선입후출 구조 

