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

public class DescribeDataEnginesScaleDetailRequest extends AbstractModel {

    /**
    * Engine name list
    */
    @SerializedName("DataEngineNames")
    @Expose
    private String [] DataEngineNames;

    /**
    * Start time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Engine name list 
     * @return DataEngineNames Engine name list
     */
    public String [] getDataEngineNames() {
        return this.DataEngineNames;
    }

    /**
     * Set Engine name list
     * @param DataEngineNames Engine name list
     */
    public void setDataEngineNames(String [] DataEngineNames) {
        this.DataEngineNames = DataEngineNames;
    }

    /**
     * Get Start time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most. 
     * @return StartTime Start time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
     * @param StartTime Start time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most. 
     * @return EndTime End time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
     * @param EndTime End time, and the format is yyyy-MM-dd HH:mm:ss. It can query the records within one month at most.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeDataEnginesScaleDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEnginesScaleDetailRequest(DescribeDataEnginesScaleDetailRequest source) {
        if (source.DataEngineNames != null) {
            this.DataEngineNames = new String[source.DataEngineNames.length];
            for (int i = 0; i < source.DataEngineNames.length; i++) {
                this.DataEngineNames[i] = new String(source.DataEngineNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataEngineNames.", this.DataEngineNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

