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

public class DescribeReportDataResponse extends AbstractModel{

    /**
    * Domain name-level data details.
    */
    @SerializedName("DomainReport")
    @Expose
    private ReportData [] DomainReport;

    /**
    * Project-level data details
    */
    @SerializedName("ProjectReport")
    @Expose
    private ReportData [] ProjectReport;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Domain name-level data details. 
     * @return DomainReport Domain name-level data details.
     */
    public ReportData [] getDomainReport() {
        return this.DomainReport;
    }

    /**
     * Set Domain name-level data details.
     * @param DomainReport Domain name-level data details.
     */
    public void setDomainReport(ReportData [] DomainReport) {
        this.DomainReport = DomainReport;
    }

    /**
     * Get Project-level data details 
     * @return ProjectReport Project-level data details
     */
    public ReportData [] getProjectReport() {
        return this.ProjectReport;
    }

    /**
     * Set Project-level data details
     * @param ProjectReport Project-level data details
     */
    public void setProjectReport(ReportData [] ProjectReport) {
        this.ProjectReport = ProjectReport;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeReportDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReportDataResponse(DescribeReportDataResponse source) {
        if (source.DomainReport != null) {
            this.DomainReport = new ReportData[source.DomainReport.length];
            for (int i = 0; i < source.DomainReport.length; i++) {
                this.DomainReport[i] = new ReportData(source.DomainReport[i]);
            }
        }
        if (source.ProjectReport != null) {
            this.ProjectReport = new ReportData[source.ProjectReport.length];
            for (int i = 0; i < source.ProjectReport.length; i++) {
                this.ProjectReport[i] = new ReportData(source.ProjectReport[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomainReport.", this.DomainReport);
        this.setParamArrayObj(map, prefix + "ProjectReport.", this.ProjectReport);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

