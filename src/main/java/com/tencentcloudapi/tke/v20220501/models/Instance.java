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
package com.tencentcloudapi.tke.v20220501.models;

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
    * Cause of instance exception (or initialization)
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * Instance status

- initializing
- running
- failed
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Whether it is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
    * Adding time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Node private network IP
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * Resource pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Native node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Native")
    @Expose
    private NativeNodeInfo Native;

    /**
    * General node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Regular")
    @Expose
    private RegularNodeInfo Regular;

    /**
    * Super node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Super")
    @Expose
    private SuperNodeInfo Super;

    /**
    * Third-party node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("External")
    @Expose
    private ExternalNodeInfo External;

    /**
    * Node type

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

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
     * Get Cause of instance exception (or initialization)
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return FailedReason Cause of instance exception (or initialization)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set Cause of instance exception (or initialization)
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param FailedReason Cause of instance exception (or initialization)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get Instance status

- initializing
- running
- failed 
     * @return InstanceState Instance status

- initializing
- running
- failed
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status

- initializing
- running
- failed
     * @param InstanceState Instance status

- initializing
- running
- failed
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Whether it is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Unschedulable Whether it is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set Whether it is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Unschedulable Whether it is unschedulable
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUnschedulable(Boolean Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get Adding time 
     * @return CreatedTime Adding time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Adding time
     * @param CreatedTime Adding time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Node private network IP
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return LanIP Node private network IP
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set Node private network IP
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param LanIP Node private network IP
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get Resource pool ID

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return NodePoolId Resource pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set Resource pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param NodePoolId Resource pool ID

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get Native node parameters
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Native Native node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public NativeNodeInfo getNative() {
        return this.Native;
    }

    /**
     * Set Native node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Native Native node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNative(NativeNodeInfo Native) {
        this.Native = Native;
    }

    /**
     * Get General node parameters
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Regular General node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public RegularNodeInfo getRegular() {
        return this.Regular;
    }

    /**
     * Set General node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Regular General node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRegular(RegularNodeInfo Regular) {
        this.Regular = Regular;
    }

    /**
     * Get Super node parameters
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Super Super node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public SuperNodeInfo getSuper() {
        return this.Super;
    }

    /**
     * Set Super node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Super Super node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setSuper(SuperNodeInfo Super) {
        this.Super = Super;
    }

    /**
     * Get Third-party node parameters
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return External Third-party node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public ExternalNodeInfo getExternal() {
        return this.External;
    }

    /**
     * Set Third-party node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param External Third-party node parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setExternal(ExternalNodeInfo External) {
        this.External = External;
    }

    /**
     * Get Node type

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return NodeType Node type

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param NodeType Node type

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
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
        if (source.Unschedulable != null) {
            this.Unschedulable = new Boolean(source.Unschedulable);
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
        if (source.Native != null) {
            this.Native = new NativeNodeInfo(source.Native);
        }
        if (source.Regular != null) {
            this.Regular = new RegularNodeInfo(source.Regular);
        }
        if (source.Super != null) {
            this.Super = new SuperNodeInfo(source.Super);
        }
        if (source.External != null) {
            this.External = new ExternalNodeInfo(source.External);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
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
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamObj(map, prefix + "Native.", this.Native);
        this.setParamObj(map, prefix + "Regular.", this.Regular);
        this.setParamObj(map, prefix + "Super.", this.Super);
        this.setParamObj(map, prefix + "External.", this.External);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

