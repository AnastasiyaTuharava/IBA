package by.iba.management.model.entity;

import by.iba.management.model.entity.ProgrammingLanguage;

/**
 * Created by katya on 3/3/2019.
 */
public class DevProgrLangPattern {
    public DevProgrLangPattern(ProgrammingLanguage midDevProgrLang_pattern, ProgrammingLanguage seniorDevProgrLang_pattern, ProgrammingLanguage leadDevProgrLang_pattern) {
        this.midDevProgrLang_pattern = midDevProgrLang_pattern;
        this.seniorDevProgrLang_pattern = seniorDevProgrLang_pattern;
        this.leadDevProgrLang_pattern = leadDevProgrLang_pattern;
    }

    ProgrammingLanguage midDevProgrLang_pattern = new ProgrammingLanguage(true, true, true, false, false);
    ProgrammingLanguage seniorDevProgrLang_pattern = new ProgrammingLanguage(true, true, true, true, false);
    ProgrammingLanguage leadDevProgrLang_pattern = new ProgrammingLanguage(true, true, true, true, true);

    public ProgrammingLanguage getMidDevProgrLang_pattern() {
        return midDevProgrLang_pattern;
    }

    public ProgrammingLanguage getSeniorDevProgrLang_pattern() {
        return seniorDevProgrLang_pattern;
    }

    public ProgrammingLanguage getLeadDevProgrLang_pattern() {
        return leadDevProgrLang_pattern;
    }
}
