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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PulsarProClusterInfo extends AbstractModel{

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
    * Description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Cluster version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeDistribution")
    @Expose
    private InstanceNodeDistribution [] NodeDistribution;

    /**
    * Max storage capacity in MB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Whether the route can be modified
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanEditRoute")
    @Expose
    private Boolean CanEditRoute;

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
     * Get Description 
     * @return Remark Description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Description
     * @param Remark Description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated). 
     * @return Status Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
     * @param Status Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Cluster version 
     * @return Version Cluster version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Cluster version
     * @param Version Cluster version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Node distribution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeDistribution Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNodeDistribution [] getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeDistribution Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeDistribution(InstanceNodeDistribution [] NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get Max storage capacity in MB 
     * @return MaxStorage Max storage capacity in MB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Max storage capacity in MB
     * @param MaxStorage Max storage capacity in MB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Whether the route can be modified
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return CanEditRoute Whether the route can be modified
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanEditRoute() {
        return this.CanEditRoute;
    }

    /**
     * Set Whether the route can be modified
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param CanEditRoute Whether the route can be modified
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setCanEditRoute(Boolean CanEditRoute) {
        this.CanEditRoute = CanEditRoute;
    }

    public PulsarProClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarProClusterInfo(PulsarProClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.NodeDistribution != null) {
            this.NodeDistribution = new InstanceNodeDistribution[source.NodeDistribution.length];
            for (int i = 0; i < source.NodeDistribution.length; i++) {
                this.NodeDistribution[i] = new InstanceNodeDistribution(source.NodeDistribution[i]);
            }
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.CanEditRoute != null) {
            this.CanEditRoute = new Boolean(source.CanEditRoute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "NodeDistribution.", this.NodeDistribution);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "CanEditRoute", this.CanEditRoute);

    }
}

