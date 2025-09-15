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

public class PodSpec extends AbstractModel {

    /**
    * Identifier of external resource provider, such as "cls-a1cd23fa".
    */
    @SerializedName("ResourceProviderIdentifier")
    @Expose
    private String ResourceProviderIdentifier;

    /**
    * Type of external resource provider, such as "tke". Currently, only "tke" is supported.
    */
    @SerializedName("ResourceProviderType")
    @Expose
    private String ResourceProviderType;

    /**
    * Purpose of the resource, which means the node type and can only be "TASK".
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Number of CPUs
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Mount point of resources for the host. A specified mount point corresponds to the host path and is used as the data storage directory in the pod. (This parameter has been disused)
    */
    @SerializedName("DataVolumes")
    @Expose
    private String [] DataVolumes;

    /**
    * EKS cluster - CPU type. Valid values: `intel` and `amd`.
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * Data directory mounting information of the pod node.
    */
    @SerializedName("PodVolumes")
    @Expose
    private PodVolume [] PodVolumes;

    /**
    * Whether floating specification is used. `1`: Yes; `0`: No.
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

    /**
    * Floating specification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private DynamicPodSpec DynamicPodSpec;

    /**
    * Unique ID of VPC network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unique ID of a VPC subnet.
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
     * Get Identifier of external resource provider, such as "cls-a1cd23fa". 
     * @return ResourceProviderIdentifier Identifier of external resource provider, such as "cls-a1cd23fa".
     */
    public String getResourceProviderIdentifier() {
        return this.ResourceProviderIdentifier;
    }

    /**
     * Set Identifier of external resource provider, such as "cls-a1cd23fa".
     * @param ResourceProviderIdentifier Identifier of external resource provider, such as "cls-a1cd23fa".
     */
    public void setResourceProviderIdentifier(String ResourceProviderIdentifier) {
        this.ResourceProviderIdentifier = ResourceProviderIdentifier;
    }

    /**
     * Get Type of external resource provider, such as "tke". Currently, only "tke" is supported. 
     * @return ResourceProviderType Type of external resource provider, such as "tke". Currently, only "tke" is supported.
     */
    public String getResourceProviderType() {
        return this.ResourceProviderType;
    }

    /**
     * Set Type of external resource provider, such as "tke". Currently, only "tke" is supported.
     * @param ResourceProviderType Type of external resource provider, such as "tke". Currently, only "tke" is supported.
     */
    public void setResourceProviderType(String ResourceProviderType) {
        this.ResourceProviderType = ResourceProviderType;
    }

    /**
     * Get Purpose of the resource, which means the node type and can only be "TASK". 
     * @return NodeType Purpose of the resource, which means the node type and can only be "TASK".
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Purpose of the resource, which means the node type and can only be "TASK".
     * @param NodeType Purpose of the resource, which means the node type and can only be "TASK".
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Number of CPUs 
     * @return Cpu Number of CPUs
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPUs
     * @param Cpu Number of CPUs
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size in GB. 
     * @return Memory Memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB.
     * @param Memory Memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Mount point of resources for the host. A specified mount point corresponds to the host path and is used as the data storage directory in the pod. (This parameter has been disused) 
     * @return DataVolumes Mount point of resources for the host. A specified mount point corresponds to the host path and is used as the data storage directory in the pod. (This parameter has been disused)
     */
    public String [] getDataVolumes() {
        return this.DataVolumes;
    }

    /**
     * Set Mount point of resources for the host. A specified mount point corresponds to the host path and is used as the data storage directory in the pod. (This parameter has been disused)
     * @param DataVolumes Mount point of resources for the host. A specified mount point corresponds to the host path and is used as the data storage directory in the pod. (This parameter has been disused)
     */
    public void setDataVolumes(String [] DataVolumes) {
        this.DataVolumes = DataVolumes;
    }

    /**
     * Get EKS cluster - CPU type. Valid values: `intel` and `amd`. 
     * @return CpuType EKS cluster - CPU type. Valid values: `intel` and `amd`.
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set EKS cluster - CPU type. Valid values: `intel` and `amd`.
     * @param CpuType EKS cluster - CPU type. Valid values: `intel` and `amd`.
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get Data directory mounting information of the pod node. 
     * @return PodVolumes Data directory mounting information of the pod node.
     */
    public PodVolume [] getPodVolumes() {
        return this.PodVolumes;
    }

    /**
     * Set Data directory mounting information of the pod node.
     * @param PodVolumes Data directory mounting information of the pod node.
     */
    public void setPodVolumes(PodVolume [] PodVolumes) {
        this.PodVolumes = PodVolumes;
    }

    /**
     * Get Whether floating specification is used. `1`: Yes; `0`: No. 
     * @return IsDynamicSpec Whether floating specification is used. `1`: Yes; `0`: No.
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set Whether floating specification is used. `1`: Yes; `0`: No.
     * @param IsDynamicSpec Whether floating specification is used. `1`: Yes; `0`: No.
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
    }

    /**
     * Get Floating specification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DynamicPodSpec Floating specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DynamicPodSpec getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set Floating specification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DynamicPodSpec Floating specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDynamicPodSpec(DynamicPodSpec DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get Unique ID of VPC network. 
     * @return VpcId Unique ID of VPC network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of VPC network.
     * @param VpcId Unique ID of VPC network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique ID of a VPC subnet. 
     * @return SubnetId Unique ID of a VPC subnet.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Unique ID of a VPC subnet.
     * @param SubnetId Unique ID of a VPC subnet.
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

    public PodSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodSpec(PodSpec source) {
        if (source.ResourceProviderIdentifier != null) {
            this.ResourceProviderIdentifier = new String(source.ResourceProviderIdentifier);
        }
        if (source.ResourceProviderType != null) {
            this.ResourceProviderType = new String(source.ResourceProviderType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DataVolumes != null) {
            this.DataVolumes = new String[source.DataVolumes.length];
            for (int i = 0; i < source.DataVolumes.length; i++) {
                this.DataVolumes[i] = new String(source.DataVolumes[i]);
            }
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
        if (source.IsDynamicSpec != null) {
            this.IsDynamicSpec = new Long(source.IsDynamicSpec);
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
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArraySimple(map, prefix + "DataVolumes.", this.DataVolumes);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamArrayObj(map, prefix + "PodVolumes.", this.PodVolumes);
        this.setParamSimple(map, prefix + "IsDynamicSpec", this.IsDynamicSpec);
        this.setParamObj(map, prefix + "DynamicPodSpec.", this.DynamicPodSpec);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

