package by.iba.management.model.entity;

import by.iba.management.model.entity.Employee;
import by.iba.management.model.entity.ProgrammingLanguage;
import by.iba.management.model.entity.Skills;
import by.iba.management.model.entity.Tools;

/**
 * Created by katya on 3/3/2019.
 */
public class PositionPattern {
    Employee qaMiddle = new Employee(false,"junior", "B1", QaTestingPattern.getMidQaTestPattern());
    Employee qaSenior = new Employee(true, "middle", "B2", QaTestingPattern.getSeniorLeadQaTestPattern());
    Employee qaLead = new Employee(true, "senior", "C1", QaTestingPattern.getSeniorLeadQaTestPattern());

    Employee devMiddle = new Employee(false, "junior", "B1", ProgrammingLanguage midDevProgrLang_pattern, Skills midDevSkills_pattern, Tools midDevTools_pattern);
    Employee devSenior = new Employee(true, "middle", "B2", ProgrammingLanguage seniorDevProgrLang_pattern, Skills seniorDevSkills_pattern, Tools seniorLeadDevTools_pattern);
    Employee devLead = new Employee(true, "senior", "C1", ProgrammingLanguage leadDevProgrLang_pattern, Skills leadDevSkills_pattern, Tools seniorLeadDevTools_pattern);

}