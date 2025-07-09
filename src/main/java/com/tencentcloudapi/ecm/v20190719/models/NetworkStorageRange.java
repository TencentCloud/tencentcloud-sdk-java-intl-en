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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkStorageRange extends AbstractModel {

    /**
    * Network bandwidth cap
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * Upper limit of the data disk size
    */
    @SerializedName("MaxSystemDiskSize")
    @Expose
    private Long MaxSystemDiskSize;

    /**
    * Lower limit of the network bandwidth
    */
    @SerializedName("MinBandwidth")
    @Expose
    private Long MinBandwidth;

    /**
    * Lower limit of the data disk size
    */
    @SerializedName("MinSystemDiskSize")
    @Expose
    private Long MinSystemDiskSize;

    /**
    * Maximum data disk size
    */
    @SerializedName("MaxDataDiskSize")
    @Expose
    private Long MaxDataDiskSize;

    /**
    * Minimum data disk size
    */
    @SerializedName("MinDataDiskSize")
    @Expose
    private Long MinDataDiskSize;

    /**
    * Suggested bandwidth
    */
    @SerializedName("SuggestBandwidth")
    @Expose
    private Long SuggestBandwidth;

    /**
    * Suggested disk size
    */
    @SerializedName("SuggestDataDiskSize")
    @Expose
    private Long SuggestDataDiskSize;

    /**
    * Suggested system disk size
    */
    @SerializedName("SuggestSystemDiskSize")
    @Expose
    private Long SuggestSystemDiskSize;

    /**
    * Peak number of CPU cores
    */
    @SerializedName("MaxVcpu")
    @Expose
    private Long MaxVcpu;

    /**
    * Minimum number of CPU cores
    */
    @SerializedName("MinVcpu")
    @Expose
    private Long MinVcpu;

    /**
    * Maximum number of CPU cores per request
    */
    @SerializedName("MaxVcpuPerReq")
    @Expose
    private Long MaxVcpuPerReq;

    /**
    * Bandwidth increment
    */
    @SerializedName("PerBandwidth")
    @Expose
    private Long PerBandwidth;

    /**
    * Data disk increment
    */
    @SerializedName("PerDataDisk")
    @Expose
    private Long PerDataDisk;

    /**
    * Total number of modules
    */
    @SerializedName("MaxModuleNum")
    @Expose
    private Long MaxModuleNum;

    /**
     * Get Network bandwidth cap 
     * @return MaxBandwidth Network bandwidth cap
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Network bandwidth cap
     * @param MaxBandwidth Network bandwidth cap
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get Upper limit of the data disk size 
     * @return MaxSystemDiskSize Upper limit of the data disk size
     */
    public Long getMaxSystemDiskSize() {
        return this.MaxSystemDiskSize;
    }

    /**
     * Set Upper limit of the data disk size
     * @param MaxSystemDiskSize Upper limit of the data disk size
     */
    public void setMaxSystemDiskSize(Long MaxSystemDiskSize) {
        this.MaxSystemDiskSize = MaxSystemDiskSize;
    }

    /**
     * Get Lower limit of the network bandwidth 
     * @return MinBandwidth Lower limit of the network bandwidth
     */
    public Long getMinBandwidth() {
        return this.MinBandwidth;
    }

    /**
     * Set Lower limit of the network bandwidth
     * @param MinBandwidth Lower limit of the network bandwidth
     */
    public void setMinBandwidth(Long MinBandwidth) {
        this.MinBandwidth = MinBandwidth;
    }

    /**
     * Get Lower limit of the data disk size 
     * @return MinSystemDiskSize Lower limit of the data disk size
     */
    public Long getMinSystemDiskSize() {
        return this.MinSystemDiskSize;
    }

    /**
     * Set Lower limit of the data disk size
     * @param MinSystemDiskSize Lower limit of the data disk size
     */
    public void setMinSystemDiskSize(Long MinSystemDiskSize) {
        this.MinSystemDiskSize = MinSystemDiskSize;
    }

    /**
     * Get Maximum data disk size 
     * @return MaxDataDiskSize Maximum data disk size
     */
    public Long getMaxDataDiskSize() {
        return this.MaxDataDiskSize;
    }

    /**
     * Set Maximum data disk size
     * @param MaxDataDiskSize Maximum data disk size
     */
    public void setMaxDataDiskSize(Long MaxDataDiskSize) {
        this.MaxDataDiskSize = MaxDataDiskSize;
    }

    /**
     * Get Minimum data disk size 
     * @return MinDataDiskSize Minimum data disk size
     */
    public Long getMinDataDiskSize() {
        return this.MinDataDiskSize;
    }

    /**
     * Set Minimum data disk size
     * @param MinDataDiskSize Minimum data disk size
     */
    public void setMinDataDiskSize(Long MinDataDiskSize) {
        this.MinDataDiskSize = MinDataDiskSize;
    }

    /**
     * Get Suggested bandwidth 
     * @return SuggestBandwidth Suggested bandwidth
     */
    public Long getSuggestBandwidth() {
        return this.SuggestBandwidth;
    }

    /**
     * Set Suggested bandwidth
     * @param SuggestBandwidth Suggested bandwidth
     */
    public void setSuggestBandwidth(Long SuggestBandwidth) {
        this.SuggestBandwidth = SuggestBandwidth;
    }

    /**
     * Get Suggested disk size 
     * @return SuggestDataDiskSize Suggested disk size
     */
    public Long getSuggestDataDiskSize() {
        return this.SuggestDataDiskSize;
    }

    /**
     * Set Suggested disk size
     * @param SuggestDataDiskSize Suggested disk size
     */
    public void setSuggestDataDiskSize(Long SuggestDataDiskSize) {
        this.SuggestDataDiskSize = SuggestDataDiskSize;
    }

    /**
     * Get Suggested system disk size 
     * @return SuggestSystemDiskSize Suggested system disk size
     */
    public Long getSuggestSystemDiskSize() {
        return this.SuggestSystemDiskSize;
    }

    /**
     * Set Suggested system disk size
     * @param SuggestSystemDiskSize Suggested system disk size
     */
    public void setSuggestSystemDiskSize(Long SuggestSystemDiskSize) {
        this.SuggestSystemDiskSize = SuggestSystemDiskSize;
    }

    /**
     * Get Peak number of CPU cores 
     * @return MaxVcpu Peak number of CPU cores
     */
    public Long getMaxVcpu() {
        return this.MaxVcpu;
    }

    /**
     * Set Peak number of CPU cores
     * @param MaxVcpu Peak number of CPU cores
     */
    public void setMaxVcpu(Long MaxVcpu) {
        this.MaxVcpu = MaxVcpu;
    }

    /**
     * Get Minimum number of CPU cores 
     * @return MinVcpu Minimum number of CPU cores
     */
    public Long getMinVcpu() {
        return this.MinVcpu;
    }

    /**
     * Set Minimum number of CPU cores
     * @param MinVcpu Minimum number of CPU cores
     */
    public void setMinVcpu(Long MinVcpu) {
        this.MinVcpu = MinVcpu;
    }

    /**
     * Get Maximum number of CPU cores per request 
     * @return MaxVcpuPerReq Maximum number of CPU cores per request
     */
    public Long getMaxVcpuPerReq() {
        return this.MaxVcpuPerReq;
    }

    /**
     * Set Maximum number of CPU cores per request
     * @param MaxVcpuPerReq Maximum number of CPU cores per request
     */
    public void setMaxVcpuPerReq(Long MaxVcpuPerReq) {
        this.MaxVcpuPerReq = MaxVcpuPerReq;
    }

    /**
     * Get Bandwidth increment 
     * @return PerBandwidth Bandwidth increment
     */
    public Long getPerBandwidth() {
        return this.PerBandwidth;
    }

    /**
     * Set Bandwidth increment
     * @param PerBandwidth Bandwidth increment
     */
    public void setPerBandwidth(Long PerBandwidth) {
        this.PerBandwidth = PerBandwidth;
    }

    /**
     * Get Data disk increment 
     * @return PerDataDisk Data disk increment
     */
    public Long getPerDataDisk() {
        return this.PerDataDisk;
    }

    /**
     * Set Data disk increment
     * @param PerDataDisk Data disk increment
     */
    public void setPerDataDisk(Long PerDataDisk) {
        this.PerDataDisk = PerDataDisk;
    }

    /**
     * Get Total number of modules 
     * @return MaxModuleNum Total number of modules
     */
    public Long getMaxModuleNum() {
        return this.MaxModuleNum;
    }

    /**
     * Set Total number of modules
     * @param MaxModuleNum Total number of modules
     */
    public void setMaxModuleNum(Long MaxModuleNum) {
        this.MaxModuleNum = MaxModuleNum;
    }

    public NetworkStorageRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkStorageRange(NetworkStorageRange source) {
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.MaxSystemDiskSize != null) {
            this.MaxSystemDiskSize = new Long(source.MaxSystemDiskSize);
        }
        if (source.MinBandwidth != null) {
            this.MinBandwidth = new Long(source.MinBandwidth);
        }
        if (source.MinSystemDiskSize != null) {
            this.MinSystemDiskSize = new Long(source.MinSystemDiskSize);
        }
        if (source.MaxDataDiskSize != null) {
            this.MaxDataDiskSize = new Long(source.MaxDataDiskSize);
        }
        if (source.MinDataDiskSize != null) {
            this.MinDataDiskSize = new Long(source.MinDataDiskSize);
        }
        if (source.SuggestBandwidth != null) {
            this.SuggestBandwidth = new Long(source.SuggestBandwidth);
        }
        if (source.SuggestDataDiskSize != null) {
            this.SuggestDataDiskSize = new Long(source.SuggestDataDiskSize);
        }
        if (source.SuggestSystemDiskSize != null) {
            this.SuggestSystemDiskSize = new Long(source.SuggestSystemDiskSize);
        }
        if (source.MaxVcpu != null) {
            this.MaxVcpu = new Long(source.MaxVcpu);
        }
        if (source.MinVcpu != null) {
            this.MinVcpu = new Long(source.MinVcpu);
        }
        if (source.MaxVcpuPerReq != null) {
            this.MaxVcpuPerReq = new Long(source.MaxVcpuPerReq);
        }
        if (source.PerBandwidth != null) {
            this.PerBandwidth = new Long(source.PerBandwidth);
        }
        if (source.PerDataDisk != null) {
            this.PerDataDisk = new Long(source.PerDataDisk);
        }
        if (source.MaxModuleNum != null) {
            this.MaxModuleNum = new Long(source.MaxModuleNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamSimple(map, prefix + "MaxSystemDiskSize", this.MaxSystemDiskSize);
        this.setParamSimple(map, prefix + "MinBandwidth", this.MinBandwidth);
        this.setParamSimple(map, prefix + "MinSystemDiskSize", this.MinSystemDiskSize);
        this.setParamSimple(map, prefix + "MaxDataDiskSize", this.MaxDataDiskSize);
        this.setParamSimple(map, prefix + "MinDataDiskSize", this.MinDataDiskSize);
        this.setParamSimple(map, prefix + "SuggestBandwidth", this.SuggestBandwidth);
        this.setParamSimple(map, prefix + "SuggestDataDiskSize", this.SuggestDataDiskSize);
        this.setParamSimple(map, prefix + "SuggestSystemDiskSize", this.SuggestSystemDiskSize);
        this.setParamSimple(map, prefix + "MaxVcpu", this.MaxVcpu);
        this.setParamSimple(map, prefix + "MinVcpu", this.MinVcpu);
        this.setParamSimple(map, prefix + "MaxVcpuPerReq", this.MaxVcpuPerReq);
        this.setParamSimple(map, prefix + "PerBandwidth", this.PerBandwidth);
        this.setParamSimple(map, prefix + "PerDataDisk", this.PerDataDisk);
        this.setParamSimple(map, prefix + "MaxModuleNum", this.MaxModuleNum);

    }
}

