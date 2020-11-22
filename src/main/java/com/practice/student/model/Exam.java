package com.practice.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Exam {

    private Long examId;
    private Long stuId;
    private String examName;
    private Float examScore;
    private ExamType examType;
}
