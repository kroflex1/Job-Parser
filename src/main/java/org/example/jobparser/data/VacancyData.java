package org.example.jobparser.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;
import java.util.List;

@Getter
@Setter
@Builder
public class VacancyData {
    private String companyName;
    private String vacancyName;
    private String placeOfWork;
    private URL link;
    private String tasksAtWork;
    private String requirements;
    private List<String> coreSkills;
    private String grade;
    private Integer salaryFrom;
    private Integer salaryTo;
}
