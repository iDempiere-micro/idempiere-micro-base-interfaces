package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PInstance_Log
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PInstance_Log {

  /** TableName=AD_PInstance_Log */
  String Table_Name = "AD_PInstance_Log";

  /** AD_Table_ID=578 */
  int Table_ID = 578;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name AD_PInstance_Log_UU */
  String COLUMNNAME_AD_PInstance_Log_UU = "AD_PInstance_Log_UU";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Log_ID */
  String COLUMNNAME_Log_ID = "Log_ID";
  /** Column name P_Date */
  String COLUMNNAME_P_Date = "P_Date";
  /** Column name P_ID */
  String COLUMNNAME_P_ID = "P_ID";
  /** Column name P_Msg */
  String COLUMNNAME_P_Msg = "P_Msg";
  /** Column name P_Number */
  String COLUMNNAME_P_Number = "P_Number";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";

  /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

  /** Set Process Instance. Instance of the process */
  void setAD_PInstance_ID(int AD_PInstance_ID);

  /** Get AD_PInstance_Log_UU */
  String getAD_PInstance_Log_UU();

  /** Set AD_PInstance_Log_UU */
  void setAD_PInstance_Log_UU(String AD_PInstance_Log_UU);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Log */
  int getLog_ID();

  /** Set Log */
  void setLog_ID(int Log_ID);

  /** Get Process Date. Process Parameter */
  Timestamp getP_Date();

  /** Set Process Date. Process Parameter */
  void setP_Date(Timestamp P_Date);

  /** Get Process ID */
  int getP_ID();

  /** Set Process ID */
  void setP_ID(int P_ID);

  /** Get Process Message */
  String getP_Msg();

  /** Set Process Message */
  void setP_Msg(String P_Msg);

  /** Get Process Number. Process Parameter */
  BigDecimal getP_Number();

  /** Set Process Number. Process Parameter */
  void setP_Number(BigDecimal P_Number);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);
}
