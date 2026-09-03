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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceMapInfo extends AbstractModel {

    /**
    * <p>Resource map ID</p>
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>Resource map name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Resource map description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Total number of instances</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
     * Get <p>Resource map ID</p> 
     * @return ResourceMapId <p>Resource map ID</p>
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>Resource map ID</p>
     * @param ResourceMapId <p>Resource map ID</p>
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>Resource map name</p> 
     * @return Name <p>Resource map name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Resource map name</p>
     * @param Name <p>Resource map name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Resource map description</p> 
     * @return Description <p>Resource map description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Resource map description</p>
     * @param Description <p>Resource map description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Total number of instances</p> 
     * @return InstanceCount <p>Total number of instances</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>Total number of instances</p>
     * @param InstanceCount <p>Total number of instances</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    public ResourceMapInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceMapInfo(ResourceMapInfo source) {
        if (source.ResourceMapId != null) {
            this.ResourceMapId = new String(source.ResourceMapId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);

    }
}

