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

public class DspmIdentifyComplianceItem extends AbstractModel {

    /**
    * <p>Recognition template ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Recognition template name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Enablement status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
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
    * <p>Application status</p><p>Enumeration values:</p><ul><li>0: Not applied</li><li>1: In application</li></ul>
    */
    @SerializedName("ApplyStatus")
    @Expose
    private Long ApplyStatus;

    /**
     * Get <p>Recognition template ID.</p> 
     * @return Id <p>Recognition template ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Recognition template ID.</p>
     * @param Id <p>Recognition template ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Recognition template name.</p> 
     * @return Name <p>Recognition template name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Recognition template name.</p>
     * @param Name <p>Recognition template name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Enablement status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul> 
     * @return Status <p>Enablement status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Enablement status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     * @param Status <p>Enablement status</p><p>Enumeration values:</p><ul><li>0: Disabled</li><li>1: Enabled</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul> 
     * @return Type <p>Template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     * @param Type <p>Template type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
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
     * Get <p>Application status</p><p>Enumeration values:</p><ul><li>0: Not applied</li><li>1: In application</li></ul> 
     * @return ApplyStatus <p>Application status</p><p>Enumeration values:</p><ul><li>0: Not applied</li><li>1: In application</li></ul>
     */
    public Long getApplyStatus() {
        return this.ApplyStatus;
    }

    /**
     * Set <p>Application status</p><p>Enumeration values:</p><ul><li>0: Not applied</li><li>1: In application</li></ul>
     * @param ApplyStatus <p>Application status</p><p>Enumeration values:</p><ul><li>0: Not applied</li><li>1: In application</li></ul>
     */
    public void setApplyStatus(Long ApplyStatus) {
        this.ApplyStatus = ApplyStatus;
    }

    public DspmIdentifyComplianceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyComplianceItem(DspmIdentifyComplianceItem source) {
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
        if (source.ApplyStatus != null) {
            this.ApplyStatus = new Long(source.ApplyStatus);
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
        this.setParamSimple(map, prefix + "ApplyStatus", this.ApplyStatus);

    }
}

