package com.studyplanning.study;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "study")
public class TestController {
    @GetMapping("/{study}")
    public String testStudy(@PathVariable(name = "study") String name) {
        return String.format("[study] = %s", name);
    }

    @PostMapping
    public String testPost() {
        return "STUDY POST";
    }
}
