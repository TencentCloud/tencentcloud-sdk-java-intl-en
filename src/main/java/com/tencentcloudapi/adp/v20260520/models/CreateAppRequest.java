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

public class CreateAppRequest extends AbstractModel {

    /**
    * <p>Space ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * <p>App avatar</p>
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * <p>Application description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Application name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Space ID</p> 
     * @return SpaceId <p>Space ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID</p>
     * @param SpaceId <p>Space ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p> 
     * @return AppMode <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
     * @param AppMode <p>Application mode. Enumeration values: 1: Standard mode, 2: Agent mode, 3: Single workflow mode, 4: ClawAgent mode</p>
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get <p>App avatar</p> 
     * @return Avatar <p>App avatar</p>
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set <p>App avatar</p>
     * @param Avatar <p>App avatar</p>
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get <p>Application description.</p> 
     * @return Description <p>Application description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Application description.</p>
     * @param Description <p>Application description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Application name.</p> 
     * @return Name <p>Application name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Application name.</p>
     * @param Name <p>Application name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppRequest(CreateAppRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

