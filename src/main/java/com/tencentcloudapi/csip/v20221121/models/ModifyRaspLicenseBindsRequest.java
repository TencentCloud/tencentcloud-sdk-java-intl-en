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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRaspLicenseBindsRequest extends AbstractModel {

    /**
    * Asset type
- CWP host security assets
- TCSS_HOST container host node
- TCSS_EKS container super node
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * Billing item type
-sv_yunjing_vas_small small package
-sv_yunjing_vas_medium medium package
-sv_yunjing_vas_large package
-sv_yunjing_vas_expansion expansion package
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * Instance ID array.
    */
    @SerializedName("QUUID")
    @Expose
    private String [] QUUID;

    /**
    * Whether to include all host instances.
    */
    @SerializedName("IsALL")
    @Expose
    private Boolean IsALL;

    /**
    * Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to QUUIDs.
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Asset type
- CWP host security assets
- TCSS_HOST container host node
- TCSS_EKS container super node 
     * @return AssetType Asset type
- CWP host security assets
- TCSS_HOST container host node
- TCSS_EKS container super node
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
- CWP host security assets
- TCSS_HOST container host node
- TCSS_EKS container super node
     * @param AssetType Asset type
- CWP host security assets
- TCSS_HOST container host node
- TCSS_EKS container super node
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Resource ID 
     * @return ResourceID Resource ID
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set Resource ID
     * @param ResourceID Resource ID
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get Billing item type
-sv_yunjing_vas_small small package
-sv_yunjing_vas_medium medium package
-sv_yunjing_vas_large package
-sv_yunjing_vas_expansion expansion package 
     * @return InquireKey Billing item type
-sv_yunjing_vas_small small package
-sv_yunjing_vas_medium medium package
-sv_yunjing_vas_large package
-sv_yunjing_vas_expansion expansion package
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set Billing item type
-sv_yunjing_vas_small small package
-sv_yunjing_vas_medium medium package
-sv_yunjing_vas_large package
-sv_yunjing_vas_expansion expansion package
     * @param InquireKey Billing item type
-sv_yunjing_vas_small small package
-sv_yunjing_vas_medium medium package
-sv_yunjing_vas_large package
-sv_yunjing_vas_expansion expansion package
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get Instance ID array. 
     * @return QUUID Instance ID array.
     */
    public String [] getQUUID() {
        return this.QUUID;
    }

    /**
     * Set Instance ID array.
     * @param QUUID Instance ID array.
     */
    public void setQUUID(String [] QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get Whether to include all host instances. 
     * @return IsALL Whether to include all host instances.
     */
    public Boolean getIsALL() {
        return this.IsALL;
    }

    /**
     * Set Whether to include all host instances.
     * @param IsALL Whether to include all host instances.
     */
    public void setIsALL(Boolean IsALL) {
        this.IsALL = IsALL;
    }

    /**
     * Get Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to QUUIDs. 
     * @return Filters Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to QUUIDs.
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to QUUIDs.
     * @param Filters Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to QUUIDs.
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ModifyRaspLicenseBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRaspLicenseBindsRequest(ModifyRaspLicenseBindsRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.QUUID != null) {
            this.QUUID = new String[source.QUUID.length];
            for (int i = 0; i < source.QUUID.length; i++) {
                this.QUUID[i] = new String(source.QUUID[i]);
            }
        }
        if (source.IsALL != null) {
            this.IsALL = new Boolean(source.IsALL);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamArraySimple(map, prefix + "QUUID.", this.QUUID);
        this.setParamSimple(map, prefix + "IsALL", this.IsALL);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

