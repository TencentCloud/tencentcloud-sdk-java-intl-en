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

public class DescribeLogDownloadTasksRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of queries.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Start time of the download task.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the download task.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of queries. 
     * @return Limit Number of queries.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of queries.
     * @param Limit Number of queries.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. 
     * @return Offset Page number.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number.
     * @param Offset Page number.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Start time of the download task. 
     * @return StartTime Start time of the download task.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the download task.
     * @param StartTime Start time of the download task.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the download task. 
     * @return EndTime End time of the download task.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the download task.
     * @param EndTime End time of the download task.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeLogDownloadTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogDownloadTasksRequest(DescribeLogDownloadTasksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

