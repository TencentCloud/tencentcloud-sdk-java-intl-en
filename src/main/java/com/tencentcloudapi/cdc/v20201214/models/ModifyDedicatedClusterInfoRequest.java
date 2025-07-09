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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDedicatedClusterInfoRequest extends AbstractModel {

    /**
    * CDC ID
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * New cluster name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * New cluster AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * New cluster description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Site where the cluster resides
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
     * Get CDC ID 
     * @return DedicatedClusterId CDC ID
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC ID
     * @param DedicatedClusterId CDC ID
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get New cluster name 
     * @return Name New cluster name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set New cluster name
     * @param Name New cluster name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get New cluster AZ 
     * @return Zone New cluster AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set New cluster AZ
     * @param Zone New cluster AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get New cluster description 
     * @return Description New cluster description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set New cluster description
     * @param Description New cluster description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Site where the cluster resides 
     * @return SiteId Site where the cluster resides
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set Site where the cluster resides
     * @param SiteId Site where the cluster resides
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    public ModifyDedicatedClusterInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDedicatedClusterInfoRequest(ModifyDedicatedClusterInfoRequest source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);

    }
}

