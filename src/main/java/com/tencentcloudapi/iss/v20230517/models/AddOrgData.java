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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOrgData extends AbstractModel {

    /**
    * Organization ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * Organization name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Organization parent node ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Organization hierarchy
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * User ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Organizational structure
    */
    @SerializedName("ParentIds")
    @Expose
    private String ParentIds;

    /**
    * Total number of devices
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of devices online
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
     * Get Organization ID 
     * @return OrganizationId Organization ID
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set Organization ID
     * @param OrganizationId Organization ID
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get Organization name 
     * @return Name Organization name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Organization name
     * @param Name Organization name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Organization parent node ID 
     * @return ParentId Organization parent node ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Organization parent node ID
     * @param ParentId Organization parent node ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Organization hierarchy 
     * @return Level Organization hierarchy
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Organization hierarchy
     * @param Level Organization hierarchy
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get User ID. 
     * @return AppId User ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID.
     * @param AppId User ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Organizational structure 
     * @return ParentIds Organizational structure
     */
    public String getParentIds() {
        return this.ParentIds;
    }

    /**
     * Set Organizational structure
     * @param ParentIds Organizational structure
     */
    public void setParentIds(String ParentIds) {
        this.ParentIds = ParentIds;
    }

    /**
     * Get Total number of devices 
     * @return Total Total number of devices
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of devices
     * @param Total Total number of devices
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of devices online 
     * @return Online Number of devices online
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set Number of devices online
     * @param Online Number of devices online
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    public AddOrgData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrgData(AddOrgData source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ParentIds != null) {
            this.ParentIds = new String(source.ParentIds);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ParentIds", this.ParentIds);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

