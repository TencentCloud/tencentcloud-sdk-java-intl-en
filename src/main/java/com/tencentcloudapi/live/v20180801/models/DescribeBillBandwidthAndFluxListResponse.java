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

public class DescribeBillBandwidthAndFluxListResponse extends AbstractModel{

    /**
    * Time point of peak bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("PeakBandwidthTime")
    @Expose
    private String PeakBandwidthTime;

    /**
    * Peak bandwidth in Mbps.
    */
    @SerializedName("PeakBandwidth")
    @Expose
    private Float PeakBandwidth;

    /**
    * Time point of 95th percentile bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("P95PeakBandwidthTime")
    @Expose
    private String P95PeakBandwidthTime;

    /**
    * 95th percentile bandwidth in Mbps.
    */
    @SerializedName("P95PeakBandwidth")
    @Expose
    private Float P95PeakBandwidth;

    /**
    * Total traffic in MB.
    */
    @SerializedName("SumFlux")
    @Expose
    private Float SumFlux;

    /**
    * Detailed data information.
    */
    @SerializedName("DataInfoList")
    @Expose
    private BillDataInfo [] DataInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Time point of peak bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return PeakBandwidthTime Time point of peak bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getPeakBandwidthTime() {
        return this.PeakBandwidthTime;
    }

    /**
     * Set Time point of peak bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
     * @param PeakBandwidthTime Time point of peak bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setPeakBandwidthTime(String PeakBandwidthTime) {
        this.PeakBandwidthTime = PeakBandwidthTime;
    }

    /**
     * Get Peak bandwidth in Mbps. 
     * @return PeakBandwidth Peak bandwidth in Mbps.
     */
    public Float getPeakBandwidth() {
        return this.PeakBandwidth;
    }

    /**
     * Set Peak bandwidth in Mbps.
     * @param PeakBandwidth Peak bandwidth in Mbps.
     */
    public void setPeakBandwidth(Float PeakBandwidth) {
        this.PeakBandwidth = PeakBandwidth;
    }

    /**
     * Get Time point of 95th percentile bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return P95PeakBandwidthTime Time point of 95th percentile bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getP95PeakBandwidthTime() {
        return this.P95PeakBandwidthTime;
    }

    /**
     * Set Time point of 95th percentile bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
     * @param P95PeakBandwidthTime Time point of 95th percentile bandwidth value in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setP95PeakBandwidthTime(String P95PeakBandwidthTime) {
        this.P95PeakBandwidthTime = P95PeakBandwidthTime;
    }

    /**
     * Get 95th percentile bandwidth in Mbps. 
     * @return P95PeakBandwidth 95th percentile bandwidth in Mbps.
     */
    public Float getP95PeakBandwidth() {
        return this.P95PeakBandwidth;
    }

    /**
     * Set 95th percentile bandwidth in Mbps.
     * @param P95PeakBandwidth 95th percentile bandwidth in Mbps.
     */
    public void setP95PeakBandwidth(Float P95PeakBandwidth) {
        this.P95PeakBandwidth = P95PeakBandwidth;
    }

    /**
     * Get Total traffic in MB. 
     * @return SumFlux Total traffic in MB.
     */
    public Float getSumFlux() {
        return this.SumFlux;
    }

    /**
     * Set Total traffic in MB.
     * @param SumFlux Total traffic in MB.
     */
    public void setSumFlux(Float SumFlux) {
        this.SumFlux = SumFlux;
    }

    /**
     * Get Detailed data information. 
     * @return DataInfoList Detailed data information.
     */
    public BillDataInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set Detailed data information.
     * @param DataInfoList Detailed data information.
     */
    public void setDataInfoList(BillDataInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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
        this.setParamSimple(map, prefix + "PeakBandwidthTime", this.PeakBandwidthTime);
        this.setParamSimple(map, prefix + "PeakBandwidth", this.PeakBandwidth);
        this.setParamSimple(map, prefix + "P95PeakBandwidthTime", this.P95PeakBandwidthTime);
        this.setParamSimple(map, prefix + "P95PeakBandwidth", this.P95PeakBandwidth);
        this.setParamSimple(map, prefix + "SumFlux", this.SumFlux);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

