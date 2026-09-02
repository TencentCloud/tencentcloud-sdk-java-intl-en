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

public class DescribeWebhookPolicyListRequest extends AbstractModel {

    /**
    * <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of results per page<br>Value range: [1, 200]<br>Default value: 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter criteria<br>Supported filter items:<br>Name: fuzzy search by policy name<br>Status: enable status, available values: ON / OFF<br>ReceiveFormat: accept format, available values: TEXT / JSON<br>Module: notification item module, available values: Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID: ID of the associated receiving robot</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Sorting field<br>Enumeration values:<br>InsertTime: creation time<br>UpdateTime: update time<br>Default value: UpdateTime</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting method<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p> 
     * @return Offset <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
     * @param Offset <p>Paging offset<br>Value range: [0, +∞)<br>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of results per page<br>Value range: [1, 200]<br>Default value: 20</p> 
     * @return Limit <p>Number of results per page<br>Value range: [1, 200]<br>Default value: 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page<br>Value range: [1, 200]<br>Default value: 20</p>
     * @param Limit <p>Number of results per page<br>Value range: [1, 200]<br>Default value: 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter criteria<br>Supported filter items:<br>Name: fuzzy search by policy name<br>Status: enable status, available values: ON / OFF<br>ReceiveFormat: accept format, available values: TEXT / JSON<br>Module: notification item module, available values: Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID: ID of the associated receiving robot</p> 
     * @return Filters <p>Filter criteria<br>Supported filter items:<br>Name: fuzzy search by policy name<br>Status: enable status, available values: ON / OFF<br>ReceiveFormat: accept format, available values: TEXT / JSON<br>Module: notification item module, available values: Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID: ID of the associated receiving robot</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria<br>Supported filter items:<br>Name: fuzzy search by policy name<br>Status: enable status, available values: ON / OFF<br>ReceiveFormat: accept format, available values: TEXT / JSON<br>Module: notification item module, available values: Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID: ID of the associated receiving robot</p>
     * @param Filters <p>Filter criteria<br>Supported filter items:<br>Name: fuzzy search by policy name<br>Status: enable status, available values: ON / OFF<br>ReceiveFormat: accept format, available values: TEXT / JSON<br>Module: notification item module, available values: Vul / Alert / AkSk / Agent / LogAnalysis<br>ReceiverID: ID of the associated receiving robot</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sorting field<br>Enumeration values:<br>InsertTime: creation time<br>UpdateTime: update time<br>Default value: UpdateTime</p> 
     * @return Order <p>Sorting field<br>Enumeration values:<br>InsertTime: creation time<br>UpdateTime: update time<br>Default value: UpdateTime</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting field<br>Enumeration values:<br>InsertTime: creation time<br>UpdateTime: update time<br>Default value: UpdateTime</p>
     * @param Order <p>Sorting field<br>Enumeration values:<br>InsertTime: creation time<br>UpdateTime: update time<br>Default value: UpdateTime</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting method<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc</p> 
     * @return By <p>Sorting method<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting method<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc</p>
     * @param By <p>Sorting method<br>Enumeration values:<br>asc: ascending<br>desc: descending<br>Default value: desc</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeWebhookPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebhookPolicyListRequest(DescribeWebhookPolicyListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

