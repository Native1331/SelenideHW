import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropExample {
    @Test
    void shouldFindSoftAssertionsPage() {
        //Откройте страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //       $("#column-b").dragAndDrop($("#column-a"));
        $("#column-b").dragAndDropTo($("#column-a"));
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));

    }
}







