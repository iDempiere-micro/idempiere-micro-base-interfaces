package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ViewComponent
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ViewComponent {

  /** TableName=AD_ViewComponent */
  String Table_Name = "AD_ViewComponent";

  /** AD_Table_ID=200087 */
  int Table_ID = 200087;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

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

  /** Column name AD_ViewComponent_ID */
  String COLUMNNAME_AD_ViewComponent_ID = "AD_ViewComponent_ID";

  /** Set Database View Component */
  void setAD_ViewComponent_ID(int AD_ViewComponent_ID);

  /** Get Database View Component */
  int getAD_ViewComponent_ID();

  /** Column name AD_ViewComponent_UU */
  String COLUMNNAME_AD_ViewComponent_UU = "AD_ViewComponent_UU";

  /** Set AD_ViewComponent_UU */
  void setAD_ViewComponent_UU(String AD_ViewComponent_UU);

  /** Get AD_ViewComponent_UU */
  String getAD_ViewComponent_UU();

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

  /** Column name FromClause */
  String COLUMNNAME_FromClause = "FromClause";

  /** Set Sql FROM. SQL FROM clause */
  void setFromClause(String FromClause);

  /** Get Sql FROM. SQL FROM clause */
  String getFromClause();

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

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Column name OtherClause */
  String COLUMNNAME_OtherClause = "OtherClause";

  /** Set Other SQL Clause. Other SQL Clause */
  void setOtherClause(String OtherClause);

  /** Get Other SQL Clause. Other SQL Clause */
  String getOtherClause();

  /** Column name Referenced_Table_ID */
  String COLUMNNAME_Referenced_Table_ID = "Referenced_Table_ID";

  /** Set Referenced Table */
  void setReferenced_Table_ID(int Referenced_Table_ID);

  /** Get Referenced Table */
  int getReferenced_Table_ID();

  I_AD_Table getReferenced_Table() throws RuntimeException;

  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Column name WhereClause */
  String COLUMNNAME_WhereClause = "WhereClause";

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();
}
