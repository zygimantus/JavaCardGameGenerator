package net.isetjb;

import java.awt.FlowLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import net.isetjb.config.I18N;
import org.apache.log4j.Logger;

/**
 * 
 * @author Zygimantus
 */
public class NewCardGameFrame extends JInternalFrame
{
    final static Logger log = Logger.getLogger(NewCardGameFrame.class);

    JButton jButton1 = new JButton(" NewCardGame Test >> ");

    /**
     * Constructor.
     */
    public NewCardGameFrame()
    {
        log.debug("START constructor...");

        setTitle(I18N.lang("frame1.title"));
        setLocation(new Random().nextInt(120) + 10, new Random().nextInt(120) + 10);
        setSize(550, 350);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(false);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        //add compnent to the frame :
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        getContentPane().add(jButton1);

        setVisible(false);

        log.debug("End of constructor.");
    }
}
