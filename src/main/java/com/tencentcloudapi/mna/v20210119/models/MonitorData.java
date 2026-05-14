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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorData extends AbstractModel {

    /**
    * Time point: s
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Business Metric (bps/ms/%)
    */
    @SerializedName("BusinessMetrics")
    @Expose
    private Float BusinessMetrics;

    /**
    * Network interface status info
    */
    @SerializedName("SlotNetInfo")
    @Expose
    private SlotNetInfo [] SlotNetInfo;

    /**
     * Get Time point: s 
     * @return Time Time point: s
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time point: s
     * @param Time Time point: s
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Business Metric (bps/ms/%) 
     * @return BusinessMetrics Business Metric (bps/ms/%)
     */
    public Float getBusinessMetrics() {
        return this.BusinessMetrics;
    }

    /**
     * Set Business Metric (bps/ms/%)
     * @param BusinessMetrics Business Metric (bps/ms/%)
     */
    public void setBusinessMetrics(Float BusinessMetrics) {
        this.BusinessMetrics = BusinessMetrics;
    }

    /**
     * Get Network interface status info 
     * @return SlotNetInfo Network interface status info
     */
    public SlotNetInfo [] getSlotNetInfo() {
        return this.SlotNetInfo;
    }

    /**
     * Set Network interface status info
     * @param SlotNetInfo Network interface status info
     */
    public void setSlotNetInfo(SlotNetInfo [] SlotNetInfo) {
        this.SlotNetInfo = SlotNetInfo;
    }

    public MonitorData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorData(MonitorData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.BusinessMetrics != null) {
            this.BusinessMetrics = new Float(source.BusinessMetrics);
        }
        if (source.SlotNetInfo != null) {
            this.SlotNetInfo = new SlotNetInfo[source.SlotNetInfo.length];
            for (int i = 0; i < source.SlotNetInfo.length; i++) {
                this.SlotNetInfo[i] = new SlotNetInfo(source.SlotNetInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "BusinessMetrics", this.BusinessMetrics);
        this.setParamArrayObj(map, prefix + "SlotNetInfo.", this.SlotNetInfo);

    }
}

