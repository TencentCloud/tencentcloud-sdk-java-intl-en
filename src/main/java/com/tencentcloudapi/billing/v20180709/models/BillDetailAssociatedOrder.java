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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillDetailAssociatedOrder extends AbstractModel {

    /**
    * Purchase order.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepayPurchase")
    @Expose
    private String PrepayPurchase;

    /**
    * Renewal order.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepayRenew")
    @Expose
    private String PrepayRenew;

    /**
    * Upgrade order.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepayModifyUp")
    @Expose
    private String PrepayModifyUp;

    /**
    * Write-off order.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReverseOrder")
    @Expose
    private String ReverseOrder;

    /**
    * The order after discount.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewOrder")
    @Expose
    private String NewOrder;

    /**
    * The original order before discount.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Original")
    @Expose
    private String Original;

    /**
     * Get Purchase order.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrepayPurchase Purchase order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrepayPurchase() {
        return this.PrepayPurchase;
    }

    /**
     * Set Purchase order.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrepayPurchase Purchase order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepayPurchase(String PrepayPurchase) {
        this.PrepayPurchase = PrepayPurchase;
    }

    /**
     * Get Renewal order.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrepayRenew Renewal order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrepayRenew() {
        return this.PrepayRenew;
    }

    /**
     * Set Renewal order.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrepayRenew Renewal order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepayRenew(String PrepayRenew) {
        this.PrepayRenew = PrepayRenew;
    }

    /**
     * Get Upgrade order.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrepayModifyUp Upgrade order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrepayModifyUp() {
        return this.PrepayModifyUp;
    }

    /**
     * Set Upgrade order.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrepayModifyUp Upgrade order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepayModifyUp(String PrepayModifyUp) {
        this.PrepayModifyUp = PrepayModifyUp;
    }

    /**
     * Get Write-off order.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReverseOrder Write-off order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReverseOrder() {
        return this.ReverseOrder;
    }

    /**
     * Set Write-off order.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReverseOrder Write-off order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReverseOrder(String ReverseOrder) {
        this.ReverseOrder = ReverseOrder;
    }

    /**
     * Get The order after discount.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewOrder The order after discount.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNewOrder() {
        return this.NewOrder;
    }

    /**
     * Set The order after discount.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewOrder The order after discount.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewOrder(String NewOrder) {
        this.NewOrder = NewOrder;
    }

    /**
     * Get The original order before discount.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Original The original order before discount.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginal() {
        return this.Original;
    }

    /**
     * Set The original order before discount.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Original The original order before discount.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginal(String Original) {
        this.Original = Original;
    }

    public BillDetailAssociatedOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDetailAssociatedOrder(BillDetailAssociatedOrder source) {
        if (source.PrepayPurchase != null) {
            this.PrepayPurchase = new String(source.PrepayPurchase);
        }
        if (source.PrepayRenew != null) {
            this.PrepayRenew = new String(source.PrepayRenew);
        }
        if (source.PrepayModifyUp != null) {
            this.PrepayModifyUp = new String(source.PrepayModifyUp);
        }
        if (source.ReverseOrder != null) {
            this.ReverseOrder = new String(source.ReverseOrder);
        }
        if (source.NewOrder != null) {
            this.NewOrder = new String(source.NewOrder);
        }
        if (source.Original != null) {
            this.Original = new String(source.Original);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrepayPurchase", this.PrepayPurchase);
        this.setParamSimple(map, prefix + "PrepayRenew", this.PrepayRenew);
        this.setParamSimple(map, prefix + "PrepayModifyUp", this.PrepayModifyUp);
        this.setParamSimple(map, prefix + "ReverseOrder", this.ReverseOrder);
        this.setParamSimple(map, prefix + "NewOrder", this.NewOrder);
        this.setParamSimple(map, prefix + "Original", this.Original);

    }
}

