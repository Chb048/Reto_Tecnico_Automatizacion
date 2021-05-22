package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.Form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String strVerify;

    public Answer(String strVerify) {
        this.strVerify = strVerify;
    }

    public static Answer toThe(String strVerify) {
        return new Answer(strVerify);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String Confirm = Text.of(Form.VERIFY).viewedBy(actor).asString();
        if(strVerify.equals(Confirm)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
