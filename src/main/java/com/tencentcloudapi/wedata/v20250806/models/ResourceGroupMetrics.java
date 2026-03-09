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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGroupMetrics extends AbstractModel {

    /**
    * Resource group specification, indicates the number of cpus.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * Resource group specification related to disk specification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskVolume")
    @Expose
    private Long DiskVolume;

    /**
    * Resource group specification related to memory size. unit: gb.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Resource group lifecycle. unit: day.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifeCycle")
    @Expose
    private Long LifeCycle;

    /**
    * Resource group specification related to highest concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaximumConcurrency")
    @Expose
    private Long MaximumConcurrency;

    /**
    * Resource group status

-0 - initializing.
-1. running.
-2 --- operation exception.
-Releasing.
-4 --- released.
-Creating.
-6 --- creation failed.
-7 --- updating.
-8 --- update failed.
-9 --- expired.
- 10 --- release failed.
-11 --- in use.
-12 --- inactive.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Metric detail.
    */
    @SerializedName("MetricSnapshots")
    @Expose
    private MetricData [] MetricSnapshots;

    /**
     * Get Resource group specification, indicates the number of cpus.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CpuNum Resource group specification, indicates the number of cpus.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Resource group specification, indicates the number of cpus.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CpuNum Resource group specification, indicates the number of cpus.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get Resource group specification related to disk specification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskVolume Resource group specification related to disk specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDiskVolume() {
        return this.DiskVolume;
    }

    /**
     * Set Resource group specification related to disk specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskVolume Resource group specification related to disk specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskVolume(Long DiskVolume) {
        this.DiskVolume = DiskVolume;
    }

    /**
     * Get Resource group specification related to memory size. unit: gb.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemSize Resource group specification related to memory size. unit: gb.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Resource group specification related to memory size. unit: gb.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemSize Resource group specification related to memory size. unit: gb.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Resource group lifecycle. unit: day.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifeCycle Resource group lifecycle. unit: day.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set Resource group lifecycle. unit: day.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifeCycle Resource group lifecycle. unit: day.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifeCycle(Long LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get Resource group specification related to highest concurrency.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaximumConcurrency Resource group specification related to highest concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaximumConcurrency() {
        return this.MaximumConcurrency;
    }

    /**
     * Set Resource group specification related to highest concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaximumConcurrency Resource group specification related to highest concurrency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaximumConcurrency(Long MaximumConcurrency) {
        this.MaximumConcurrency = MaximumConcurrency;
    }

    /**
     * Get Resource group status

-0 - initializing.
-1. running.
-2 --- operation exception.
-Releasing.
-4 --- released.
-Creating.
-6 --- creation failed.
-7 --- updating.
-8 --- update failed.
-9 --- expired.
- 10 --- release failed.
-11 --- in use.
-12 --- inactive.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Resource group status

-0 - initializing.
-1. running.
-2 --- operation exception.
-Releasing.
-4 --- released.
-Creating.
-6 --- creation failed.
-7 --- updating.
-8 --- update failed.
-9 --- expired.
- 10 --- release failed.
-11 --- in use.
-12 --- inactive.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Resource group status

-0 - initializing.
-1. running.
-2 --- operation exception.
-Releasing.
-4 --- released.
-Creating.
-6 --- creation failed.
-7 --- updating.
-8 --- update failed.
-9 --- expired.
- 10 --- release failed.
-11 --- in use.
-12 --- inactive.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Resource group status

-0 - initializing.
-1. running.
-2 --- operation exception.
-Releasing.
-4 --- released.
-Creating.
-6 --- creation failed.
-7 --- updating.
-8 --- update failed.
-9 --- expired.
- 10 --- release failed.
-11 --- in use.
-12 --- inactive.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Metric detail. 
     * @return MetricSnapshots Metric detail.
     */
    public MetricData [] getMetricSnapshots() {
        return this.MetricSnapshots;
    }

    /**
     * Set Metric detail.
     * @param MetricSnapshots Metric detail.
     */
    public void setMetricSnapshots(MetricData [] MetricSnapshots) {
        this.MetricSnapshots = MetricSnapshots;
    }

    public ResourceGroupMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGroupMetrics(ResourceGroupMetrics source) {
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.DiskVolume != null) {
            this.DiskVolume = new Long(source.DiskVolume);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new Long(source.LifeCycle);
        }
        if (source.MaximumConcurrency != null) {
            this.MaximumConcurrency = new Long(source.MaximumConcurrency);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MetricSnapshots != null) {
            this.MetricSnapshots = new MetricData[source.MetricSnapshots.length];
            for (int i = 0; i < source.MetricSnapshots.length; i++) {
                this.MetricSnapshots[i] = new MetricData(source.MetricSnapshots[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "DiskVolume", this.DiskVolume);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "LifeCycle", this.LifeCycle);
        this.setParamSimple(map, prefix + "MaximumConcurrency", this.MaximumConcurrency);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "MetricSnapshots.", this.MetricSnapshots);

    }
}

