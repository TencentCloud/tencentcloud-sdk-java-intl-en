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
    * Query the start time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query the end time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
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
`mainland`: Regions within the Chinese mainland
`overseas`: Regions outside the Chinese mainland
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
     * Get Query the start time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month. 
     * @return StartTime Query the start time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query the start time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
     * @param StartTime Query the start time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query the end time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month. 
     * @return EndTime Query the end time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query the end time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
     * @param EndTime Query the end time in the format of `yyyy-MM-dd`
If the report type is `daily`, the start time and end time must be of the same day.
If the report type is `weekly`, the start time must be Monday and the end time must be the Sunday of the same week.
If the report type is `monthly`, the start time must be the first day of the month and the end time must be the last day of the same month.
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
`mainland`: Regions within the Chinese mainland
`overseas`: Regions outside the Chinese mainland 
     * @return Area Domain name acceleration region
`mainland`: Regions within the Chinese mainland
`overseas`: Regions outside the Chinese mainland
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Domain name acceleration region
`mainland`: Regions within the Chinese mainland
`overseas`: Regions outside the Chinese mainland
     * @param Area Domain name acceleration region
`mainland`: Regions within the Chinese mainland
`overseas`: Regions outside the Chinese mainland
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

    public DescribeReportDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportDataRequest(DescribeReportDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ReportType != null) {
            this.ReportType = new String(source.ReportType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
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

