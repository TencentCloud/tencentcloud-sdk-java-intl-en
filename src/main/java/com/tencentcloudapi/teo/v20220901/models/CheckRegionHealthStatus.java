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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckRegionHealthStatus extends AbstractModel {

    /**
    * Health check region, which is a two-letter code according to ISO-3166-1.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Health status of origin servers in a single health check region. Valid values:
<li>Healthy: healthy.</li>
<li>Unhealthy: unhealthy.</li>
<li>Undetected: no data detected.</li>Note: If all origin servers in a single health check region are healthy, the status is healthy; otherwise, it is unhealthy.
    */
    @SerializedName("Healthy")
    @Expose
    private String Healthy;

    /**
    * Origin server health status.
    */
    @SerializedName("OriginHealthStatus")
    @Expose
    private OriginHealthStatus [] OriginHealthStatus;

    /**
     * Get Health check region, which is a two-letter code according to ISO-3166-1. 
     * @return Region Health check region, which is a two-letter code according to ISO-3166-1.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Health check region, which is a two-letter code according to ISO-3166-1.
     * @param Region Health check region, which is a two-letter code according to ISO-3166-1.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Health status of origin servers in a single health check region. Valid values:
<li>Healthy: healthy.</li>
<li>Unhealthy: unhealthy.</li>
<li>Undetected: no data detected.</li>Note: If all origin servers in a single health check region are healthy, the status is healthy; otherwise, it is unhealthy. 
     * @return Healthy Health status of origin servers in a single health check region. Valid values:
<li>Healthy: healthy.</li>
<li>Unhealthy: unhealthy.</li>
<li>Undetected: no data detected.</li>Note: If all origin servers in a single health check region are healthy, the status is healthy; otherwise, it is unhealthy.
     */
    public String getHealthy() {
        return this.Healthy;
    }

    /**
     * Set Health status of origin servers in a single health check region. Valid values:
<li>Healthy: healthy.</li>
<li>Unhealthy: unhealthy.</li>
<li>Undetected: no data detected.</li>Note: If all origin servers in a single health check region are healthy, the status is healthy; otherwise, it is unhealthy.
     * @param Healthy Health status of origin servers in a single health check region. Valid values:
<li>Healthy: healthy.</li>
<li>Unhealthy: unhealthy.</li>
<li>Undetected: no data detected.</li>Note: If all origin servers in a single health check region are healthy, the status is healthy; otherwise, it is unhealthy.
     */
    public void setHealthy(String Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get Origin server health status. 
     * @return OriginHealthStatus Origin server health status.
     */
    public OriginHealthStatus [] getOriginHealthStatus() {
        return this.OriginHealthStatus;
    }

    /**
     * Set Origin server health status.
     * @param OriginHealthStatus Origin server health status.
     */
    public void setOriginHealthStatus(OriginHealthStatus [] OriginHealthStatus) {
        this.OriginHealthStatus = OriginHealthStatus;
    }

    public CheckRegionHealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckRegionHealthStatus(CheckRegionHealthStatus source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Healthy != null) {
            this.Healthy = new String(source.Healthy);
        }
        if (source.OriginHealthStatus != null) {
            this.OriginHealthStatus = new OriginHealthStatus[source.OriginHealthStatus.length];
            for (int i = 0; i < source.OriginHealthStatus.length; i++) {
                this.OriginHealthStatus[i] = new OriginHealthStatus(source.OriginHealthStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamArrayObj(map, prefix + "OriginHealthStatus.", this.OriginHealthStatus);

    }
}

