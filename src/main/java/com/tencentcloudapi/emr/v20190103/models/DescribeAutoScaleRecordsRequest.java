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
    * Parameter for record filtration. Valid values: "StartTime", "EndTime" and "StrategyName". StartTime and EndTime support the time format of 2006-01-02 15:04:05 or 2006/01/02 15:04:05.
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
     * Get Parameter for record filtration. Valid values: "StartTime", "EndTime" and "StrategyName". StartTime and EndTime support the time format of 2006-01-02 15:04:05 or 2006/01/02 15:04:05. 
     * @return Filters Parameter for record filtration. Valid values: "StartTime", "EndTime" and "StrategyName". StartTime and EndTime support the time format of 2006-01-02 15:04:05 or 2006/01/02 15:04:05.
     */
    public KeyValue [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Parameter for record filtration. Valid values: "StartTime", "EndTime" and "StrategyName". StartTime and EndTime support the time format of 2006-01-02 15:04:05 or 2006/01/02 15:04:05.
     * @param Filters Parameter for record filtration. Valid values: "StartTime", "EndTime" and "StrategyName". StartTime and EndTime support the time format of 2006-01-02 15:04:05 or 2006/01/02 15:04:05.
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

