package by.iba.management.model.entity;
import by.iba.management.model.entity.Tools;

/**
 * Created by katya on 3/3/2019.
 */
public class DevToolsPattern {
    Tools midDevTools_pattern = new Tools(true, true, true, false);
    Tools seniorLeadDevTools_pattern = new Tools(true, true, true, true);

    public Tools getMidDevTools_pattern() {
        return midDevTools_pattern;
    }

    public Tools getSeniorLeadDevTools_pattern() {
        return seniorLeadDevTools_pattern;
    }
}
