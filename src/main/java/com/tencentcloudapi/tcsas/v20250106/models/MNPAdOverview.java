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

public class MNPAdOverview extends AbstractModel {

    /**
    * Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EstimatedEarnings")
    @Expose
    private String EstimatedEarnings;

    /**
    * Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ECPM")
    @Expose
    private String ECPM;

    /**
    * Requests
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestsNumber")
    @Expose
    private Long RequestsNumber;

    /**
    * Impressions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Impressions")
    @Expose
    private Long Impressions;

    /**
    * Taps
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClicksNumber")
    @Expose
    private Long ClicksNumber;

    /**
     * Get Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EstimatedEarnings Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEstimatedEarnings() {
        return this.EstimatedEarnings;
    }

    /**
     * Set Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EstimatedEarnings Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEstimatedEarnings(String EstimatedEarnings) {
        this.EstimatedEarnings = EstimatedEarnings;
    }

    /**
     * Get Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ECPM Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getECPM() {
        return this.ECPM;
    }

    /**
     * Set Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ECPM Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setECPM(String ECPM) {
        this.ECPM = ECPM;
    }

    /**
     * Get Requests
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestsNumber Requests
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRequestsNumber() {
        return this.RequestsNumber;
    }

    /**
     * Set Requests
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestsNumber Requests
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestsNumber(Long RequestsNumber) {
        this.RequestsNumber = RequestsNumber;
    }

    /**
     * Get Impressions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Impressions Impressions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getImpressions() {
        return this.Impressions;
    }

    /**
     * Set Impressions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Impressions Impressions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImpressions(Long Impressions) {
        this.Impressions = Impressions;
    }

    /**
     * Get Taps
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClicksNumber Taps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getClicksNumber() {
        return this.ClicksNumber;
    }

    /**
     * Set Taps
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClicksNumber Taps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClicksNumber(Long ClicksNumber) {
        this.ClicksNumber = ClicksNumber;
    }

    public MNPAdOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNPAdOverview(MNPAdOverview source) {
        if (source.EstimatedEarnings != null) {
            this.EstimatedEarnings = new String(source.EstimatedEarnings);
        }
        if (source.ECPM != null) {
            this.ECPM = new String(source.ECPM);
        }
        if (source.RequestsNumber != null) {
            this.RequestsNumber = new Long(source.RequestsNumber);
        }
        if (source.Impressions != null) {
            this.Impressions = new Long(source.Impressions);
        }
        if (source.ClicksNumber != null) {
            this.ClicksNumber = new Long(source.ClicksNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EstimatedEarnings", this.EstimatedEarnings);
        this.setParamSimple(map, prefix + "ECPM", this.ECPM);
        this.setParamSimple(map, prefix + "RequestsNumber", this.RequestsNumber);
        this.setParamSimple(map, prefix + "Impressions", this.Impressions);
        this.setParamSimple(map, prefix + "ClicksNumber", this.ClicksNumber);

    }
}

