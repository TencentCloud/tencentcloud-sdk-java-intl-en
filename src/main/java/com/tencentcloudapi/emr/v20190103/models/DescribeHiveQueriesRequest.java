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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHiveQueriesRequest extends AbstractModel {

    /**
    * The cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The start time in seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time in seconds. EndTime-StartTime should not exceed one day's duration, which is 86400 seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Starting offset for pagination. Start value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page size. Valid range: [1,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The cluster ID. 
     * @return InstanceId The cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The cluster ID.
     * @param InstanceId The cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The start time in seconds. 
     * @return StartTime The start time in seconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time in seconds.
     * @param StartTime The start time in seconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time in seconds. EndTime-StartTime should not exceed one day's duration, which is 86400 seconds. 
     * @return EndTime The end time in seconds. EndTime-StartTime should not exceed one day's duration, which is 86400 seconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time in seconds. EndTime-StartTime should not exceed one day's duration, which is 86400 seconds.
     * @param EndTime The end time in seconds. EndTime-StartTime should not exceed one day's duration, which is 86400 seconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Starting offset for pagination. Start value: 0 
     * @return Offset Starting offset for pagination. Start value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset for pagination. Start value: 0
     * @param Offset Starting offset for pagination. Start value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page size. Valid range: [1,100] 
     * @return Limit Page size. Valid range: [1,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size. Valid range: [1,100]
     * @param Limit Page size. Valid range: [1,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeHiveQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHiveQueriesRequest(DescribeHiveQueriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

