package com.example.JobApp.service;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.save(jobPost);
    }



    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public Optional<JobPost> getJobPost(String postId) {
        return  jobRepo.findById(postId);

    }

    public Boolean updateJobPost(JobPost newJobPost) {
        JobPost savedPost = jobRepo.save(newJobPost);
        return true;
    }

    public Boolean deleteJobPost(String postId) {
        try {
            jobRepo.deleteById(postId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<JobPost> searchByKeyWord(String keyword) {

            return jobRepo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
