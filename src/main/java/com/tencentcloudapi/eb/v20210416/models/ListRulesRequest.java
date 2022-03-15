/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRulesRequest extends AbstractModel{

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time) 
     * @return OrderBy Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
     * @param OrderBy Indicates by which field to sort the returned results. Valid values: AddTime (creation time), ModTime (modification time)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order) 
     * @return Order Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
     * @param Order Indicates whether the returned results are sorted in ascending or descending order. Valid values: ASC (ascending order), DESC (descending order)
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public ListRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRulesRequest(ListRulesRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

