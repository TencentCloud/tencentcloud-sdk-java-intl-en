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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationVersion extends AbstractModel {

    /**
    * Version type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Version ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
    * Release name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Release description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Entry file
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Creator name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Git information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GitInfo")
    @Expose
    private String GitInfo;

    /**
     * Get Version type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Version type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Version type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Version type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Version ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationVersionId Version ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set Version ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationVersionId Version ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    /**
     * Get Release name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Release name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Release name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Release name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Release description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Release description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Release description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Release description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Entry file
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Entrypoint Entry file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set Entry file
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Entrypoint Entry file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creator name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatorName Creator name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set Creator name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatorName Creator name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get Creator ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatorId Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatorId Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get Git information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GitInfo Git information
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getGitInfo() {
        return this.GitInfo;
    }

    /**
     * Set Git information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GitInfo Git information
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setGitInfo(String GitInfo) {
        this.GitInfo = GitInfo;
    }

    public ApplicationVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationVersion(ApplicationVersion source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.GitInfo != null) {
            this.GitInfo = new String(source.GitInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "GitInfo", this.GitInfo);

    }
}

