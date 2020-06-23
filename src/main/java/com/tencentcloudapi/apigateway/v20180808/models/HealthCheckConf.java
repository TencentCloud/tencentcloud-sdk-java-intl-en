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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConf extends AbstractModel{

    /**
    * Whether health check is enabled.
    */
    @SerializedName("IsHealthCheck")
    @Expose
    private Boolean IsHealthCheck;

    /**
    * Health check threshold.
    */
    @SerializedName("RequestVolumeThreshold")
    @Expose
    private Long RequestVolumeThreshold;

    /**
    * Window size.
    */
    @SerializedName("SleepWindowInMilliseconds")
    @Expose
    private Long SleepWindowInMilliseconds;

    /**
    * Threshold percentage.
    */
    @SerializedName("ErrorThresholdPercentage")
    @Expose
    private Long ErrorThresholdPercentage;

    /**
     * Get Whether health check is enabled. 
     * @return IsHealthCheck Whether health check is enabled.
     */
    public Boolean getIsHealthCheck() {
        return this.IsHealthCheck;
    }

    /**
     * Set Whether health check is enabled.
     * @param IsHealthCheck Whether health check is enabled.
     */
    public void setIsHealthCheck(Boolean IsHealthCheck) {
        this.IsHealthCheck = IsHealthCheck;
    }

    /**
     * Get Health check threshold. 
     * @return RequestVolumeThreshold Health check threshold.
     */
    public Long getRequestVolumeThreshold() {
        return this.RequestVolumeThreshold;
    }

    /**
     * Set Health check threshold.
     * @param RequestVolumeThreshold Health check threshold.
     */
    public void setRequestVolumeThreshold(Long RequestVolumeThreshold) {
        this.RequestVolumeThreshold = RequestVolumeThreshold;
    }

    /**
     * Get Window size. 
     * @return SleepWindowInMilliseconds Window size.
     */
    public Long getSleepWindowInMilliseconds() {
        return this.SleepWindowInMilliseconds;
    }

    /**
     * Set Window size.
     * @param SleepWindowInMilliseconds Window size.
     */
    public void setSleepWindowInMilliseconds(Long SleepWindowInMilliseconds) {
        this.SleepWindowInMilliseconds = SleepWindowInMilliseconds;
    }

    /**
     * Get Threshold percentage. 
     * @return ErrorThresholdPercentage Threshold percentage.
     */
    public Long getErrorThresholdPercentage() {
        return this.ErrorThresholdPercentage;
    }

    /**
     * Set Threshold percentage.
     * @param ErrorThresholdPercentage Threshold percentage.
     */
    public void setErrorThresholdPercentage(Long ErrorThresholdPercentage) {
        this.ErrorThresholdPercentage = ErrorThresholdPercentage;
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

