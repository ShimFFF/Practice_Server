package com.practice.spring.domain.test.service;

import com.practice.spring.global.common.exception.GeneralException;
import com.practice.spring.global.common.exception.code.GlobalErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new GeneralException(GlobalErrorCode.TEMP_EXCEPTION);
    }
}
