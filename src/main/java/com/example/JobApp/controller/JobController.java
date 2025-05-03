package com.example.JobApp.controller;


import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class JobController {
    @Autowired
    private JobService jobService;



    @PostMapping("/jobPost")
    public String addJobPost(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }
    @PutMapping("/jobPost")
    public String updateJobPost(@RequestBody JobPost newJobPost){
        System.out.printf("update status = "+jobService.updateJobPost(newJobPost));
        return "update status = "+jobService.updateJobPost(newJobPost);
    }

    @DeleteMapping("/jobPost/{postId}")
    public String deleteJobPost(@PathVariable("postId") String postId){

        return "delete status = "+jobService.deleteJobPost(postId);
    }


    @GetMapping("/jobPosts")
    public List<JobPost> viewAllJobs(){

        return jobService.getAllJobs();

    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJobPost(@PathVariable("postId") int postId){
        return  jobService.getJobPost(postId);

    }


}
