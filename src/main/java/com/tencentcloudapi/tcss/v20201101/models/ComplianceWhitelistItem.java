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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceWhitelistItem extends AbstractModel {

    /**
    * Allowed item ID
    */
    @SerializedName("WhitelistItemId")
    @Expose
    private Long WhitelistItemId;

    /**
    * ID of the customer check item
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * Check item name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Compliance standard name
    */
    @SerializedName("StandardName")
    @Expose
    private String StandardName;

    /**
    * Compliance standard ID
    */
    @SerializedName("StandardId")
    @Expose
    private Long StandardId;

    /**
    * Number of assets affected by the check item
    */
    @SerializedName("AffectedAssetCount")
    @Expose
    private Long AffectedAssetCount;

    /**
    * Last update time
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * Allowed time
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get Allowed item ID 
     * @return WhitelistItemId Allowed item ID
     */
    public Long getWhitelistItemId() {
        return this.WhitelistItemId;
    }

    /**
     * Set Allowed item ID
     * @param WhitelistItemId Allowed item ID
     */
    public void setWhitelistItemId(Long WhitelistItemId) {
        this.WhitelistItemId = WhitelistItemId;
    }

    /**
     * Get ID of the customer check item 
     * @return CustomerPolicyItemId ID of the customer check item
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set ID of the customer check item
     * @param CustomerPolicyItemId ID of the customer check item
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get Check item name 
     * @return Name Check item name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Check item name
     * @param Name Check item name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Compliance standard name 
     * @return StandardName Compliance standard name
     */
    public String getStandardName() {
        return this.StandardName;
    }

    /**
     * Set Compliance standard name
     * @param StandardName Compliance standard name
     */
    public void setStandardName(String StandardName) {
        this.StandardName = StandardName;
    }

    /**
     * Get Compliance standard ID 
     * @return StandardId Compliance standard ID
     */
    public Long getStandardId() {
        return this.StandardId;
    }

    /**
     * Set Compliance standard ID
     * @param StandardId Compliance standard ID
     */
    public void setStandardId(Long StandardId) {
        this.StandardId = StandardId;
    }

    /**
     * Get Number of assets affected by the check item 
     * @return AffectedAssetCount Number of assets affected by the check item
     */
    public Long getAffectedAssetCount() {
        return this.AffectedAssetCount;
    }

    /**
     * Set Number of assets affected by the check item
     * @param AffectedAssetCount Number of assets affected by the check item
     */
    public void setAffectedAssetCount(Long AffectedAssetCount) {
        this.AffectedAssetCount = AffectedAssetCount;
    }

    /**
     * Get Last update time 
     * @return LastUpdateTime Last update time
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last update time
     * @param LastUpdateTime Last update time
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get Allowed time 
     * @return InsertTime Allowed time
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Allowed time
     * @param InsertTime Allowed time
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public ComplianceWhitelistItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceWhitelistItem(ComplianceWhitelistItem source) {
        if (source.WhitelistItemId != null) {
            this.WhitelistItemId = new Long(source.WhitelistItemId);
        }
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StandardName != null) {
            this.StandardName = new String(source.StandardName);
        }
        if (source.StandardId != null) {
            this.StandardId = new Long(source.StandardId);
        }
        if (source.AffectedAssetCount != null) {
            this.AffectedAssetCount = new Long(source.AffectedAssetCount);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhitelistItemId", this.WhitelistItemId);
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StandardName", this.StandardName);
        this.setParamSimple(map, prefix + "StandardId", this.StandardId);
        this.setParamSimple(map, prefix + "AffectedAssetCount", this.AffectedAssetCount);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

