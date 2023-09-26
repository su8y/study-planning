package com.studyplanning.analysis.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "study")
public interface FeignRemoteService {
    @GetMapping("/study/{name}")
    String getStudy(@PathVariable(name = "name") String name);
}
