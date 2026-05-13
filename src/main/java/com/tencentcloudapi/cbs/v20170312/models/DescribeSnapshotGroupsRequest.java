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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotGroupsRequest extends AbstractModel {

    /**
    * Filter criteria.<br><li>snapshot-group-id - Array of String - Required: No - (Filter criteria) Filter by snapshot group ID.<br><li>snapshot-group-state - Array of String - Required: No - (Filter criteria) Filter by snapshot group state. (NORMAL: Normal | CREATING: Creating | ROLLBACKING: Rolling back)<br><li>snapshot-group-name - Array of String - Required: No - (Filter criteria) Filter by snapshot group name.<br><li>snapshot-id - Array of String - Required: No - (Filter criteria) Filter by snapshot ID within the snapshot group.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns, with a default value of 20, and a maximum value of 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Filter criteria.<br><li>snapshot-group-id - Array of String - Required: No - (Filter criteria) Filter by snapshot group ID.<br><li>snapshot-group-state - Array of String - Required: No - (Filter criteria) Filter by snapshot group state. (NORMAL: Normal | CREATING: Creating | ROLLBACKING: Rolling back)<br><li>snapshot-group-name - Array of String - Required: No - (Filter criteria) Filter by snapshot group name.<br><li>snapshot-id - Array of String - Required: No - (Filter criteria) Filter by snapshot ID within the snapshot group. 
     * @return Filters Filter criteria.<br><li>snapshot-group-id - Array of String - Required: No - (Filter criteria) Filter by snapshot group ID.<br><li>snapshot-group-state - Array of String - Required: No - (Filter criteria) Filter by snapshot group state. (NORMAL: Normal | CREATING: Creating | ROLLBACKING: Rolling back)<br><li>snapshot-group-name - Array of String - Required: No - (Filter criteria) Filter by snapshot group name.<br><li>snapshot-id - Array of String - Required: No - (Filter criteria) Filter by snapshot ID within the snapshot group.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria.<br><li>snapshot-group-id - Array of String - Required: No - (Filter criteria) Filter by snapshot group ID.<br><li>snapshot-group-state - Array of String - Required: No - (Filter criteria) Filter by snapshot group state. (NORMAL: Normal | CREATING: Creating | ROLLBACKING: Rolling back)<br><li>snapshot-group-name - Array of String - Required: No - (Filter criteria) Filter by snapshot group name.<br><li>snapshot-id - Array of String - Required: No - (Filter criteria) Filter by snapshot ID within the snapshot group.
     * @param Filters Filter criteria.<br><li>snapshot-group-id - Array of String - Required: No - (Filter criteria) Filter by snapshot group ID.<br><li>snapshot-group-state - Array of String - Required: No - (Filter criteria) Filter by snapshot group state. (NORMAL: Normal | CREATING: Creating | ROLLBACKING: Rolling back)<br><li>snapshot-group-name - Array of String - Required: No - (Filter criteria) Filter by snapshot group name.<br><li>snapshot-id - Array of String - Required: No - (Filter criteria) Filter by snapshot ID within the snapshot group.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returns, with a default value of 20, and a maximum value of 100. 
     * @return Limit Number of returns, with a default value of 20, and a maximum value of 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns, with a default value of 20, and a maximum value of 100.
     * @param Limit Number of returns, with a default value of 20, and a maximum value of 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSnapshotGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotGroupsRequest(DescribeSnapshotGroupsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

