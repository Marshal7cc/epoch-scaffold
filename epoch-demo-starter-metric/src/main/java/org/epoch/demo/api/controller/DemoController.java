package org.epoch.demo.api.controller;

import org.epoch.core.base.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marshal
 * @date 2021/1/26
 */
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {
    @GetMapping
    public String hello() {
        return "hello";
    }
}
