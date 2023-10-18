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

public class ComplianceAssetInfo extends AbstractModel {

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
    * This field is the image tag when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Server IP of the asset
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Node name of the asset
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassedPolicyItemCount")
    @Expose
    private Long PassedPolicyItemCount;

    /**
    * Number of check items that the asset failed
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Node instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
     * Get This field is the image tag when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageTag This field is the image tag when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set This field is the image tag when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageTag This field is the image tag when the asset is an image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassedPolicyItemCount Number of check items that the asset passed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPassedPolicyItemCount() {
        return this.PassedPolicyItemCount;
    }

    /**
     * Set Number of check items that the asset passed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassedPolicyItemCount Number of check items that the asset passed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassedPolicyItemCount(Long PassedPolicyItemCount) {
        this.PassedPolicyItemCount = PassedPolicyItemCount;
    }

    /**
     * Get Number of check items that the asset failed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailedPolicyItemCount Number of check items that the asset failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFailedPolicyItemCount() {
        return this.FailedPolicyItemCount;
    }

    /**
     * Set Number of check items that the asset failed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailedPolicyItemCount Number of check items that the asset failed
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Node instance ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceId Node instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Node instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceId Node instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ComplianceAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetInfo(ComplianceAssetInfo source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "PassedPolicyItemCount", this.PassedPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedPolicyItemCount", this.FailedPolicyItemCount);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

