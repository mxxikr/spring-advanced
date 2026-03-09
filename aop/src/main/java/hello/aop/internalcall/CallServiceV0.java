package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV0 {
    public void external() {
        log.info("call external");
        interanl();
    }

    public void interanl() {
        log.info("call internal");
    }
}
