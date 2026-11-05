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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MinimalRequestBodyTransferRate extends AbstractModel {

    /**
    * Minimum body transfer rate threshold. The measurement unit only supports bps.
    */
    @SerializedName("MinimalAvgTransferRateThreshold")
    @Expose
    private String MinimalAvgTransferRateThreshold;

    /**
    * Statistical time range for minimum body transfer rate. Valid values: <li>10s: 10 seconds;</li><li>30s: 30 seconds;</li><li>60s: 60 seconds;</li><li>120s: 120 seconds.</li>
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * Whether the minimum body transfer rate threshold is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get Minimum body transfer rate threshold. The measurement unit only supports bps. 
     * @return MinimalAvgTransferRateThreshold Minimum body transfer rate threshold. The measurement unit only supports bps.
     */
    public String getMinimalAvgTransferRateThreshold() {
        return this.MinimalAvgTransferRateThreshold;
    }

    /**
     * Set Minimum body transfer rate threshold. The measurement unit only supports bps.
     * @param MinimalAvgTransferRateThreshold Minimum body transfer rate threshold. The measurement unit only supports bps.
     */
    public void setMinimalAvgTransferRateThreshold(String MinimalAvgTransferRateThreshold) {
        this.MinimalAvgTransferRateThreshold = MinimalAvgTransferRateThreshold;
    }

    /**
     * Get Statistical time range for minimum body transfer rate. Valid values: <li>10s: 10 seconds;</li><li>30s: 30 seconds;</li><li>60s: 60 seconds;</li><li>120s: 120 seconds.</li> 
     * @return CountingPeriod Statistical time range for minimum body transfer rate. Valid values: <li>10s: 10 seconds;</li><li>30s: 30 seconds;</li><li>60s: 60 seconds;</li><li>120s: 120 seconds.</li>
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set Statistical time range for minimum body transfer rate. Valid values: <li>10s: 10 seconds;</li><li>30s: 30 seconds;</li><li>60s: 60 seconds;</li><li>120s: 120 seconds.</li>
     * @param CountingPeriod Statistical time range for minimum body transfer rate. Valid values: <li>10s: 10 seconds;</li><li>30s: 30 seconds;</li><li>60s: 60 seconds;</li><li>120s: 120 seconds.</li>
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get Whether the minimum body transfer rate threshold is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li> 
     * @return Enabled Whether the minimum body transfer rate threshold is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the minimum body transfer rate threshold is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     * @param Enabled Whether the minimum body transfer rate threshold is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public MinimalRequestBodyTransferRate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MinimalRequestBodyTransferRate(MinimalRequestBodyTransferRate source) {
        if (source.MinimalAvgTransferRateThreshold != null) {
            this.MinimalAvgTransferRateThreshold = new String(source.MinimalAvgTransferRateThreshold);
        }
        if (source.CountingPeriod != null) {
            this.CountingPeriod = new String(source.CountingPeriod);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinimalAvgTransferRateThreshold", this.MinimalAvgTransferRateThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

