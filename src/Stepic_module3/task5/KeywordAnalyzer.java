package Stepic_module3.task5;

abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords(); //абстр методы

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String keyword : getKeywords()) {
           if(text.contains(keyword)){
               return getLabel();
           }
        }
        return Label.OK;
    }
}
