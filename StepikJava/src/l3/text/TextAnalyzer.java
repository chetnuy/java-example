package l3.text;

/**
 * date:             02.01.18
 * author:         nevernew
 */

interface TextAnalyzer {
    Label processText(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private String keywords [];
    public SpamAnalyzer(String keywords []){
        this.keywords = keywords;
    }
    @Override
    public Label processText(String text) {
        return null;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}

class NegativeTextAnalyzer extends KeywordAnalyzer implements   TextAnalyzer{

    @Override
    public Label processText(String text) {
        return null;
    }

    @Override
    protected String[] getKeywords() {
        return null;
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}

class TooLongTextAnalyzer implements TextAnalyzer {
    int maxLength;
    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return null;
    }

}

abstract class KeywordAnalyzer{
    protected abstract String [] getKeywords();
    protected abstract  Label getLabel();
}