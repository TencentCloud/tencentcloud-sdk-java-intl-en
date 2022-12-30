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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodNewSpec extends AbstractModel{

    /**
    * The identifier of an external resource provider, such as "cls-a1cd23fa".
    */
    @SerializedName("ResourceProviderIdentifier")
    @Expose
    private String ResourceProviderIdentifier;

    /**
    * The type of the external resource provider, such as "tke". Currently, only "tke" is supported.
    */
    @SerializedName("ResourceProviderType")
    @Expose
    private String ResourceProviderType;

    /**
    * The purpose of the resource, which means the node type and can only be "TASK".
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * The number of CPUs.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * The memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * The EKS cluster - CPU type. Valid values: `intel` and `amd`.
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * The data directory mounting information of the pod node.
    */
    @SerializedName("PodVolumes")
    @Expose
    private PodVolume [] PodVolumes;

    /**
    * Whether the dynamic spec is used. Valid values:
<li>`true`: Yes</li>
<li>`false` (default): No</li>
    */
    @SerializedName("EnableDynamicSpecFlag")
    @Expose
    private Boolean EnableDynamicSpecFlag;

    /**
    * The dynamic spec.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private DynamicPodSpec DynamicPodSpec;

    /**
    * The unique VPC ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The unique VPC subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The pod name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
     * Get The identifier of an external resource provider, such as "cls-a1cd23fa". 
     * @return ResourceProviderIdentifier The identifier of an external resource provider, such as "cls-a1cd23fa".
     */
    public String getResourceProviderIdentifier() {
        return this.ResourceProviderIdentifier;
    }

    /**
     * Set The identifier of an external resource provider, such as "cls-a1cd23fa".
     * @param ResourceProviderIdentifier The identifier of an external resource provider, such as "cls-a1cd23fa".
     */
    public void setResourceProviderIdentifier(String ResourceProviderIdentifier) {
        this.ResourceProviderIdentifier = ResourceProviderIdentifier;
    }

    /**
     * Get The type of the external resource provider, such as "tke". Currently, only "tke" is supported. 
     * @return ResourceProviderType The type of the external resource provider, such as "tke". Currently, only "tke" is supported.
     */
    public String getResourceProviderType() {
        return this.ResourceProviderType;
    }

    /**
     * Set The type of the external resource provider, such as "tke". Currently, only "tke" is supported.
     * @param ResourceProviderType The type of the external resource provider, such as "tke". Currently, only "tke" is supported.
     */
    public void setResourceProviderType(String ResourceProviderType) {
        this.ResourceProviderType = ResourceProviderType;
    }

    /**
     * Get The purpose of the resource, which means the node type and can only be "TASK". 
     * @return NodeFlag The purpose of the resource, which means the node type and can only be "TASK".
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set The purpose of the resource, which means the node type and can only be "TASK".
     * @param NodeFlag The purpose of the resource, which means the node type and can only be "TASK".
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get The number of CPUs. 
     * @return Cpu The number of CPUs.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of CPUs.
     * @param Cpu The number of CPUs.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get The memory size in GB. 
     * @return Memory The memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set The memory size in GB.
     * @param Memory The memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get The EKS cluster - CPU type. Valid values: `intel` and `amd`. 
     * @return CpuType The EKS cluster - CPU type. Valid values: `intel` and `amd`.
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set The EKS cluster - CPU type. Valid values: `intel` and `amd`.
     * @param CpuType The EKS cluster - CPU type. Valid values: `intel` and `amd`.
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get The data directory mounting information of the pod node. 
     * @return PodVolumes The data directory mounting information of the pod node.
     */
    public PodVolume [] getPodVolumes() {
        return this.PodVolumes;
    }

    /**
     * Set The data directory mounting information of the pod node.
     * @param PodVolumes The data directory mounting information of the pod node.
     */
    public void setPodVolumes(PodVolume [] PodVolumes) {
        this.PodVolumes = PodVolumes;
    }

    /**
     * Get Whether the dynamic spec is used. Valid values:
<li>`true`: Yes</li>
<li>`false` (default): No</li> 
     * @return EnableDynamicSpecFlag Whether the dynamic spec is used. Valid values:
<li>`true`: Yes</li>
<li>`false` (default): No</li>
     */
    public Boolean getEnableDynamicSpecFlag() {
        return this.EnableDynamicSpecFlag;
    }

    /**
     * Set Whether the dynamic spec is used. Valid values:
<li>`true`: Yes</li>
<li>`false` (default): No</li>
     * @param EnableDynamicSpecFlag Whether the dynamic spec is used. Valid values:
<li>`true`: Yes</li>
<li>`false` (default): No</li>
     */
    public void setEnableDynamicSpecFlag(Boolean EnableDynamicSpecFlag) {
        this.EnableDynamicSpecFlag = EnableDynamicSpecFlag;
    }

    /**
     * Get The dynamic spec.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DynamicPodSpec The dynamic spec.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DynamicPodSpec getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set The dynamic spec.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DynamicPodSpec The dynamic spec.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDynamicPodSpec(DynamicPodSpec DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get The unique VPC ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId The unique VPC ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The unique VPC ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId The unique VPC ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The unique VPC subnet ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId The unique VPC subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The unique VPC subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId The unique VPC subnet ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The pod name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodName The pod name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set The pod name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodName The pod name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public PodNewSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodNewSpec(PodNewSpec source) {
        if (source.ResourceProviderIdentifier != null) {
            this.ResourceProviderIdentifier = new String(source.ResourceProviderIdentifier);
        }
        if (source.ResourceProviderType != null) {
            this.ResourceProviderType = new String(source.ResourceProviderType);
        }
        if (source.NodeFlag != null) {
            this.NodeFlag = new String(source.NodeFlag);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.PodVolumes != null) {
            this.PodVolumes = new PodVolume[source.PodVolumes.length];
            for (int i = 0; i < source.PodVolumes.length; i++) {
                this.PodVolumes[i] = new PodVolume(source.PodVolumes[i]);
            }
        }
        if (source.EnableDynamicSpecFlag != null) {
            this.EnableDynamicSpecFlag = new Boolean(source.EnableDynamicSpecFlag);
        }
        if (source.DynamicPodSpec != null) {
            this.DynamicPodSpec = new DynamicPodSpec(source.DynamicPodSpec);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceProviderIdentifier", this.ResourceProviderIdentifier);
        this.setParamSimple(map, prefix + "ResourceProviderType", this.ResourceProviderType);
        this.setParamSimple(map, prefix + "NodeFlag", this.NodeFlag);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamArrayObj(map, prefix + "PodVolumes.", this.PodVolumes);
        this.setParamSimple(map, prefix + "EnableDynamicSpecFlag", this.EnableDynamicSpecFlag);
        this.setParamObj(map, prefix + "DynamicPodSpec.", this.DynamicPodSpec);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

