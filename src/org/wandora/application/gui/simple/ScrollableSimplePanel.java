
package org.wandora.application.gui.simple;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author akivela
 */
public class ScrollableSimplePanel extends SimplePanel implements Scrollable {



    /** Creates a new instance of ScrollableSimplePanel */
    public ScrollableSimplePanel() {
    }

    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 10;
    }

    public boolean getScrollableTracksViewportWidth() {
        Container c=this.getParent();
        if(c==null) return true;
        if(c.getWidth()>300) return true;
        else return false;
    }

    public boolean getScrollableTracksViewportHeight() {
        return false;
    }

    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        if(orientation==SwingConstants.VERTICAL) return visibleRect.height;
        else return visibleRect.width;
    }

    public Dimension getPreferredScrollableViewportSize() {
        return getPreferredSize();
    }

}
