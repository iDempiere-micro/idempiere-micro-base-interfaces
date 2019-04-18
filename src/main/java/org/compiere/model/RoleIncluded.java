package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Role_Included
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface RoleIncluded extends PersistentObject {

    /**
     * TableName=AD_Role_Included
     */
    String Table_Name = "AD_Role_Included";

    /**
     * AD_Table_ID=53222
     */
    int Table_ID = 53222;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name Included_Role_ID
     */
    String COLUMNNAME_Included_Role_ID = "Included_Role_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Included Role
     */
    int getIncludedRoleId();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

}
