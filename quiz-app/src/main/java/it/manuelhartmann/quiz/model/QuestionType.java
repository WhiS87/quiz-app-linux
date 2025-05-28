package it.manuelhartmann.quiz.model;

public enum QuestionType {
    SINGLE_CHOICE("Eine Richtige Antwort"),
    MULTI_CHOICE_ALL("Mehrere Richtige Antworten alle Auswählen "),
    MULTI_CHOICE_ANY("Mehrere Richtige Antworten eine Auswählen ");

    private final String displayName;

    QuestionType(String displayName) {

        this.displayName = displayName;
    }

    public String getDisplayName()
    {
        return displayName;
    }


}
