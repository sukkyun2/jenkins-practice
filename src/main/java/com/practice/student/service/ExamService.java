package com.practice.student.service;

import com.practice.student.mapper.ExamMapper;
import com.practice.student.model.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    ExamMapper examMapper;

    public void insertExam(Exam exam) {
        examMapper.insertExam(exam);
    }

    public void updateExam(Exam exam) {
        examMapper.updateExam(exam);
    }

    public List<Exam> selectExam(Long stuId) {
        return examMapper.selectExam(stuId);
    }

    public void deleteExam(Long examId) {
        examMapper.deleteExam(examId);
    }
}
