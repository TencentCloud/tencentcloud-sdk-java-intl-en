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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeClusterUpgradeInfoResponse extends AbstractModel{

    /**
    * Upgradeable cluster component
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ComponentVersion")
    @Expose
    private String ComponentVersion;

    /**
    * Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EdgeVersionCurrent")
    @Expose
    private String EdgeVersionCurrent;

    /**
    * Prefix of the image registry of an edge component (including domain name and namespace)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RegistryPrefix")
    @Expose
    private String RegistryPrefix;

    /**
    * Cluster upgrade status. Valid values: `Running`, `Updating`, `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterUpgradeStatus")
    @Expose
    private String ClusterUpgradeStatus;

    /**
    * Reason for `Updating` or `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterUpgradeStatusReason")
    @Expose
    private String ClusterUpgradeStatusReason;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Upgradeable cluster component
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ComponentVersion Upgradeable cluster component
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getComponentVersion() {
        return this.ComponentVersion;
    }

    /**
     * Set Upgradeable cluster component
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ComponentVersion Upgradeable cluster component
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setComponentVersion(String ComponentVersion) {
        this.ComponentVersion = ComponentVersion;
    }

    /**
     * Get Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EdgeVersionCurrent Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEdgeVersionCurrent() {
        return this.EdgeVersionCurrent;
    }

    /**
     * Set Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EdgeVersionCurrent Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEdgeVersionCurrent(String EdgeVersionCurrent) {
        this.EdgeVersionCurrent = EdgeVersionCurrent;
    }

    /**
     * Get Prefix of the image registry of an edge component (including domain name and namespace)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RegistryPrefix Prefix of the image registry of an edge component (including domain name and namespace)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRegistryPrefix() {
        return this.RegistryPrefix;
    }

    /**
     * Set Prefix of the image registry of an edge component (including domain name and namespace)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RegistryPrefix Prefix of the image registry of an edge component (including domain name and namespace)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRegistryPrefix(String RegistryPrefix) {
        this.RegistryPrefix = RegistryPrefix;
    }

    /**
     * Get Cluster upgrade status. Valid values: `Running`, `Updating`, `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClusterUpgradeStatus Cluster upgrade status. Valid values: `Running`, `Updating`, `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getClusterUpgradeStatus() {
        return this.ClusterUpgradeStatus;
    }

    /**
     * Set Cluster upgrade status. Valid values: `Running`, `Updating`, `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClusterUpgradeStatus Cluster upgrade status. Valid values: `Running`, `Updating`, `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClusterUpgradeStatus(String ClusterUpgradeStatus) {
        this.ClusterUpgradeStatus = ClusterUpgradeStatus;
    }

    /**
     * Get Reason for `Updating` or `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ClusterUpgradeStatusReason Reason for `Updating` or `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getClusterUpgradeStatusReason() {
        return this.ClusterUpgradeStatusReason;
    }

    /**
     * Set Reason for `Updating` or `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ClusterUpgradeStatusReason Reason for `Updating` or `Failed`
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClusterUpgradeStatusReason(String ClusterUpgradeStatusReason) {
        this.ClusterUpgradeStatusReason = ClusterUpgradeStatusReason;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEdgeClusterUpgradeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeClusterUpgradeInfoResponse(DescribeEdgeClusterUpgradeInfoResponse source) {
        if (source.ComponentVersion != null) {
            this.ComponentVersion = new String(source.ComponentVersion);
        }
        if (source.EdgeVersionCurrent != null) {
            this.EdgeVersionCurrent = new String(source.EdgeVersionCurrent);
        }
        if (source.RegistryPrefix != null) {
            this.RegistryPrefix = new String(source.RegistryPrefix);
        }
        if (source.ClusterUpgradeStatus != null) {
            this.ClusterUpgradeStatus = new String(source.ClusterUpgradeStatus);
        }
        if (source.ClusterUpgradeStatusReason != null) {
            this.ClusterUpgradeStatusReason = new String(source.ClusterUpgradeStatusReason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentVersion", this.ComponentVersion);
        this.setParamSimple(map, prefix + "EdgeVersionCurrent", this.EdgeVersionCurrent);
        this.setParamSimple(map, prefix + "RegistryPrefix", this.RegistryPrefix);
        this.setParamSimple(map, prefix + "ClusterUpgradeStatus", this.ClusterUpgradeStatus);
        this.setParamSimple(map, prefix + "ClusterUpgradeStatusReason", this.ClusterUpgradeStatusReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

