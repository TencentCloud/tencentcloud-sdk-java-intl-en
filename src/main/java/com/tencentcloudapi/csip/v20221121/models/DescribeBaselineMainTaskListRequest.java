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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineMainTaskListRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Universal Filter Criteria. Supported Name: JobID (exact search by task ID), TaskStatus (task status: INIT/SCANNING/SUCCESS/FAILED), TaskType (task type: PERIODIC/MANUAL).</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Starting offset amount for paging query. It starts from 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sort field name, an optional field defined by the specific API.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Universal Filter Criteria. Supported Name: JobID (exact search by task ID), TaskStatus (task status: INIT/SCANNING/SUCCESS/FAILED), TaskType (task type: PERIODIC/MANUAL).</p> 
     * @return Filters <p>Universal Filter Criteria. Supported Name: JobID (exact search by task ID), TaskStatus (task status: INIT/SCANNING/SUCCESS/FAILED), TaskType (task type: PERIODIC/MANUAL).</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Universal Filter Criteria. Supported Name: JobID (exact search by task ID), TaskStatus (task status: INIT/SCANNING/SUCCESS/FAILED), TaskType (task type: PERIODIC/MANUAL).</p>
     * @param Filters <p>Universal Filter Criteria. Supported Name: JobID (exact search by task ID), TaskStatus (task status: INIT/SCANNING/SUCCESS/FAILED), TaskType (task type: PERIODIC/MANUAL).</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p> 
     * @return Limit <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
     * @param Limit <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Starting offset amount for paging query. It starts from 0.</p> 
     * @return Offset <p>Starting offset amount for paging query. It starts from 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Starting offset amount for paging query. It starts from 0.</p>
     * @param Offset <p>Starting offset amount for paging query. It starts from 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p> 
     * @return Order <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
     * @param Order <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sort field name, an optional field defined by the specific API.</p> 
     * @return By <p>Sort field name, an optional field defined by the specific API.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sort field name, an optional field defined by the specific API.</p>
     * @param By <p>Sort field name, an optional field defined by the specific API.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBaselineMainTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineMainTaskListRequest(DescribeBaselineMainTaskListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

