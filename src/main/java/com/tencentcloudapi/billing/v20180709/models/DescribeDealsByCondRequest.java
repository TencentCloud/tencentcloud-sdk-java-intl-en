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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDealsByCondRequest extends AbstractModel {

    /**
    * Start time 
Example :2016-01-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time 
Example:2016-02-01 00:00:00. 
It is recommended that the span does not exceed 3 months.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The number of records per page. The default is 20, and the maximum is 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The page number the records start from, starting from 0. The default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Order status, default is 4 (successful order)
Status of the order
1: unpaid
2: paid 
3: shipment in progress
4: shipped
5`: Shipment Failed
6`: Refunded
7`: Ticket closed
8`: Order expired
9`: Order invalid
10: product invalidated
11: third-party payment refused
12: payment in process
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Sub-order number
Example: 202202021234567
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Large order number.
Example: 202202021234566
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * Resource ID
Example:ins-a2bb34
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get Start time 
Example :2016-01-01 00:00:00 
     * @return StartTime Start time 
Example :2016-01-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time 
Example :2016-01-01 00:00:00
     * @param StartTime Start time 
Example :2016-01-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
Example:2016-02-01 00:00:00. 
It is recommended that the span does not exceed 3 months. 
     * @return EndTime End time 
Example:2016-02-01 00:00:00. 
It is recommended that the span does not exceed 3 months.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time 
Example:2016-02-01 00:00:00. 
It is recommended that the span does not exceed 3 months.
     * @param EndTime End time 
Example:2016-02-01 00:00:00. 
It is recommended that the span does not exceed 3 months.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The number of records per page. The default is 20, and the maximum is 1,000. 
     * @return Limit The number of records per page. The default is 20, and the maximum is 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records per page. The default is 20, and the maximum is 1,000.
     * @param Limit The number of records per page. The default is 20, and the maximum is 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The page number the records start from, starting from 0. The default is 0. 
     * @return Offset The page number the records start from, starting from 0. The default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The page number the records start from, starting from 0. The default is 0.
     * @param Offset The page number the records start from, starting from 0. The default is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Order status, default is 4 (successful order)
Status of the order
1: unpaid
2: paid 
3: shipment in progress
4: shipped
5`: Shipment Failed
6`: Refunded
7`: Ticket closed
8`: Order expired
9`: Order invalid
10: product invalidated
11: third-party payment refused
12: payment in process 
     * @return Status Order status, default is 4 (successful order)
Status of the order
1: unpaid
2: paid 
3: shipment in progress
4: shipped
5`: Shipment Failed
6`: Refunded
7`: Ticket closed
8`: Order expired
9`: Order invalid
10: product invalidated
11: third-party payment refused
12: payment in process
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Order status, default is 4 (successful order)
Status of the order
1: unpaid
2: paid 
3: shipment in progress
4: shipped
5`: Shipment Failed
6`: Refunded
7`: Ticket closed
8`: Order expired
9`: Order invalid
10: product invalidated
11: third-party payment refused
12: payment in process
     * @param Status Order status, default is 4 (successful order)
Status of the order
1: unpaid
2: paid 
3: shipment in progress
4: shipped
5`: Shipment Failed
6`: Refunded
7`: Ticket closed
8`: Order expired
9`: Order invalid
10: product invalidated
11: third-party payment refused
12: payment in process
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Sub-order number
Example: 202202021234567 
     * @return OrderId Sub-order number
Example: 202202021234567
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Sub-order number
Example: 202202021234567
     * @param OrderId Sub-order number
Example: 202202021234567
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Large order number.
Example: 202202021234566 
     * @return BigDealId Large order number.
Example: 202202021234566
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set Large order number.
Example: 202202021234566
     * @param BigDealId Large order number.
Example: 202202021234566
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get Resource ID
Example:ins-a2bb34 
     * @return ResourceId Resource ID
Example:ins-a2bb34
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
Example:ins-a2bb34
     * @param ResourceId Resource ID
Example:ins-a2bb34
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public DescribeDealsByCondRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDealsByCondRequest(DescribeDealsByCondRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

