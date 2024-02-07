package com.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.Course;
@Service // this class providing the service to application
public class CourseServiceImpl implements CourseSevice {

	List<Course> list;
	public CourseServiceImpl() {
		list =new ArrayList<>();
		list.add(new Course(45,"java spring lecture ","Java"));
		list.add(new Course(18,"React lecture ","React"));
		list.add(new Course(10,"Dotnet lecture ","Dotnet"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
