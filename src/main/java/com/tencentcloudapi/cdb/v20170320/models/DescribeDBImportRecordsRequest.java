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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBImportRecordsRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 00:00:01.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 23:59:59.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pagination parameter indicating the offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameter indicating the number of results to be returned for a single request. Value range: 1-100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 00:00:01. 
     * @return StartTime Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 00:00:01.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 00:00:01.
     * @param StartTime Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 00:00:01.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 23:59:59. 
     * @return EndTime End time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 23:59:59.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 23:59:59.
     * @param EndTime End time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-01-01 23:59:59.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pagination parameter indicating the offset. Default value: 0. 
     * @return Offset Pagination parameter indicating the offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter indicating the offset. Default value: 0.
     * @param Offset Pagination parameter indicating the offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameter indicating the number of results to be returned for a single request. Value range: 1-100. Default value: 20. 
     * @return Limit Pagination parameter indicating the number of results to be returned for a single request. Value range: 1-100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter indicating the number of results to be returned for a single request. Value range: 1-100. Default value: 20.
     * @param Limit Pagination parameter indicating the number of results to be returned for a single request. Value range: 1-100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDBImportRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBImportRecordsRequest(DescribeDBImportRecordsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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

