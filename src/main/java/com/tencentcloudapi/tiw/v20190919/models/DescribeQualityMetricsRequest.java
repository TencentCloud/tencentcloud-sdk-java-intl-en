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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQualityMetricsRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Start time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Metrics to be queried. Valid values:
  - image_load_total_count: The number of image loads.
  - image_load_fail_count: The number of image load failures.
  - image_load_success_rate: The success rate of image loading, in percentage.
  - ppt_load_total_count: The number of PowerPoint file loads.
  - ppt_load_fail_count: The number of PowerPoint file load failures.
  - ppt_load_success_rate: The success rate of PowerPoint file loading, in percentage.
  - verify_sdk_total_count: The number of SDK verifications.
  - verify_sdk_fail_count: The number of SDK verification failures.
  - verify_sdk_success_rate: The success rate of SDK verification, in percentage.
  - verify_sdk_in_one_second_rate: The rate of SDK verification completed within one second, in percentage.
  - verify_sdk_cost_avg: The average time taken by each SDK verification, in milliseconds.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Aggregation interval. Valid value: `1h`.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Start time, which is a Unix timestamp in seconds. The time length cannot exceed seven days. 
     * @return StartTime Start time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
     * @param StartTime Start time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, which is a Unix timestamp in seconds. The time length cannot exceed seven days. 
     * @return EndTime End time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
     * @param EndTime End time, which is a Unix timestamp in seconds. The time length cannot exceed seven days.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Metrics to be queried. Valid values:
  - image_load_total_count: The number of image loads.
  - image_load_fail_count: The number of image load failures.
  - image_load_success_rate: The success rate of image loading, in percentage.
  - ppt_load_total_count: The number of PowerPoint file loads.
  - ppt_load_fail_count: The number of PowerPoint file load failures.
  - ppt_load_success_rate: The success rate of PowerPoint file loading, in percentage.
  - verify_sdk_total_count: The number of SDK verifications.
  - verify_sdk_fail_count: The number of SDK verification failures.
  - verify_sdk_success_rate: The success rate of SDK verification, in percentage.
  - verify_sdk_in_one_second_rate: The rate of SDK verification completed within one second, in percentage.
  - verify_sdk_cost_avg: The average time taken by each SDK verification, in milliseconds. 
     * @return Metric Metrics to be queried. Valid values:
  - image_load_total_count: The number of image loads.
  - image_load_fail_count: The number of image load failures.
  - image_load_success_rate: The success rate of image loading, in percentage.
  - ppt_load_total_count: The number of PowerPoint file loads.
  - ppt_load_fail_count: The number of PowerPoint file load failures.
  - ppt_load_success_rate: The success rate of PowerPoint file loading, in percentage.
  - verify_sdk_total_count: The number of SDK verifications.
  - verify_sdk_fail_count: The number of SDK verification failures.
  - verify_sdk_success_rate: The success rate of SDK verification, in percentage.
  - verify_sdk_in_one_second_rate: The rate of SDK verification completed within one second, in percentage.
  - verify_sdk_cost_avg: The average time taken by each SDK verification, in milliseconds.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metrics to be queried. Valid values:
  - image_load_total_count: The number of image loads.
  - image_load_fail_count: The number of image load failures.
  - image_load_success_rate: The success rate of image loading, in percentage.
  - ppt_load_total_count: The number of PowerPoint file loads.
  - ppt_load_fail_count: The number of PowerPoint file load failures.
  - ppt_load_success_rate: The success rate of PowerPoint file loading, in percentage.
  - verify_sdk_total_count: The number of SDK verifications.
  - verify_sdk_fail_count: The number of SDK verification failures.
  - verify_sdk_success_rate: The success rate of SDK verification, in percentage.
  - verify_sdk_in_one_second_rate: The rate of SDK verification completed within one second, in percentage.
  - verify_sdk_cost_avg: The average time taken by each SDK verification, in milliseconds.
     * @param Metric Metrics to be queried. Valid values:
  - image_load_total_count: The number of image loads.
  - image_load_fail_count: The number of image load failures.
  - image_load_success_rate: The success rate of image loading, in percentage.
  - ppt_load_total_count: The number of PowerPoint file loads.
  - ppt_load_fail_count: The number of PowerPoint file load failures.
  - ppt_load_success_rate: The success rate of PowerPoint file loading, in percentage.
  - verify_sdk_total_count: The number of SDK verifications.
  - verify_sdk_fail_count: The number of SDK verification failures.
  - verify_sdk_success_rate: The success rate of SDK verification, in percentage.
  - verify_sdk_in_one_second_rate: The rate of SDK verification completed within one second, in percentage.
  - verify_sdk_cost_avg: The average time taken by each SDK verification, in milliseconds.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Aggregation interval. Valid value: `1h`. 
     * @return Interval Aggregation interval. Valid value: `1h`.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Aggregation interval. Valid value: `1h`.
     * @param Interval Aggregation interval. Valid value: `1h`.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeQualityMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityMetricsRequest(DescribeQualityMetricsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

