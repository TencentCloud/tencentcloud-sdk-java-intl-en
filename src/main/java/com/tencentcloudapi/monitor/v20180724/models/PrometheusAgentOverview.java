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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAgentOverview extends AbstractModel{

    /**
    * Cluster type
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Agent status. Valid values: 
`normal`
`abnormal`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * External labels
External labels, which will be attached to all metrics in this cluster
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExternalLabels")
    @Expose
    private Label [] ExternalLabels;

    /**
    * Cluster region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * ID of the VPC where the cluster resides
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Recorded information of failed operations, such as association.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

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
     * Get Agent status. Valid values: 
`normal`
`abnormal` 
     * @return Status Agent status. Valid values: 
`normal`
`abnormal`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status. Valid values: 
`normal`
`abnormal`
     * @param Status Agent status. Valid values: 
`normal`
`abnormal`
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get External labels
External labels, which will be attached to all metrics in this cluster
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExternalLabels External labels
External labels, which will be attached to all metrics in this cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Label [] getExternalLabels() {
        return this.ExternalLabels;
    }

    /**
     * Set External labels
External labels, which will be attached to all metrics in this cluster
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExternalLabels External labels
External labels, which will be attached to all metrics in this cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExternalLabels(Label [] ExternalLabels) {
        this.ExternalLabels = ExternalLabels;
    }

    /**
     * Get Cluster region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Cluster region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Cluster region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get ID of the VPC where the cluster resides
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId ID of the VPC where the cluster resides
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC where the cluster resides
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId ID of the VPC where the cluster resides
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Recorded information of failed operations, such as association.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailedReason Recorded information of failed operations, such as association.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set Recorded information of failed operations, such as association.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailedReason Recorded information of failed operations, such as association.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    public PrometheusAgentOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAgentOverview(PrometheusAgentOverview source) {
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ExternalLabels != null) {
            this.ExternalLabels = new Label[source.ExternalLabels.length];
            for (int i = 0; i < source.ExternalLabels.length; i++) {
                this.ExternalLabels[i] = new Label(source.ExternalLabels[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamArrayObj(map, prefix + "ExternalLabels.", this.ExternalLabels);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);

    }
}

