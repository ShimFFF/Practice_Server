package com.practice.spring.global.common.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GeneralException extends RuntimeException {
    private final ErrorCodeInterface errorCode;

    public ErrorCode getErrorCode() {
        return this.errorCode.getErrorCode();
    }
}