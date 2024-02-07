package com.app.services;

import java.util.List;

import com.app.entity.Course;

public interface CourseSevice {
  
	
	
	public List<Course> getCourses();
	 
	public Course getCourse(long courseId);
	//call comes from controller by course bt id
	
	public Course addCourse(Course course);
}
