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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageSummaryDistribution extends AbstractModel {

    /**
    * Data item.
    */
    @SerializedName("MetricItem")
    @Expose
    private String MetricItem;

    /**
    * Data item description.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Sampling value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Dps")
    @Expose
    private Dps [] Dps;

    /**
     * Get Data item. 
     * @return MetricItem Data item.
     */
    public String getMetricItem() {
        return this.MetricItem;
    }

    /**
     * Set Data item.
     * @param MetricItem Data item.
     */
    public void setMetricItem(String MetricItem) {
        this.MetricItem = MetricItem;
    }

    /**
     * Get Data item description. 
     * @return MetricName Data item description.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Data item description.
     * @param MetricName Data item description.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Sampling value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Dps Sampling value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Dps [] getDps() {
        return this.Dps;
    }

    /**
     * Set Sampling value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Dps Sampling value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDps(Dps [] Dps) {
        this.Dps = Dps;
    }

    public StorageSummaryDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageSummaryDistribution(StorageSummaryDistribution source) {
        if (source.MetricItem != null) {
            this.MetricItem = new String(source.MetricItem);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Dps != null) {
            this.Dps = new Dps[source.Dps.length];
            for (int i = 0; i < source.Dps.length; i++) {
                this.Dps[i] = new Dps(source.Dps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricItem", this.MetricItem);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Dps.", this.Dps);

    }
}

