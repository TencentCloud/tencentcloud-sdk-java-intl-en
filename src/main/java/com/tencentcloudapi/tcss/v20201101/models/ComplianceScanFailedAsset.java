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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceScanFailedAsset extends AbstractModel{

    /**
    * Customer asset ID
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Check status
`CHECK_INIT`: To be checked.
`CHECK_RUNNING`: Checking.
`CHECK_FINISHED`: Checked.
`CHECK_FAILED`: Check failed.
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Cause of the asset check failure
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * Suggestion for handling the check failure
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Check time
    */
    @SerializedName("CheckTime")
    @Expose
    private String CheckTime;

    /**
     * Get Customer asset ID 
     * @return CustomerAssetId Customer asset ID
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set Customer asset ID
     * @param CustomerAssetId Customer asset ID
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Check status
`CHECK_INIT`: To be checked.
`CHECK_RUNNING`: Checking.
`CHECK_FINISHED`: Checked.
`CHECK_FAILED`: Check failed. 
     * @return CheckStatus Check status
`CHECK_INIT`: To be checked.
`CHECK_RUNNING`: Checking.
`CHECK_FINISHED`: Checked.
`CHECK_FAILED`: Check failed.
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set Check status
`CHECK_INIT`: To be checked.
`CHECK_RUNNING`: Checking.
`CHECK_FINISHED`: Checked.
`CHECK_FAILED`: Check failed.
     * @param CheckStatus Check status
`CHECK_INIT`: To be checked.
`CHECK_RUNNING`: Checking.
`CHECK_FINISHED`: Checked.
`CHECK_FAILED`: Check failed.
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get Asset name 
     * @return AssetName Asset name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
     * @param AssetName Asset name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Cause of the asset check failure 
     * @return FailureReason Cause of the asset check failure
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set Cause of the asset check failure
     * @param FailureReason Cause of the asset check failure
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get Suggestion for handling the check failure 
     * @return Suggestion Suggestion for handling the check failure
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for handling the check failure
     * @param Suggestion Suggestion for handling the check failure
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Check time 
     * @return CheckTime Check time
     */
    public String getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set Check time
     * @param CheckTime Check time
     */
    public void setCheckTime(String CheckTime) {
        this.CheckTime = CheckTime;
    }

    public ComplianceScanFailedAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceScanFailedAsset(ComplianceScanFailedAsset source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.CheckTime != null) {
            this.CheckTime = new String(source.CheckTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "CheckTime", this.CheckTime);

    }
}

