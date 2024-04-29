package com.withus.withmebe.common.exception;


import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CONFLICT;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {
  // BAD_REQUEST: 400
  EX(BAD_REQUEST, "예시입니당"),

  // Unauthorized: 401

  // FORBIDDEN: 403

  // NOT_FOUND: 404
  ENTITY_NOT_FOUND(NOT_FOUND, "개체를 찾지 못했습니다.")

  // Conflict: 409
  ;

  private final HttpStatus status;
  private final String message;
}
