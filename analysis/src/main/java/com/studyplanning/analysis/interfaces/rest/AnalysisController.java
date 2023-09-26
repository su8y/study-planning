package com.studyplanning.analysis.interfaces.rest;

import com.studyplanning.analysis.service.FeignRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("analysis")
public class AnalysisController {
    @Autowired
    public FeignRemoteService feignRemoteService;

    @GetMapping("{name}")
    public String analysisTest(@PathVariable("name")String name){
        return String.format("[analysis] = %s", feignRemoteService.getStudy(name));
    }
}
