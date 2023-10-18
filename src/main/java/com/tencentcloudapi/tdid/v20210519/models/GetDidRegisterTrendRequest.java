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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDidRegisterTrendRequest extends AbstractModel {

    /**
    * The start date (as early as 2021-4-23).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end date (as early as 2021-4-23).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get The start date (as early as 2021-4-23). 
     * @return StartTime The start date (as early as 2021-4-23).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start date (as early as 2021-4-23).
     * @param StartTime The start date (as early as 2021-4-23).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end date (as early as 2021-4-23). 
     * @return EndTime The end date (as early as 2021-4-23).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end date (as early as 2021-4-23).
     * @param EndTime The end date (as early as 2021-4-23).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public GetDidRegisterTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDidRegisterTrendRequest(GetDidRegisterTrendRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

