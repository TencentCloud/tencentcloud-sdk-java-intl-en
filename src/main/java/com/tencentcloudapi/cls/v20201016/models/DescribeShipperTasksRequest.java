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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShipperTasksRequest extends AbstractModel {

    /**
    * Shipping rule ID
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * Query start timestamp in milliseconds, which can be within the last three days
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end timestamp in milliseconds
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Shipping rule ID 
     * @return ShipperId Shipping rule ID
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set Shipping rule ID
     * @param ShipperId Shipping rule ID
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get Query start timestamp in milliseconds, which can be within the last three days 
     * @return StartTime Query start timestamp in milliseconds, which can be within the last three days
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start timestamp in milliseconds, which can be within the last three days
     * @param StartTime Query start timestamp in milliseconds, which can be within the last three days
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end timestamp in milliseconds 
     * @return EndTime Query end timestamp in milliseconds
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end timestamp in milliseconds
     * @param EndTime Query end timestamp in milliseconds
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeShipperTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShipperTasksRequest(DescribeShipperTasksRequest source) {
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

