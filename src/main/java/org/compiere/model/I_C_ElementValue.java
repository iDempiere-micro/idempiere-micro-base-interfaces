package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ElementValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ElementValue {

    /**
     * TableName=C_ElementValue
     */
    String Table_Name = "C_ElementValue";

    /**
     * AD_Table_ID=188
     */
    int Table_ID = 188;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AccountSign
     */
    String COLUMNNAME_AccountSign = "AccountSign";
    /**
     * Column name AccountType
     */
    String COLUMNNAME_AccountType = "AccountType";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name BPartnerType
     */
    String COLUMNNAME_BPartnerType = "BPartnerType";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_Element_ID
     */
    String COLUMNNAME_C_Element_ID = "C_Element_ID";
    /**
     * Column name C_ElementValue_ID
     */
    String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
    /**
     * Column name C_ElementValue_UU
     */
    String COLUMNNAME_C_ElementValue_UU = "C_ElementValue_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBankAccount
     */
    String COLUMNNAME_IsBankAccount = "IsBankAccount";
    /**
     * Column name IsDetailBPartner
     */
    String COLUMNNAME_IsDetailBPartner = "IsDetailBPartner";
    /**
     * Column name IsDetailProduct
     */
    String COLUMNNAME_IsDetailProduct = "IsDetailProduct";
    /**
     * Column name IsDocControlled
     */
    String COLUMNNAME_IsDocControlled = "IsDocControlled";
    /**
     * Column name IsForeignCurrency
     */
    String COLUMNNAME_IsForeignCurrency = "IsForeignCurrency";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name PostActual
     */
    String COLUMNNAME_PostActual = "PostActual";
    /**
     * Column name PostBudget
     */
    String COLUMNNAME_PostBudget = "PostBudget";
    /**
     * Column name PostEncumbrance
     */
    String COLUMNNAME_PostEncumbrance = "PostEncumbrance";
    /**
     * Column name PostStatistical
     */
    String COLUMNNAME_PostStatistical = "PostStatistical";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    String getAccountSign();

    /**
     * Set Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    void setAccountSign(String AccountSign);

    /**
     * Get Account Type. Indicates the type of account
     */
    String getAccountType();

    /**
     * Set Account Type. Indicates the type of account
     */
    void setAccountType(String AccountType);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Business Partner Type
     */
    String getBPartnerType();

    /**
     * Set Business Partner Type
     */
    void setBPartnerType(String BPartnerType);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Get Element. Accounting Element
     */
    int getC_Element_ID();

    /**
     * Set Element. Accounting Element
     */
    void setC_Element_ID(int C_Element_ID);

    I_C_Element getC_Element() throws RuntimeException;

    /**
     * Get Account Element. Account Element
     */
    int getC_ElementValue_ID();

    /**
     * Set Account Element. Account Element
     */
    void setC_ElementValue_ID(int C_ElementValue_ID);

    /**
     * Get C_ElementValue_UU
     */
    String getC_ElementValue_UU();

    /**
     * Set C_ElementValue_UU
     */
    void setC_ElementValue_UU(String C_ElementValue_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Bank Account. Indicates if this is the Bank Account
     */
    void setIsBankAccount(boolean IsBankAccount);

    /**
     * Get Bank Account. Indicates if this is the Bank Account
     */
    boolean isBankAccount();

    /**
     * Set Manage Business Partners
     */
    void setIsDetailBPartner(boolean IsDetailBPartner);

    /**
     * Get Manage Business Partners
     */
    boolean isDetailBPartner();

    /**
     * Set Manage Products
     */
    void setIsDetailProduct(boolean IsDetailProduct);

    /**
     * Get Manage Products
     */
    boolean isDetailProduct();

    /**
     * Set Document Controlled. Control account - If an account is controlled by a document, you
     * cannot post manually to it
     */
    void setIsDocControlled(boolean IsDocControlled);

    /**
     * Get Document Controlled. Control account - If an account is controlled by a document, you
     * cannot post manually to it
     */
    boolean isDocControlled();

    /**
     * Set Foreign Currency Account. Balances in foreign currency accounts are held in the nominated
     * currency
     */
    void setIsForeignCurrency(boolean IsForeignCurrency);

    /**
     * Get Foreign Currency Account. Balances in foreign currency accounts are held in the nominated
     * currency
     */
    boolean isForeignCurrency();

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Post Actual. Actual Values can be posted
     */
    boolean isPostActual();

    /**
     * Set Post Actual. Actual Values can be posted
     */
    void setPostActual(boolean PostActual);

    /**
     * Get Post Budget. Budget values can be posted
     */
    boolean isPostBudget();

    /**
     * Set Post Budget. Budget values can be posted
     */
    void setPostBudget(boolean PostBudget);

    /**
     * Get Post Encumbrance. Post commitments to this account
     */
    boolean isPostEncumbrance();

    /**
     * Set Post Encumbrance. Post commitments to this account
     */
    void setPostEncumbrance(boolean PostEncumbrance);

    /**
     * Get Post Statistical. Post statistical quantities to this account?
     */
    boolean isPostStatistical();

    /**
     * Set Post Statistical. Post statistical quantities to this account?
     */
    void setPostStatistical(boolean PostStatistical);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
