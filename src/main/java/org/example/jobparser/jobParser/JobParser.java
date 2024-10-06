package org.example.jobparser.jobParser;

import org.example.jobparser.data.VacancyData;

import java.net.URL;
import java.util.List;

public interface JobParser {
    List<VacancyData> findVacancys(String nameOfTerritory, List<String> keywords);

    URL getVacancyWebsite();
}
