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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskByStatus extends AbstractModel {

    /**
    * Statistical Value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CountGroup")
    @Expose
    private String CountGroup;

    /**
    * DateNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ShowTimeGroup")
    @Expose
    private String ShowTimeGroup;

    /**
    * StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 1
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Statistical Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CountGroup Statistical Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCountGroup() {
        return this.CountGroup;
    }

    /**
     * Set Statistical Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CountGroup Statistical Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCountGroup(String CountGroup) {
        this.CountGroup = CountGroup;
    }

    /**
     * Get DateNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ShowTimeGroup DateNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getShowTimeGroup() {
        return this.ShowTimeGroup;
    }

    /**
     * Set DateNote: This field may return null, indicating that no valid value can be obtained.
     * @param ShowTimeGroup DateNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setShowTimeGroup(String ShowTimeGroup) {
        this.ShowTimeGroup = ShowTimeGroup;
    }

    /**
     * Get StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Status StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param Status StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleUnit Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleUnit Cycle Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 1 
     * @return ReportTime 1
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 1
     * @param ReportTime 1
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get 1 
     * @return Count 1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 1
     * @param Count 1
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public TaskByStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskByStatus(TaskByStatus source) {
        if (source.CountGroup != null) {
            this.CountGroup = new String(source.CountGroup);
        }
        if (source.ShowTimeGroup != null) {
            this.ShowTimeGroup = new String(source.ShowTimeGroup);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountGroup", this.CountGroup);
        this.setParamSimple(map, prefix + "ShowTimeGroup", this.ShowTimeGroup);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

