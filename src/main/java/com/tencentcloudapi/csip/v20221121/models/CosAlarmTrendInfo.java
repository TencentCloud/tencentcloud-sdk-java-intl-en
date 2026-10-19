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

public class CosAlarmTrendInfo extends AbstractModel {

    /**
    * Current date in string format
    */
    @SerializedName("CurrentDateStr")
    @Expose
    private String CurrentDateStr;

    /**
    * Total count for the current date
    */
    @SerializedName("CurrentDayCount")
    @Expose
    private Long CurrentDayCount;

    /**
    * Alarm category details on the day
    */
    @SerializedName("CurrentDayOverView")
    @Expose
    private CosRiskInfo [] CurrentDayOverView;

    /**
     * Get Current date in string format 
     * @return CurrentDateStr Current date in string format
     */
    public String getCurrentDateStr() {
        return this.CurrentDateStr;
    }

    /**
     * Set Current date in string format
     * @param CurrentDateStr Current date in string format
     */
    public void setCurrentDateStr(String CurrentDateStr) {
        this.CurrentDateStr = CurrentDateStr;
    }

    /**
     * Get Total count for the current date 
     * @return CurrentDayCount Total count for the current date
     */
    public Long getCurrentDayCount() {
        return this.CurrentDayCount;
    }

    /**
     * Set Total count for the current date
     * @param CurrentDayCount Total count for the current date
     */
    public void setCurrentDayCount(Long CurrentDayCount) {
        this.CurrentDayCount = CurrentDayCount;
    }

    /**
     * Get Alarm category details on the day 
     * @return CurrentDayOverView Alarm category details on the day
     */
    public CosRiskInfo [] getCurrentDayOverView() {
        return this.CurrentDayOverView;
    }

    /**
     * Set Alarm category details on the day
     * @param CurrentDayOverView Alarm category details on the day
     */
    public void setCurrentDayOverView(CosRiskInfo [] CurrentDayOverView) {
        this.CurrentDayOverView = CurrentDayOverView;
    }

    public CosAlarmTrendInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAlarmTrendInfo(CosAlarmTrendInfo source) {
        if (source.CurrentDateStr != null) {
            this.CurrentDateStr = new String(source.CurrentDateStr);
        }
        if (source.CurrentDayCount != null) {
            this.CurrentDayCount = new Long(source.CurrentDayCount);
        }
        if (source.CurrentDayOverView != null) {
            this.CurrentDayOverView = new CosRiskInfo[source.CurrentDayOverView.length];
            for (int i = 0; i < source.CurrentDayOverView.length; i++) {
                this.CurrentDayOverView[i] = new CosRiskInfo(source.CurrentDayOverView[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentDateStr", this.CurrentDateStr);
        this.setParamSimple(map, prefix + "CurrentDayCount", this.CurrentDayCount);
        this.setParamArrayObj(map, prefix + "CurrentDayOverView.", this.CurrentDayOverView);

    }
}

