# 스프링 입문을 위한 자바 객체 지향의 원리와 이해 
_Assembled by yunjin (2021-07-05)_ 
</br> 

 
## 📍 3부) 자바와 객체 지향 

#### 06_다형성 : 사용 편의성 
- 상위 클래스 타입의 객체 참조 변수를 사용하더라도 하위 클래스에서 오버라이딩(재정의)한 메서드가 호출된다는 사실을 꼭 기억하자. 

#### 다형성에 대해 사용 편의성의 이유? 
  - 오버로딩  
    \- 함수명 하나를 가지고 인자 목록만 달리하여 정의할 수 있음.  

  - 오버라이딩  
    \- 하위 클래스가 재정의한 메서드를 알아서 호출해 줌으로써 형변환이나 instanceof 연산자를 쓰지 않아도 된다.  
    
  - 제네릭   
    \- 자바 5에서 추가된 제네릭을 이용하면 하나의 함수만 구현해도 다수의 함수를 구현한 효과를 낼 수 있다.  
    
  - [`요약`]() 즉, 오버라이딩을 통한 메서드 재정의, 오버로딩을 통한 메서드 중복 정의를 통해 다형성을 제공하고 이를 통해 개발자가 프로그래밍을 할때 사용편의성을 준다.
