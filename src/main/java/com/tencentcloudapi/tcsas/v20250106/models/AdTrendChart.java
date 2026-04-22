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

public class AdTrendChart extends AbstractModel {

    /**
    * Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EstimatedEarnings")
    @Expose
    private AnalysisData [] EstimatedEarnings;

    /**
    * Requests
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestsNumber")
    @Expose
    private AnalysisData [] RequestsNumber;

    /**
    * Impressions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Impressions")
    @Expose
    private AnalysisData [] Impressions;

    /**
    * Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ECPM")
    @Expose
    private AnalysisData [] ECPM;

    /**
    * Taps
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClicksNumber")
    @Expose
    private AnalysisData [] ClicksNumber;

    /**
     * Get Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EstimatedEarnings Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalysisData [] getEstimatedEarnings() {
        return this.EstimatedEarnings;
    }

    /**
     * Set Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EstimatedEarnings Estimated revenue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEstimatedEarnings(AnalysisData [] EstimatedEarnings) {
        this.EstimatedEarnings = EstimatedEarnings;
    }

    /**
     * Get Requests
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestsNumber Requests
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalysisData [] getRequestsNumber() {
        return this.RequestsNumber;
    }

    /**
     * Set Requests
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestsNumber Requests
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestsNumber(AnalysisData [] RequestsNumber) {
        this.RequestsNumber = RequestsNumber;
    }

    /**
     * Get Impressions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Impressions Impressions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalysisData [] getImpressions() {
        return this.Impressions;
    }

    /**
     * Set Impressions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Impressions Impressions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImpressions(AnalysisData [] Impressions) {
        this.Impressions = Impressions;
    }

    /**
     * Get Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ECPM Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalysisData [] getECPM() {
        return this.ECPM;
    }

    /**
     * Set Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ECPM Effective Cost Per Mille
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setECPM(AnalysisData [] ECPM) {
        this.ECPM = ECPM;
    }

    /**
     * Get Taps
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClicksNumber Taps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnalysisData [] getClicksNumber() {
        return this.ClicksNumber;
    }

    /**
     * Set Taps
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClicksNumber Taps
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClicksNumber(AnalysisData [] ClicksNumber) {
        this.ClicksNumber = ClicksNumber;
    }

    public AdTrendChart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdTrendChart(AdTrendChart source) {
        if (source.EstimatedEarnings != null) {
            this.EstimatedEarnings = new AnalysisData[source.EstimatedEarnings.length];
            for (int i = 0; i < source.EstimatedEarnings.length; i++) {
                this.EstimatedEarnings[i] = new AnalysisData(source.EstimatedEarnings[i]);
            }
        }
        if (source.RequestsNumber != null) {
            this.RequestsNumber = new AnalysisData[source.RequestsNumber.length];
            for (int i = 0; i < source.RequestsNumber.length; i++) {
                this.RequestsNumber[i] = new AnalysisData(source.RequestsNumber[i]);
            }
        }
        if (source.Impressions != null) {
            this.Impressions = new AnalysisData[source.Impressions.length];
            for (int i = 0; i < source.Impressions.length; i++) {
                this.Impressions[i] = new AnalysisData(source.Impressions[i]);
            }
        }
        if (source.ECPM != null) {
            this.ECPM = new AnalysisData[source.ECPM.length];
            for (int i = 0; i < source.ECPM.length; i++) {
                this.ECPM[i] = new AnalysisData(source.ECPM[i]);
            }
        }
        if (source.ClicksNumber != null) {
            this.ClicksNumber = new AnalysisData[source.ClicksNumber.length];
            for (int i = 0; i < source.ClicksNumber.length; i++) {
                this.ClicksNumber[i] = new AnalysisData(source.ClicksNumber[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EstimatedEarnings.", this.EstimatedEarnings);
        this.setParamArrayObj(map, prefix + "RequestsNumber.", this.RequestsNumber);
        this.setParamArrayObj(map, prefix + "Impressions.", this.Impressions);
        this.setParamArrayObj(map, prefix + "ECPM.", this.ECPM);
        this.setParamArrayObj(map, prefix + "ClicksNumber.", this.ClicksNumber);

    }
}

