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

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Message_ID */
  String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
    /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_TableIndex_ID */
  String COLUMNNAME_AD_TableIndex_ID = "AD_TableIndex_ID";
  /** Column name AD_TableIndex_UU */
  String COLUMNNAME_AD_TableIndex_UU = "AD_TableIndex_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name IsCreateConstraint */
  String COLUMNNAME_IsCreateConstraint = "IsCreateConstraint";
  /** Column name IsKey */
  String COLUMNNAME_IsKey = "IsKey";
  /** Column name IsUnique */
  String COLUMNNAME_IsUnique = "IsUnique";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name TableIndexDrop */
  String COLUMNNAME_TableIndexDrop = "TableIndexDrop";

    /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Table Index */
  int getAD_TableIndex_ID();

    /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

    /** Set Create Constraint */
  void setIsCreateConstraint(boolean IsCreateConstraint);

  /** Get Create Constraint */
  boolean isCreateConstraint();

    /** Get Key column. This column is the key in this table */
  boolean isKey();

  /** Set Unique */
  void setIsUnique(boolean IsUnique);

  /** Get Unique */
  boolean isUnique();

}
