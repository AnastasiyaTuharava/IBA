package by.iba.management.model.entity;

import by.iba.management.model.entity.Skills;

/**
 * Created by katya on 3/3/2019.
 */
public class DevSkillsPattern {
    Skills midDevSkills_pattern = new Skills(true, true, true, false, false);
    Skills seniorDevSkills_pattern = new Skills(true, true, true, true, false);
    Skills leadDevSkills_pattern = new Skills(true, true, true, true, true);

    public Skills getMidDevSkills_pattern() {
        return midDevSkills_pattern;
    }

    public Skills getSeniorDevSkills_pattern() {
        return seniorDevSkills_pattern;
    }

    public Skills getLeadDevSkills_pattern() {
        return leadDevSkills_pattern;
    }
}
