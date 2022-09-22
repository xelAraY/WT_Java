package by.bsuir.Deschenya.ClassesAndObjects.Task_13;

import by.bsuir.Deschenya.ClassesAndObjects.Task_12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) obj;
        return super.equals(obj) && language == book.language && level == book.level;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((language == null) ? 0 : language.hashCode());        
        result = prime * result + level;

        return super.hashCode() + result;
    }

    @Override
    public String toString() {
        return String.format("%s\nLanguage: %s\nLevel: %d", super.toString(), language, level);
    }
}
