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

public class DescribeMNPReportDataLineChartRequest extends AbstractModel {

    /**
    * Mini program appid
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Tenant ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Fixed value: mnp_data_analysis
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * IndexId (optional):
active_device_num: Active users
new_device_num: New users
total_user_num: Total users
share_num: Number of shares
miniapp_open_num: Number of opens
avg_device_open_num: Average opens per user
avg_device_open_duration: Average duration per user
avg_count_open_duration: Average duration per session
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
    * Input parameter base64 string: {"DataType":"1","Platform":0,"BeginDate":20251118,"EndDate":20251124}
    */
    @SerializedName("QueryData")
    @Expose
    private String QueryData;

    /**
     * Get Mini program appid 
     * @return MNPId Mini program appid
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program appid
     * @param MNPId Mini program appid
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

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
     * Get Fixed value: mnp_data_analysis 
     * @return ReportId Fixed value: mnp_data_analysis
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set Fixed value: mnp_data_analysis
     * @param ReportId Fixed value: mnp_data_analysis
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get IndexId (optional):
active_device_num: Active users
new_device_num: New users
total_user_num: Total users
share_num: Number of shares
miniapp_open_num: Number of opens
avg_device_open_num: Average opens per user
avg_device_open_duration: Average duration per user
avg_count_open_duration: Average duration per session 
     * @return IndexId IndexId (optional):
active_device_num: Active users
new_device_num: New users
total_user_num: Total users
share_num: Number of shares
miniapp_open_num: Number of opens
avg_device_open_num: Average opens per user
avg_device_open_duration: Average duration per user
avg_count_open_duration: Average duration per session
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set IndexId (optional):
active_device_num: Active users
new_device_num: New users
total_user_num: Total users
share_num: Number of shares
miniapp_open_num: Number of opens
avg_device_open_num: Average opens per user
avg_device_open_duration: Average duration per user
avg_count_open_duration: Average duration per session
     * @param IndexId IndexId (optional):
active_device_num: Active users
new_device_num: New users
total_user_num: Total users
share_num: Number of shares
miniapp_open_num: Number of opens
avg_device_open_num: Average opens per user
avg_device_open_duration: Average duration per user
avg_count_open_duration: Average duration per session
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get Input parameter base64 string: {"DataType":"1","Platform":0,"BeginDate":20251118,"EndDate":20251124} 
     * @return QueryData Input parameter base64 string: {"DataType":"1","Platform":0,"BeginDate":20251118,"EndDate":20251124}
     */
    public String getQueryData() {
        return this.QueryData;
    }

    /**
     * Set Input parameter base64 string: {"DataType":"1","Platform":0,"BeginDate":20251118,"EndDate":20251124}
     * @param QueryData Input parameter base64 string: {"DataType":"1","Platform":0,"BeginDate":20251118,"EndDate":20251124}
     */
    public void setQueryData(String QueryData) {
        this.QueryData = QueryData;
    }

    public DescribeMNPReportDataLineChartRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPReportDataLineChartRequest(DescribeMNPReportDataLineChartRequest source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
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
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);
        this.setParamSimple(map, prefix + "QueryData", this.QueryData);

    }
}

