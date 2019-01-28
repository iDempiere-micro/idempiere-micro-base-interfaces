package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_User_OrgAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_User_OrgAccess {

  /** TableName=AD_User_OrgAccess */
  String Table_Name = "AD_User_OrgAccess";

  /** AD_Table_ID=769 */
  int Table_ID = 769;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_User_OrgAccess_UU */
  String COLUMNNAME_AD_User_OrgAccess_UU = "AD_User_OrgAccess_UU";
    /** Column name IsReadOnly */
  String COLUMNNAME_IsReadOnly = "IsReadOnly";

    /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

    /** Set Read Only. Field is read only */
  void setIsReadOnly(boolean IsReadOnly);

  /** Get Read Only. Field is read only */
  boolean isReadOnly();

}
