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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfo extends AbstractModel {

    /**
    * <p>Number of nodes.</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Node type</p><p>Enumeration values:</p><ul><li>hotData: hot data node</li><li>warmData: cold data node</li><li>dedicatedMaster: dedicated master node</li><li>dedicatedCoordinating: dedicated coordinator node</li><li>dedicatedMl: dedicated Machine Learning node</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud disk</li>Default value: CLOUD_SSD</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Node disk capacity (GB)</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Node local disk information.</p>
    */
    @SerializedName("LocalDiskInfo")
    @Expose
    private LocalDiskInfo LocalDiskInfo;

    /**
    * <p>Number of node disk blocks</p>
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * <p>Whether the node disk is encrypted. 0: no encryption; 1: encryption; not encrypted by default</p>
    */
    @SerializedName("DiskEncrypt")
    @Expose
    private Long DiskEncrypt;

    /**
    * <p>Custom encryption key id</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>Custom encryption key name</p>
    */
    @SerializedName("KmsKeyName")
    @Expose
    private String KmsKeyName;

    /**
    * <p>Number of CPUs</p>
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * <p>Memory size, in GB.</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Additional hard disk performance</p>
    */
    @SerializedName("DiskEnhance")
    @Expose
    private Long DiskEnhance;

    /**
    * <p>Gpu information of the node</p>
    */
    @SerializedName("GpuInfo")
    @Expose
    private GpuInfo GpuInfo;

    /**
     * Get <p>Number of nodes.</p> 
     * @return NodeNum <p>Number of nodes.</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>Number of nodes.</p>
     * @param NodeNum <p>Number of nodes.</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p> 
     * @return NodeType <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     * @param NodeType <p>Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Node type</p><p>Enumeration values:</p><ul><li>hotData: hot data node</li><li>warmData: cold data node</li><li>dedicatedMaster: dedicated master node</li><li>dedicatedCoordinating: dedicated coordinator node</li><li>dedicatedMl: dedicated Machine Learning node</li></ul> 
     * @return Type <p>Node type</p><p>Enumeration values:</p><ul><li>hotData: hot data node</li><li>warmData: cold data node</li><li>dedicatedMaster: dedicated master node</li><li>dedicatedCoordinating: dedicated coordinator node</li><li>dedicatedMl: dedicated Machine Learning node</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Node type</p><p>Enumeration values:</p><ul><li>hotData: hot data node</li><li>warmData: cold data node</li><li>dedicatedMaster: dedicated master node</li><li>dedicatedCoordinating: dedicated coordinator node</li><li>dedicatedMl: dedicated Machine Learning node</li></ul>
     * @param Type <p>Node type</p><p>Enumeration values:</p><ul><li>hotData: hot data node</li><li>warmData: cold data node</li><li>dedicatedMaster: dedicated master node</li><li>dedicatedCoordinating: dedicated coordinator node</li><li>dedicatedMl: dedicated Machine Learning node</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud disk</li>Default value: CLOUD_SSD</p> 
     * @return DiskType <p>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud disk</li>Default value: CLOUD_SSD</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud disk</li>Default value: CLOUD_SSD</p>
     * @param DiskType <p>Node disk type<li>CLOUD_SSD: ssd cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud disk</li>Default value: CLOUD_SSD</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Node disk capacity (GB)</p> 
     * @return DiskSize <p>Node disk capacity (GB)</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Node disk capacity (GB)</p>
     * @param DiskSize <p>Node disk capacity (GB)</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Node local disk information.</p> 
     * @return LocalDiskInfo <p>Node local disk information.</p>
     */
    public LocalDiskInfo getLocalDiskInfo() {
        return this.LocalDiskInfo;
    }

    /**
     * Set <p>Node local disk information.</p>
     * @param LocalDiskInfo <p>Node local disk information.</p>
     */
    public void setLocalDiskInfo(LocalDiskInfo LocalDiskInfo) {
        this.LocalDiskInfo = LocalDiskInfo;
    }

    /**
     * Get <p>Number of node disk blocks</p> 
     * @return DiskCount <p>Number of node disk blocks</p>
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set <p>Number of node disk blocks</p>
     * @param DiskCount <p>Number of node disk blocks</p>
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get <p>Whether the node disk is encrypted. 0: no encryption; 1: encryption; not encrypted by default</p> 
     * @return DiskEncrypt <p>Whether the node disk is encrypted. 0: no encryption; 1: encryption; not encrypted by default</p>
     */
    public Long getDiskEncrypt() {
        return this.DiskEncrypt;
    }

    /**
     * Set <p>Whether the node disk is encrypted. 0: no encryption; 1: encryption; not encrypted by default</p>
     * @param DiskEncrypt <p>Whether the node disk is encrypted. 0: no encryption; 1: encryption; not encrypted by default</p>
     */
    public void setDiskEncrypt(Long DiskEncrypt) {
        this.DiskEncrypt = DiskEncrypt;
    }

    /**
     * Get <p>Custom encryption key id</p> 
     * @return KmsKeyId <p>Custom encryption key id</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>Custom encryption key id</p>
     * @param KmsKeyId <p>Custom encryption key id</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>Custom encryption key name</p> 
     * @return KmsKeyName <p>Custom encryption key name</p>
     */
    public String getKmsKeyName() {
        return this.KmsKeyName;
    }

    /**
     * Set <p>Custom encryption key name</p>
     * @param KmsKeyName <p>Custom encryption key name</p>
     */
    public void setKmsKeyName(String KmsKeyName) {
        this.KmsKeyName = KmsKeyName;
    }

    /**
     * Get <p>Number of CPUs</p> 
     * @return CpuNum <p>Number of CPUs</p>
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set <p>Number of CPUs</p>
     * @param CpuNum <p>Number of CPUs</p>
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get <p>Memory size, in GB.</p> 
     * @return MemSize <p>Memory size, in GB.</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory size, in GB.</p>
     * @param MemSize <p>Memory size, in GB.</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Additional hard disk performance</p> 
     * @return DiskEnhance <p>Additional hard disk performance</p>
     */
    public Long getDiskEnhance() {
        return this.DiskEnhance;
    }

    /**
     * Set <p>Additional hard disk performance</p>
     * @param DiskEnhance <p>Additional hard disk performance</p>
     */
    public void setDiskEnhance(Long DiskEnhance) {
        this.DiskEnhance = DiskEnhance;
    }

    /**
     * Get <p>Gpu information of the node</p> 
     * @return GpuInfo <p>Gpu information of the node</p>
     */
    public GpuInfo getGpuInfo() {
        return this.GpuInfo;
    }

    /**
     * Set <p>Gpu information of the node</p>
     * @param GpuInfo <p>Gpu information of the node</p>
     */
    public void setGpuInfo(GpuInfo GpuInfo) {
        this.GpuInfo = GpuInfo;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.LocalDiskInfo != null) {
            this.LocalDiskInfo = new LocalDiskInfo(source.LocalDiskInfo);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.DiskEncrypt != null) {
            this.DiskEncrypt = new Long(source.DiskEncrypt);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.KmsKeyName != null) {
            this.KmsKeyName = new String(source.KmsKeyName);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.DiskEnhance != null) {
            this.DiskEnhance = new Long(source.DiskEnhance);
        }
        if (source.GpuInfo != null) {
            this.GpuInfo = new GpuInfo(source.GpuInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamObj(map, prefix + "LocalDiskInfo.", this.LocalDiskInfo);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "DiskEncrypt", this.DiskEncrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KmsKeyName", this.KmsKeyName);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskEnhance", this.DiskEnhance);
        this.setParamObj(map, prefix + "GpuInfo.", this.GpuInfo);

    }
}

