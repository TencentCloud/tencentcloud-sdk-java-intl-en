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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientIpPlaySumInfo extends AbstractModel {

    /**
    * Client IP in dotted-decimal notation.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * District where the client is located.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * Total traffic.
    */
    @SerializedName("TotalFlux")
    @Expose
    private Float TotalFlux;

    /**
    * Total number of requests.
    */
    @SerializedName("TotalRequest")
    @Expose
    private Long TotalRequest;

    /**
    * Total number of failed requests.
    */
    @SerializedName("TotalFailedRequest")
    @Expose
    private Long TotalFailedRequest;

    /**
    * Country/region where the client is located.
    */
    @SerializedName("CountryArea")
    @Expose
    private String CountryArea;

    /**
     * Get Client IP in dotted-decimal notation. 
     * @return ClientIp Client IP in dotted-decimal notation.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP in dotted-decimal notation.
     * @param ClientIp Client IP in dotted-decimal notation.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get District where the client is located. 
     * @return Province District where the client is located.
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set District where the client is located.
     * @param Province District where the client is located.
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get Total traffic. 
     * @return TotalFlux Total traffic.
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set Total traffic.
     * @param TotalFlux Total traffic.
     */
    public void setTotalFlux(Float TotalFlux) {
        this.TotalFlux = TotalFlux;
    }

    /**
     * Get Total number of requests. 
     * @return TotalRequest Total number of requests.
     */
    public Long getTotalRequest() {
        return this.TotalRequest;
    }

    /**
     * Set Total number of requests.
     * @param TotalRequest Total number of requests.
     */
    public void setTotalRequest(Long TotalRequest) {
        this.TotalRequest = TotalRequest;
    }

    /**
     * Get Total number of failed requests. 
     * @return TotalFailedRequest Total number of failed requests.
     */
    public Long getTotalFailedRequest() {
        return this.TotalFailedRequest;
    }

    /**
     * Set Total number of failed requests.
     * @param TotalFailedRequest Total number of failed requests.
     */
    public void setTotalFailedRequest(Long TotalFailedRequest) {
        this.TotalFailedRequest = TotalFailedRequest;
    }

    /**
     * Get Country/region where the client is located. 
     * @return CountryArea Country/region where the client is located.
     */
    public String getCountryArea() {
        return this.CountryArea;
    }

    /**
     * Set Country/region where the client is located.
     * @param CountryArea Country/region where the client is located.
     */
    public void setCountryArea(String CountryArea) {
        this.CountryArea = CountryArea;
    }

    public ClientIpPlaySumInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientIpPlaySumInfo(ClientIpPlaySumInfo source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.TotalFlux != null) {
            this.TotalFlux = new Float(source.TotalFlux);
        }
        if (source.TotalRequest != null) {
            this.TotalRequest = new Long(source.TotalRequest);
        }
        if (source.TotalFailedRequest != null) {
            this.TotalFailedRequest = new Long(source.TotalFailedRequest);
        }
        if (source.CountryArea != null) {
            this.CountryArea = new String(source.CountryArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);
        this.setParamSimple(map, prefix + "TotalFailedRequest", this.TotalFailedRequest);
        this.setParamSimple(map, prefix + "CountryArea", this.CountryArea);

    }
}

