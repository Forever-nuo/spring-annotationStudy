package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:48
 */
@Aspect
public class LogAspect {

    @Pointcut("execution (* aop.TargetObject.*(..) )")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void logStart(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("日志开启");
    }

    @After("pointcut()")
    public void logEnd(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("日志结束");
    }

    @AfterReturning("pointcut()")
    public void logReturn(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("目标方法返回结果");
    }

    @AfterThrowing("pointcut()")
    public void logThrowing(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("异常执行的方法");
    }

}
