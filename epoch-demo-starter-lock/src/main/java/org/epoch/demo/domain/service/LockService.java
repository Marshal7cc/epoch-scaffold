package org.epoch.demo.domain.service;

import org.epoch.core.rest.Response;
import org.epoch.core.rest.ResponseEntity;
import org.epoch.starter.lock.annotation.Lock;
import org.springframework.stereotype.Service;

/**
 * @author Marshal
 * @since 2021/12/8
 */
@Service
public class LockService {
    @Lock(name = "'lockOps'")
    public ResponseEntity<Object> testLock() throws InterruptedException {
        Thread.sleep(10000L);
        return Response.success();
    }
}
