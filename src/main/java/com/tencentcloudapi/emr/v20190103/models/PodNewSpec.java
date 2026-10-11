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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodNewSpec extends AbstractModel {

    /**
    * Identifier of the external resource provider, for example, "cls-a1cd23fa".
    */
    @SerializedName("ResourceProviderIdentifier")
    @Expose
    private String ResourceProviderIdentifier;

    /**
    * Type of the external resource provider, for example, "tke". Currently, only "tke" is supported.
    */
    @SerializedName("ResourceProviderType")
    @Expose
    private String ResourceProviderType;

    /**
    * Purpose of the resource, that is, the node type. Currently only "TASK" is supported.
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * Number of CPU cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size (GB).
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CPU type for the EKS cluster, currently supporting intel and amd.
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * Mounting information of the node data directory on Pod.
    */
    @SerializedName("PodVolumes")
    @Expose
    private PodVolume [] PodVolumes;

    /**
    * Whether it is a floating specification. Default: false. Valid values:
<li>true: yes</li>
<li>false: no</li>
    */
    @SerializedName("EnableDynamicSpecFlag")
    @Expose
    private Boolean EnableDynamicSpecFlag;

    /**
    * Floating specification.
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private DynamicPodSpec DynamicPodSpec;

    /**
    * Unique ID of the VPC.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unique ID of the VPC subnet.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Other account authorization information.
    */
    @SerializedName("OtherAccountInfo")
    @Expose
    private OtherAccountInfo OtherAccountInfo;

    /**
     * Get Identifier of the external resource provider, for example, "cls-a1cd23fa". 
     * @return ResourceProviderIdentifier Identifier of the external resource provider, for example, "cls-a1cd23fa".
     */
    public String getResourceProviderIdentifier() {
        return this.ResourceProviderIdentifier;
    }

    /**
     * Set Identifier of the external resource provider, for example, "cls-a1cd23fa".
     * @param ResourceProviderIdentifier Identifier of the external resource provider, for example, "cls-a1cd23fa".
     */
    public void setResourceProviderIdentifier(String ResourceProviderIdentifier) {
        this.ResourceProviderIdentifier = ResourceProviderIdentifier;
    }

    /**
     * Get Type of the external resource provider, for example, "tke". Currently, only "tke" is supported. 
     * @return ResourceProviderType Type of the external resource provider, for example, "tke". Currently, only "tke" is supported.
     */
    public String getResourceProviderType() {
        return this.ResourceProviderType;
    }

    /**
     * Set Type of the external resource provider, for example, "tke". Currently, only "tke" is supported.
     * @param ResourceProviderType Type of the external resource provider, for example, "tke". Currently, only "tke" is supported.
     */
    public void setResourceProviderType(String ResourceProviderType) {
        this.ResourceProviderType = ResourceProviderType;
    }

    /**
     * Get Purpose of the resource, that is, the node type. Currently only "TASK" is supported. 
     * @return NodeFlag Purpose of the resource, that is, the node type. Currently only "TASK" is supported.
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set Purpose of the resource, that is, the node type. Currently only "TASK" is supported.
     * @param NodeFlag Purpose of the resource, that is, the node type. Currently only "TASK" is supported.
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get Number of CPU cores. 
     * @return Cpu Number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores.
     * @param Cpu Number of CPU cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size (GB). 
     * @return Memory Memory size (GB).
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size (GB).
     * @param Memory Memory size (GB).
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU type for the EKS cluster, currently supporting intel and amd. 
     * @return CpuType CPU type for the EKS cluster, currently supporting intel and amd.
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set CPU type for the EKS cluster, currently supporting intel and amd.
     * @param CpuType CPU type for the EKS cluster, currently supporting intel and amd.
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get Mounting information of the node data directory on Pod. 
     * @return PodVolumes Mounting information of the node data directory on Pod.
     */
    public PodVolume [] getPodVolumes() {
        return this.PodVolumes;
    }

    /**
     * Set Mounting information of the node data directory on Pod.
     * @param PodVolumes Mounting information of the node data directory on Pod.
     */
    public void setPodVolumes(PodVolume [] PodVolumes) {
        this.PodVolumes = PodVolumes;
    }

    /**
     * Get Whether it is a floating specification. Default: false. Valid values:
<li>true: yes</li>
<li>false: no</li> 
     * @return EnableDynamicSpecFlag Whether it is a floating specification. Default: false. Valid values:
<li>true: yes</li>
<li>false: no</li>
     */
    public Boolean getEnableDynamicSpecFlag() {
        return this.EnableDynamicSpecFlag;
    }

    /**
     * Set Whether it is a floating specification. Default: false. Valid values:
<li>true: yes</li>
<li>false: no</li>
     * @param EnableDynamicSpecFlag Whether it is a floating specification. Default: false. Valid values:
<li>true: yes</li>
<li>false: no</li>
     */
    public void setEnableDynamicSpecFlag(Boolean EnableDynamicSpecFlag) {
        this.EnableDynamicSpecFlag = EnableDynamicSpecFlag;
    }

    /**
     * Get Floating specification. 
     * @return DynamicPodSpec Floating specification.
     */
    public DynamicPodSpec getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set Floating specification.
     * @param DynamicPodSpec Floating specification.
     */
    public void setDynamicPodSpec(DynamicPodSpec DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get Unique ID of the VPC. 
     * @return VpcId Unique ID of the VPC.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of the VPC.
     * @param VpcId Unique ID of the VPC.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique ID of the VPC subnet. 
     * @return SubnetId Unique ID of the VPC subnet.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Unique ID of the VPC subnet.
     * @param SubnetId Unique ID of the VPC subnet.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get pod name 
     * @return PodName pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod name
     * @param PodName pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Other account authorization information. 
     * @return OtherAccountInfo Other account authorization information.
     */
    public OtherAccountInfo getOtherAccountInfo() {
        return this.OtherAccountInfo;
    }

    /**
     * Set Other account authorization information.
     * @param OtherAccountInfo Other account authorization information.
     */
    public void setOtherAccountInfo(OtherAccountInfo OtherAccountInfo) {
        this.OtherAccountInfo = OtherAccountInfo;
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
        if (source.OtherAccountInfo != null) {
            this.OtherAccountInfo = new OtherAccountInfo(source.OtherAccountInfo);
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
        this.setParamObj(map, prefix + "OtherAccountInfo.", this.OtherAccountInfo);

    }
}

