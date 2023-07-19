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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogRequest extends AbstractModel{

    /**
    * ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time for prequerying a slow log
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time for prequerying a slow log
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The average execution time threshold of slow query  in microseconds
    */
    @SerializedName("MinQueryTime")
    @Expose
    private Long MinQueryTime;

    /**
    * Number of slow queries displayed per page. Default value: `20`. Value range:  [20,1000].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Slow query offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Node role. <ul><li>`Master`: Master node</li><li>`Slave`: Replica node</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

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
     * Get Start time for prequerying a slow log 
     * @return BeginTime Start time for prequerying a slow log
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time for prequerying a slow log
     * @param BeginTime Start time for prequerying a slow log
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time for prequerying a slow log 
     * @return EndTime End time for prequerying a slow log
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for prequerying a slow log
     * @param EndTime End time for prequerying a slow log
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The average execution time threshold of slow query  in microseconds 
     * @return MinQueryTime The average execution time threshold of slow query  in microseconds
     */
    public Long getMinQueryTime() {
        return this.MinQueryTime;
    }

    /**
     * Set The average execution time threshold of slow query  in microseconds
     * @param MinQueryTime The average execution time threshold of slow query  in microseconds
     */
    public void setMinQueryTime(Long MinQueryTime) {
        this.MinQueryTime = MinQueryTime;
    }

    /**
     * Get Number of slow queries displayed per page. Default value: `20`. Value range:  [20,1000]. 
     * @return Limit Number of slow queries displayed per page. Default value: `20`. Value range:  [20,1000].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of slow queries displayed per page. Default value: `20`. Value range:  [20,1000].
     * @param Limit Number of slow queries displayed per page. Default value: `20`. Value range:  [20,1000].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Slow query offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1). 
     * @return Offset Slow query offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Slow query offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     * @param Offset Slow query offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Node role. <ul><li>`Master`: Master node</li><li>`Slave`: Replica node</li></ul> 
     * @return Role Node role. <ul><li>`Master`: Master node</li><li>`Slave`: Replica node</li></ul>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Node role. <ul><li>`Master`: Master node</li><li>`Slave`: Replica node</li></ul>
     * @param Role Node role. <ul><li>`Master`: Master node</li><li>`Slave`: Replica node</li></ul>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public DescribeSlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogRequest(DescribeSlowLogRequest source) {
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
        if (source.Role != null) {
            this.Role = new String(source.Role);
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
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

