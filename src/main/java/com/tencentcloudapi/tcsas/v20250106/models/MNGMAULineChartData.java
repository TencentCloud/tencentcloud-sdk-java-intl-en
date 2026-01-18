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

public class MNGMAULineChartData extends AbstractModel {

    /**
    * Year-month-date data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataTime")
    @Expose
    private Long DataTime;

    /**
    * MAU data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MAUCount")
    @Expose
    private Long MAUCount;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Year-month-date data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataTime Year-month-date data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Year-month-date data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataTime Year-month-date data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataTime(Long DataTime) {
        this.DataTime = DataTime;
    }

    /**
     * Get MAU data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MAUCount MAU data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMAUCount() {
        return this.MAUCount;
    }

    /**
     * Set MAU data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MAUCount MAU data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMAUCount(Long MAUCount) {
        this.MAUCount = MAUCount;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MNGMAULineChartData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNGMAULineChartData(MNGMAULineChartData source) {
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

