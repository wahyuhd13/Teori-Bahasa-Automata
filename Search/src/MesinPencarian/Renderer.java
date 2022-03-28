package MesinPencarian;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ListCellRenderer;
import javax.swing.JList;

public class Renderer extends DefaultListCellRenderer implements ListCellRenderer<Object> {
    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean  CellHasFocus){
        ImgsNText is = (ImgsNText) value;
        setText(is.getName());
        setIcon(is.getImg());
        setIconTextGap(10);
        
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        
        setEnabled(true);
        setFont(list.getFont());
        return this;
    }
}
