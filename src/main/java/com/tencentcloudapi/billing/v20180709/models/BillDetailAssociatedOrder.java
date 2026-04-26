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
    * Newly purchased order
    */
    @SerializedName("PrepayPurchase")
    @Expose
    private String PrepayPurchase;

    /**
    * Renewal order
    */
    @SerializedName("PrepayRenew")
    @Expose
    private String PrepayRenew;

    /**
    * Configuration upgrade order
    */
    @SerializedName("PrepayModifyUp")
    @Expose
    private String PrepayModifyUp;

    /**
    * Write-off order
    */
    @SerializedName("ReverseOrder")
    @Expose
    private String ReverseOrder;

    /**
    * Order after discount adjustment
    */
    @SerializedName("NewOrder")
    @Expose
    private String NewOrder;

    /**
    * Order before discount adjustment
    */
    @SerializedName("Original")
    @Expose
    private String Original;

    /**
     * Get Newly purchased order 
     * @return PrepayPurchase Newly purchased order
     */
    public String getPrepayPurchase() {
        return this.PrepayPurchase;
    }

    /**
     * Set Newly purchased order
     * @param PrepayPurchase Newly purchased order
     */
    public void setPrepayPurchase(String PrepayPurchase) {
        this.PrepayPurchase = PrepayPurchase;
    }

    /**
     * Get Renewal order 
     * @return PrepayRenew Renewal order
     */
    public String getPrepayRenew() {
        return this.PrepayRenew;
    }

    /**
     * Set Renewal order
     * @param PrepayRenew Renewal order
     */
    public void setPrepayRenew(String PrepayRenew) {
        this.PrepayRenew = PrepayRenew;
    }

    /**
     * Get Configuration upgrade order 
     * @return PrepayModifyUp Configuration upgrade order
     */
    public String getPrepayModifyUp() {
        return this.PrepayModifyUp;
    }

    /**
     * Set Configuration upgrade order
     * @param PrepayModifyUp Configuration upgrade order
     */
    public void setPrepayModifyUp(String PrepayModifyUp) {
        this.PrepayModifyUp = PrepayModifyUp;
    }

    /**
     * Get Write-off order 
     * @return ReverseOrder Write-off order
     */
    public String getReverseOrder() {
        return this.ReverseOrder;
    }

    /**
     * Set Write-off order
     * @param ReverseOrder Write-off order
     */
    public void setReverseOrder(String ReverseOrder) {
        this.ReverseOrder = ReverseOrder;
    }

    /**
     * Get Order after discount adjustment 
     * @return NewOrder Order after discount adjustment
     */
    public String getNewOrder() {
        return this.NewOrder;
    }

    /**
     * Set Order after discount adjustment
     * @param NewOrder Order after discount adjustment
     */
    public void setNewOrder(String NewOrder) {
        this.NewOrder = NewOrder;
    }

    /**
     * Get Order before discount adjustment 
     * @return Original Order before discount adjustment
     */
    public String getOriginal() {
        return this.Original;
    }

    /**
     * Set Order before discount adjustment
     * @param Original Order before discount adjustment
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

