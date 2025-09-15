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

public class DescribeAutoScaleRecordsRequest extends AbstractModel {

    /**
    * The instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Record filter parameter, which can only be "StartTime", "EndTime", "StrategyName", "ActionStatus", or "ScaleAction".
Time format. Either 2006-01-02 15:04:05 or 2006/01/02 15:04:05 for StartTime and EndTime.
ActionStatus: 0 (INITED), 1 (SUCCESS), 2 (FAILED), 3 (LIMITED_SUCCESSED), 4 (IN_PROCESS), 5 (IN_RETRY).
ScaleAction: 1 (scale out), 2 (scale in).

    */
    @SerializedName("Filters")
    @Expose
    private KeyValue [] Filters;

    /**
    * Pagination parameters.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameters. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Whether it is automatic scaling (0) or managed scaling (1)
    */
    @SerializedName("RecordSource")
    @Expose
    private Long RecordSource;

    /**
    * Ascending or not. 1: ascending, 0: descending.
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
     * Get The instance ID. 
     * @return InstanceId The instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The instance ID.
     * @param InstanceId The instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Record filter parameter, which can only be "StartTime", "EndTime", "StrategyName", "ActionStatus", or "ScaleAction".
Time format. Either 2006-01-02 15:04:05 or 2006/01/02 15:04:05 for StartTime and EndTime.
ActionStatus: 0 (INITED), 1 (SUCCESS), 2 (FAILED), 3 (LIMITED_SUCCESSED), 4 (IN_PROCESS), 5 (IN_RETRY).
ScaleAction: 1 (scale out), 2 (scale in).
 
     * @return Filters Record filter parameter, which can only be "StartTime", "EndTime", "StrategyName", "ActionStatus", or "ScaleAction".
Time format. Either 2006-01-02 15:04:05 or 2006/01/02 15:04:05 for StartTime and EndTime.
ActionStatus: 0 (INITED), 1 (SUCCESS), 2 (FAILED), 3 (LIMITED_SUCCESSED), 4 (IN_PROCESS), 5 (IN_RETRY).
ScaleAction: 1 (scale out), 2 (scale in).

     */
    public KeyValue [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Record filter parameter, which can only be "StartTime", "EndTime", "StrategyName", "ActionStatus", or "ScaleAction".
Time format. Either 2006-01-02 15:04:05 or 2006/01/02 15:04:05 for StartTime and EndTime.
ActionStatus: 0 (INITED), 1 (SUCCESS), 2 (FAILED), 3 (LIMITED_SUCCESSED), 4 (IN_PROCESS), 5 (IN_RETRY).
ScaleAction: 1 (scale out), 2 (scale in).

     * @param Filters Record filter parameter, which can only be "StartTime", "EndTime", "StrategyName", "ActionStatus", or "ScaleAction".
Time format. Either 2006-01-02 15:04:05 or 2006/01/02 15:04:05 for StartTime and EndTime.
ActionStatus: 0 (INITED), 1 (SUCCESS), 2 (FAILED), 3 (LIMITED_SUCCESSED), 4 (IN_PROCESS), 5 (IN_RETRY).
ScaleAction: 1 (scale out), 2 (scale in).

     */
    public void setFilters(KeyValue [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Pagination parameters. 
     * @return Offset Pagination parameters.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameters.
     * @param Offset Pagination parameters.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameters. Maximum value: 100 
     * @return Limit Pagination parameters. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters. Maximum value: 100
     * @param Limit Pagination parameters. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Whether it is automatic scaling (0) or managed scaling (1) 
     * @return RecordSource Whether it is automatic scaling (0) or managed scaling (1)
     */
    public Long getRecordSource() {
        return this.RecordSource;
    }

    /**
     * Set Whether it is automatic scaling (0) or managed scaling (1)
     * @param RecordSource Whether it is automatic scaling (0) or managed scaling (1)
     */
    public void setRecordSource(Long RecordSource) {
        this.RecordSource = RecordSource;
    }

    /**
     * Get Ascending or not. 1: ascending, 0: descending. 
     * @return Asc Ascending or not. 1: ascending, 0: descending.
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set Ascending or not. 1: ascending, 0: descending.
     * @param Asc Ascending or not. 1: ascending, 0: descending.
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    public DescribeAutoScaleRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScaleRecordsRequest(DescribeAutoScaleRecordsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new KeyValue[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new KeyValue(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RecordSource != null) {
            this.RecordSource = new Long(source.RecordSource);
        }
        if (source.Asc != null) {
            this.Asc = new Long(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RecordSource", this.RecordSource);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

