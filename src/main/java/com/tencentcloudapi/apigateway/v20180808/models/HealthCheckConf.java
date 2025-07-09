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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConf extends AbstractModel {

    /**
    * Whether health check is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsHealthCheck")
    @Expose
    private Boolean IsHealthCheck;

    /**
    * Health check threshold. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestVolumeThreshold")
    @Expose
    private Long RequestVolumeThreshold;

    /**
    * Window size. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SleepWindowInMilliseconds")
    @Expose
    private Long SleepWindowInMilliseconds;

    /**
    * Threshold percentage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorThresholdPercentage")
    @Expose
    private Long ErrorThresholdPercentage;

    /**
     * Get Whether health check is enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsHealthCheck Whether health check is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsHealthCheck() {
        return this.IsHealthCheck;
    }

    /**
     * Set Whether health check is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsHealthCheck Whether health check is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsHealthCheck(Boolean IsHealthCheck) {
        this.IsHealthCheck = IsHealthCheck;
    }

    /**
     * Get Health check threshold. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestVolumeThreshold Health check threshold. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRequestVolumeThreshold() {
        return this.RequestVolumeThreshold;
    }

    /**
     * Set Health check threshold. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestVolumeThreshold Health check threshold. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestVolumeThreshold(Long RequestVolumeThreshold) {
        this.RequestVolumeThreshold = RequestVolumeThreshold;
    }

    /**
     * Get Window size. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SleepWindowInMilliseconds Window size. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSleepWindowInMilliseconds() {
        return this.SleepWindowInMilliseconds;
    }

    /**
     * Set Window size. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SleepWindowInMilliseconds Window size. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSleepWindowInMilliseconds(Long SleepWindowInMilliseconds) {
        this.SleepWindowInMilliseconds = SleepWindowInMilliseconds;
    }

    /**
     * Get Threshold percentage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorThresholdPercentage Threshold percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrorThresholdPercentage() {
        return this.ErrorThresholdPercentage;
    }

    /**
     * Set Threshold percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorThresholdPercentage Threshold percentage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorThresholdPercentage(Long ErrorThresholdPercentage) {
        this.ErrorThresholdPercentage = ErrorThresholdPercentage;
    }

    public HealthCheckConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConf(HealthCheckConf source) {
        if (source.IsHealthCheck != null) {
            this.IsHealthCheck = new Boolean(source.IsHealthCheck);
        }
        if (source.RequestVolumeThreshold != null) {
            this.RequestVolumeThreshold = new Long(source.RequestVolumeThreshold);
        }
        if (source.SleepWindowInMilliseconds != null) {
            this.SleepWindowInMilliseconds = new Long(source.SleepWindowInMilliseconds);
        }
        if (source.ErrorThresholdPercentage != null) {
            this.ErrorThresholdPercentage = new Long(source.ErrorThresholdPercentage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsHealthCheck", this.IsHealthCheck);
        this.setParamSimple(map, prefix + "RequestVolumeThreshold", this.RequestVolumeThreshold);
        this.setParamSimple(map, prefix + "SleepWindowInMilliseconds", this.SleepWindowInMilliseconds);
        this.setParamSimple(map, prefix + "ErrorThresholdPercentage", this.ErrorThresholdPercentage);

    }
}

