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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Project extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project description.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Tags.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Tags")
    @Expose
    private TagSpec [] Tags;

    /**
    * Project status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Create time.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * App ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Uin.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub account uin.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name. 
     * @return Name Project name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name.
     * @param Name Project name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project description.

Note: This field may return null, indicating that no valid value is found. 
     * @return Description Project description.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Project description.

Note: This field may return null, indicating that no valid value is found.
     * @param Description Project description.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Tags.

Note: This field may return null, indicating that no valid value is found. 
     * @return Tags Tags.

Note: This field may return null, indicating that no valid value is found.
     */
    public TagSpec [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags.

Note: This field may return null, indicating that no valid value is found.
     * @param Tags Tags.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTags(TagSpec [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Project status. 
     * @return Status Project status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Project status.
     * @param Status Project status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Create time. 
     * @return CreatedAt Create time.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Create time.
     * @param CreatedAt Create time.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time. 
     * @return UpdatedAt Update time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
     * @param UpdatedAt Update time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get App ID. 
     * @return AppId App ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID.
     * @param AppId App ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Uin. 
     * @return Uin Uin.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin.
     * @param Uin Uin.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub account uin. 
     * @return SubAccountUin Sub account uin.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub account uin.
     * @param SubAccountUin Sub account uin.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new TagSpec[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagSpec(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

