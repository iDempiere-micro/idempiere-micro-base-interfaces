package org.idempiere.common.exceptions;

/**
 * Any exception that occurs inside the Adempiere core
 *
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class AdempiereException extends RuntimeException {
  /** */
  private static final long serialVersionUID = 2340179640558569534L;

  /** @param message */
  public AdempiereException(String message) {
    super(message);
  }

  /** @param cause */
  public AdempiereException(Throwable cause) {
    super(cause);
  }

  /**
   * @param message
   * @param cause
   */
  public AdempiereException(String message, Throwable cause) {
    super(message, cause);
  }

  @Override
  public String getLocalizedMessage() {
    String msg = super.getLocalizedMessage();
    // msg = Msg.parseTranslation(getCtx(), msg); DAP TODO
    return msg;
  }
}
