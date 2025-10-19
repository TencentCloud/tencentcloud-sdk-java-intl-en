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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogPatternsRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Slow log start time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Slow log end time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Threshold of slow log execution time in milliseconds. Minimum value: 100. Slow logs whose execution time exceeds the threshold will be returned.
    */
    @SerializedName("SlowMS")
    @Expose
    private Long SlowMS;

    /**
    * Offset. Minimum value: 0. Maximum value: 10000. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Minimum value: 1. Maximum value: 100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Slow log format, which can be JSON. If this parameter is left empty, the slow log will be returned in its native format.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list. 
     * @return InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     * @param InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Slow log start time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried. 
     * @return StartTime Slow log start time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Slow log start time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     * @param StartTime Slow log start time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Slow log end time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried. 
     * @return EndTime Slow log end time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Slow log end time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     * @param EndTime Slow log end time.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Threshold of slow log execution time in milliseconds. Minimum value: 100. Slow logs whose execution time exceeds the threshold will be returned. 
     * @return SlowMS Threshold of slow log execution time in milliseconds. Minimum value: 100. Slow logs whose execution time exceeds the threshold will be returned.
     */
    public Long getSlowMS() {
        return this.SlowMS;
    }

    /**
     * Set Threshold of slow log execution time in milliseconds. Minimum value: 100. Slow logs whose execution time exceeds the threshold will be returned.
     * @param SlowMS Threshold of slow log execution time in milliseconds. Minimum value: 100. Slow logs whose execution time exceeds the threshold will be returned.
     */
    public void setSlowMS(Long SlowMS) {
        this.SlowMS = SlowMS;
    }

    /**
     * Get Offset. Minimum value: 0. Maximum value: 10000. Default value: 0. 
     * @return Offset Offset. Minimum value: 0. Maximum value: 10000. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Minimum value: 0. Maximum value: 10000. Default value: 0.
     * @param Offset Offset. Minimum value: 0. Maximum value: 10000. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Minimum value: 1. Maximum value: 100. Default value: 20. 
     * @return Limit Number of entries per page. Minimum value: 1. Maximum value: 100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Minimum value: 1. Maximum value: 100. Default value: 20.
     * @param Limit Number of entries per page. Minimum value: 1. Maximum value: 100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Slow log format, which can be JSON. If this parameter is left empty, the slow log will be returned in its native format. 
     * @return Format Slow log format, which can be JSON. If this parameter is left empty, the slow log will be returned in its native format.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Slow log format, which can be JSON. If this parameter is left empty, the slow log will be returned in its native format.
     * @param Format Slow log format, which can be JSON. If this parameter is left empty, the slow log will be returned in its native format.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public DescribeSlowLogPatternsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogPatternsRequest(DescribeSlowLogPatternsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SlowMS != null) {
            this.SlowMS = new Long(source.SlowMS);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SlowMS", this.SlowMS);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

