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

public class DescribeGlobalOverviewDataSummaryRequest extends AbstractModel {

    /**
    * string: Overview
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * Tenant ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Date in YYYYMMDD format
    */
    @SerializedName("DataTime")
    @Expose
    private Long DataTime;

    /**
     * Get string: Overview 
     * @return DataType string: Overview
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set string: Overview
     * @param DataType string: Overview
     */
    public void setDataType(String DataType) {
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
     * Get Date in YYYYMMDD format 
     * @return DataTime Date in YYYYMMDD format
     */
    public Long getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Date in YYYYMMDD format
     * @param DataTime Date in YYYYMMDD format
     */
    public void setDataTime(Long DataTime) {
        this.DataTime = DataTime;
    }

    public DescribeGlobalOverviewDataSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalOverviewDataSummaryRequest(DescribeGlobalOverviewDataSummaryRequest source) {
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.DataTime != null) {
            this.DataTime = new Long(source.DataTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);

    }
}

