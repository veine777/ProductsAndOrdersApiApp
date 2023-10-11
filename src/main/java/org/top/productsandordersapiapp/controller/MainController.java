package org.top.productsandordersapiapp.controller;

//Controller-классы ответственны за обработку входящих запросов и возвращают ответ.
//MainController - главный контроллер имеющий два метода index и ping

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Класс контроллера MainController в Spring обрабатывает информацию аннотацией @RestController
@RestController
public class MainController {

    //С помощью метода index Сервер по запросу http://localhost:8080/ выводит информацию "Server is running", подтверждающую работу сервера
    @GetMapping("")
    public String index() {
        return "Server is running";
    }

    //С помощью метода ping Сервер по запросу http://localhost:8080/ping будет выводить "pong" для подтверждения обратной связи.
    @GetMapping("ping")
    public String ping() {
        return "pong";
    }
}
