import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class CheckBoxExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Checkbox Example");

        Checkbox checkbox = new Checkbox("Check Me");
        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox is selected.");
                } else {
                    System.out.println("Checkbox is deselected.");
                }
            }
        });

        frame.add(checkbox);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

