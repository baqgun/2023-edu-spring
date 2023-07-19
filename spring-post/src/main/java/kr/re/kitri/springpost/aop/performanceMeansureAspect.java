package kr.re.kitri.springpost.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class performanceMeansureAspect {


    @Around("execution(* kr.re.kitri.springpost.service.*Service.*(..))")
    public Object meansurePerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        log.debug(joinPoint.getSignature().getName()+" 시작시간 : "+start);
        Object obj = joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.debug(joinPoint.getSignature().getName()+" 종료시간 : "+end);

        log.debug(joinPoint.getSignature().getName()+" 함수의 실행시간은 "+(end-start)+"ms 입니다.");
        return obj;
    }
}
