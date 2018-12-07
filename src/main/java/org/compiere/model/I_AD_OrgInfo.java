package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_OrgInfo
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_OrgInfo {

  /** TableName=AD_OrgInfo */
  String Table_Name = "AD_OrgInfo";

  /** AD_Table_ID=228 */
  int Table_ID = 228;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_OrgInfo_UU */
  String COLUMNNAME_AD_OrgInfo_UU = "AD_OrgInfo_UU";

  /** Set AD_OrgInfo_UU */
  void setAD_OrgInfo_UU(String AD_OrgInfo_UU);

  /** Get AD_OrgInfo_UU */
  String getAD_OrgInfo_UU();

  /** Column name AD_OrgType_ID */
  String COLUMNNAME_AD_OrgType_ID = "AD_OrgType_ID";

  /** Set Organization Type. Organization Type */
  void setAD_OrgType_ID(int AD_OrgType_ID);

  /** Get Organization Type. Organization Type */
  int getAD_OrgType_ID();

  /** Column name C_Calendar_ID */
  String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";

  /** Set Calendar. Accounting Calendar Name */
  void setC_Calendar_ID(int C_Calendar_ID);

  /** Get Calendar. Accounting Calendar Name */
  int getC_Calendar_ID();

  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name DropShip_Warehouse_ID */
  String COLUMNNAME_DropShip_Warehouse_ID = "DropShip_Warehouse_ID";

  /**
   * Set Drop Ship Warehouse. The (logical) warehouse to use for recording drop ship receipts and
   * shipments.
   */
  void setDropShip_Warehouse_ID(int DropShip_Warehouse_ID);

  /**
   * Get Drop Ship Warehouse. The (logical) warehouse to use for recording drop ship receipts and
   * shipments.
   */
  int getDropShip_Warehouse_ID();

  /** Column name DUNS */
  String COLUMNNAME_DUNS = "DUNS";

  /** Set D-U-N-S. Dun & Bradstreet Number */
  void setDUNS(String DUNS);

  /** Get D-U-N-S. Dun & Bradstreet Number */
  String getDUNS();

  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";

  /** Set EMail Address. Electronic Mail Address */
  void setEMail(String EMail);

  /** Get EMail Address. Electronic Mail Address */
  String getEMail();

  /** Column name Fax */
  String COLUMNNAME_Fax = "Fax";

  /** Set Fax. Facsimile number */
  void setFax(String Fax);

  /** Get Fax. Facsimile number */
  String getFax();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name Logo_ID */
  String COLUMNNAME_Logo_ID = "Logo_ID";

  /** Set Logo */
  void setLogo_ID(int Logo_ID);

  /** Get Logo */
  int getLogo_ID();

  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Column name Parent_Org_ID */
  String COLUMNNAME_Parent_Org_ID = "Parent_Org_ID";

  /** Set Parent Organization. Parent (superior) Organization */
  void setParent_Org_ID(int Parent_Org_ID);

  /** Get Parent Organization. Parent (superior) Organization */
  int getParent_Org_ID();

  /** Column name Phone */
  String COLUMNNAME_Phone = "Phone";

  /** Set Phone. Identifies a telephone number */
  void setPhone(String Phone);

  /** Get Phone. Identifies a telephone number */
  String getPhone();

  /** Column name Phone2 */
  String COLUMNNAME_Phone2 = "Phone2";

  /** Set 2nd Phone. Identifies an alternate telephone number. */
  void setPhone2(String Phone2);

  /** Get 2nd Phone. Identifies an alternate telephone number. */
  String getPhone2();

  /** Column name ReceiptFooterMsg */
  String COLUMNNAME_ReceiptFooterMsg = "ReceiptFooterMsg";

  /**
   * Set Receipt Footer Msg. This message will be displayed at the bottom of a receipt when doing a
   * sales or purchase
   */
  void setReceiptFooterMsg(String ReceiptFooterMsg);

  /**
   * Get Receipt Footer Msg. This message will be displayed at the bottom of a receipt when doing a
   * sales or purchase
   */
  String getReceiptFooterMsg();

  /** Column name Supervisor_ID */
  String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

  /** Set Supervisor. Supervisor for this user/organization - used for escalation and approval */
  void setSupervisor_ID(int Supervisor_ID);

  /** Get Supervisor. Supervisor for this user/organization - used for escalation and approval */
  int getSupervisor_ID();

  /** Column name TaxID */
  String COLUMNNAME_TaxID = "TaxID";

  /** Set Tax ID. Tax Identification */
  void setTaxID(String TaxID);

  /** Get Tax ID. Tax Identification */
  String getTaxID();

  /** Column name TransferBank_ID */
  String COLUMNNAME_TransferBank_ID = "TransferBank_ID";

  /**
   * Set Bank for transfers. Bank account depending on currency will be used from this bank for
   * doing transfers
   */
  void setTransferBank_ID(int TransferBank_ID);

  /**
   * Get Bank for transfers. Bank account depending on currency will be used from this bank for
   * doing transfers
   */
  int getTransferBank_ID();

  /** Column name TransferCashBook_ID */
  String COLUMNNAME_TransferCashBook_ID = "TransferCashBook_ID";

  /** Set CashBook for transfers */
  void setTransferCashBook_ID(int TransferCashBook_ID);

  /** Get CashBook for transfers */
  int getTransferCashBook_ID();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
