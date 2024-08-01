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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineScaleInfoDetail extends AbstractModel {

    /**
    * Start time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Current statistical time period and engine specifications
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CU")
    @Expose
    private Long CU;

    /**
     * Get Start time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time of counting in the format of yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Current statistical time period and engine specifications
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CU Current statistical time period and engine specifications
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCU() {
        return this.CU;
    }

    /**
     * Set Current statistical time period and engine specifications
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CU Current statistical time period and engine specifications
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCU(Long CU) {
        this.CU = CU;
    }

    public DataEngineScaleInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineScaleInfoDetail(DataEngineScaleInfoDetail source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CU != null) {
            this.CU = new Long(source.CU);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CU", this.CU);

    }
}

