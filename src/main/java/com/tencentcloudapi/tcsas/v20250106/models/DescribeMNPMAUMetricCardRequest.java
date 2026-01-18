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

public class DescribeMNPMAUMetricCardRequest extends AbstractModel {

    /**
    * Start time in YYYYMMDD format
    */
    @SerializedName("SourceMonth")
    @Expose
    private Long SourceMonth;

    /**
    * Type: 0 Non-production data, 1 Production data 
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
    * Tenant ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * End time in YYYYMMDD format
    */
    @SerializedName("TargetMonth")
    @Expose
    private Long TargetMonth;

    /**
    * Superapp ID starting with App
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Mini program appid, required. When provided, the query is performed based on the mini program.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program team ID, required. When provided, the query is performed based on the mini program team.
    */
    @SerializedName("MNPTeamId")
    @Expose
    private Long MNPTeamId;

    /**
     * Get Start time in YYYYMMDD format 
     * @return SourceMonth Start time in YYYYMMDD format
     */
    public Long getSourceMonth() {
        return this.SourceMonth;
    }

    /**
     * Set Start time in YYYYMMDD format
     * @param SourceMonth Start time in YYYYMMDD format
     */
    public void setSourceMonth(Long SourceMonth) {
        this.SourceMonth = SourceMonth;
    }

    /**
     * Get Type: 0 Non-production data, 1 Production data  
     * @return DataType Type: 0 Non-production data, 1 Production data 
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set Type: 0 Non-production data, 1 Production data 
     * @param DataType Type: 0 Non-production data, 1 Production data 
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
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
     * Get End time in YYYYMMDD format 
     * @return TargetMonth End time in YYYYMMDD format
     */
    public Long getTargetMonth() {
        return this.TargetMonth;
    }

    /**
     * Set End time in YYYYMMDD format
     * @param TargetMonth End time in YYYYMMDD format
     */
    public void setTargetMonth(Long TargetMonth) {
        this.TargetMonth = TargetMonth;
    }

    /**
     * Get Superapp ID starting with App 
     * @return ApplicationId Superapp ID starting with App
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Superapp ID starting with App
     * @param ApplicationId Superapp ID starting with App
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Mini program appid, required. When provided, the query is performed based on the mini program. 
     * @return MNPId Mini program appid, required. When provided, the query is performed based on the mini program.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program appid, required. When provided, the query is performed based on the mini program.
     * @param MNPId Mini program appid, required. When provided, the query is performed based on the mini program.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program team ID, required. When provided, the query is performed based on the mini program team. 
     * @return MNPTeamId Mini program team ID, required. When provided, the query is performed based on the mini program team.
     */
    public Long getMNPTeamId() {
        return this.MNPTeamId;
    }

    /**
     * Set Mini program team ID, required. When provided, the query is performed based on the mini program team.
     * @param MNPTeamId Mini program team ID, required. When provided, the query is performed based on the mini program team.
     */
    public void setMNPTeamId(Long MNPTeamId) {
        this.MNPTeamId = MNPTeamId;
    }

    public DescribeMNPMAUMetricCardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPMAUMetricCardRequest(DescribeMNPMAUMetricCardRequest source) {
        if (source.SourceMonth != null) {
            this.SourceMonth = new Long(source.SourceMonth);
        }
        if (source.DataType != null) {
            this.DataType = new Long(source.DataType);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.TargetMonth != null) {
            this.TargetMonth = new Long(source.TargetMonth);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPTeamId != null) {
            this.MNPTeamId = new Long(source.MNPTeamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMonth", this.SourceMonth);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "TargetMonth", this.TargetMonth);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPTeamId", this.MNPTeamId);

    }
}

