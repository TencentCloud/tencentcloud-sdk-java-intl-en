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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongActiveHealthCheck extends AbstractModel {

    /**
    * Probe interval for active health check in seconds. 0 means disabled.
    */
    @SerializedName("HealthyInterval")
    @Expose
    private Long HealthyInterval;

    /**
    * Proactive health check exception probe interval, unit: second. 0 indicates disabled.
    */
    @SerializedName("UnHealthyInterval")
    @Expose
    private Long UnHealthyInterval;

    /**
    * Path used in GET HTTP request to run as a proactive health check probe. Default: "/".
    */
    @SerializedName("HttpPath")
    @Expose
    private String HttpPath;

    /**
    * Timeout for GET HTTP requests, unit: seconds. Default 60.
    */
    @SerializedName("Timeout")
    @Expose
    private Float Timeout;

    /**
     * Get Probe interval for active health check in seconds. 0 means disabled. 
     * @return HealthyInterval Probe interval for active health check in seconds. 0 means disabled.
     */
    public Long getHealthyInterval() {
        return this.HealthyInterval;
    }

    /**
     * Set Probe interval for active health check in seconds. 0 means disabled.
     * @param HealthyInterval Probe interval for active health check in seconds. 0 means disabled.
     */
    public void setHealthyInterval(Long HealthyInterval) {
        this.HealthyInterval = HealthyInterval;
    }

    /**
     * Get Proactive health check exception probe interval, unit: second. 0 indicates disabled. 
     * @return UnHealthyInterval Proactive health check exception probe interval, unit: second. 0 indicates disabled.
     */
    public Long getUnHealthyInterval() {
        return this.UnHealthyInterval;
    }

    /**
     * Set Proactive health check exception probe interval, unit: second. 0 indicates disabled.
     * @param UnHealthyInterval Proactive health check exception probe interval, unit: second. 0 indicates disabled.
     */
    public void setUnHealthyInterval(Long UnHealthyInterval) {
        this.UnHealthyInterval = UnHealthyInterval;
    }

    /**
     * Get Path used in GET HTTP request to run as a proactive health check probe. Default: "/". 
     * @return HttpPath Path used in GET HTTP request to run as a proactive health check probe. Default: "/".
     */
    public String getHttpPath() {
        return this.HttpPath;
    }

    /**
     * Set Path used in GET HTTP request to run as a proactive health check probe. Default: "/".
     * @param HttpPath Path used in GET HTTP request to run as a proactive health check probe. Default: "/".
     */
    public void setHttpPath(String HttpPath) {
        this.HttpPath = HttpPath;
    }

    /**
     * Get Timeout for GET HTTP requests, unit: seconds. Default 60. 
     * @return Timeout Timeout for GET HTTP requests, unit: seconds. Default 60.
     */
    public Float getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout for GET HTTP requests, unit: seconds. Default 60.
     * @param Timeout Timeout for GET HTTP requests, unit: seconds. Default 60.
     */
    public void setTimeout(Float Timeout) {
        this.Timeout = Timeout;
    }

    public KongActiveHealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongActiveHealthCheck(KongActiveHealthCheck source) {
        if (source.HealthyInterval != null) {
            this.HealthyInterval = new Long(source.HealthyInterval);
        }
        if (source.UnHealthyInterval != null) {
            this.UnHealthyInterval = new Long(source.UnHealthyInterval);
        }
        if (source.HttpPath != null) {
            this.HttpPath = new String(source.HttpPath);
        }
        if (source.Timeout != null) {
            this.Timeout = new Float(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthyInterval", this.HealthyInterval);
        this.setParamSimple(map, prefix + "UnHealthyInterval", this.UnHealthyInterval);
        this.setParamSimple(map, prefix + "HttpPath", this.HttpPath);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

