/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentIdentifier extends AbstractModel {

    /**
    * Content identifier ID.
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * Content identifier description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of times referenced by the rule engine.
    */
    @SerializedName("ReferenceCount")
    @Expose
    private Long ReferenceCount;

    /**
    * Bound package ID.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Bound tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Content identifier status. Valid values:
<li> active: effective; </li>
<li> deleted: Deleted.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Latest update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * Deletion time. It is empty when the status is not "deleted". The time is in Coordinated Universal Time (UTC), following the ISO 8601 date and time format.
    */
    @SerializedName("DeletedOn")
    @Expose
    private String DeletedOn;

    /**
     * Get Content identifier ID. 
     * @return ContentId Content identifier ID.
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set Content identifier ID.
     * @param ContentId Content identifier ID.
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get Content identifier description. 
     * @return Description Content identifier description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Content identifier description.
     * @param Description Content identifier description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of times referenced by the rule engine. 
     * @return ReferenceCount Number of times referenced by the rule engine.
     */
    public Long getReferenceCount() {
        return this.ReferenceCount;
    }

    /**
     * Set Number of times referenced by the rule engine.
     * @param ReferenceCount Number of times referenced by the rule engine.
     */
    public void setReferenceCount(Long ReferenceCount) {
        this.ReferenceCount = ReferenceCount;
    }

    /**
     * Get Bound package ID. 
     * @return PlanId Bound package ID.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Bound package ID.
     * @param PlanId Bound package ID.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Bound tag. 
     * @return Tags Bound tag.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tag.
     * @param Tags Bound tag.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Content identifier status. Valid values:
<li> active: effective; </li>
<li> deleted: Deleted.</li> 
     * @return Status Content identifier status. Valid values:
<li> active: effective; </li>
<li> deleted: Deleted.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Content identifier status. Valid values:
<li> active: effective; </li>
<li> deleted: Deleted.</li>
     * @param Status Content identifier status. Valid values:
<li> active: effective; </li>
<li> deleted: Deleted.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return CreatedOn Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param CreatedOn Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Latest update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return ModifiedOn Latest update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Latest update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param ModifiedOn Latest update time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get Deletion time. It is empty when the status is not "deleted". The time is in Coordinated Universal Time (UTC), following the ISO 8601 date and time format. 
     * @return DeletedOn Deletion time. It is empty when the status is not "deleted". The time is in Coordinated Universal Time (UTC), following the ISO 8601 date and time format.
     */
    public String getDeletedOn() {
        return this.DeletedOn;
    }

    /**
     * Set Deletion time. It is empty when the status is not "deleted". The time is in Coordinated Universal Time (UTC), following the ISO 8601 date and time format.
     * @param DeletedOn Deletion time. It is empty when the status is not "deleted". The time is in Coordinated Universal Time (UTC), following the ISO 8601 date and time format.
     */
    public void setDeletedOn(String DeletedOn) {
        this.DeletedOn = DeletedOn;
    }

    public ContentIdentifier() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentIdentifier(ContentIdentifier source) {
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReferenceCount != null) {
            this.ReferenceCount = new Long(source.ReferenceCount);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.DeletedOn != null) {
            this.DeletedOn = new String(source.DeletedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReferenceCount", this.ReferenceCount);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "DeletedOn", this.DeletedOn);

    }
}

