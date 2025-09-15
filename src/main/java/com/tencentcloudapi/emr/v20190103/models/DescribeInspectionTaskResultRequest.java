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

public class DescribeInspectionTaskResultRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Page size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get Type. 
     * @return Type Type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Page size. 
     * @return Limit Page size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size.
     * @param Limit Page size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInspectionTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInspectionTaskResultRequest(DescribeInspectionTaskResultRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

