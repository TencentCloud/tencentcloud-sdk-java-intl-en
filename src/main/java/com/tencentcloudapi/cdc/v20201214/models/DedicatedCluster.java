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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedCluster extends AbstractModel {

    /**
    * CDC id, e.g., cluster-xxxxx.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * Name of AZ to which the CDC belongs
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * CDC description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CDC name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Life cycle of the CDC, e.g., PENDING.
    */
    @SerializedName("LifecycleStatus")
    @Expose
    private String LifecycleStatus;

    /**
    * Creation time of the CDC
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Site id to which the CDC belongs
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
     * Get CDC id, e.g., cluster-xxxxx. 
     * @return DedicatedClusterId CDC id, e.g., cluster-xxxxx.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC id, e.g., cluster-xxxxx.
     * @param DedicatedClusterId CDC id, e.g., cluster-xxxxx.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get Name of AZ to which the CDC belongs 
     * @return Zone Name of AZ to which the CDC belongs
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Name of AZ to which the CDC belongs
     * @param Zone Name of AZ to which the CDC belongs
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get CDC description 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Description CDC description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set CDC description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Description CDC description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CDC name 
     * @return Name CDC name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set CDC name
     * @param Name CDC name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Life cycle of the CDC, e.g., PENDING. 
     * @return LifecycleStatus Life cycle of the CDC, e.g., PENDING.
     */
    public String getLifecycleStatus() {
        return this.LifecycleStatus;
    }

    /**
     * Set Life cycle of the CDC, e.g., PENDING.
     * @param LifecycleStatus Life cycle of the CDC, e.g., PENDING.
     */
    public void setLifecycleStatus(String LifecycleStatus) {
        this.LifecycleStatus = LifecycleStatus;
    }

    /**
     * Get Creation time of the CDC 
     * @return CreateTime Creation time of the CDC
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the CDC
     * @param CreateTime Creation time of the CDC
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Site id to which the CDC belongs 
     * @return SiteId Site id to which the CDC belongs
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set Site id to which the CDC belongs
     * @param SiteId Site id to which the CDC belongs
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    public DedicatedCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedCluster(DedicatedCluster source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LifecycleStatus != null) {
            this.LifecycleStatus = new String(source.LifecycleStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LifecycleStatus", this.LifecycleStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);

    }
}

