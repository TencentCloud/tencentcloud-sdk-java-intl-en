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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAppIdInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("SubAppIdName")
    @Expose
    private String SubAppIdName;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("StorageRegions")
    @Expose
    private String [] StorageRegions;

    /**
    * 
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return SubAppIdName 
     */
    public String getSubAppIdName() {
        return this.SubAppIdName;
    }

    /**
     * Set 
     * @param SubAppIdName 
     */
    public void setSubAppIdName(String SubAppIdName) {
        this.SubAppIdName = SubAppIdName;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * @return Mode 
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 
     * @param Mode 
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get  
     * @return StorageRegions 
     */
    public String [] getStorageRegions() {
        return this.StorageRegions;
    }

    /**
     * Set 
     * @param StorageRegions 
     */
    public void setStorageRegions(String [] StorageRegions) {
        this.StorageRegions = StorageRegions;
    }

    /**
     * Get  
     * @return Tags 
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 
     * @param Tags 
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
    }

    public SubAppIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubAppIdInfo(SubAppIdInfo source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SubAppIdName != null) {
            this.SubAppIdName = new String(source.SubAppIdName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StorageRegions != null) {
            this.StorageRegions = new String[source.StorageRegions.length];
            for (int i = 0; i < source.StorageRegions.length; i++) {
                this.StorageRegions[i] = new String(source.StorageRegions[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SubAppIdName", this.SubAppIdName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "StorageRegions.", this.StorageRegions);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

