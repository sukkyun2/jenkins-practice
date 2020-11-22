package com.practice.student.controller;

import com.practice.student.model.Exam;
import com.practice.student.service.ExamService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/exam")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExamController {

    @Autowired private ExamService examService;

    @RequestMapping(value = "/{stuId}/list", method = { RequestMethod.GET })
    @ApiOperation(value = "학생의 모든 시험 조회", tags = "Exam")
    public List<Exam> selectExam(@PathVariable("stuId") Long stuId){
        return examService.selectExam(stuId);
    }

    @RequestMapping(value = "/", method = { RequestMethod.POST,RequestMethod.PUT })
    @ApiOperation(value = "시험 입력/수정", tags = "Exam")
    public void registerExam(Exam exam){
        if(exam.getExamId() == null){
            //insert
            examService.insertExam(exam);
        } else {
            //update
            examService.updateExam(exam);
        }
    }

    @RequestMapping(value = "/{examId}", method = { RequestMethod.DELETE } )
    @ApiOperation(value = "시험 삭제", tags = "Exam")
    public void deleteExam(@PathVariable("examId") Long examId){
        examService.deleteExam(examId);
    }
}
