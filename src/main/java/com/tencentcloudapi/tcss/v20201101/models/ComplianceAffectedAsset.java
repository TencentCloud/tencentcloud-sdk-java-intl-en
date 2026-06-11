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

public class ComplianceAffectedAsset extends AbstractModel {

    /**
    * <p>Unique asset item ID allocated to the customer.</p>
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * <p>Asset item name.</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>Asset item type.</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Check status.</p><p>CHECK_INIT: pending check</p><p>CHECK_RUNNING: checking</p><p>CHECK_FINISHED: check completed</p><p>CHECK_FAILED: check failed</p>
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * <p>Node name.</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>Last check time in the format of YYYY-MM-DD HH:m::SS.</p><p>If never checked, this field will be 0000-00-00 00:00:00.</p>
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * <p>Check result. Valid values:</p><p>RESULT_FAILED: failed</p><p>RESULT_PASSED: passed</p>
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * <p>Host IP address.</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>Image tag.</p>
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * <p>Check item verification information.</p>
    */
    @SerializedName("VerifyInfo")
    @Expose
    private String VerifyInfo;

    /**
    * <p>Host instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Image repository information.</p>
    */
    @SerializedName("ImageRegistryInfo")
    @Expose
    private ImageRegistryInfo ImageRegistryInfo;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Unique asset ID.</p><p>Default value: -</p>
    */
    @SerializedName("AssetUniqueID")
    @Expose
    private String AssetUniqueID;

    /**
     * Get <p>Unique asset item ID allocated to the customer.</p> 
     * @return CustomerAssetId <p>Unique asset item ID allocated to the customer.</p>
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set <p>Unique asset item ID allocated to the customer.</p>
     * @param CustomerAssetId <p>Unique asset item ID allocated to the customer.</p>
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    /**
     * Get <p>Asset item name.</p> 
     * @return AssetName <p>Asset item name.</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>Asset item name.</p>
     * @param AssetName <p>Asset item name.</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>Asset item type.</p> 
     * @return AssetType <p>Asset item type.</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset item type.</p>
     * @param AssetType <p>Asset item type.</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Check status.</p><p>CHECK_INIT: pending check</p><p>CHECK_RUNNING: checking</p><p>CHECK_FINISHED: check completed</p><p>CHECK_FAILED: check failed</p> 
     * @return CheckStatus <p>Check status.</p><p>CHECK_INIT: pending check</p><p>CHECK_RUNNING: checking</p><p>CHECK_FINISHED: check completed</p><p>CHECK_FAILED: check failed</p>
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set <p>Check status.</p><p>CHECK_INIT: pending check</p><p>CHECK_RUNNING: checking</p><p>CHECK_FINISHED: check completed</p><p>CHECK_FAILED: check failed</p>
     * @param CheckStatus <p>Check status.</p><p>CHECK_INIT: pending check</p><p>CHECK_RUNNING: checking</p><p>CHECK_FINISHED: check completed</p><p>CHECK_FAILED: check failed</p>
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get <p>Node name.</p> 
     * @return NodeName <p>Node name.</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>Node name.</p>
     * @param NodeName <p>Node name.</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>Last check time in the format of YYYY-MM-DD HH:m::SS.</p><p>If never checked, this field will be 0000-00-00 00:00:00.</p> 
     * @return LastCheckTime <p>Last check time in the format of YYYY-MM-DD HH:m::SS.</p><p>If never checked, this field will be 0000-00-00 00:00:00.</p>
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set <p>Last check time in the format of YYYY-MM-DD HH:m::SS.</p><p>If never checked, this field will be 0000-00-00 00:00:00.</p>
     * @param LastCheckTime <p>Last check time in the format of YYYY-MM-DD HH:m::SS.</p><p>If never checked, this field will be 0000-00-00 00:00:00.</p>
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get <p>Check result. Valid values:</p><p>RESULT_FAILED: failed</p><p>RESULT_PASSED: passed</p> 
     * @return CheckResult <p>Check result. Valid values:</p><p>RESULT_FAILED: failed</p><p>RESULT_PASSED: passed</p>
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set <p>Check result. Valid values:</p><p>RESULT_FAILED: failed</p><p>RESULT_PASSED: passed</p>
     * @param CheckResult <p>Check result. Valid values:</p><p>RESULT_FAILED: failed</p><p>RESULT_PASSED: passed</p>
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get <p>Host IP address.</p> 
     * @return HostIP <p>Host IP address.</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>Host IP address.</p>
     * @param HostIP <p>Host IP address.</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get <p>Image tag.</p> 
     * @return ImageTag <p>Image tag.</p>
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set <p>Image tag.</p>
     * @param ImageTag <p>Image tag.</p>
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get <p>Check item verification information.</p> 
     * @return VerifyInfo <p>Check item verification information.</p>
     */
    public String getVerifyInfo() {
        return this.VerifyInfo;
    }

    /**
     * Set <p>Check item verification information.</p>
     * @param VerifyInfo <p>Check item verification information.</p>
     */
    public void setVerifyInfo(String VerifyInfo) {
        this.VerifyInfo = VerifyInfo;
    }

    /**
     * Get <p>Host instance ID.</p> 
     * @return InstanceId <p>Host instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Host instance ID.</p>
     * @param InstanceId <p>Host instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Image repository information.</p> 
     * @return ImageRegistryInfo <p>Image repository information.</p>
     */
    public ImageRegistryInfo getImageRegistryInfo() {
        return this.ImageRegistryInfo;
    }

    /**
     * Set <p>Image repository information.</p>
     * @param ImageRegistryInfo <p>Image repository information.</p>
     */
    public void setImageRegistryInfo(ImageRegistryInfo ImageRegistryInfo) {
        this.ImageRegistryInfo = ImageRegistryInfo;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterID <p>Cluster ID.</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterID <p>Cluster ID.</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Unique asset ID.</p><p>Default value: -</p> 
     * @return AssetUniqueID <p>Unique asset ID.</p><p>Default value: -</p>
     */
    public String getAssetUniqueID() {
        return this.AssetUniqueID;
    }

    /**
     * Set <p>Unique asset ID.</p><p>Default value: -</p>
     * @param AssetUniqueID <p>Unique asset ID.</p><p>Default value: -</p>
     */
    public void setAssetUniqueID(String AssetUniqueID) {
        this.AssetUniqueID = AssetUniqueID;
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
        if (source.ImageRegistryInfo != null) {
            this.ImageRegistryInfo = new ImageRegistryInfo(source.ImageRegistryInfo);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AssetUniqueID != null) {
            this.AssetUniqueID = new String(source.AssetUniqueID);
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
        this.setParamObj(map, prefix + "ImageRegistryInfo.", this.ImageRegistryInfo);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AssetUniqueID", this.AssetUniqueID);

    }
}

