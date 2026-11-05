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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppMetadata extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * App avatar
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * Creation time (Unix timestamp in seconds).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Application description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Superapp name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Space ID.
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Update time (Unix timestamp in seconds).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Application ID 
     * @return AppId Application ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode 
     * @return AppMode Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode
     * @param AppMode Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get App avatar 
     * @return Avatar App avatar
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set App avatar
     * @param Avatar App avatar
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get Creation time (Unix timestamp in seconds). 
     * @return CreateTime Creation time (Unix timestamp in seconds).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time (Unix timestamp in seconds).
     * @param CreateTime Creation time (Unix timestamp in seconds).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Application description 
     * @return Description Application description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Application description
     * @param Description Application description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Superapp name 
     * @return Name Superapp name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Superapp name
     * @param Name Superapp name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Space ID. 
     * @return SpaceId Space ID.
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Space ID.
     * @param SpaceId Space ID.
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Update time (Unix timestamp in seconds). 
     * @return UpdateTime Update time (Unix timestamp in seconds).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time (Unix timestamp in seconds).
     * @param UpdateTime Update time (Unix timestamp in seconds).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AppMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppMetadata(AppMetadata source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

