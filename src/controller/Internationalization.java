package controller;

import java.util.Locale;
import java.util.Observable;
import java.util.ResourceBundle;

public class Internationalization extends Observable {
    private Boolean langWasChanged = false;
    private Locale russian = new Locale("ru", "RU");
    private Locale english = new Locale("en", "US");
    ResourceBundle lang_ru = ResourceBundle.getBundle("bundles.Locale_ru", russian);
    ResourceBundle lang_en = ResourceBundle.getBundle("bundles.Locale_en", english);
    private ResourceBundle lang = lang_ru;
    void setLang(Boolean langWasChanged){
        this.langWasChanged = langWasChanged;
        super.setChanged();
    }
    Boolean getState(){
        return langWasChanged;
    }
}
