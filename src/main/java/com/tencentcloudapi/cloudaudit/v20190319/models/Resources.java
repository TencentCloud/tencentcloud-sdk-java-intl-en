/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resources extends AbstractModel{

    /**
    * Resource type
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Resource region
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Resource alias
    */
    @SerializedName("ResourceAlias")
    @Expose
    private String ResourceAlias;

    /**
    * Whether the resource is deleted
    */
    @SerializedName("IsDeleted")
    @Expose
    private Boolean IsDeleted;

    /**
     * Get Resource type 
     * @return ResourceType Resource type
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
     * @param ResourceType Resource type
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource creation time 
     * @return CreateTime Resource creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Resource creation time
     * @param CreateTime Resource creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Resource region 
     * @return ResourceRegion Resource region
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region
     * @param ResourceRegion Resource region
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Resource alias 
     * @return ResourceAlias Resource alias
     */
    public String getResourceAlias() {
        return this.ResourceAlias;
    }

    /**
     * Set Resource alias
     * @param ResourceAlias Resource alias
     */
    public void setResourceAlias(String ResourceAlias) {
        this.ResourceAlias = ResourceAlias;
    }

    /**
     * Get Whether the resource is deleted 
     * @return IsDeleted Whether the resource is deleted
     */
    public Boolean getIsDeleted() {
        return this.IsDeleted;
    }

    /**
     * Set Whether the resource is deleted
     * @param IsDeleted Whether the resource is deleted
     */
    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public Resources() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resources(Resources source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceAlias != null) {
            this.ResourceAlias = new String(source.ResourceAlias);
        }
        if (source.IsDeleted != null) {
            this.IsDeleted = new Boolean(source.IsDeleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceAlias", this.ResourceAlias);
        this.setParamSimple(map, prefix + "IsDeleted", this.IsDeleted);

    }
}

