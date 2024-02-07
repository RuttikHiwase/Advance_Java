package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Course;
import com.app.services.CourseSevice;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
public class MyControlller {
   
	@Autowired // this will create obj of CourseService and inject in courseService
	private CourseSevice courseService;
	//---------------------------------------------------------------------------
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}
	//-------------------------------------------------------------------------
	
	@GetMapping("/courses")
	public List<Course> getCourse(){
		
		return this.courseService.getCourses();
		
	}
	//----------------------------------------------------------------------------
	  @GetMapping("/courses/{courseId}")
	public Course  getCourse(@PathVariable String courseId)
	{
		  return this.courseService.getCourse(Long.parseLong(courseId));
	}
	  
	  //--------------------------------------------------------------
	    @PostMapping("/courses")
	    public Course addCourse(@RequestBody Course course) {
	    	return this.courseService.addCourse(course);
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
