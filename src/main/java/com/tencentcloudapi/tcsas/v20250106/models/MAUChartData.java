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

public class MAUChartData extends AbstractModel {

    /**
    * Year and month: 2024-12
    */
    @SerializedName("DataTime")
    @Expose
    private Long DataTime;

    /**
    * Value
    */
    @SerializedName("MAUCount")
    @Expose
    private Long MAUCount;

    /**
    * Data update time, only available when MAUCount is greater than 0.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Year and month: 2024-12 
     * @return DataTime Year and month: 2024-12
     */
    public Long getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Year and month: 2024-12
     * @param DataTime Year and month: 2024-12
     */
    public void setDataTime(Long DataTime) {
        this.DataTime = DataTime;
    }

    /**
     * Get Value 
     * @return MAUCount Value
     */
    public Long getMAUCount() {
        return this.MAUCount;
    }

    /**
     * Set Value
     * @param MAUCount Value
     */
    public void setMAUCount(Long MAUCount) {
        this.MAUCount = MAUCount;
    }

    /**
     * Get Data update time, only available when MAUCount is greater than 0. 
     * @return UpdateTime Data update time, only available when MAUCount is greater than 0.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Data update time, only available when MAUCount is greater than 0.
     * @param UpdateTime Data update time, only available when MAUCount is greater than 0.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MAUChartData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MAUChartData(MAUChartData source) {
        if (source.DataTime != null) {
            this.DataTime = new Long(source.DataTime);
        }
        if (source.MAUCount != null) {
            this.MAUCount = new Long(source.MAUCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);
        this.setParamSimple(map, prefix + "MAUCount", this.MAUCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

