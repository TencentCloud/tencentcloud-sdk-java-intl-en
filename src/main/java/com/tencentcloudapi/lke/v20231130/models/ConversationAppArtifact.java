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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationAppArtifact extends AbstractModel {

    /**
    * 
    */
    @SerializedName("AppAvatar")
    @Expose
    private String AppAvatar;

    /**
    * 
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 
    */
    @SerializedName("AppPattern")
    @Expose
    private Long AppPattern;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get  
     * @return AppAvatar 
     */
    public String getAppAvatar() {
        return this.AppAvatar;
    }

    /**
     * Set 
     * @param AppAvatar 
     */
    public void setAppAvatar(String AppAvatar) {
        this.AppAvatar = AppAvatar;
    }

    /**
     * Get  
     * @return AppId 
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 
     * @param AppId 
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get  
     * @return AppPattern 
     */
    public Long getAppPattern() {
        return this.AppPattern;
    }

    /**
     * Set 
     * @param AppPattern 
     */
    public void setAppPattern(Long AppPattern) {
        this.AppPattern = AppPattern;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return SpaceId 
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 
     * @param SpaceId 
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public ConversationAppArtifact() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationAppArtifact(ConversationAppArtifact source) {
        if (source.AppAvatar != null) {
            this.AppAvatar = new String(source.AppAvatar);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppPattern != null) {
            this.AppPattern = new Long(source.AppPattern);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppAvatar", this.AppAvatar);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppPattern", this.AppPattern);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}

