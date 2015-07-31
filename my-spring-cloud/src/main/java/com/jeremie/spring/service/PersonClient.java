package com.jeremie.spring.service;

import com.jeremie.spring.vo.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guanhong 15/7/28 下午9:56.
 */
@FeignClient("movie")
public interface PersonClient {
    @RequestMapping(method = RequestMethod.GET, value = "/person")
    String[] findAll();

    @RequestMapping(method = RequestMethod.GET, value = "/person/{id}")
    Person findById(@RequestParam("id") String id);

    @RequestMapping(method = RequestMethod.POST, value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    void createPerson(@RequestBody Person person);
}