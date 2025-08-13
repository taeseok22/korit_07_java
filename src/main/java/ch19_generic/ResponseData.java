package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;
}
/*
    제네릭을 쓸거라면 class에 추가적인 명령어가 필요하다.
    놓치고 가는 경우가 많아서 확인해야한다.
    public class ResponseData<T>

    wildcard 패키지
 */