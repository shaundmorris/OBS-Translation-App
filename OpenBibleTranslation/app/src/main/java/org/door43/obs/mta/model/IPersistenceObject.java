package org.door43.obs.mta.model;

import java.util.Date;

/**
 * Interface for objects that should be persisted in DB.
 */
public interface IPersistenceObject {

    /**
     * @return ID used as primary key for storing in DB.
     */
    Long getId();

    /**
     * Sets objects ID to be used as primary key for storing in DB.
     * @param id
     */
    void setId(Long id);

    /**
     * @return Date of object creation
     */
    Date getCreated();

    /**
     * Sets date of object's creation
     * @param created
     */
    void setCreated(Date created);

    /**
     * @return Date of last object's modification.
     */
    Date getModified();

    /**
     * Sets date of last object's update.
     * @param modified
     */
    void setModified(Date modified);

}
