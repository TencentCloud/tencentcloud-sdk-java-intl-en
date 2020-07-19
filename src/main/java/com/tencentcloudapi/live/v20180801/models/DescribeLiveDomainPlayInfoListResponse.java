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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainPlayInfoListResponse extends AbstractModel{

    /**
    * Data time in the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Real-time total bandwidth.
    */
    @SerializedName("TotalBandwidth")
    @Expose
    private Float TotalBandwidth;

    /**
    * Real-time total traffic.
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
    * Real-time total number of connections.
    */
    @SerializedName("TotalOnline")
    @Expose
    private Long TotalOnline;

    /**
    * Data by domain name.
    */
    @SerializedName("DomainInfoList")
    @Expose
    private DomainInfoList [] DomainInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data time in the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return Time Data time in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Data time in the format of `yyyy-mm-dd HH:MM:SS`.
     * @param Time Data time in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Real-time total bandwidth. 
     * @return TotalBandwidth Real-time total bandwidth.
     */
    public Float getTotalBandwidth() {
        return this.TotalBandwidth;
    }

    /**
     * Set Real-time total bandwidth.
     * @param TotalBandwidth Real-time total bandwidth.
     */
    public void setTotalBandwidth(Float TotalBandwidth) {
        this.TotalBandwidth = TotalBandwidth;
    }

    /**
     * Get Real-time total traffic. 
     * @return TotalFlux Real-time total traffic.
     */
    public Float getTotalFlux() {
        return this.TotalFlux;
    }

    /**
     * Set Real-time total traffic.
     * @param TotalFlux Real-time total traffic.
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
     * Get Real-time total number of connections. 
     * @return TotalOnline Real-time total number of connections.
     */
    public Long getTotalOnline() {
        return this.TotalOnline;
    }

    /**
     * Set Real-time total number of connections.
     * @param TotalOnline Real-time total number of connections.
     */
    public void setTotalOnline(Long TotalOnline) {
        this.TotalOnline = TotalOnline;
    }

    /**
     * Get Data by domain name. 
     * @return DomainInfoList Data by domain name.
     */
    public DomainInfoList [] getDomainInfoList() {
        return this.DomainInfoList;
    }

    /**
     * Set Data by domain name.
     * @param DomainInfoList Data by domain name.
     */
    public void setDomainInfoList(DomainInfoList [] DomainInfoList) {
        this.DomainInfoList = DomainInfoList;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TotalBandwidth", this.TotalBandwidth);
        this.setParamSimple(map, prefix + "TotalFlux", this.TotalFlux);
        this.setParamSimple(map, prefix + "TotalRequest", this.TotalRequest);
        this.setParamSimple(map, prefix + "TotalOnline", this.TotalOnline);
        this.setParamArrayObj(map, prefix + "DomainInfoList.", this.DomainInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

