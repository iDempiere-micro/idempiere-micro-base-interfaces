package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Element {

  /** TableName=C_Element */
  String Table_Name = "C_Element";

  /** AD_Table_ID=142 */
  int Table_ID = 142;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Tree_ID */
  String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
  /** Column name C_Element_ID */
  String COLUMNNAME_C_Element_ID = "C_Element_ID";
  /** Column name C_Element_UU */
  String COLUMNNAME_C_Element_UU = "C_Element_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name ElementType */
  String COLUMNNAME_ElementType = "ElementType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBalancing */
  String COLUMNNAME_IsBalancing = "IsBalancing";
  /** Column name IsNaturalAccount */
  String COLUMNNAME_IsNaturalAccount = "IsNaturalAccount";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name VFormat */
  String COLUMNNAME_VFormat = "VFormat";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Tree. Identifies a Tree */
  int getAD_Tree_ID();

  /** Set Tree. Identifies a Tree */
  void setAD_Tree_ID(int AD_Tree_ID);

  I_AD_Tree getAD_Tree() throws RuntimeException;

  /** Get Element. Accounting Element */
  int getC_Element_ID();

  /** Set Element. Accounting Element */
  void setC_Element_ID(int C_Element_ID);

  /** Get C_Element_UU */
  String getC_Element_UU();

  /** Set C_Element_UU */
  void setC_Element_UU(String C_Element_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Type. Element Type (account or user defined) */
  String getElementType();

  /** Set Type. Element Type (account or user defined) */
  void setElementType(String ElementType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Balancing. All transactions within an element value must balance (e.g. cost centers) */
  void setIsBalancing(boolean IsBalancing);

  /** Get Balancing. All transactions within an element value must balance (e.g. cost centers) */
  boolean isBalancing();

  /** Set Natural Account. The primary natural account */
  void setIsNaturalAccount(boolean IsNaturalAccount);

  /** Get Natural Account. The primary natural account */
  boolean isNaturalAccount();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /**
   * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  String getVFormat();

  /**
   * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
   * "_lLoOaAcCa09"
   */
  void setVFormat(String VFormat);
}
