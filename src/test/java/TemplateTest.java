import pattern.behavioral.template.CsGame;
import pattern.behavioral.template.LoLGame;
import pattern.behavioral.template.Template;

/** Created by ALEXuH on 2019/5/10 0010 */
public class TemplateTest {

  public static void main(String[] args) {
    Template cs = new CsGame();
    Template lol = new LoLGame();
    cs.process();
    lol.process();
  }
}
