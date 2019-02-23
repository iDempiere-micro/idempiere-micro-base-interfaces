package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_Column
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Column {

    /**
     * TableName=AD_Column
     */
    String Table_Name = "AD_Column";

    /**
     * AD_Table_ID=101
     */
    int Table_ID = 101;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Element_ID
     */
    String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_Reference_Value_ID
     */
    String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_Val_Rule_ID
     */
    String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
    /**
     * Column name ColumnName
     */
    String COLUMNNAME_ColumnName = "ColumnName";
    /**
     * Column name ColumnSQL
     */
    String COLUMNNAME_ColumnSQL = "ColumnSQL";
    /**
     * Column name DefaultValue
     */
    String COLUMNNAME_DefaultValue = "DefaultValue";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FieldLength
     */
    String COLUMNNAME_FieldLength = "FieldLength";
    /**
     * Column name FormatPattern
     */
    String COLUMNNAME_FormatPattern = "FormatPattern";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsAllowCopy
     */
    String COLUMNNAME_IsAllowCopy = "IsAllowCopy";
    /**
     * Column name IsAlwaysUpdateable
     */
    String COLUMNNAME_IsAlwaysUpdateable = "IsAlwaysUpdateable";
    /**
     * Column name IsEncrypted
     */
    String COLUMNNAME_IsEncrypted = "IsEncrypted";
    /**
     * Column name IsIdentifier
     */
    String COLUMNNAME_IsIdentifier = "IsIdentifier";
    /**
     * Column name IsKey
     */
    String COLUMNNAME_IsKey = "IsKey";
    /**
     * Column name IsMandatory
     */
    String COLUMNNAME_IsMandatory = "IsMandatory";
    /**
     * Column name IsParent
     */
    String COLUMNNAME_IsParent = "IsParent";
    /**
     * Column name IsSecure
     */
    String COLUMNNAME_IsSecure = "IsSecure";
    /**
     * Column name IsSelectionColumn
     */
    String COLUMNNAME_IsSelectionColumn = "IsSelectionColumn";
    /**
     * Column name IsToolbarButton
     */
    String COLUMNNAME_IsToolbarButton = "IsToolbarButton";
    /**
     * Column name IsTranslated
     */
    String COLUMNNAME_IsTranslated = "IsTranslated";
    /**
     * Column name IsUpdateable
     */
    String COLUMNNAME_IsUpdateable = "IsUpdateable";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name ValueMax
     */
    String COLUMNNAME_ValueMax = "ValueMax";
    /**
     * Column name ValueMin
     */
    String COLUMNNAME_ValueMin = "ValueMin";
    /**
     * Column name Version
     */
    String COLUMNNAME_Version = "Version";

    /**
     * Get Column. Column in the table
     */
    int getColumnId();

    /**
     * Get System Element. System Element enables the central maintenance of column description and
     * help.
     */
    int getElementId();

    /**
     * Set System Element. System Element enables the central maintenance of column description and
     * help.
     */
    void setElementId(int AD_Element_ID);

    /**
     * Get Process. Process or Report
     */
    int getProcessId();

    /**
     * Get Reference. System Reference and Validation
     */
    int getReferenceId();

    /**
     * Set Reference. System Reference and Validation
     */
    void setReferenceId(int AD_Reference_ID);

    I_AD_Reference getReference() throws RuntimeException;

    /**
     * Get Reference Key. Required to specify, if data type is Table or List
     */
    int getReferenceValueId();

    /**
     * Get Table. Database Table information
     */
    int getColumnTableId();

    /**
     * Set Table. Database Table information
     */
    void setColumnTableId(int AD_Table_ID);

    I_AD_Table getColumnTable() throws RuntimeException;

    /**
     * Get DB Column Name. Name of the column in the database
     */
    String getColumnName();

    /**
     * Set DB Column Name. Name of the column in the database
     */
    void setColumnName(String ColumnName);

    /**
     * Get Column SQL. Virtual Column (r/o)
     */
    String getColumnSQL();

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Default Logic. Default value hierarchy, separated by ;
     */
    String getDefaultValue();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Length. Length of the column in the database
     */
    int getFieldLength();

    /**
     * Set Length. Length of the column in the database
     */
    void setFieldLength(int FieldLength);

    /**
     * Get Format Pattern. The pattern used to format a number or date.
     */
    String getFormatPattern();

    /**
     * Set Format Pattern. The pattern used to format a number or date.
     */
    void setFormatPattern(String FormatPattern);

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Allow Copy. Determine if a column must be copied when pushing the button to copy record
     */
    void setIsAllowCopy(boolean IsAllowCopy);

    /**
     * Get Allow Copy. Determine if a column must be copied when pushing the button to copy record
     */
    boolean isAllowCopy();

    /**
     * Set Always Updatable. The column is always updateable, even if the record is not active or
     * processed
     */
    void setIsAlwaysUpdateable(boolean IsAlwaysUpdateable);

    /**
     * Get Always Updatable. The column is always updateable, even if the record is not active or
     * processed
     */
    boolean isAlwaysUpdateable();

    /**
     * Get Encrypted. Display or Storage is encrypted
     */
    String getIsEncrypted();

    /**
     * Set Encrypted. Display or Storage is encrypted
     */
    void setIsEncrypted(String IsEncrypted);

    /**
     * Set Identifier. This column is part of the record identifier
     */
    void setIsIdentifier(boolean IsIdentifier);

    /**
     * Get Identifier. This column is part of the record identifier
     */
    boolean isIdentifier();

    /**
     * Set Key column. This column is the key in this table
     */
    void setIsKey(boolean IsKey);

    /**
     * Get Key column. This column is the key in this table
     */
    boolean isKey();

    /**
     * Set Mandatory. Data entry is required in this column
     */
    void setIsMandatory(boolean IsMandatory);

    /**
     * Get Mandatory. Data entry is required in this column
     */
    boolean isMandatory();

    /**
     * Set Parent link column. This column is a link to the parent table (e.g. header from lines) -
     * incl. Association key columns
     */
    void setIsParent(boolean IsParent);

    /**
     * Get Parent link column. This column is a link to the parent table (e.g. header from lines) -
     * incl. Association key columns
     */
    boolean isParent();

    /**
     * Get Secure content. Defines whether content must be treated as secure
     */
    boolean isSecure();

    /**
     * Set Selection Column. Is this column used for finding rows in windows
     */
    void setIsSelectionColumn(boolean IsSelectionColumn);

    /**
     * Get Toolbar Button. Show the button on the toolbar, the window, or both
     */
    String getIsToolbarButton();

    /**
     * Set Toolbar Button. Show the button on the toolbar, the window, or both
     */
    void setIsToolbarButton(String IsToolbarButton);

    /**
     * Set Translated. This column is translated
     */
    void setIsTranslated(boolean IsTranslated);

    /**
     * Get Translated. This column is translated
     */
    boolean isTranslated();

    /**
     * Set Updatable. Determines, if the field can be updated
     */
    void setIsUpdateable(boolean IsUpdateable);

    /**
     * Get Updatable. Determines, if the field can be updated
     */
    boolean isUpdateable();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Get Max. Value. Maximum Value for a field
     */
    String getValueMax();

    /**
     * Get Min. Value. Minimum Value for a field
     */
    String getValueMin();

    /**
     * Set Version. Version of the table definition
     */
    void setVersion(BigDecimal Version);

}
