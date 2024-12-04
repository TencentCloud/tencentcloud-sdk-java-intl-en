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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySlowLogRequest extends AbstractModel {

    /**
    * ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time of a slow query, with a maximum query span of 30 days.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of a slow query, with a maximum query span of 30 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Slow query threshold  in milliseconds
    */
    @SerializedName("MinQueryTime")
    @Expose
    private Long MinQueryTime;

    /**
    * Number of tasks output on each page. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, which is an integer multiple of Limit. Calculation formula: Offset = Limit x (Page number - 1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
 
     * @return InstanceId ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.

     * @param InstanceId ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time of a slow query, with a maximum query span of 30 days. 
     * @return BeginTime Start time of a slow query, with a maximum query span of 30 days.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of a slow query, with a maximum query span of 30 days.
     * @param BeginTime Start time of a slow query, with a maximum query span of 30 days.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of a slow query, with a maximum query span of 30 days. 
     * @return EndTime End time of a slow query, with a maximum query span of 30 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of a slow query, with a maximum query span of 30 days.
     * @param EndTime End time of a slow query, with a maximum query span of 30 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Slow query threshold  in milliseconds 
     * @return MinQueryTime Slow query threshold  in milliseconds
     */
    public Long getMinQueryTime() {
        return this.MinQueryTime;
    }

    /**
     * Set Slow query threshold  in milliseconds
     * @param MinQueryTime Slow query threshold  in milliseconds
     */
    public void setMinQueryTime(Long MinQueryTime) {
        this.MinQueryTime = MinQueryTime;
    }

    /**
     * Get Number of tasks output on each page. Default value: 20. Maximum value: 100. 
     * @return Limit Number of tasks output on each page. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of tasks output on each page. Default value: 20. Maximum value: 100.
     * @param Limit Number of tasks output on each page. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, which is an integer multiple of Limit. Calculation formula: Offset = Limit x (Page number - 1). 
     * @return Offset Pagination offset, which is an integer multiple of Limit. Calculation formula: Offset = Limit x (Page number - 1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, which is an integer multiple of Limit. Calculation formula: Offset = Limit x (Page number - 1).
     * @param Offset Pagination offset, which is an integer multiple of Limit. Calculation formula: Offset = Limit x (Page number - 1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeProxySlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxySlowLogRequest(DescribeProxySlowLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MinQueryTime != null) {
            this.MinQueryTime = new Long(source.MinQueryTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MinQueryTime", this.MinQueryTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

