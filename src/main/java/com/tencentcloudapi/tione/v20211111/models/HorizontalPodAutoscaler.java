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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HorizontalPodAutoscaler extends AbstractModel {

    /**
    * Minimum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * Maximum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Supported."gpu-util": GPU utilization; value range: 10-100. "cpu-util": CPU utilization; value range: 10-100. "memory-util": memory utilization; value range: 10-100. "service-qps": the QPS value of single instances; value range: 1-5000."concurrency-util": the number of concurrent requests of single instances. Value range: 1-100000.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HpaMetrics")
    @Expose
    private Option [] HpaMetrics;

    /**
    * Scale-out cooldown period, in seconds.
    */
    @SerializedName("ScaleUpStabilizationWindowSeconds")
    @Expose
    private Long ScaleUpStabilizationWindowSeconds;

    /**
    * Scale-in cooldown period, in seconds.
    */
    @SerializedName("ScaleDownStabilizationWindowSeconds")
    @Expose
    private Long ScaleDownStabilizationWindowSeconds;

    /**
     * Get Minimum number of instances.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinReplicas Minimum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set Minimum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinReplicas Minimum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get Maximum number of instances.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxReplicas Maximum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set Maximum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxReplicas Maximum number of instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Supported."gpu-util": GPU utilization; value range: 10-100. "cpu-util": CPU utilization; value range: 10-100. "memory-util": memory utilization; value range: 10-100. "service-qps": the QPS value of single instances; value range: 1-5000."concurrency-util": the number of concurrent requests of single instances. Value range: 1-100000.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HpaMetrics Supported."gpu-util": GPU utilization; value range: 10-100. "cpu-util": CPU utilization; value range: 10-100. "memory-util": memory utilization; value range: 10-100. "service-qps": the QPS value of single instances; value range: 1-5000."concurrency-util": the number of concurrent requests of single instances. Value range: 1-100000.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Option [] getHpaMetrics() {
        return this.HpaMetrics;
    }

    /**
     * Set Supported."gpu-util": GPU utilization; value range: 10-100. "cpu-util": CPU utilization; value range: 10-100. "memory-util": memory utilization; value range: 10-100. "service-qps": the QPS value of single instances; value range: 1-5000."concurrency-util": the number of concurrent requests of single instances. Value range: 1-100000.Note: This field may return null, indicating that no valid values can be obtained.
     * @param HpaMetrics Supported."gpu-util": GPU utilization; value range: 10-100. "cpu-util": CPU utilization; value range: 10-100. "memory-util": memory utilization; value range: 10-100. "service-qps": the QPS value of single instances; value range: 1-5000."concurrency-util": the number of concurrent requests of single instances. Value range: 1-100000.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHpaMetrics(Option [] HpaMetrics) {
        this.HpaMetrics = HpaMetrics;
    }

    /**
     * Get Scale-out cooldown period, in seconds. 
     * @return ScaleUpStabilizationWindowSeconds Scale-out cooldown period, in seconds.
     */
    public Long getScaleUpStabilizationWindowSeconds() {
        return this.ScaleUpStabilizationWindowSeconds;
    }

    /**
     * Set Scale-out cooldown period, in seconds.
     * @param ScaleUpStabilizationWindowSeconds Scale-out cooldown period, in seconds.
     */
    public void setScaleUpStabilizationWindowSeconds(Long ScaleUpStabilizationWindowSeconds) {
        this.ScaleUpStabilizationWindowSeconds = ScaleUpStabilizationWindowSeconds;
    }

    /**
     * Get Scale-in cooldown period, in seconds. 
     * @return ScaleDownStabilizationWindowSeconds Scale-in cooldown period, in seconds.
     */
    public Long getScaleDownStabilizationWindowSeconds() {
        return this.ScaleDownStabilizationWindowSeconds;
    }

    /**
     * Set Scale-in cooldown period, in seconds.
     * @param ScaleDownStabilizationWindowSeconds Scale-in cooldown period, in seconds.
     */
    public void setScaleDownStabilizationWindowSeconds(Long ScaleDownStabilizationWindowSeconds) {
        this.ScaleDownStabilizationWindowSeconds = ScaleDownStabilizationWindowSeconds;
    }

    public HorizontalPodAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HorizontalPodAutoscaler(HorizontalPodAutoscaler source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.HpaMetrics != null) {
            this.HpaMetrics = new Option[source.HpaMetrics.length];
            for (int i = 0; i < source.HpaMetrics.length; i++) {
                this.HpaMetrics[i] = new Option(source.HpaMetrics[i]);
            }
        }
        if (source.ScaleUpStabilizationWindowSeconds != null) {
            this.ScaleUpStabilizationWindowSeconds = new Long(source.ScaleUpStabilizationWindowSeconds);
        }
        if (source.ScaleDownStabilizationWindowSeconds != null) {
            this.ScaleDownStabilizationWindowSeconds = new Long(source.ScaleDownStabilizationWindowSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "HpaMetrics.", this.HpaMetrics);
        this.setParamSimple(map, prefix + "ScaleUpStabilizationWindowSeconds", this.ScaleUpStabilizationWindowSeconds);
        this.setParamSimple(map, prefix + "ScaleDownStabilizationWindowSeconds", this.ScaleDownStabilizationWindowSeconds);

    }
}

