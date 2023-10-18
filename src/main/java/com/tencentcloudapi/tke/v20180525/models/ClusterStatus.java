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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterStatus extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster status
    */
    @SerializedName("ClusterState")
    @Expose
    private String ClusterState;

    /**
    * Status of nodes in the cluster
    */
    @SerializedName("ClusterInstanceState")
    @Expose
    private String ClusterInstanceState;

    /**
    * Indicates whether the monitoring service is enabled for the cluster
    */
    @SerializedName("ClusterBMonitor")
    @Expose
    private Boolean ClusterBMonitor;

    /**
    * Number of cluster nodes being created. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
    */
    @SerializedName("ClusterInitNodeNum")
    @Expose
    private Long ClusterInitNodeNum;

    /**
    * Number of running nodes in the cluster. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
    */
    @SerializedName("ClusterRunningNodeNum")
    @Expose
    private Long ClusterRunningNodeNum;

    /**
    * Number of abnormal nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
    */
    @SerializedName("ClusterFailedNodeNum")
    @Expose
    private Long ClusterFailedNodeNum;

    /**
    * Number of shutdown nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ClusterClosedNodeNum")
    @Expose
    private Long ClusterClosedNodeNum;

    /**
    * Number of nodes being shut down in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ClusterClosingNodeNum")
    @Expose
    private Long ClusterClosingNodeNum;

    /**
    * Indicates whether to enable cluster deletion protection
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ClusterDeletionProtection")
    @Expose
    private Boolean ClusterDeletionProtection;

    /**
    * Indicates whether the cluster is auditable
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ClusterAuditEnabled")
    @Expose
    private Boolean ClusterAuditEnabled;

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
     * Get Cluster status 
     * @return ClusterState Cluster status
     */
    public String getClusterState() {
        return this.ClusterState;
    }

    /**
     * Set Cluster status
     * @param ClusterState Cluster status
     */
    public void setClusterState(String ClusterState) {
        this.ClusterState = ClusterState;
    }

    /**
     * Get Status of nodes in the cluster 
     * @return ClusterInstanceState Status of nodes in the cluster
     */
    public String getClusterInstanceState() {
        return this.ClusterInstanceState;
    }

    /**
     * Set Status of nodes in the cluster
     * @param ClusterInstanceState Status of nodes in the cluster
     */
    public void setClusterInstanceState(String ClusterInstanceState) {
        this.ClusterInstanceState = ClusterInstanceState;
    }

    /**
     * Get Indicates whether the monitoring service is enabled for the cluster 
     * @return ClusterBMonitor Indicates whether the monitoring service is enabled for the cluster
     */
    public Boolean getClusterBMonitor() {
        return this.ClusterBMonitor;
    }

    /**
     * Set Indicates whether the monitoring service is enabled for the cluster
     * @param ClusterBMonitor Indicates whether the monitoring service is enabled for the cluster
     */
    public void setClusterBMonitor(Boolean ClusterBMonitor) {
        this.ClusterBMonitor = ClusterBMonitor;
    }

    /**
     * Get Number of cluster nodes being created. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed. 
     * @return ClusterInitNodeNum Number of cluster nodes being created. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     */
    public Long getClusterInitNodeNum() {
        return this.ClusterInitNodeNum;
    }

    /**
     * Set Number of cluster nodes being created. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     * @param ClusterInitNodeNum Number of cluster nodes being created. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     */
    public void setClusterInitNodeNum(Long ClusterInitNodeNum) {
        this.ClusterInitNodeNum = ClusterInitNodeNum;
    }

    /**
     * Get Number of running nodes in the cluster. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed. 
     * @return ClusterRunningNodeNum Number of running nodes in the cluster. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     */
    public Long getClusterRunningNodeNum() {
        return this.ClusterRunningNodeNum;
    }

    /**
     * Set Number of running nodes in the cluster. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     * @param ClusterRunningNodeNum Number of running nodes in the cluster. "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     */
    public void setClusterRunningNodeNum(Long ClusterRunningNodeNum) {
        this.ClusterRunningNodeNum = ClusterRunningNodeNum;
    }

    /**
     * Get Number of abnormal nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed. 
     * @return ClusterFailedNodeNum Number of abnormal nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     */
    public Long getClusterFailedNodeNum() {
        return this.ClusterFailedNodeNum;
    }

    /**
     * Set Number of abnormal nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     * @param ClusterFailedNodeNum Number of abnormal nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
     */
    public void setClusterFailedNodeNum(Long ClusterFailedNodeNum) {
        this.ClusterFailedNodeNum = ClusterFailedNodeNum;
    }

    /**
     * Get Number of shutdown nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ClusterClosedNodeNum Number of shutdown nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getClusterClosedNodeNum() {
        return this.ClusterClosedNodeNum;
    }

    /**
     * Set Number of shutdown nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ClusterClosedNodeNum Number of shutdown nodes in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setClusterClosedNodeNum(Long ClusterClosedNodeNum) {
        this.ClusterClosedNodeNum = ClusterClosedNodeNum;
    }

    /**
     * Get Number of nodes being shut down in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ClusterClosingNodeNum Number of nodes being shut down in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getClusterClosingNodeNum() {
        return this.ClusterClosingNodeNum;
    }

    /**
     * Set Number of nodes being shut down in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ClusterClosingNodeNum Number of nodes being shut down in the cluster.  "-1" indicates that the request to obtain the node status timed out. "-2" indicates that the request failed.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setClusterClosingNodeNum(Long ClusterClosingNodeNum) {
        this.ClusterClosingNodeNum = ClusterClosingNodeNum;
    }

    /**
     * Get Indicates whether to enable cluster deletion protection
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ClusterDeletionProtection Indicates whether to enable cluster deletion protection
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Boolean getClusterDeletionProtection() {
        return this.ClusterDeletionProtection;
    }

    /**
     * Set Indicates whether to enable cluster deletion protection
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ClusterDeletionProtection Indicates whether to enable cluster deletion protection
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setClusterDeletionProtection(Boolean ClusterDeletionProtection) {
        this.ClusterDeletionProtection = ClusterDeletionProtection;
    }

    /**
     * Get Indicates whether the cluster is auditable
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ClusterAuditEnabled Indicates whether the cluster is auditable
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Boolean getClusterAuditEnabled() {
        return this.ClusterAuditEnabled;
    }

    /**
     * Set Indicates whether the cluster is auditable
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ClusterAuditEnabled Indicates whether the cluster is auditable
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setClusterAuditEnabled(Boolean ClusterAuditEnabled) {
        this.ClusterAuditEnabled = ClusterAuditEnabled;
    }

    public ClusterStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterStatus(ClusterStatus source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterState != null) {
            this.ClusterState = new String(source.ClusterState);
        }
        if (source.ClusterInstanceState != null) {
            this.ClusterInstanceState = new String(source.ClusterInstanceState);
        }
        if (source.ClusterBMonitor != null) {
            this.ClusterBMonitor = new Boolean(source.ClusterBMonitor);
        }
        if (source.ClusterInitNodeNum != null) {
            this.ClusterInitNodeNum = new Long(source.ClusterInitNodeNum);
        }
        if (source.ClusterRunningNodeNum != null) {
            this.ClusterRunningNodeNum = new Long(source.ClusterRunningNodeNum);
        }
        if (source.ClusterFailedNodeNum != null) {
            this.ClusterFailedNodeNum = new Long(source.ClusterFailedNodeNum);
        }
        if (source.ClusterClosedNodeNum != null) {
            this.ClusterClosedNodeNum = new Long(source.ClusterClosedNodeNum);
        }
        if (source.ClusterClosingNodeNum != null) {
            this.ClusterClosingNodeNum = new Long(source.ClusterClosingNodeNum);
        }
        if (source.ClusterDeletionProtection != null) {
            this.ClusterDeletionProtection = new Boolean(source.ClusterDeletionProtection);
        }
        if (source.ClusterAuditEnabled != null) {
            this.ClusterAuditEnabled = new Boolean(source.ClusterAuditEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterState", this.ClusterState);
        this.setParamSimple(map, prefix + "ClusterInstanceState", this.ClusterInstanceState);
        this.setParamSimple(map, prefix + "ClusterBMonitor", this.ClusterBMonitor);
        this.setParamSimple(map, prefix + "ClusterInitNodeNum", this.ClusterInitNodeNum);
        this.setParamSimple(map, prefix + "ClusterRunningNodeNum", this.ClusterRunningNodeNum);
        this.setParamSimple(map, prefix + "ClusterFailedNodeNum", this.ClusterFailedNodeNum);
        this.setParamSimple(map, prefix + "ClusterClosedNodeNum", this.ClusterClosedNodeNum);
        this.setParamSimple(map, prefix + "ClusterClosingNodeNum", this.ClusterClosingNodeNum);
        this.setParamSimple(map, prefix + "ClusterDeletionProtection", this.ClusterDeletionProtection);
        this.setParamSimple(map, prefix + "ClusterAuditEnabled", this.ClusterAuditEnabled);

    }
}

