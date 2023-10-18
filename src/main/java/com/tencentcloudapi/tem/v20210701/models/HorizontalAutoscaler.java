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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HorizontalAutoscaler extends AbstractModel {

    /**
    * (Optional) Minimum number of instances
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * (Optional) Maximum number of instances
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Metric measurement
`CPU`: CPU utilization (%)
`MEMORY`: Memory utilization (%)
`CPU_CORE_USED`: CPU usage (core)
`MEMORY_SIZE_USED`: Memory usage (MiB)
`NETWORK_BANDWIDTH_RECEIVE`: Network bandwidth in (Mbps)
`NETWORK_BANDWIDTH_TRANSMIT`: Network bandwidth out (Mbps)
`NETWORK_TRAFFIC_RECEIVE`: Network traffic in (MiB/s)
`NETWORK_TRAFFIC_TRANSMIT`: Network traffic  out (MiB/s)
`NETWORK_PACKETS_RECEIVE`: Network packets in (packets/sec)
`NETWORK_PACKETS_TRANSMIT`: Network packets out (packets/sec)
`FS_IOPS_WRITE`: Disk writes (count/sec)
`FS_IOPS_READ`: Disk reads (count/sec)
`FS_SIZE_WRITE`: Disk write size (MiB/s)
`FS_SIZE_READ`: Disk read size (MiB/s)
    */
    @SerializedName("Metrics")
    @Expose
    private String Metrics;

    /**
    * The value of threshold (integer)
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Whether it is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * The value of threshold (demical)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DoubleThreshold")
    @Expose
    private Float DoubleThreshold;

    /**
     * Get (Optional) Minimum number of instances 
     * @return MinReplicas (Optional) Minimum number of instances
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set (Optional) Minimum number of instances
     * @param MinReplicas (Optional) Minimum number of instances
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get (Optional) Maximum number of instances 
     * @return MaxReplicas (Optional) Maximum number of instances
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set (Optional) Maximum number of instances
     * @param MaxReplicas (Optional) Maximum number of instances
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Metric measurement
`CPU`: CPU utilization (%)
`MEMORY`: Memory utilization (%)
`CPU_CORE_USED`: CPU usage (core)
`MEMORY_SIZE_USED`: Memory usage (MiB)
`NETWORK_BANDWIDTH_RECEIVE`: Network bandwidth in (Mbps)
`NETWORK_BANDWIDTH_TRANSMIT`: Network bandwidth out (Mbps)
`NETWORK_TRAFFIC_RECEIVE`: Network traffic in (MiB/s)
`NETWORK_TRAFFIC_TRANSMIT`: Network traffic  out (MiB/s)
`NETWORK_PACKETS_RECEIVE`: Network packets in (packets/sec)
`NETWORK_PACKETS_TRANSMIT`: Network packets out (packets/sec)
`FS_IOPS_WRITE`: Disk writes (count/sec)
`FS_IOPS_READ`: Disk reads (count/sec)
`FS_SIZE_WRITE`: Disk write size (MiB/s)
`FS_SIZE_READ`: Disk read size (MiB/s) 
     * @return Metrics Metric measurement
`CPU`: CPU utilization (%)
`MEMORY`: Memory utilization (%)
`CPU_CORE_USED`: CPU usage (core)
`MEMORY_SIZE_USED`: Memory usage (MiB)
`NETWORK_BANDWIDTH_RECEIVE`: Network bandwidth in (Mbps)
`NETWORK_BANDWIDTH_TRANSMIT`: Network bandwidth out (Mbps)
`NETWORK_TRAFFIC_RECEIVE`: Network traffic in (MiB/s)
`NETWORK_TRAFFIC_TRANSMIT`: Network traffic  out (MiB/s)
`NETWORK_PACKETS_RECEIVE`: Network packets in (packets/sec)
`NETWORK_PACKETS_TRANSMIT`: Network packets out (packets/sec)
`FS_IOPS_WRITE`: Disk writes (count/sec)
`FS_IOPS_READ`: Disk reads (count/sec)
`FS_SIZE_WRITE`: Disk write size (MiB/s)
`FS_SIZE_READ`: Disk read size (MiB/s)
     */
    public String getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Metric measurement
`CPU`: CPU utilization (%)
`MEMORY`: Memory utilization (%)
`CPU_CORE_USED`: CPU usage (core)
`MEMORY_SIZE_USED`: Memory usage (MiB)
`NETWORK_BANDWIDTH_RECEIVE`: Network bandwidth in (Mbps)
`NETWORK_BANDWIDTH_TRANSMIT`: Network bandwidth out (Mbps)
`NETWORK_TRAFFIC_RECEIVE`: Network traffic in (MiB/s)
`NETWORK_TRAFFIC_TRANSMIT`: Network traffic  out (MiB/s)
`NETWORK_PACKETS_RECEIVE`: Network packets in (packets/sec)
`NETWORK_PACKETS_TRANSMIT`: Network packets out (packets/sec)
`FS_IOPS_WRITE`: Disk writes (count/sec)
`FS_IOPS_READ`: Disk reads (count/sec)
`FS_SIZE_WRITE`: Disk write size (MiB/s)
`FS_SIZE_READ`: Disk read size (MiB/s)
     * @param Metrics Metric measurement
`CPU`: CPU utilization (%)
`MEMORY`: Memory utilization (%)
`CPU_CORE_USED`: CPU usage (core)
`MEMORY_SIZE_USED`: Memory usage (MiB)
`NETWORK_BANDWIDTH_RECEIVE`: Network bandwidth in (Mbps)
`NETWORK_BANDWIDTH_TRANSMIT`: Network bandwidth out (Mbps)
`NETWORK_TRAFFIC_RECEIVE`: Network traffic in (MiB/s)
`NETWORK_TRAFFIC_TRANSMIT`: Network traffic  out (MiB/s)
`NETWORK_PACKETS_RECEIVE`: Network packets in (packets/sec)
`NETWORK_PACKETS_TRANSMIT`: Network packets out (packets/sec)
`FS_IOPS_WRITE`: Disk writes (count/sec)
`FS_IOPS_READ`: Disk reads (count/sec)
`FS_SIZE_WRITE`: Disk write size (MiB/s)
`FS_SIZE_READ`: Disk read size (MiB/s)
     */
    public void setMetrics(String Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get The value of threshold (integer) 
     * @return Threshold The value of threshold (integer)
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set The value of threshold (integer)
     * @param Threshold The value of threshold (integer)
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Whether it is enabled 
     * @return Enabled Whether it is enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether it is enabled
     * @param Enabled Whether it is enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get The value of threshold (demical)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DoubleThreshold The value of threshold (demical)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getDoubleThreshold() {
        return this.DoubleThreshold;
    }

    /**
     * Set The value of threshold (demical)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DoubleThreshold The value of threshold (demical)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDoubleThreshold(Float DoubleThreshold) {
        this.DoubleThreshold = DoubleThreshold;
    }

    public HorizontalAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HorizontalAutoscaler(HorizontalAutoscaler source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.Metrics != null) {
            this.Metrics = new String(source.Metrics);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.DoubleThreshold != null) {
            this.DoubleThreshold = new Float(source.DoubleThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "Metrics", this.Metrics);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DoubleThreshold", this.DoubleThreshold);

    }
}

