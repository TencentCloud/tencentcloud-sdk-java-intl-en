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

public class MasterNodeInfo extends AbstractModel {

    /**
    * Whether the dedicated master node is enabled or not
    */
    @SerializedName("EnableDedicatedMaster")
    @Expose
    private Boolean EnableDedicatedMaster;

    /**
    * Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
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
    * Number of CPU cores of the dedicated master node
    */
    @SerializedName("MasterNodeCpuNum")
    @Expose
    private Long MasterNodeCpuNum;

    /**
    * Dedicated primary node memory size, in GB.
    */
    @SerializedName("MasterNodeMemSize")
    @Expose
    private Long MasterNodeMemSize;

    /**
    * Dedicated primary node disk size in GB
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * Dedicated primary node disk type
    */
    @SerializedName("MasterNodeDiskType")
    @Expose
    private String MasterNodeDiskType;

    /**
     * Get Whether the dedicated master node is enabled or not 
     * @return EnableDedicatedMaster Whether the dedicated master node is enabled or not
     */
    public Boolean getEnableDedicatedMaster() {
        return this.EnableDedicatedMaster;
    }

    /**
     * Set Whether the dedicated master node is enabled or not
     * @param EnableDedicatedMaster Whether the dedicated master node is enabled or not
     */
    public void setEnableDedicatedMaster(Boolean EnableDedicatedMaster) {
        this.EnableDedicatedMaster = EnableDedicatedMaster;
    }

    /**
     * Get Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li> 
     * @return MasterNodeType Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
     * @param MasterNodeType Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
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
     * Get Number of CPU cores of the dedicated master node 
     * @return MasterNodeCpuNum Number of CPU cores of the dedicated master node
     */
    public Long getMasterNodeCpuNum() {
        return this.MasterNodeCpuNum;
    }

    /**
     * Set Number of CPU cores of the dedicated master node
     * @param MasterNodeCpuNum Number of CPU cores of the dedicated master node
     */
    public void setMasterNodeCpuNum(Long MasterNodeCpuNum) {
        this.MasterNodeCpuNum = MasterNodeCpuNum;
    }

    /**
     * Get Dedicated primary node memory size, in GB. 
     * @return MasterNodeMemSize Dedicated primary node memory size, in GB.
     */
    public Long getMasterNodeMemSize() {
        return this.MasterNodeMemSize;
    }

    /**
     * Set Dedicated primary node memory size, in GB.
     * @param MasterNodeMemSize Dedicated primary node memory size, in GB.
     */
    public void setMasterNodeMemSize(Long MasterNodeMemSize) {
        this.MasterNodeMemSize = MasterNodeMemSize;
    }

    /**
     * Get Dedicated primary node disk size in GB 
     * @return MasterNodeDiskSize Dedicated primary node disk size in GB
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set Dedicated primary node disk size in GB
     * @param MasterNodeDiskSize Dedicated primary node disk size in GB
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get Dedicated primary node disk type 
     * @return MasterNodeDiskType Dedicated primary node disk type
     */
    public String getMasterNodeDiskType() {
        return this.MasterNodeDiskType;
    }

    /**
     * Set Dedicated primary node disk type
     * @param MasterNodeDiskType Dedicated primary node disk type
     */
    public void setMasterNodeDiskType(String MasterNodeDiskType) {
        this.MasterNodeDiskType = MasterNodeDiskType;
    }

    public MasterNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MasterNodeInfo(MasterNodeInfo source) {
        if (source.EnableDedicatedMaster != null) {
            this.EnableDedicatedMaster = new Boolean(source.EnableDedicatedMaster);
        }
        if (source.MasterNodeType != null) {
            this.MasterNodeType = new String(source.MasterNodeType);
        }
        if (source.MasterNodeNum != null) {
            this.MasterNodeNum = new Long(source.MasterNodeNum);
        }
        if (source.MasterNodeCpuNum != null) {
            this.MasterNodeCpuNum = new Long(source.MasterNodeCpuNum);
        }
        if (source.MasterNodeMemSize != null) {
            this.MasterNodeMemSize = new Long(source.MasterNodeMemSize);
        }
        if (source.MasterNodeDiskSize != null) {
            this.MasterNodeDiskSize = new Long(source.MasterNodeDiskSize);
        }
        if (source.MasterNodeDiskType != null) {
            this.MasterNodeDiskType = new String(source.MasterNodeDiskType);
        }
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

