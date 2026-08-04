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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInferenceServiceDeploymentLogsRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * ID of the inference service.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Deployment record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Start time for retrieving logs.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time for retrieving logs. Default query time range (EndTime - StartTime) is the most recent 7 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Sorting field. Valid values: <li>timestamp: Log generation time.</li>Default value: timestamp.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>Sorting method. Valid values: <li>asc: ascending order;</li><li>desc: descending order.</li>Default value: desc.</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get ID of the inference service. 
     * @return ServiceId ID of the inference service.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set ID of the inference service.
     * @param ServiceId ID of the inference service.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Deployment record ID. 
     * @return RecordId Deployment record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Deployment record ID.
     * @param RecordId Deployment record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Start time for retrieving logs. 
     * @return StartTime Start time for retrieving logs.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for retrieving logs.
     * @param StartTime Start time for retrieving logs.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for retrieving logs. Default query time range (EndTime - StartTime) is the most recent 7 days. 
     * @return EndTime End time for retrieving logs. Default query time range (EndTime - StartTime) is the most recent 7 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for retrieving logs. Default query time range (EndTime - StartTime) is the most recent 7 days.
     * @param EndTime End time for retrieving logs. Default query time range (EndTime - StartTime) is the most recent 7 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sorting field. Valid values: <li>timestamp: Log generation time.</li>Default value: timestamp. 
     * @return SortBy Sorting field. Valid values: <li>timestamp: Log generation time.</li>Default value: timestamp.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting field. Valid values: <li>timestamp: Log generation time.</li>Default value: timestamp.
     * @param SortBy Sorting field. Valid values: <li>timestamp: Log generation time.</li>Default value: timestamp.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>Sorting method. Valid values: <li>asc: ascending order;</li><li>desc: descending order.</li>Default value: desc.</p> 
     * @return SortOrder <p>Sorting method. Valid values: <li>asc: ascending order;</li><li>desc: descending order.</li>Default value: desc.</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>Sorting method. Valid values: <li>asc: ascending order;</li><li>desc: descending order.</li>Default value: desc.</p>
     * @param SortOrder <p>Sorting method. Valid values: <li>asc: ascending order;</li><li>desc: descending order.</li>Default value: desc.</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. Default value: 20. Maximum value: 1000. 
     * @return Limit Number of returned entries. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 20. Maximum value: 1000.
     * @param Limit Number of returned entries. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInferenceServiceDeploymentLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceServiceDeploymentLogsRequest(DescribeInferenceServiceDeploymentLogsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

