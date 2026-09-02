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

public class CycleScanConf extends AbstractModel {

    /**
    * <p>Period scanning switch. 0: off, 1: on.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>Interval type for period scanning. Values:</p><ul><li>DAY: Every several days. For IntervalValueList, take the number of interval days (for example, ["1"] means every day)</li><li>WEEK: Specified weekdays. For IntervalValueList, take 1–7 (Monday–Sunday)</li><li>MONTH: Specified date per month. For IntervalValueList, take 1–31</li></ul>
    */
    @SerializedName("IntervalType")
    @Expose
    private String IntervalType;

    /**
    * <p>Period value list. The meaning varies with IntervalType:</p><ul><li>IntervalType=DAY: every how many days. For example, ["1"] means every day</li><li>IntervalType=WEEK: day of the week, with values from 1 to 7 (Monday to Sunday)</li><li>IntervalType=MONTH: day of the month, with values from 1 to 31</li></ul>
    */
    @SerializedName("IntervalValueList")
    @Expose
    private String [] IntervalValueList;

    /**
    * <p>Scan period start time. Format: HH:mm. Example: 02:00.</p>
    */
    @SerializedName("ScanStart")
    @Expose
    private String ScanStart;

    /**
    * <p>Scan period end time. Format: HH:mm. For example, 06:00.</p>
    */
    @SerializedName("ScanEnd")
    @Expose
    private String ScanEnd;

    /**
     * Get <p>Period scanning switch. 0: off, 1: on.</p> 
     * @return Enable <p>Period scanning switch. 0: off, 1: on.</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Period scanning switch. 0: off, 1: on.</p>
     * @param Enable <p>Period scanning switch. 0: off, 1: on.</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Interval type for period scanning. Values:</p><ul><li>DAY: Every several days. For IntervalValueList, take the number of interval days (for example, ["1"] means every day)</li><li>WEEK: Specified weekdays. For IntervalValueList, take 1–7 (Monday–Sunday)</li><li>MONTH: Specified date per month. For IntervalValueList, take 1–31</li></ul> 
     * @return IntervalType <p>Interval type for period scanning. Values:</p><ul><li>DAY: Every several days. For IntervalValueList, take the number of interval days (for example, ["1"] means every day)</li><li>WEEK: Specified weekdays. For IntervalValueList, take 1–7 (Monday–Sunday)</li><li>MONTH: Specified date per month. For IntervalValueList, take 1–31</li></ul>
     */
    public String getIntervalType() {
        return this.IntervalType;
    }

    /**
     * Set <p>Interval type for period scanning. Values:</p><ul><li>DAY: Every several days. For IntervalValueList, take the number of interval days (for example, ["1"] means every day)</li><li>WEEK: Specified weekdays. For IntervalValueList, take 1–7 (Monday–Sunday)</li><li>MONTH: Specified date per month. For IntervalValueList, take 1–31</li></ul>
     * @param IntervalType <p>Interval type for period scanning. Values:</p><ul><li>DAY: Every several days. For IntervalValueList, take the number of interval days (for example, ["1"] means every day)</li><li>WEEK: Specified weekdays. For IntervalValueList, take 1–7 (Monday–Sunday)</li><li>MONTH: Specified date per month. For IntervalValueList, take 1–31</li></ul>
     */
    public void setIntervalType(String IntervalType) {
        this.IntervalType = IntervalType;
    }

    /**
     * Get <p>Period value list. The meaning varies with IntervalType:</p><ul><li>IntervalType=DAY: every how many days. For example, ["1"] means every day</li><li>IntervalType=WEEK: day of the week, with values from 1 to 7 (Monday to Sunday)</li><li>IntervalType=MONTH: day of the month, with values from 1 to 31</li></ul> 
     * @return IntervalValueList <p>Period value list. The meaning varies with IntervalType:</p><ul><li>IntervalType=DAY: every how many days. For example, ["1"] means every day</li><li>IntervalType=WEEK: day of the week, with values from 1 to 7 (Monday to Sunday)</li><li>IntervalType=MONTH: day of the month, with values from 1 to 31</li></ul>
     */
    public String [] getIntervalValueList() {
        return this.IntervalValueList;
    }

    /**
     * Set <p>Period value list. The meaning varies with IntervalType:</p><ul><li>IntervalType=DAY: every how many days. For example, ["1"] means every day</li><li>IntervalType=WEEK: day of the week, with values from 1 to 7 (Monday to Sunday)</li><li>IntervalType=MONTH: day of the month, with values from 1 to 31</li></ul>
     * @param IntervalValueList <p>Period value list. The meaning varies with IntervalType:</p><ul><li>IntervalType=DAY: every how many days. For example, ["1"] means every day</li><li>IntervalType=WEEK: day of the week, with values from 1 to 7 (Monday to Sunday)</li><li>IntervalType=MONTH: day of the month, with values from 1 to 31</li></ul>
     */
    public void setIntervalValueList(String [] IntervalValueList) {
        this.IntervalValueList = IntervalValueList;
    }

    /**
     * Get <p>Scan period start time. Format: HH:mm. Example: 02:00.</p> 
     * @return ScanStart <p>Scan period start time. Format: HH:mm. Example: 02:00.</p>
     */
    public String getScanStart() {
        return this.ScanStart;
    }

    /**
     * Set <p>Scan period start time. Format: HH:mm. Example: 02:00.</p>
     * @param ScanStart <p>Scan period start time. Format: HH:mm. Example: 02:00.</p>
     */
    public void setScanStart(String ScanStart) {
        this.ScanStart = ScanStart;
    }

    /**
     * Get <p>Scan period end time. Format: HH:mm. For example, 06:00.</p> 
     * @return ScanEnd <p>Scan period end time. Format: HH:mm. For example, 06:00.</p>
     */
    public String getScanEnd() {
        return this.ScanEnd;
    }

    /**
     * Set <p>Scan period end time. Format: HH:mm. For example, 06:00.</p>
     * @param ScanEnd <p>Scan period end time. Format: HH:mm. For example, 06:00.</p>
     */
    public void setScanEnd(String ScanEnd) {
        this.ScanEnd = ScanEnd;
    }

    public CycleScanConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CycleScanConf(CycleScanConf source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.IntervalType != null) {
            this.IntervalType = new String(source.IntervalType);
        }
        if (source.IntervalValueList != null) {
            this.IntervalValueList = new String[source.IntervalValueList.length];
            for (int i = 0; i < source.IntervalValueList.length; i++) {
                this.IntervalValueList[i] = new String(source.IntervalValueList[i]);
            }
        }
        if (source.ScanStart != null) {
            this.ScanStart = new String(source.ScanStart);
        }
        if (source.ScanEnd != null) {
            this.ScanEnd = new String(source.ScanEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "IntervalType", this.IntervalType);
        this.setParamArraySimple(map, prefix + "IntervalValueList.", this.IntervalValueList);
        this.setParamSimple(map, prefix + "ScanStart", this.ScanStart);
        this.setParamSimple(map, prefix + "ScanEnd", this.ScanEnd);

    }
}

