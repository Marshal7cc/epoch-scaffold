package org.epoch.demo.api.controller;

import org.epoch.core.base.BaseController;
import org.epoch.core.rest.ResponseEntity;
import org.epoch.demo.domain.service.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marshal
 * @date 2021/1/26
 */
@RestController
@RequestMapping("/demo")
public class LockController extends BaseController {
    @Autowired
    private LockService lockService;

    @GetMapping
    public ResponseEntity<Object> hello() throws InterruptedException {
        return lockService.testLock();
    }
}
