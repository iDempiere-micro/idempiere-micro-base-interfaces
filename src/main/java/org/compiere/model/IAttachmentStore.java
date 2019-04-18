package org.compiere.model;

public interface IAttachmentStore {

    boolean loadLOBData(Attachment attach, StorageProvider prov);

    boolean save(Attachment attach, StorageProvider prov);

    boolean delete(Attachment attach, StorageProvider prov);

}
