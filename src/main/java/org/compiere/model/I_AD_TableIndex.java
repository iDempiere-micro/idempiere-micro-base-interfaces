package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_TableIndex
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TableIndex {

  /** TableName=AD_TableIndex */
  String Table_Name = "AD_TableIndex";

  /** AD_Table_ID=200085 */
  int Table_ID = 200085;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Message_ID */
  String COLUMNNAME_AD_Message_ID = "AD_Message_ID";

  /** Set Message. System Message */
  void setAD_Message_ID(int AD_Message_ID);

  /** Get Message. System Message */
  int getAD_Message_ID();

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Column name AD_TableIndex_ID */
  String COLUMNNAME_AD_TableIndex_ID = "AD_TableIndex_ID";

  /** Set Table Index */
  void setAD_TableIndex_ID(int AD_TableIndex_ID);

  /** Get Table Index */
  int getAD_TableIndex_ID();

  /** Column name AD_TableIndex_UU */
  String COLUMNNAME_AD_TableIndex_UU = "AD_TableIndex_UU";

  /** Set AD_TableIndex_UU */
  void setAD_TableIndex_UU(String AD_TableIndex_UU);

  /** Get AD_TableIndex_UU */
  String getAD_TableIndex_UU();

  /** Column name Created */
  String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Column name Description */
  String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Column name Help */
  String COLUMNNAME_Help = "Help";

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Column name IsCreateConstraint */
  String COLUMNNAME_IsCreateConstraint = "IsCreateConstraint";

  /** Set Create Constraint */
  void setIsCreateConstraint(boolean IsCreateConstraint);

  /** Get Create Constraint */
  boolean isCreateConstraint();

  /** Column name IsKey */
  String COLUMNNAME_IsKey = "IsKey";

  /** Set Key column. This column is the key in this table */
  void setIsKey(boolean IsKey);

  /** Get Key column. This column is the key in this table */
  boolean isKey();

  /** Column name IsUnique */
  String COLUMNNAME_IsUnique = "IsUnique";

  /** Set Unique */
  void setIsUnique(boolean IsUnique);

  /** Get Unique */
  boolean isUnique();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Process Now */
  boolean isProcessing();

  /** Column name TableIndexDrop */
  String COLUMNNAME_TableIndexDrop = "TableIndexDrop";

  /** Set Drop table index */
  void setTableIndexDrop(String TableIndexDrop);

  /** Get Drop table index */
  String getTableIndexDrop();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
