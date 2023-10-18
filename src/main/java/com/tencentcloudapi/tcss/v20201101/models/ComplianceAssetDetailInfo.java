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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceAssetDetailInfo extends AbstractModel {

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
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Node name of the asset
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Server name of the asset
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server IP of the asset
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

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
    * Number of check items that the asset passed
    */
    @SerializedName("PassedPolicyItemCount")
    @Expose
    private Long PassedPolicyItemCount;

    /**
    * Number of check items that the asset failed
    */
    @SerializedName("FailedPolicyItemCount")
    @Expose
    private Long FailedPolicyItemCount;

    /**
    * Last check time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * Check result. Valid values:
`RESULT_FAILED`: Failed.
`RESULT_PASSED`: Passed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * Asset status
    */
    @SerializedName("AssetStatus")
    @Expose
    private String AssetStatus;

    /**
    * Asset creation time
`ASSET_NORMAL`: Running.
`ASSET_PAUSED`: Suspended.
`ASSET_STOPPED`: Stopped.
`ASSET_ABNORMAL`: Abnormal.
    */
    @SerializedName("AssetCreateTime")
    @Expose
    private String AssetCreateTime;

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
     * Get Node name of the asset 
     * @return NodeName Node name of the asset
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name of the asset
     * @param NodeName Node name of the asset
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Server name of the asset 
     * @return HostName Server name of the asset
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name of the asset
     * @param HostName Server name of the asset
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Server IP of the asset 
     * @return HostIP Server IP of the asset
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP of the asset
     * @param HostIP Server IP of the asset
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
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
     * Get Number of check items that the asset passed 
     * @return PassedPolicyItemCount Number of check items that the asset passed
     */
    public Long getPassedPolicyItemCount() {
        return this.PassedPolicyItemCount;
    }

    /**
     * Set Number of check items that the asset passed
     * @param PassedPolicyItemCount Number of check items that the asset passed
     */
    public void setPassedPolicyItemCount(Long PassedPolicyItemCount) {
        this.PassedPolicyItemCount = PassedPolicyItemCount;
    }

    /**
     * Get Number of check items that the asset failed 
     * @return FailedPolicyItemCount Number of check items that the asset failed
     */
    public Long getFailedPolicyItemCount() {
        return this.FailedPolicyItemCount;
    }

    /**
     * Set Number of check items that the asset failed
     * @param FailedPolicyItemCount Number of check items that the asset failed
     */
    public void setFailedPolicyItemCount(Long FailedPolicyItemCount) {
        this.FailedPolicyItemCount = FailedPolicyItemCount;
    }

    /**
     * Get Last check time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastCheckTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastCheckTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get Check result. Valid values:
`RESULT_FAILED`: Failed.
`RESULT_PASSED`: Passed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckResult Check result. Valid values:
`RESULT_FAILED`: Failed.
`RESULT_PASSED`: Passed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set Check result. Valid values:
`RESULT_FAILED`: Failed.
`RESULT_PASSED`: Passed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckResult Check result. Valid values:
`RESULT_FAILED`: Failed.
`RESULT_PASSED`: Passed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get Asset status 
     * @return AssetStatus Asset status
     */
    public String getAssetStatus() {
        return this.AssetStatus;
    }

    /**
     * Set Asset status
     * @param AssetStatus Asset status
     */
    public void setAssetStatus(String AssetStatus) {
        this.AssetStatus = AssetStatus;
    }

    /**
     * Get Asset creation time
`ASSET_NORMAL`: Running.
`ASSET_PAUSED`: Suspended.
`ASSET_STOPPED`: Stopped.
`ASSET_ABNORMAL`: Abnormal. 
     * @return AssetCreateTime Asset creation time
`ASSET_NORMAL`: Running.
`ASSET_PAUSED`: Suspended.
`ASSET_STOPPED`: Stopped.
`ASSET_ABNORMAL`: Abnormal.
     */
    public String getAssetCreateTime() {
        return this.AssetCreateTime;
    }

    /**
     * Set Asset creation time
`ASSET_NORMAL`: Running.
`ASSET_PAUSED`: Suspended.
`ASSET_STOPPED`: Stopped.
`ASSET_ABNORMAL`: Abnormal.
     * @param AssetCreateTime Asset creation time
`ASSET_NORMAL`: Running.
`ASSET_PAUSED`: Suspended.
`ASSET_STOPPED`: Stopped.
`ASSET_ABNORMAL`: Abnormal.
     */
    public void setAssetCreateTime(String AssetCreateTime) {
        this.AssetCreateTime = AssetCreateTime;
    }

    public ComplianceAssetDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetDetailInfo(ComplianceAssetDetailInfo source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.PassedPolicyItemCount != null) {
            this.PassedPolicyItemCount = new Long(source.PassedPolicyItemCount);
        }
        if (source.FailedPolicyItemCount != null) {
            this.FailedPolicyItemCount = new Long(source.FailedPolicyItemCount);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.AssetStatus != null) {
            this.AssetStatus = new String(source.AssetStatus);
        }
        if (source.AssetCreateTime != null) {
            this.AssetCreateTime = new String(source.AssetCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "PassedPolicyItemCount", this.PassedPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedPolicyItemCount", this.FailedPolicyItemCount);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "AssetStatus", this.AssetStatus);
        this.setParamSimple(map, prefix + "AssetCreateTime", this.AssetCreateTime);

    }
}

