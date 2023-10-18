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

public class NetworkClusterInfoItem extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster version
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Cluster OS
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * Cluster type
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Cluster network plugin
    */
    @SerializedName("NetworkPolicyPlugin")
    @Expose
    private String NetworkPolicyPlugin;

    /**
    * Cluster status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * Total number of policies
    */
    @SerializedName("TotalRuleCount")
    @Expose
    private Long TotalRuleCount;

    /**
    * Number of enabled policies
    */
    @SerializedName("EnableRuleCount")
    @Expose
    private Long EnableRuleCount;

    /**
    * Status of the cluster network plugin. Valid values: `Running` (normal); `Error` (abnormal).
    */
    @SerializedName("NetworkPolicyPluginStatus")
    @Expose
    private String NetworkPolicyPluginStatus;

    /**
    * Error message of the cluster network plugin
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkPolicyPluginError")
    @Expose
    private String NetworkPolicyPluginError;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster version 
     * @return ClusterVersion Cluster version
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Cluster version
     * @param ClusterVersion Cluster version
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Cluster OS 
     * @return ClusterOs Cluster OS
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set Cluster OS
     * @param ClusterOs Cluster OS
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get Cluster type 
     * @return ClusterType Cluster type
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type
     * @param ClusterType Cluster type
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster region 
     * @return Region Cluster region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster region
     * @param Region Cluster region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Cluster network plugin 
     * @return NetworkPolicyPlugin Cluster network plugin
     */
    public String getNetworkPolicyPlugin() {
        return this.NetworkPolicyPlugin;
    }

    /**
     * Set Cluster network plugin
     * @param NetworkPolicyPlugin Cluster network plugin
     */
    public void setNetworkPolicyPlugin(String NetworkPolicyPlugin) {
        this.NetworkPolicyPlugin = NetworkPolicyPlugin;
    }

    /**
     * Get Cluster status 
     * @return ClusterStatus Cluster status
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status
     * @param ClusterStatus Cluster status
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Total number of policies 
     * @return TotalRuleCount Total number of policies
     */
    public Long getTotalRuleCount() {
        return this.TotalRuleCount;
    }

    /**
     * Set Total number of policies
     * @param TotalRuleCount Total number of policies
     */
    public void setTotalRuleCount(Long TotalRuleCount) {
        this.TotalRuleCount = TotalRuleCount;
    }

    /**
     * Get Number of enabled policies 
     * @return EnableRuleCount Number of enabled policies
     */
    public Long getEnableRuleCount() {
        return this.EnableRuleCount;
    }

    /**
     * Set Number of enabled policies
     * @param EnableRuleCount Number of enabled policies
     */
    public void setEnableRuleCount(Long EnableRuleCount) {
        this.EnableRuleCount = EnableRuleCount;
    }

    /**
     * Get Status of the cluster network plugin. Valid values: `Running` (normal); `Error` (abnormal). 
     * @return NetworkPolicyPluginStatus Status of the cluster network plugin. Valid values: `Running` (normal); `Error` (abnormal).
     */
    public String getNetworkPolicyPluginStatus() {
        return this.NetworkPolicyPluginStatus;
    }

    /**
     * Set Status of the cluster network plugin. Valid values: `Running` (normal); `Error` (abnormal).
     * @param NetworkPolicyPluginStatus Status of the cluster network plugin. Valid values: `Running` (normal); `Error` (abnormal).
     */
    public void setNetworkPolicyPluginStatus(String NetworkPolicyPluginStatus) {
        this.NetworkPolicyPluginStatus = NetworkPolicyPluginStatus;
    }

    /**
     * Get Error message of the cluster network plugin
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkPolicyPluginError Error message of the cluster network plugin
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkPolicyPluginError() {
        return this.NetworkPolicyPluginError;
    }

    /**
     * Set Error message of the cluster network plugin
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkPolicyPluginError Error message of the cluster network plugin
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkPolicyPluginError(String NetworkPolicyPluginError) {
        this.NetworkPolicyPluginError = NetworkPolicyPluginError;
    }

    public NetworkClusterInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkClusterInfoItem(NetworkClusterInfoItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.NetworkPolicyPlugin != null) {
            this.NetworkPolicyPlugin = new String(source.NetworkPolicyPlugin);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.TotalRuleCount != null) {
            this.TotalRuleCount = new Long(source.TotalRuleCount);
        }
        if (source.EnableRuleCount != null) {
            this.EnableRuleCount = new Long(source.EnableRuleCount);
        }
        if (source.NetworkPolicyPluginStatus != null) {
            this.NetworkPolicyPluginStatus = new String(source.NetworkPolicyPluginStatus);
        }
        if (source.NetworkPolicyPluginError != null) {
            this.NetworkPolicyPluginError = new String(source.NetworkPolicyPluginError);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "NetworkPolicyPlugin", this.NetworkPolicyPlugin);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "TotalRuleCount", this.TotalRuleCount);
        this.setParamSimple(map, prefix + "EnableRuleCount", this.EnableRuleCount);
        this.setParamSimple(map, prefix + "NetworkPolicyPluginStatus", this.NetworkPolicyPluginStatus);
        this.setParamSimple(map, prefix + "NetworkPolicyPluginError", this.NetworkPolicyPluginError);

    }
}

