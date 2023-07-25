package com.example.ThreeTierTestBE.TeachersPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("all")
    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }
    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherRepository.save(teacher);
    }
    @DeleteMapping
    public void deleteTeacher(@RequestParam Integer id){teacherRepository.deleteById(id);}
    @PutMapping
    public Teacher editTeacher(@RequestBody Teacher teacher){return teacherRepository.save(teacher);}
}
