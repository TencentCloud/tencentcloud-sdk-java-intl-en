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
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The start time
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The average execution time threshold of slow query in microseconds
    */
    @SerializedName("MinQueryTime")
    @Expose
    private Long MinQueryTime;

    /**
    * Number of slow queries displayed per page. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Slow query offset, which is an integral multiple of `Limit`.
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
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The start time 
     * @return BeginTime The start time
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time
     * @param BeginTime The start time
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time 
     * @return EndTime The end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time
     * @param EndTime The end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The average execution time threshold of slow query in microseconds 
     * @return MinQueryTime The average execution time threshold of slow query in microseconds
     */
    public Long getMinQueryTime() {
        return this.MinQueryTime;
    }

    /**
     * Set The average execution time threshold of slow query in microseconds
     * @param MinQueryTime The average execution time threshold of slow query in microseconds
     */
    public void setMinQueryTime(Long MinQueryTime) {
        this.MinQueryTime = MinQueryTime;
    }

    /**
     * Get Number of slow queries displayed per page. Default value: `20`. 
     * @return Limit Number of slow queries displayed per page. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of slow queries displayed per page. Default value: `20`.
     * @param Limit Number of slow queries displayed per page. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Slow query offset, which is an integral multiple of `Limit`. 
     * @return Offset Slow query offset, which is an integral multiple of `Limit`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Slow query offset, which is an integral multiple of `Limit`.
     * @param Offset Slow query offset, which is an integral multiple of `Limit`.
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

