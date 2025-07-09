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

public class CreateDedicatedClusterRequest extends AbstractModel {

    /**
    * SiteId to which the CDC belongs
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
    * CDC name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * AZ to which the CDC belongs
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * CDC description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get SiteId to which the CDC belongs 
     * @return SiteId SiteId to which the CDC belongs
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set SiteId to which the CDC belongs
     * @param SiteId SiteId to which the CDC belongs
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
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
     * Get AZ to which the CDC belongs 
     * @return Zone AZ to which the CDC belongs
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ to which the CDC belongs
     * @param Zone AZ to which the CDC belongs
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get CDC description 
     * @return Description CDC description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set CDC description
     * @param Description CDC description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateDedicatedClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDedicatedClusterRequest(CreateDedicatedClusterRequest source) {
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

