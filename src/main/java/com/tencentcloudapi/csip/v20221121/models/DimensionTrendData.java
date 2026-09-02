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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionTrendData extends AbstractModel {

    /**
    * Dimension ID
Enumeration values:
risk_governance: Risk Governance
threat_detection: threat detection
    */
    @SerializedName("DimensionId")
    @Expose
    private String DimensionId;

    /**
    * Daily data point
    */
    @SerializedName("DataPoints")
    @Expose
    private TrendDataPoint [] DataPoints;

    /**
     * Get Dimension ID
Enumeration values:
risk_governance: Risk Governance
threat_detection: threat detection 
     * @return DimensionId Dimension ID
Enumeration values:
risk_governance: Risk Governance
threat_detection: threat detection
     */
    public String getDimensionId() {
        return this.DimensionId;
    }

    /**
     * Set Dimension ID
Enumeration values:
risk_governance: Risk Governance
threat_detection: threat detection
     * @param DimensionId Dimension ID
Enumeration values:
risk_governance: Risk Governance
threat_detection: threat detection
     */
    public void setDimensionId(String DimensionId) {
        this.DimensionId = DimensionId;
    }

    /**
     * Get Daily data point 
     * @return DataPoints Daily data point
     */
    public TrendDataPoint [] getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set Daily data point
     * @param DataPoints Daily data point
     */
    public void setDataPoints(TrendDataPoint [] DataPoints) {
        this.DataPoints = DataPoints;
    }

    public DimensionTrendData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionTrendData(DimensionTrendData source) {
        if (source.DimensionId != null) {
            this.DimensionId = new String(source.DimensionId);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new TrendDataPoint[source.DataPoints.length];
            for (int i = 0; i < source.DataPoints.length; i++) {
                this.DataPoints[i] = new TrendDataPoint(source.DataPoints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DimensionId", this.DimensionId);
        this.setParamArrayObj(map, prefix + "DataPoints.", this.DataPoints);

    }
}

