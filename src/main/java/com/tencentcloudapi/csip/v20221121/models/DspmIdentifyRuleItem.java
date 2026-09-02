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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyRuleItem extends AbstractModel {

    /**
    * <p>Data item id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Data item name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Data item description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Whether to enable the data item</p><p>Enumeration values:</p><ul><li>0: No</li><li>1: Yes</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Data item type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Structure rule configuration status</p>
    */
    @SerializedName("StructuredStatus")
    @Expose
    private Boolean StructuredStatus;

    /**
    * <p>Unstructured rule configuration status</p>
    */
    @SerializedName("UnStructuredStatus")
    @Expose
    private Boolean UnStructuredStatus;

    /**
    * <p>Associated identification template information</p>
    */
    @SerializedName("ComplianceRelations")
    @Expose
    private DspmIdentifyRefComplianceInfo [] ComplianceRelations;

    /**
     * Get <p>Data item id</p> 
     * @return Id <p>Data item id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Data item id</p>
     * @param Id <p>Data item id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Data item name.</p> 
     * @return Name <p>Data item name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Data item name.</p>
     * @param Name <p>Data item name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Data item description.</p> 
     * @return Description <p>Data item description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Data item description.</p>
     * @param Description <p>Data item description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Whether to enable the data item</p><p>Enumeration values:</p><ul><li>0: No</li><li>1: Yes</li></ul> 
     * @return Status <p>Whether to enable the data item</p><p>Enumeration values:</p><ul><li>0: No</li><li>1: Yes</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whether to enable the data item</p><p>Enumeration values:</p><ul><li>0: No</li><li>1: Yes</li></ul>
     * @param Status <p>Whether to enable the data item</p><p>Enumeration values:</p><ul><li>0: No</li><li>1: Yes</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Data item type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul> 
     * @return Type <p>Data item type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Data item type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     * @param Type <p>Data item type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Structure rule configuration status</p> 
     * @return StructuredStatus <p>Structure rule configuration status</p>
     */
    public Boolean getStructuredStatus() {
        return this.StructuredStatus;
    }

    /**
     * Set <p>Structure rule configuration status</p>
     * @param StructuredStatus <p>Structure rule configuration status</p>
     */
    public void setStructuredStatus(Boolean StructuredStatus) {
        this.StructuredStatus = StructuredStatus;
    }

    /**
     * Get <p>Unstructured rule configuration status</p> 
     * @return UnStructuredStatus <p>Unstructured rule configuration status</p>
     */
    public Boolean getUnStructuredStatus() {
        return this.UnStructuredStatus;
    }

    /**
     * Set <p>Unstructured rule configuration status</p>
     * @param UnStructuredStatus <p>Unstructured rule configuration status</p>
     */
    public void setUnStructuredStatus(Boolean UnStructuredStatus) {
        this.UnStructuredStatus = UnStructuredStatus;
    }

    /**
     * Get <p>Associated identification template information</p> 
     * @return ComplianceRelations <p>Associated identification template information</p>
     */
    public DspmIdentifyRefComplianceInfo [] getComplianceRelations() {
        return this.ComplianceRelations;
    }

    /**
     * Set <p>Associated identification template information</p>
     * @param ComplianceRelations <p>Associated identification template information</p>
     */
    public void setComplianceRelations(DspmIdentifyRefComplianceInfo [] ComplianceRelations) {
        this.ComplianceRelations = ComplianceRelations;
    }

    public DspmIdentifyRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyRuleItem(DspmIdentifyRuleItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StructuredStatus != null) {
            this.StructuredStatus = new Boolean(source.StructuredStatus);
        }
        if (source.UnStructuredStatus != null) {
            this.UnStructuredStatus = new Boolean(source.UnStructuredStatus);
        }
        if (source.ComplianceRelations != null) {
            this.ComplianceRelations = new DspmIdentifyRefComplianceInfo[source.ComplianceRelations.length];
            for (int i = 0; i < source.ComplianceRelations.length; i++) {
                this.ComplianceRelations[i] = new DspmIdentifyRefComplianceInfo(source.ComplianceRelations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StructuredStatus", this.StructuredStatus);
        this.setParamSimple(map, prefix + "UnStructuredStatus", this.UnStructuredStatus);
        this.setParamArrayObj(map, prefix + "ComplianceRelations.", this.ComplianceRelations);

    }
}

