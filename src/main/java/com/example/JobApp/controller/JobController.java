package com.example.JobApp.controller;


import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService jobService;
    @RequestMapping({"/","/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){

        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(@ModelAttribute("jobPost") JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model model){
        List<JobPost> jobPosts = jobService.getAllJobs();
        model.addAttribute("jobPosts",jobPosts);
        return "viewalljobs";
    }


}
