package info.nehrke;

import java.util.Map;

public class TemplateDescription {
    private String name;
    private Map<String, String> metaValues;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Map<String, String> getMetaValues() {
        return metaValues;
    }

    void setMetaValues(Map<String, String> metaValues) {
        this.metaValues = metaValues;
    }
}
