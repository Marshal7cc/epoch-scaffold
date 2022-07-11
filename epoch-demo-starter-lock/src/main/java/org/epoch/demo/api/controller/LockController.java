package org.epoch.demo.api.controller;

import lombok.Data;
import org.epoch.core.base.BaseController;
import org.epoch.core.rest.Response;
import org.epoch.core.rest.ResponseEntity;
import org.epoch.lock.annotation.Lock;
import org.epoch.lock.annotation.LockKey;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marshal
 * @date 2021/1/26
 */
@RestController
@RequestMapping("/demo/lock")
public class LockController extends BaseController {

    @GetMapping("/test1")
    @Lock(name = "'lockOps'")
    public ResponseEntity<Void> test1() throws InterruptedException {
        Thread.sleep(20000L);
        return Response.success();
    }

    @GetMapping("/test11")
    @Lock(name = "'lockOps'+#id")
    public ResponseEntity<Void> test1(@RequestParam String id) throws InterruptedException {
        Thread.sleep(20000L);
        return Response.success();
    }

    @GetMapping("/test2")
    @Lock(waitTime = 10L)
    public ResponseEntity<Void> test2(@LockKey @RequestParam String id) throws InterruptedException {
        Thread.sleep(20000L);
        return Response.success();
    }

    @GetMapping("/test3")
    @Lock(name = "", waitTime = 10L)
    public ResponseEntity<Void> test3(@LockKey("userName") User user) throws InterruptedException {
        Thread.sleep(20000L);
        return Response.success();
    }

    @Data
    public static class User {
        String userName;
    }
}
