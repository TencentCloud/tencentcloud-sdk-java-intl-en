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

public class CreateScanStatisticExportJobRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Filtered Content
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * Pagination size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting type
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field.
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Health check task id
    */
    @SerializedName("TaskLogId")
    @Expose
    private String TaskLogId;

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
     * Get Filtered Content 
     * @return Filter Filtered Content
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filtered Content
     * @param Filter Filtered Content
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Pagination size. 
     * @return Limit Pagination size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size.
     * @param Limit Pagination size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting type 
     * @return Order Sorting type
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting type
     * @param Order Sorting type
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field. 
     * @return By Sorting field.
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field.
     * @param By Sorting field.
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Health check task id 
     * @return TaskLogId Health check task id
     */
    public String getTaskLogId() {
        return this.TaskLogId;
    }

    /**
     * Set Health check task id
     * @param TaskLogId Health check task id
     */
    public void setTaskLogId(String TaskLogId) {
        this.TaskLogId = TaskLogId;
    }

    public CreateScanStatisticExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScanStatisticExportJobRequest(CreateScanStatisticExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
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
        if (source.TaskLogId != null) {
            this.TaskLogId = new String(source.TaskLogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "TaskLogId", this.TaskLogId);

    }
}

