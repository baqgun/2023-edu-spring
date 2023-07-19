package kr.re.kitri.springpost.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value= TooManyResultsException.class)
    public ErrorResponse tooManyResultsException(TooManyResultsException e){

//        log.debug("loggg : "+e.toString());
        return new ErrorResponse("조회결과가 너무 깁니다.", "201");
    }


}
