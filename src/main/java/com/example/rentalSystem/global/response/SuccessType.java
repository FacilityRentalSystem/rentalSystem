package com.example.rentalSystem.global.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum SuccessType {

  SUCCESS(200, "요청에 성공하였습니다."),
  CREATED(201, "성공적으로 생성하였습니다.");

  private final int httpStatusCode;
  private final String message;
}
