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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7HealthConfig extends AbstractModel {

    /**
    * Forwarding protocol. Valid values: [http, https, http/https]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Forwarding domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 1: enabled, 0: disabled
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Detection interval in seconds
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Number of exceptions in times
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * Number of health checks in times
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
    * Health check detection method. Valid values: HEAD, GET. Default VALUE: HEAD
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * URL of checked directory. Default value: /
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Forwarding protocol. Valid values: [http, https, http/https] 
     * @return Protocol Forwarding protocol. Valid values: [http, https, http/https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Forwarding protocol. Valid values: [http, https, http/https]
     * @param Protocol Forwarding protocol. Valid values: [http, https, http/https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Forwarding domain name 
     * @return Domain Forwarding domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Forwarding domain name
     * @param Domain Forwarding domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 1: enabled, 0: disabled 
     * @return Enable 1: enabled, 0: disabled
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1: enabled, 0: disabled
     * @param Enable 1: enabled, 0: disabled
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Detection interval in seconds 
     * @return Interval Detection interval in seconds
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Detection interval in seconds
     * @param Interval Detection interval in seconds
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Number of exceptions in times 
     * @return KickNum Number of exceptions in times
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * Set Number of exceptions in times
     * @param KickNum Number of exceptions in times
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * Get Number of health checks in times 
     * @return AliveNum Number of health checks in times
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * Set Number of health checks in times
     * @param AliveNum Number of health checks in times
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * Get Health check detection method. Valid values: HEAD, GET. Default VALUE: HEAD 
     * @return Method Health check detection method. Valid values: HEAD, GET. Default VALUE: HEAD
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Health check detection method. Valid values: HEAD, GET. Default VALUE: HEAD
     * @param Method Health check detection method. Valid values: HEAD, GET. Default VALUE: HEAD
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up 
     * @return StatusCode Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
     * @param StatusCode Healthy status code during health check. xx = 1, 2xx = 2, 3xx = 4, 4xx = 8, 5xx = 16. Multiple status code values are added up
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get URL of checked directory. Default value: / 
     * @return Url URL of checked directory. Default value: /
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of checked directory. Default value: /
     * @param Url URL of checked directory. Default value: /
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public L7HealthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7HealthConfig(L7HealthConfig source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.KickNum != null) {
            this.KickNum = new Long(source.KickNum);
        }
        if (source.AliveNum != null) {
            this.AliveNum = new Long(source.AliveNum);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

