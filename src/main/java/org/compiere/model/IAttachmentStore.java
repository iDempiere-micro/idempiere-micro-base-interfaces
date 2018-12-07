package org.compiere.model;

public interface IAttachmentStore {

  boolean loadLOBData(I_AD_Attachment attach, I_AD_StorageProvider prov);

  boolean save(I_AD_Attachment attach, I_AD_StorageProvider prov);

  boolean delete(I_AD_Attachment attach, I_AD_StorageProvider prov);

  boolean deleteEntry(I_AD_Attachment mAttachment, I_AD_StorageProvider provider, int index);
}
