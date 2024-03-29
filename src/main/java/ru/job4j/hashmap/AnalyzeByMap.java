package ru.job4j.hashmap;


import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double avgScore = 0D;
        int subjectQuantity = 0;
        int scoreSum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectQuantity++;
                scoreSum += subject.score();
            }
        }
        if (subjectQuantity > 0) {
            avgScore = (double) scoreSum / subjectQuantity;
        }
        return avgScore;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        int subjectQuantity;
        int scoreSum;
        double avgScore;
        List<Label> pupilsScores = new ArrayList<>();
        for (Pupil pupil : pupils) {
            subjectQuantity = 0;
            scoreSum = 0;
            avgScore = 0D;
            for (Subject subject : pupil.subjects()) {
                subjectQuantity++;
                scoreSum += subject.score();
            }
            if (subjectQuantity > 0) {
                avgScore = scoreSum / subjectQuantity;
            }
            Label pupilAVGScore = new Label(pupil.name(), avgScore);
            pupilsScores.add(pupilAVGScore);
        }
        return pupilsScores;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        final int pupilTotal = pupils.size();
        ArrayList<Label> result = new ArrayList<>();
        LinkedHashMap<String, Integer> subjectsTotals = subjectTotalScores(pupils);
        subjectsTotals.forEach((key, value) -> result.add(new Label(key, (double) value / pupilTotal)));
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        String pupilName = "";
        int totalPupilScore = 0;
        int pupilCurrentScore;
        for (Pupil pupil : pupils) {
            pupilCurrentScore = 0;
            for (Subject subject : pupil.subjects()) {
                pupilCurrentScore += subject.score();
            }
            if (pupilCurrentScore > totalPupilScore) {
                pupilName = pupil.name();
                totalPupilScore = pupilCurrentScore;
            }
        }
        return new Label(pupilName, totalPupilScore);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        String resultSubjectName = "";
        int resultSubjectScore = 0;
        ArrayList<Label> result = new ArrayList<>();
        LinkedHashMap<String, Integer> subjectsTotals = subjectTotalScores(pupils);
        subjectsTotals.forEach((key, value) -> result.add(new Label(key, value)));
        for (Label item : result) {
            if (item.score() > resultSubjectScore) {
                resultSubjectName = item.name();
                resultSubjectScore = (int) item.score();
            }
        }
        return new Label(resultSubjectName, resultSubjectScore);
    }

    private static LinkedHashMap subjectTotalScores(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> subjectsTotals = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectsTotals.put(subject.name(), subject.score() + subjectsTotals.getOrDefault(subject.name(), 0));
            }
        }
        return subjectsTotals;
    }
}
