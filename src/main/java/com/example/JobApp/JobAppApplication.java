package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JobAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JobAppApplication.class, args);
		JobRepo jobRepo = context.getBean(JobRepo.class);
		List<JobPost> jobPosts = new ArrayList<>();



//		jobPosts.add(new JobPost("1", "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//				List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//		jobPosts.add(new JobPost("2", "Frontend Developer", "Experience in building responsive web applications using React", 3,
//				List.of("HTML", "CSS", "JavaScript", "React")));
//
//		jobPosts.add(new JobPost("3", "Data Scientist", "Strong background in machine learning and data analysis", 4,
//				List.of("Python", "Machine Learning", "Data Analysis")));
//
//		jobPosts.add(new JobPost("4", "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//				List.of("Networking", "Cisco", "Routing", "Switching")));
//
//		jobPosts.add(new JobPost("5", "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//				List.of("iOS Development", "Android Development", "Mobile App")));
//
//
//		jobPosts.add(new JobPost("6", "DevOps Engineer", "Proficiency in CI/CD, cloud, and infrastructure automation", 3,
//				List.of("CI/CD", "AWS", "Docker", "Kubernetes")));
//
//        jobRepo.saveAll(jobPosts);

	}

}
