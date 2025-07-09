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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodesSummary extends AbstractModel {

    /**
    * Model, such as S1
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Number of nodes
    */
    @SerializedName("NodeSize")
    @Expose
    private Long NodeSize;

    /**
    * Number of CPU cores, in counts
    */
    @SerializedName("Core")
    @Expose
    private Long Core;

    /**
    * Memory size, in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk size, in GB
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * Disk type
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk description
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
    * Information of mounted cloud disks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachCBSSpec")
    @Expose
    private AttachCBSSpec AttachCBSSpec;

    /**
    * Sub-product name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubProductType")
    @Expose
    private String SubProductType;

    /**
    * Specified cores
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecCore")
    @Expose
    private Long SpecCore;

    /**
    * Specified memory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecMemory")
    @Expose
    private Long SpecMemory;

    /**
    * Disk size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * Whether it is encrypted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Encrypt")
    @Expose
    private Long Encrypt;

    /**
    * Maximum disk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
     * Get Model, such as S1 
     * @return Spec Model, such as S1
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Model, such as S1
     * @param Spec Model, such as S1
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Number of nodes 
     * @return NodeSize Number of nodes
     */
    public Long getNodeSize() {
        return this.NodeSize;
    }

    /**
     * Set Number of nodes
     * @param NodeSize Number of nodes
     */
    public void setNodeSize(Long NodeSize) {
        this.NodeSize = NodeSize;
    }

    /**
     * Get Number of CPU cores, in counts 
     * @return Core Number of CPU cores, in counts
     */
    public Long getCore() {
        return this.Core;
    }

    /**
     * Set Number of CPU cores, in counts
     * @param Core Number of CPU cores, in counts
     */
    public void setCore(Long Core) {
        this.Core = Core;
    }

    /**
     * Get Memory size, in GB 
     * @return Memory Memory size, in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size, in GB
     * @param Memory Memory size, in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk size, in GB 
     * @return Disk Disk size, in GB
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set Disk size, in GB
     * @param Disk Disk size, in GB
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get Disk type 
     * @return DiskType Disk type
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type
     * @param DiskType Disk type
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk description 
     * @return DiskDesc Disk description
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set Disk description
     * @param DiskDesc Disk description
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    /**
     * Get Information of mounted cloud disks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttachCBSSpec Information of mounted cloud disks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AttachCBSSpec getAttachCBSSpec() {
        return this.AttachCBSSpec;
    }

    /**
     * Set Information of mounted cloud disks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttachCBSSpec Information of mounted cloud disks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttachCBSSpec(AttachCBSSpec AttachCBSSpec) {
        this.AttachCBSSpec = AttachCBSSpec;
    }

    /**
     * Get Sub-product name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubProductType Sub-product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubProductType() {
        return this.SubProductType;
    }

    /**
     * Set Sub-product name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubProductType Sub-product name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubProductType(String SubProductType) {
        this.SubProductType = SubProductType;
    }

    /**
     * Get Specified cores
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecCore Specified cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSpecCore() {
        return this.SpecCore;
    }

    /**
     * Set Specified cores
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecCore Specified cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecCore(Long SpecCore) {
        this.SpecCore = SpecCore;
    }

    /**
     * Get Specified memory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecMemory Specified memory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSpecMemory() {
        return this.SpecMemory;
    }

    /**
     * Set Specified memory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecMemory Specified memory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecMemory(Long SpecMemory) {
        this.SpecMemory = SpecMemory;
    }

    /**
     * Get Disk size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskCount Disk size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Disk size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskCount Disk size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get Whether it is encrypted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Encrypt Whether it is encrypted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Whether it is encrypted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Encrypt Whether it is encrypted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncrypt(Long Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get Maximum disk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxDiskSize Maximum disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set Maximum disk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxDiskSize Maximum disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    public NodesSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodesSummary(NodesSummary source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.NodeSize != null) {
            this.NodeSize = new Long(source.NodeSize);
        }
        if (source.Core != null) {
            this.Core = new Long(source.Core);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
        if (source.AttachCBSSpec != null) {
            this.AttachCBSSpec = new AttachCBSSpec(source.AttachCBSSpec);
        }
        if (source.SubProductType != null) {
            this.SubProductType = new String(source.SubProductType);
        }
        if (source.SpecCore != null) {
            this.SpecCore = new Long(source.SpecCore);
        }
        if (source.SpecMemory != null) {
            this.SpecMemory = new Long(source.SpecMemory);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Long(source.Encrypt);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "NodeSize", this.NodeSize);
        this.setParamSimple(map, prefix + "Core", this.Core);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);
        this.setParamObj(map, prefix + "AttachCBSSpec.", this.AttachCBSSpec);
        this.setParamSimple(map, prefix + "SubProductType", this.SubProductType);
        this.setParamSimple(map, prefix + "SpecCore", this.SpecCore);
        this.setParamSimple(map, prefix + "SpecMemory", this.SpecMemory);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);

    }
}

