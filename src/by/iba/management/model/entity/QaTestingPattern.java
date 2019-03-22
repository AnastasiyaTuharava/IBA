package by.iba.management.model.entity;

import by.iba.management.model.entity.Testing;

/**
 * Created by katya on 3/3/2019.
 */
public class QaTestingPattern {
    Testing midQaTestPattern = new Testing(true, false, true, true);
    Testing seniorLeadQaTestPattern = new Testing(true, true, true, true);

    public Testing getMidQaTestPattern() {
        return midQaTestPattern;
    }

    public Testing getSeniorLeadQaTestPattern() {
        return seniorLeadQaTestPattern;
    }
}
