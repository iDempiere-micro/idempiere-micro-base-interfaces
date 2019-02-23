package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Element {

    /**
     * TableName=C_Element
     */
    String Table_Name = "C_Element";

    /**
     * AD_Table_ID=142
     */
    int Table_ID = 142;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Tree_ID
     */
    String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
    /**
     * Column name C_Element_ID
     */
    String COLUMNNAME_C_Element_ID = "C_Element_ID";
    /**
     * Column name ElementType
     */
    String COLUMNNAME_ElementType = "ElementType";
    /**
     * Column name IsBalancing
     */
    String COLUMNNAME_IsBalancing = "IsBalancing";
    /**
     * Column name IsNaturalAccount
     */
    String COLUMNNAME_IsNaturalAccount = "IsNaturalAccount";

    /**
     * Get Tree. Identifies a Tree
     */
    int getAD_Tree_ID();

    /**
     * Set Tree. Identifies a Tree
     */
    void setAD_Tree_ID(int AD_Tree_ID);

    /**
     * Get Element. Accounting Element
     */
    int getC_Element_ID();

    /**
     * Get Type. Element Type (account or user defined)
     */
    String getElementType();

    /**
     * Set Type. Element Type (account or user defined)
     */
    void setElementType(String ElementType);

    /**
     * Set Balancing. All transactions within an element value must balance (e.g. cost centers)
     */
    void setIsBalancing(boolean IsBalancing);

    /**
     * Set Natural Account. The primary natural account
     */
    void setIsNaturalAccount(boolean IsNaturalAccount);

    /**
     * Get Natural Account. The primary natural account
     */
    boolean isNaturalAccount();

}
