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

public class MetricData extends AbstractModel {

    /**
    * Metric name

-ConcurrencyUsage --- concurrency usage rate.
-CpuCoreUsage --- cpu utilization.
-CpuLoad --- cpu load.
-DevelopQueueTask --- number of tasks in the queue.
-Number of running develop tasks.
-DevelopSchedulingTask --- number of development tasks being scheduled.
-DiskUsage --- disk usage.
-DiskUsed --- disk used amount.
-MaximumConcurrency --- maximum concurrency.
-MemoryLoad --- memory load.
-MemoryUsage --- memory usage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Current value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotValue")
    @Expose
    private Long SnapshotValue;

    /**
    * Metric trend.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrendList")
    @Expose
    private TrendData [] TrendList;

    /**
     * Get Metric name

-ConcurrencyUsage --- concurrency usage rate.
-CpuCoreUsage --- cpu utilization.
-CpuLoad --- cpu load.
-DevelopQueueTask --- number of tasks in the queue.
-Number of running develop tasks.
-DevelopSchedulingTask --- number of development tasks being scheduled.
-DiskUsage --- disk usage.
-DiskUsed --- disk used amount.
-MaximumConcurrency --- maximum concurrency.
-MemoryLoad --- memory load.
-MemoryUsage --- memory usage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricName Metric name

-ConcurrencyUsage --- concurrency usage rate.
-CpuCoreUsage --- cpu utilization.
-CpuLoad --- cpu load.
-DevelopQueueTask --- number of tasks in the queue.
-Number of running develop tasks.
-DevelopSchedulingTask --- number of development tasks being scheduled.
-DiskUsage --- disk usage.
-DiskUsed --- disk used amount.
-MaximumConcurrency --- maximum concurrency.
-MemoryLoad --- memory load.
-MemoryUsage --- memory usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name

-ConcurrencyUsage --- concurrency usage rate.
-CpuCoreUsage --- cpu utilization.
-CpuLoad --- cpu load.
-DevelopQueueTask --- number of tasks in the queue.
-Number of running develop tasks.
-DevelopSchedulingTask --- number of development tasks being scheduled.
-DiskUsage --- disk usage.
-DiskUsed --- disk used amount.
-MaximumConcurrency --- maximum concurrency.
-MemoryLoad --- memory load.
-MemoryUsage --- memory usage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricName Metric name

-ConcurrencyUsage --- concurrency usage rate.
-CpuCoreUsage --- cpu utilization.
-CpuLoad --- cpu load.
-DevelopQueueTask --- number of tasks in the queue.
-Number of running develop tasks.
-DevelopSchedulingTask --- number of development tasks being scheduled.
-DiskUsage --- disk usage.
-DiskUsed --- disk used amount.
-MaximumConcurrency --- maximum concurrency.
-MemoryLoad --- memory load.
-MemoryUsage --- memory usage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Current value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotValue Current value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSnapshotValue() {
        return this.SnapshotValue;
    }

    /**
     * Set Current value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapshotValue Current value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotValue(Long SnapshotValue) {
        this.SnapshotValue = SnapshotValue;
    }

    /**
     * Get Metric trend.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrendList Metric trend.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TrendData [] getTrendList() {
        return this.TrendList;
    }

    /**
     * Set Metric trend.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrendList Metric trend.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrendList(TrendData [] TrendList) {
        this.TrendList = TrendList;
    }

    public MetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricData(MetricData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.SnapshotValue != null) {
            this.SnapshotValue = new Long(source.SnapshotValue);
        }
        if (source.TrendList != null) {
            this.TrendList = new TrendData[source.TrendList.length];
            for (int i = 0; i < source.TrendList.length; i++) {
                this.TrendList[i] = new TrendData(source.TrendList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "SnapshotValue", this.SnapshotValue);
        this.setParamArrayObj(map, prefix + "TrendList.", this.TrendList);

    }
}

