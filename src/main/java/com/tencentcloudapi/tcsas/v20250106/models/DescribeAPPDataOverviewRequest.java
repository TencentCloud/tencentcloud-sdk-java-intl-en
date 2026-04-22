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

public class DescribeAPPDataOverviewRequest extends AbstractModel {

    /**
    * Tenant ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Start time in YYYYMMDD format
    */
    @SerializedName("DataTime")
    @Expose
    private Long DataTime;

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
     * Get Start time in YYYYMMDD format 
     * @return DataTime Start time in YYYYMMDD format
     */
    public Long getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Start time in YYYYMMDD format
     * @param DataTime Start time in YYYYMMDD format
     */
    public void setDataTime(Long DataTime) {
        this.DataTime = DataTime;
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

    public DescribeAPPDataOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAPPDataOverviewRequest(DescribeAPPDataOverviewRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.DataTime != null) {
            this.DataTime = new Long(source.DataTime);
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
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);
        this.setParamArraySimple(map, prefix + "ApplicationIds.", this.ApplicationIds);

    }
}

