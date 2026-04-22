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

public class DescribeAPPDataDetailLineChartRequest extends AbstractModel {

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
app_minigame_num: Number of created mini games
app_online_miniapp_num: Number of available mini programs
app_miniapp_num: Number of created mini programs
app_related_corp_num: Mini program team data
app_online_minigame_num: Number of available mini games
app_active_device_num: Number of active devices
app_new_device_num: Number of new devices
    */
    @SerializedName("IndexIds")
    @Expose
    private String [] IndexIds;

    /**
    * Input parameter base64 string: {"BeginDate":"20251122","EndDate":"20251128"}
    */
    @SerializedName("QueryData")
    @Expose
    private String QueryData;

    /**
    * Superapp ID
    */
    @SerializedName("ApplicationIds")
    @Expose
    private String [] ApplicationIds;

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
app_minigame_num: Number of created mini games
app_online_miniapp_num: Number of available mini programs
app_miniapp_num: Number of created mini programs
app_related_corp_num: Mini program team data
app_online_minigame_num: Number of available mini games
app_active_device_num: Number of active devices
app_new_device_num: Number of new devices 
     * @return IndexIds IndexId (optional):
app_minigame_num: Number of created mini games
app_online_miniapp_num: Number of available mini programs
app_miniapp_num: Number of created mini programs
app_related_corp_num: Mini program team data
app_online_minigame_num: Number of available mini games
app_active_device_num: Number of active devices
app_new_device_num: Number of new devices
     */
    public String [] getIndexIds() {
        return this.IndexIds;
    }

    /**
     * Set IndexId (optional):
app_minigame_num: Number of created mini games
app_online_miniapp_num: Number of available mini programs
app_miniapp_num: Number of created mini programs
app_related_corp_num: Mini program team data
app_online_minigame_num: Number of available mini games
app_active_device_num: Number of active devices
app_new_device_num: Number of new devices
     * @param IndexIds IndexId (optional):
app_minigame_num: Number of created mini games
app_online_miniapp_num: Number of available mini programs
app_miniapp_num: Number of created mini programs
app_related_corp_num: Mini program team data
app_online_minigame_num: Number of available mini games
app_active_device_num: Number of active devices
app_new_device_num: Number of new devices
     */
    public void setIndexIds(String [] IndexIds) {
        this.IndexIds = IndexIds;
    }

    /**
     * Get Input parameter base64 string: {"BeginDate":"20251122","EndDate":"20251128"} 
     * @return QueryData Input parameter base64 string: {"BeginDate":"20251122","EndDate":"20251128"}
     */
    public String getQueryData() {
        return this.QueryData;
    }

    /**
     * Set Input parameter base64 string: {"BeginDate":"20251122","EndDate":"20251128"}
     * @param QueryData Input parameter base64 string: {"BeginDate":"20251122","EndDate":"20251128"}
     */
    public void setQueryData(String QueryData) {
        this.QueryData = QueryData;
    }

    /**
     * Get Superapp ID 
     * @return ApplicationIds Superapp ID
     */
    public String [] getApplicationIds() {
        return this.ApplicationIds;
    }

    /**
     * Set Superapp ID
     * @param ApplicationIds Superapp ID
     */
    public void setApplicationIds(String [] ApplicationIds) {
        this.ApplicationIds = ApplicationIds;
    }

    public DescribeAPPDataDetailLineChartRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAPPDataDetailLineChartRequest(DescribeAPPDataDetailLineChartRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.IndexIds != null) {
            this.IndexIds = new String[source.IndexIds.length];
            for (int i = 0; i < source.IndexIds.length; i++) {
                this.IndexIds[i] = new String(source.IndexIds[i]);
            }
        }
        if (source.QueryData != null) {
            this.QueryData = new String(source.QueryData);
        }
        if (source.ApplicationIds != null) {
            this.ApplicationIds = new String[source.ApplicationIds.length];
            for (int i = 0; i < source.ApplicationIds.length; i++) {
                this.ApplicationIds[i] = new String(source.ApplicationIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamArraySimple(map, prefix + "IndexIds.", this.IndexIds);
        this.setParamSimple(map, prefix + "QueryData", this.QueryData);
        this.setParamArraySimple(map, prefix + "ApplicationIds.", this.ApplicationIds);

    }
}

