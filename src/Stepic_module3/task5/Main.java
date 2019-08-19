package Stepic_module3.task5;

class Main {
    Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label mark = analyzer.processText(text);
            if (mark != Label.OK) {
                return mark;
            }
        }
        return Label.OK;
    }
}


