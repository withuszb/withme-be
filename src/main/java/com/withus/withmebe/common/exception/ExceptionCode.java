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
  PASSWORD_CHK_MISMATCH(BAD_REQUEST, "비밀번호 확인이 비밀번호와 일치하지 않습니다."),

  // Unauthorized: 401
  TOKEN_EXPIRED(UNAUTHORIZED, "토큰이 만료되었습니다."),
  AUTHENTICATION_ISSUE(UNAUTHORIZED, "인증 이슈가 있습니다."),

  // FORBIDDEN: 403

  // NOT_FOUND: 404
  ENTITY_NOT_FOUND(NOT_FOUND, "개체를 찾지 못했습니다."),
  PASSWORD_MISMATCH(UNAUTHORIZED, "비밀번호가 일치하지 않습니다."),

  // Conflict: 409
  EMAIL_CONFLICT(CONFLICT, "이메일이 중복됩니다.")
  ;

  private final HttpStatus status;
  private final String message;
}