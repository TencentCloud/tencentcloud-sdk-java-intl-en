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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MasterNodeInfo extends AbstractModel{

    /**
    * Whether to enable the dedicated primary node
    */
    @SerializedName("EnableDedicatedMaster")
    @Expose
    private Boolean EnableDedicatedMaster;

    /**
    * Dedicated primary node specification <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * Number of dedicated primary nodes
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * Number of CPU cores of the dedicated primary node
    */
    @SerializedName("MasterNodeCpuNum")
    @Expose
    private Long MasterNodeCpuNum;

    /**
    * Memory size of the dedicated primary node in GB
    */
    @SerializedName("MasterNodeMemSize")
    @Expose
    private Long MasterNodeMemSize;

    /**
    * Disk size of the dedicated primary node in GB
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * Disk type of the dedicated primary node
    */
    @SerializedName("MasterNodeDiskType")
    @Expose
    private String MasterNodeDiskType;

    /**
     * Get Whether to enable the dedicated primary node 
     * @return EnableDedicatedMaster Whether to enable the dedicated primary node
     */
    public Boolean getEnableDedicatedMaster() {
        return this.EnableDedicatedMaster;
    }

    /**
     * Set Whether to enable the dedicated primary node
     * @param EnableDedicatedMaster Whether to enable the dedicated primary node
     */
    public void setEnableDedicatedMaster(Boolean EnableDedicatedMaster) {
        this.EnableDedicatedMaster = EnableDedicatedMaster;
    }

    /**
     * Get Dedicated primary node specification <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li> 
     * @return MasterNodeType Dedicated primary node specification <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set Dedicated primary node specification <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
     * @param MasterNodeType Dedicated primary node specification <li>ES.S1.SMALL2: 1-core 2 GB</li><li>ES.S1.MEDIUM4: 2-core 4 GB</li><li>ES.S1.MEDIUM8: 2-core 8 GB</li><li>ES.S1.LARGE16: 4-core 16 GB</li><li>ES.S1.2XLARGE32: 8-core 32 GB</li><li>ES.S1.4XLARGE32: 16-core 32 GB</li><li>ES.S1.4XLARGE64: 16-core 64 GB</li>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get Number of dedicated primary nodes 
     * @return MasterNodeNum Number of dedicated primary nodes
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set Number of dedicated primary nodes
     * @param MasterNodeNum Number of dedicated primary nodes
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get Number of CPU cores of the dedicated primary node 
     * @return MasterNodeCpuNum Number of CPU cores of the dedicated primary node
     */
    public Long getMasterNodeCpuNum() {
        return this.MasterNodeCpuNum;
    }

    /**
     * Set Number of CPU cores of the dedicated primary node
     * @param MasterNodeCpuNum Number of CPU cores of the dedicated primary node
     */
    public void setMasterNodeCpuNum(Long MasterNodeCpuNum) {
        this.MasterNodeCpuNum = MasterNodeCpuNum;
    }

    /**
     * Get Memory size of the dedicated primary node in GB 
     * @return MasterNodeMemSize Memory size of the dedicated primary node in GB
     */
    public Long getMasterNodeMemSize() {
        return this.MasterNodeMemSize;
    }

    /**
     * Set Memory size of the dedicated primary node in GB
     * @param MasterNodeMemSize Memory size of the dedicated primary node in GB
     */
    public void setMasterNodeMemSize(Long MasterNodeMemSize) {
        this.MasterNodeMemSize = MasterNodeMemSize;
    }

    /**
     * Get Disk size of the dedicated primary node in GB 
     * @return MasterNodeDiskSize Disk size of the dedicated primary node in GB
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set Disk size of the dedicated primary node in GB
     * @param MasterNodeDiskSize Disk size of the dedicated primary node in GB
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get Disk type of the dedicated primary node 
     * @return MasterNodeDiskType Disk type of the dedicated primary node
     */
    public String getMasterNodeDiskType() {
        return this.MasterNodeDiskType;
    }

    /**
     * Set Disk type of the dedicated primary node
     * @param MasterNodeDiskType Disk type of the dedicated primary node
     */
    public void setMasterNodeDiskType(String MasterNodeDiskType) {
        this.MasterNodeDiskType = MasterNodeDiskType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableDedicatedMaster", this.EnableDedicatedMaster);
        this.setParamSimple(map, prefix + "MasterNodeType", this.MasterNodeType);
        this.setParamSimple(map, prefix + "MasterNodeNum", this.MasterNodeNum);
        this.setParamSimple(map, prefix + "MasterNodeCpuNum", this.MasterNodeCpuNum);
        this.setParamSimple(map, prefix + "MasterNodeMemSize", this.MasterNodeMemSize);
        this.setParamSimple(map, prefix + "MasterNodeDiskSize", this.MasterNodeDiskSize);
        this.setParamSimple(map, prefix + "MasterNodeDiskType", this.MasterNodeDiskType);

    }
}

