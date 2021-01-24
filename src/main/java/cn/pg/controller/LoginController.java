package cn.pg.controller;

import cn.pg.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhangfei
 * @date ：Created in 2021/1/24 9:38 上午
 */

@RestController
public class LoginController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/hello")
    public String hello() {
        weatherService.getWeatherByCity("南京");
        return "hello";
    }
}
