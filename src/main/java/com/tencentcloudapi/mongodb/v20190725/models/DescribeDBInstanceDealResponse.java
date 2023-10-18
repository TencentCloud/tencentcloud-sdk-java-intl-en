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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceDealResponse extends AbstractModel {

    /**
    * Order status. Valid values: 1 (unpaid), 2 (paid), 3 (delivering), 4 (delivered), 5 (delivery failed), 6 (refunded), 7 (order closed), 8 (order closed because it failed to be paid within timeout period).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Original price of the order.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discounted price of the order.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * Operation performed by the order. Valid values: purchase, renew, upgrade, downgrade, refund.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Order status. Valid values: 1 (unpaid), 2 (paid), 3 (delivering), 4 (delivered), 5 (delivery failed), 6 (refunded), 7 (order closed), 8 (order closed because it failed to be paid within timeout period). 
     * @return Status Order status. Valid values: 1 (unpaid), 2 (paid), 3 (delivering), 4 (delivered), 5 (delivery failed), 6 (refunded), 7 (order closed), 8 (order closed because it failed to be paid within timeout period).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Order status. Valid values: 1 (unpaid), 2 (paid), 3 (delivering), 4 (delivered), 5 (delivery failed), 6 (refunded), 7 (order closed), 8 (order closed because it failed to be paid within timeout period).
     * @param Status Order status. Valid values: 1 (unpaid), 2 (paid), 3 (delivering), 4 (delivered), 5 (delivery failed), 6 (refunded), 7 (order closed), 8 (order closed because it failed to be paid within timeout period).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Original price of the order. 
     * @return OriginalPrice Original price of the order.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Original price of the order.
     * @param OriginalPrice Original price of the order.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discounted price of the order. 
     * @return DiscountPrice Discounted price of the order.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted price of the order.
     * @param DiscountPrice Discounted price of the order.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get Operation performed by the order. Valid values: purchase, renew, upgrade, downgrade, refund. 
     * @return Action Operation performed by the order. Valid values: purchase, renew, upgrade, downgrade, refund.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Operation performed by the order. Valid values: purchase, renew, upgrade, downgrade, refund.
     * @param Action Operation performed by the order. Valid values: purchase, renew, upgrade, downgrade, refund.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBInstanceDealResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceDealResponse(DescribeDBInstanceDealResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

