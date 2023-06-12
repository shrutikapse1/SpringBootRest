package com.springrest.springrest.service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImp implements CourseService{
//    List<Course> list;
//    Course course;
    @Autowired
    private CourseDao courseDao;
    public CourseServiceImp(){

//        list=new ArrayList<>();
//        list.add(new Course(1,"Spring Boot","Great Spring boot course"));
//        list.add(new Course(2,"Spring JPA","Great to start"));
    }
    public List<Course> getCourses(){
        return courseDao.findAll();
//        return list;
    }

    @Override
    public Course getCourse(long courseId) {
//        Course c=null;
//        for(Course course:list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
//        return c;
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        for(Course c:list){
//            if(c.getId()==course.getId()){
//                c.setTitle(course.getTitle());
//                c.setDescription(course.getDescription());
//                break;
//            }
//        }
//        return course;
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
//        for (Course c:list) {
//            if (c.getId() == courseId) {
//                list.remove(c);
//            }
//        }
        Course c=courseDao.getOne(courseId);
        courseDao.delete(c);
    }


}