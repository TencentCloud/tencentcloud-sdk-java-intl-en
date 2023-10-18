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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedRetentionPolicy extends AbstractModel {

    /**
    * Retains one latest snapshot each day within `Days` days. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * Retains one latest snapshot each week within `Weeks` weeks. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weeks")
    @Expose
    private Long Weeks;

    /**
    * Retains one latest snapshot each month within `Months` months. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Months")
    @Expose
    private Long Months;

    /**
    * Retains one latest snapshot each year within `Years` years. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Years")
    @Expose
    private Long Years;

    /**
     * Get Retains one latest snapshot each day within `Days` days. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Days Retains one latest snapshot each day within `Days` days. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set Retains one latest snapshot each day within `Days` days. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Days Retains one latest snapshot each day within `Days` days. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get Retains one latest snapshot each week within `Weeks` weeks. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weeks Retains one latest snapshot each week within `Weeks` weeks. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeeks() {
        return this.Weeks;
    }

    /**
     * Set Retains one latest snapshot each week within `Weeks` weeks. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weeks Retains one latest snapshot each week within `Weeks` weeks. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeeks(Long Weeks) {
        this.Weeks = Weeks;
    }

    /**
     * Get Retains one latest snapshot each month within `Months` months. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Months Retains one latest snapshot each month within `Months` months. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMonths() {
        return this.Months;
    }

    /**
     * Set Retains one latest snapshot each month within `Months` months. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Months Retains one latest snapshot each month within `Months` months. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMonths(Long Months) {
        this.Months = Months;
    }

    /**
     * Get Retains one latest snapshot each year within `Years` years. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Years Retains one latest snapshot each year within `Years` years. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getYears() {
        return this.Years;
    }

    /**
     * Set Retains one latest snapshot each year within `Years` years. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Years Retains one latest snapshot each year within `Years` years. Value range: [0, 100].
Note: This field may return null, indicating that no valid values can be obtained.
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

