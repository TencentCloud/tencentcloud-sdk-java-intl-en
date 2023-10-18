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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusGlobalConfigResponse extends AbstractModel {

    /**
    * Configuration content
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * List of service monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * List of pod monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * List of raw jobs and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
    * List of probes and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Probes")
    @Expose
    private PrometheusConfigItem [] Probes;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Configuration content 
     * @return Config Configuration content
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration content
     * @param Config Configuration content
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get List of service monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceMonitors List of service monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set List of service monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceMonitors List of service monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get List of pod monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodMonitors List of pod monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set List of pod monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodMonitors List of pod monitors and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get List of raw jobs and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RawJobs List of raw jobs and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set List of raw jobs and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RawJobs List of raw jobs and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    /**
     * Get List of probes and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Probes List of probes and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getProbes() {
        return this.Probes;
    }

    /**
     * Set List of probes and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Probes List of probes and the corresponding targets information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProbes(PrometheusConfigItem [] Probes) {
        this.Probes = Probes;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePrometheusGlobalConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusGlobalConfigResponse(DescribePrometheusGlobalConfigResponse source) {
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ServiceMonitors != null) {
            this.ServiceMonitors = new PrometheusConfigItem[source.ServiceMonitors.length];
            for (int i = 0; i < source.ServiceMonitors.length; i++) {
                this.ServiceMonitors[i] = new PrometheusConfigItem(source.ServiceMonitors[i]);
            }
        }
        if (source.PodMonitors != null) {
            this.PodMonitors = new PrometheusConfigItem[source.PodMonitors.length];
            for (int i = 0; i < source.PodMonitors.length; i++) {
                this.PodMonitors[i] = new PrometheusConfigItem(source.PodMonitors[i]);
            }
        }
        if (source.RawJobs != null) {
            this.RawJobs = new PrometheusConfigItem[source.RawJobs.length];
            for (int i = 0; i < source.RawJobs.length; i++) {
                this.RawJobs[i] = new PrometheusConfigItem(source.RawJobs[i]);
            }
        }
        if (source.Probes != null) {
            this.Probes = new PrometheusConfigItem[source.Probes.length];
            for (int i = 0; i < source.Probes.length; i++) {
                this.Probes[i] = new PrometheusConfigItem(source.Probes[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamArrayObj(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArrayObj(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArrayObj(map, prefix + "RawJobs.", this.RawJobs);
        this.setParamArrayObj(map, prefix + "Probes.", this.Probes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

