package com.example.userservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)  // null인 값을 응답에서 제외
public class ResponseUser {
    private String email;

    private String name;

    private String userId;
}
