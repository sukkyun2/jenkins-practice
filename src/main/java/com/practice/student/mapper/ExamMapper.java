package com.practice.student.mapper;

import com.practice.student.model.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {

    public List<Exam> selectExam(Long stuId);
    public void updateExam(Exam exam);
    public void insertExam(Exam exam);
    public void deleteExam(Long examId);
}
