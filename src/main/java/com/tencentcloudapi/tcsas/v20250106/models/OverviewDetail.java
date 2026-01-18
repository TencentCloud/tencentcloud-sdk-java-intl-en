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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewDetail extends AbstractModel {

    /**
    * Time
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
    * Name
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Category
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Estimated revenue
    */
    @SerializedName("EstimatedEarnings")
    @Expose
    private String EstimatedEarnings;

    /**
    * Requests
    */
    @SerializedName("RequestsNumber")
    @Expose
    private Long RequestsNumber;

    /**
    * Impressions
    */
    @SerializedName("Impressions")
    @Expose
    private Long Impressions;

    /**
    * Effective Cost Per Mille
    */
    @SerializedName("ECPM")
    @Expose
    private String ECPM;

    /**
    * Taps
    */
    @SerializedName("ClicksNumber")
    @Expose
    private Long ClicksNumber;

    /**
     * Get Time 
     * @return DataTime Time
     */
    public String getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Time
     * @param DataTime Time
     */
    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
    }

    /**
     * Get Name 
     * @return MNPName Name
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Name
     * @param MNPName Name
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Category 
     * @return MNPType Category
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Category
     * @param MNPType Category
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Estimated revenue 
     * @return EstimatedEarnings Estimated revenue
     */
    public String getEstimatedEarnings() {
        return this.EstimatedEarnings;
    }

    /**
     * Set Estimated revenue
     * @param EstimatedEarnings Estimated revenue
     */
    public void setEstimatedEarnings(String EstimatedEarnings) {
        this.EstimatedEarnings = EstimatedEarnings;
    }

    /**
     * Get Requests 
     * @return RequestsNumber Requests
     */
    public Long getRequestsNumber() {
        return this.RequestsNumber;
    }

    /**
     * Set Requests
     * @param RequestsNumber Requests
     */
    public void setRequestsNumber(Long RequestsNumber) {
        this.RequestsNumber = RequestsNumber;
    }

    /**
     * Get Impressions 
     * @return Impressions Impressions
     */
    public Long getImpressions() {
        return this.Impressions;
    }

    /**
     * Set Impressions
     * @param Impressions Impressions
     */
    public void setImpressions(Long Impressions) {
        this.Impressions = Impressions;
    }

    /**
     * Get Effective Cost Per Mille 
     * @return ECPM Effective Cost Per Mille
     */
    public String getECPM() {
        return this.ECPM;
    }

    /**
     * Set Effective Cost Per Mille
     * @param ECPM Effective Cost Per Mille
     */
    public void setECPM(String ECPM) {
        this.ECPM = ECPM;
    }

    /**
     * Get Taps 
     * @return ClicksNumber Taps
     */
    public Long getClicksNumber() {
        return this.ClicksNumber;
    }

    /**
     * Set Taps
     * @param ClicksNumber Taps
     */
    public void setClicksNumber(Long ClicksNumber) {
        this.ClicksNumber = ClicksNumber;
    }

    public OverviewDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewDetail(OverviewDetail source) {
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.EstimatedEarnings != null) {
            this.EstimatedEarnings = new String(source.EstimatedEarnings);
        }
        if (source.RequestsNumber != null) {
            this.RequestsNumber = new Long(source.RequestsNumber);
        }
        if (source.Impressions != null) {
            this.Impressions = new Long(source.Impressions);
        }
        if (source.ECPM != null) {
            this.ECPM = new String(source.ECPM);
        }
        if (source.ClicksNumber != null) {
            this.ClicksNumber = new Long(source.ClicksNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "EstimatedEarnings", this.EstimatedEarnings);
        this.setParamSimple(map, prefix + "RequestsNumber", this.RequestsNumber);
        this.setParamSimple(map, prefix + "Impressions", this.Impressions);
        this.setParamSimple(map, prefix + "ECPM", this.ECPM);
        this.setParamSimple(map, prefix + "ClicksNumber", this.ClicksNumber);

    }
}

