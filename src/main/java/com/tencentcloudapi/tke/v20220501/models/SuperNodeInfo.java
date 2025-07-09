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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuperNodeInfo extends AbstractModel {

    /**
    * Instance name
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Auto-renewal label
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Resource type
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * CPU specification of nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("CPU")
    @Expose
    private Float CPU;

    /**
    * Total number of CPUs of Pods on nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("UsedCPU")
    @Expose
    private Float UsedCPU;

    /**
    * Memory specification of nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * Total memory of Pods on nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("UsedMemory")
    @Expose
    private Float UsedMemory;

    /**
    * Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Unique VPC ID
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Effective time
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ActiveAt")
    @Expose
    private String ActiveAt;

    /**
    * Expiration time

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * Maximum schedulable CPU specification for a single Pod
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MaxCPUScheduledPod")
    @Expose
    private Long MaxCPUScheduledPod;

    /**
    * Instance attributes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceAttribute")
    @Expose
    private String InstanceAttribute;

    /**
     * Get Instance name
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Name Instance name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Name Instance name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Auto-renewal label
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return AutoRenewFlag Auto-renewal label
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal label
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param AutoRenewFlag Auto-renewal label
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Resource type
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ResourceType Resource type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ResourceType Resource type
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get CPU specification of nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return CPU CPU specification of nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Float getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU specification of nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param CPU CPU specification of nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setCPU(Float CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Total number of CPUs of Pods on nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return UsedCPU Total number of CPUs of Pods on nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Float getUsedCPU() {
        return this.UsedCPU;
    }

    /**
     * Set Total number of CPUs of Pods on nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param UsedCPU Total number of CPUs of Pods on nodes (unit: cores).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUsedCPU(Float UsedCPU) {
        this.UsedCPU = UsedCPU;
    }

    /**
     * Get Memory specification of nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Memory Memory specification of nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory specification of nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Memory Memory specification of nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Total memory of Pods on nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return UsedMemory Total memory of Pods on nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Float getUsedMemory() {
        return this.UsedMemory;
    }

    /**
     * Set Total memory of Pods on nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param UsedMemory Total memory of Pods on nodes (unit: Gi).
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUsedMemory(Float UsedMemory) {
        this.UsedMemory = UsedMemory;
    }

    /**
     * Get Availability zone

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Zone Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Zone Availability zone

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Unique VPC ID
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return VpcId Unique VPC ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique VPC ID
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param VpcId Unique VPC ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return SubnetId Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param SubnetId Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Effective time
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ActiveAt Effective time
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getActiveAt() {
        return this.ActiveAt;
    }

    /**
     * Set Effective time
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ActiveAt Effective time
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setActiveAt(String ActiveAt) {
        this.ActiveAt = ActiveAt;
    }

    /**
     * Get Expiration time

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ExpireAt Expiration time

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set Expiration time

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ExpireAt Expiration time

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get Maximum schedulable CPU specification for a single Pod
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MaxCPUScheduledPod Maximum schedulable CPU specification for a single Pod
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getMaxCPUScheduledPod() {
        return this.MaxCPUScheduledPod;
    }

    /**
     * Set Maximum schedulable CPU specification for a single Pod
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MaxCPUScheduledPod Maximum schedulable CPU specification for a single Pod
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMaxCPUScheduledPod(Long MaxCPUScheduledPod) {
        this.MaxCPUScheduledPod = MaxCPUScheduledPod;
    }

    /**
     * Get Instance attributes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return InstanceAttribute Instance attributes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getInstanceAttribute() {
        return this.InstanceAttribute;
    }

    /**
     * Set Instance attributes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param InstanceAttribute Instance attributes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setInstanceAttribute(String InstanceAttribute) {
        this.InstanceAttribute = InstanceAttribute;
    }

    public SuperNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperNodeInfo(SuperNodeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.CPU != null) {
            this.CPU = new Float(source.CPU);
        }
        if (source.UsedCPU != null) {
            this.UsedCPU = new Float(source.UsedCPU);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.UsedMemory != null) {
            this.UsedMemory = new Float(source.UsedMemory);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ActiveAt != null) {
            this.ActiveAt = new String(source.ActiveAt);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.MaxCPUScheduledPod != null) {
            this.MaxCPUScheduledPod = new Long(source.MaxCPUScheduledPod);
        }
        if (source.InstanceAttribute != null) {
            this.InstanceAttribute = new String(source.InstanceAttribute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "UsedCPU", this.UsedCPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "UsedMemory", this.UsedMemory);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ActiveAt", this.ActiveAt);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "MaxCPUScheduledPod", this.MaxCPUScheduledPod);
        this.setParamSimple(map, prefix + "InstanceAttribute", this.InstanceAttribute);

    }
}

