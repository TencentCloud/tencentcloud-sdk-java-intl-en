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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedRetentionPolicy extends AbstractModel {

    /**
    * Retains the latest snapshot of each day within the specified number of Days. value range: [0, 100].
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * Reserve the latest snapshot of each week for Weeks. value range: [0, 100].
    */
    @SerializedName("Weeks")
    @Expose
    private Long Weeks;

    /**
    * Reserve the latest snapshot of each month within Months Months. value range: [0, 100].
    */
    @SerializedName("Months")
    @Expose
    private Long Months;

    /**
    * Reserve the latest snapshot of each year within Years Years. value range: [0, 100].
    */
    @SerializedName("Years")
    @Expose
    private Long Years;

    /**
     * Get Retains the latest snapshot of each day within the specified number of Days. value range: [0, 100]. 
     * @return Days Retains the latest snapshot of each day within the specified number of Days. value range: [0, 100].
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set Retains the latest snapshot of each day within the specified number of Days. value range: [0, 100].
     * @param Days Retains the latest snapshot of each day within the specified number of Days. value range: [0, 100].
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get Reserve the latest snapshot of each week for Weeks. value range: [0, 100]. 
     * @return Weeks Reserve the latest snapshot of each week for Weeks. value range: [0, 100].
     */
    public Long getWeeks() {
        return this.Weeks;
    }

    /**
     * Set Reserve the latest snapshot of each week for Weeks. value range: [0, 100].
     * @param Weeks Reserve the latest snapshot of each week for Weeks. value range: [0, 100].
     */
    public void setWeeks(Long Weeks) {
        this.Weeks = Weeks;
    }

    /**
     * Get Reserve the latest snapshot of each month within Months Months. value range: [0, 100]. 
     * @return Months Reserve the latest snapshot of each month within Months Months. value range: [0, 100].
     */
    public Long getMonths() {
        return this.Months;
    }

    /**
     * Set Reserve the latest snapshot of each month within Months Months. value range: [0, 100].
     * @param Months Reserve the latest snapshot of each month within Months Months. value range: [0, 100].
     */
    public void setMonths(Long Months) {
        this.Months = Months;
    }

    /**
     * Get Reserve the latest snapshot of each year within Years Years. value range: [0, 100]. 
     * @return Years Reserve the latest snapshot of each year within Years Years. value range: [0, 100].
     */
    public Long getYears() {
        return this.Years;
    }

    /**
     * Set Reserve the latest snapshot of each year within Years Years. value range: [0, 100].
     * @param Years Reserve the latest snapshot of each year within Years Years. value range: [0, 100].
     */
    public void setYears(Long Years) {
        this.Years = Years;
    }

    public AdvancedRetentionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedRetentionPolicy(AdvancedRetentionPolicy source) {
        if (source.Days != null) {
            this.Days = new Long(source.Days);
        }
        if (source.Weeks != null) {
            this.Weeks = new Long(source.Weeks);
        }
        if (source.Months != null) {
            this.Months = new Long(source.Months);
        }
        if (source.Years != null) {
            this.Years = new Long(source.Years);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "Weeks", this.Weeks);
        this.setParamSimple(map, prefix + "Months", this.Months);
        this.setParamSimple(map, prefix + "Years", this.Years);

    }
}

