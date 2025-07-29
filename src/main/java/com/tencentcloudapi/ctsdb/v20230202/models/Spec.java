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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Spec extends AbstractModel {

    /**
    * 1: yearly/monthly subscription; 2: bill by hour.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Request unit. 0 indicates following the resource configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestUnit")
    @Expose
    private Long RequestUnit;

    /**
    * Maximum number of CPU cores.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuLimit")
    @Expose
    private Float CpuLimit;

    /**
    * Maximum memory size (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemoryLimit")
    @Expose
    private Float MemoryLimit;

    /**
    * Maximum number of disks (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskLimit")
    @Expose
    private Long DiskLimit;

    /**
    * Number of business shards.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Shards")
    @Expose
    private Long Shards;

    /**
    * Number of business nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
     * Get 1: yearly/monthly subscription; 2: bill by hour.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode 1: yearly/monthly subscription; 2: bill by hour.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 1: yearly/monthly subscription; 2: bill by hour.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode 1: yearly/monthly subscription; 2: bill by hour.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Request unit. 0 indicates following the resource configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestUnit Request unit. 0 indicates following the resource configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRequestUnit() {
        return this.RequestUnit;
    }

    /**
     * Set Request unit. 0 indicates following the resource configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestUnit Request unit. 0 indicates following the resource configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestUnit(Long RequestUnit) {
        this.RequestUnit = RequestUnit;
    }

    /**
     * Get Maximum number of CPU cores.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CpuLimit Maximum number of CPU cores.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set Maximum number of CPU cores.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CpuLimit Maximum number of CPU cores.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuLimit(Float CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get Maximum memory size (Gi).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemoryLimit Maximum memory size (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set Maximum memory size (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemoryLimit Maximum memory size (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemoryLimit(Float MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get Maximum number of disks (Gi).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskLimit Maximum number of disks (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskLimit() {
        return this.DiskLimit;
    }

    /**
     * Set Maximum number of disks (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskLimit Maximum number of disks (Gi).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskLimit(Long DiskLimit) {
        this.DiskLimit = DiskLimit;
    }

    /**
     * Get Number of business shards.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Shards Number of business shards.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShards() {
        return this.Shards;
    }

    /**
     * Set Number of business shards.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Shards Number of business shards.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShards(Long Shards) {
        this.Shards = Shards;
    }

    /**
     * Get Number of business nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Replicas Number of business nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Number of business nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Replicas Number of business nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    public Spec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Spec(Spec source) {
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RequestUnit != null) {
            this.RequestUnit = new Long(source.RequestUnit);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new Float(source.CpuLimit);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new Float(source.MemoryLimit);
        }
        if (source.DiskLimit != null) {
            this.DiskLimit = new Long(source.DiskLimit);
        }
        if (source.Shards != null) {
            this.Shards = new Long(source.Shards);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RequestUnit", this.RequestUnit);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "DiskLimit", this.DiskLimit);
        this.setParamSimple(map, prefix + "Shards", this.Shards);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);

    }
}

