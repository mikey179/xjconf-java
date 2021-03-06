package net.schst.XJConf.ext.xinc;

import net.schst.XJConf.exceptions.XJConfException;

/**
 * @author Stephan Schmidt <stephan.schmidt@schlund.de>
 */
public class XIncludeException extends XJConfException {

    private static final long serialVersionUID = -5453475466235377080L;

    /**
     * @param message
     */
    public XIncludeException(String message) {
        super(message);
    }

    /**
     * @param e
     */
    public XIncludeException(Exception e) {
        super(e);
    }

    /**
     * @param message
     * @param e
     */
    public XIncludeException(String message, Exception e) {
        super(message, e);
    }

}
