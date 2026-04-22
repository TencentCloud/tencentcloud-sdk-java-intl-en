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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalOverviewReportDetailRequest extends AbstractModel {

    /**
    * Tenant ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Parameter value: mnp_data_analysis
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * Parameter value: app_num|corp_num|miniapp_num|miniapp_visit_pv|minigame_num|minigame_visit_pv
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
    * Base64 string containing start and end time: {"BeginDate":20251111,"EndDate":20251125}
    */
    @SerializedName("QueryData")
    @Expose
    private String QueryData;

    /**
     * Get Tenant ID 
     * @return PlatformId Tenant ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Tenant ID
     * @param PlatformId Tenant ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Parameter value: mnp_data_analysis 
     * @return ReportId Parameter value: mnp_data_analysis
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set Parameter value: mnp_data_analysis
     * @param ReportId Parameter value: mnp_data_analysis
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get Parameter value: app_num|corp_num|miniapp_num|miniapp_visit_pv|minigame_num|minigame_visit_pv 
     * @return IndexId Parameter value: app_num|corp_num|miniapp_num|miniapp_visit_pv|minigame_num|minigame_visit_pv
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set Parameter value: app_num|corp_num|miniapp_num|miniapp_visit_pv|minigame_num|minigame_visit_pv
     * @param IndexId Parameter value: app_num|corp_num|miniapp_num|miniapp_visit_pv|minigame_num|minigame_visit_pv
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get Base64 string containing start and end time: {"BeginDate":20251111,"EndDate":20251125} 
     * @return QueryData Base64 string containing start and end time: {"BeginDate":20251111,"EndDate":20251125}
     */
    public String getQueryData() {
        return this.QueryData;
    }

    /**
     * Set Base64 string containing start and end time: {"BeginDate":20251111,"EndDate":20251125}
     * @param QueryData Base64 string containing start and end time: {"BeginDate":20251111,"EndDate":20251125}
     */
    public void setQueryData(String QueryData) {
        this.QueryData = QueryData;
    }

    public DescribeGlobalOverviewReportDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalOverviewReportDetailRequest(DescribeGlobalOverviewReportDetailRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.IndexId != null) {
            this.IndexId = new String(source.IndexId);
        }
        if (source.QueryData != null) {
            this.QueryData = new String(source.QueryData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);
        this.setParamSimple(map, prefix + "QueryData", this.QueryData);

    }
}

