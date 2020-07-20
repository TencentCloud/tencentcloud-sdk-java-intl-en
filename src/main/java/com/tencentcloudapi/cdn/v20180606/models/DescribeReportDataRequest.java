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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReportDataRequest extends AbstractModel{

    /**
    * Query start time in the format of `yyyy-MM-dd`
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time in the format of `yyyy-MM-dd`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Report type
daily: daily report
weekly: weekly report (Monday to Sunday)
monthly: monthly report (calendar month)
    */
    @SerializedName("ReportType")
    @Expose
    private String ReportType;

    /**
    * Domain name acceleration region
mainland: in Mainland China
overseas: outside Mainland China
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of data entries. Default value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters by project ID
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
     * Get Query start time in the format of `yyyy-MM-dd` 
     * @return StartTime Query start time in the format of `yyyy-MM-dd`
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of `yyyy-MM-dd`
     * @param StartTime Query start time in the format of `yyyy-MM-dd`
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of `yyyy-MM-dd` 
     * @return EndTime Query end time in the format of `yyyy-MM-dd`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of `yyyy-MM-dd`
     * @param EndTime Query end time in the format of `yyyy-MM-dd`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Report type
daily: daily report
weekly: weekly report (Monday to Sunday)
monthly: monthly report (calendar month) 
     * @return ReportType Report type
daily: daily report
weekly: weekly report (Monday to Sunday)
monthly: monthly report (calendar month)
     */
    public String getReportType() {
        return this.ReportType;
    }

    /**
     * Set Report type
daily: daily report
weekly: weekly report (Monday to Sunday)
monthly: monthly report (calendar month)
     * @param ReportType Report type
daily: daily report
weekly: weekly report (Monday to Sunday)
monthly: monthly report (calendar month)
     */
    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get Domain name acceleration region
mainland: in Mainland China
overseas: outside Mainland China 
     * @return Area Domain name acceleration region
mainland: in Mainland China
overseas: outside Mainland China
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Domain name acceleration region
mainland: in Mainland China
overseas: outside Mainland China
     * @param Area Domain name acceleration region
mainland: in Mainland China
overseas: outside Mainland China
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of data entries. Default value: 1000. 
     * @return Limit Number of data entries. Default value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of data entries. Default value: 1000.
     * @param Limit Number of data entries. Default value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters by project ID 
     * @return Project Filters by project ID
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set Filters by project ID
     * @param Project Filters by project ID
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Project", this.Project);

    }
}

