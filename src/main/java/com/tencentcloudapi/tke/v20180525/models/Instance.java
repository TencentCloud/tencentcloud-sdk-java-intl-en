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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node role: MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Reason for instance exception (or initialization)
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * Instance status (running, initializing, or failed)
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Whether the instance is drained
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("DrainStatus")
    @Expose
    private String DrainStatus;

    /**
    * Node settings
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Node private IP
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * Resource pool ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * ID of the auto-scaling group
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node role: MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER 
     * @return InstanceRole Node role: MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Node role: MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER
     * @param InstanceRole Node role: MASTER, WORKER, ETCD, MASTER_ETCD, and ALL. Default value: WORKER
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Reason for instance exception (or initialization) 
     * @return FailedReason Reason for instance exception (or initialization)
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set Reason for instance exception (or initialization)
     * @param FailedReason Reason for instance exception (or initialization)
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get Instance status (running, initializing, or failed) 
     * @return InstanceState Instance status (running, initializing, or failed)
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status (running, initializing, or failed)
     * @param InstanceState Instance status (running, initializing, or failed)
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Whether the instance is drained
Note: this field may return null, indicating that no valid value is obtained. 
     * @return DrainStatus Whether the instance is drained
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getDrainStatus() {
        return this.DrainStatus;
    }

    /**
     * Set Whether the instance is drained
Note: this field may return null, indicating that no valid value is obtained.
     * @param DrainStatus Whether the instance is drained
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setDrainStatus(String DrainStatus) {
        this.DrainStatus = DrainStatus;
    }

    /**
     * Get Node settings
Note: this field may return null, indicating that no valid value is obtained. 
     * @return InstanceAdvancedSettings Node settings
Note: this field may return null, indicating that no valid value is obtained.
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set Node settings
Note: this field may return null, indicating that no valid value is obtained.
     * @param InstanceAdvancedSettings Node settings
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Node private IP
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LanIP Node private IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set Node private IP
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LanIP Node private IP
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get Resource pool ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NodePoolId Resource pool ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set Resource pool ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NodePoolId Resource pool ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get ID of the auto-scaling group
Note: this field may return null, indicating that no valid value is obtained. 
     * @return AutoscalingGroupId ID of the auto-scaling group
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set ID of the auto-scaling group
Note: this field may return null, indicating that no valid value is obtained.
     * @param AutoscalingGroupId ID of the auto-scaling group
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.DrainStatus != null) {
            this.DrainStatus = new String(source.DrainStatus);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.LanIP != null) {
            this.LanIP = new String(source.LanIP);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "DrainStatus", this.DrainStatus);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);

    }
}

