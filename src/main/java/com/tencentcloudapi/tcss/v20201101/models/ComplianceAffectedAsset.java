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

public class ComplianceAffectedAsset extends AbstractModel{

    /**
    * Unique ID of the customer asset
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

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
    * Node name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Last check time in the format of "YYYY-MM-DD HH:m::SS"

It is "0000-00-00 00:00:00" if no check has been performed.
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * Check result. Valid values:

`RESULT_FAILED`: Failed.

`RESULT_PASSED`: Passed.
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * Server IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Image tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Verification information of the check item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyInfo")
    @Expose
    private String VerifyInfo;

    /**
    * Instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Unique ID of the customer asset 
     * @return CustomerAssetId Unique ID of the customer asset
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set Unique ID of the customer asset
     * @param CustomerAssetId Unique ID of the customer asset
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
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
     * Get Node name 
     * @return NodeName Node name
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name
     * @param NodeName Node name
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Last check time in the format of "YYYY-MM-DD HH:m::SS"

It is "0000-00-00 00:00:00" if no check has been performed. 
     * @return LastCheckTime Last check time in the format of "YYYY-MM-DD HH:m::SS"

It is "0000-00-00 00:00:00" if no check has been performed.
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set Last check time in the format of "YYYY-MM-DD HH:m::SS"

It is "0000-00-00 00:00:00" if no check has been performed.
     * @param LastCheckTime Last check time in the format of "YYYY-MM-DD HH:m::SS"

It is "0000-00-00 00:00:00" if no check has been performed.
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get Check result. Valid values:

`RESULT_FAILED`: Failed.

`RESULT_PASSED`: Passed. 
     * @return CheckResult Check result. Valid values:

`RESULT_FAILED`: Failed.

`RESULT_PASSED`: Passed.
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set Check result. Valid values:

`RESULT_FAILED`: Failed.

`RESULT_PASSED`: Passed.
     * @param CheckResult Check result. Valid values:

`RESULT_FAILED`: Failed.

`RESULT_PASSED`: Passed.
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get Server IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIP Server IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIP Server IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Image tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageTag Image tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set Image tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageTag Image tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get Verification information of the check item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VerifyInfo Verification information of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVerifyInfo() {
        return this.VerifyInfo;
    }

    /**
     * Set Verification information of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VerifyInfo Verification information of the check item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyInfo(String VerifyInfo) {
        this.VerifyInfo = VerifyInfo;
    }

    /**
     * Get Instance ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ComplianceAffectedAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAffectedAsset(ComplianceAffectedAsset source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.VerifyInfo != null) {
            this.VerifyInfo = new String(source.VerifyInfo);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "VerifyInfo", this.VerifyInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

