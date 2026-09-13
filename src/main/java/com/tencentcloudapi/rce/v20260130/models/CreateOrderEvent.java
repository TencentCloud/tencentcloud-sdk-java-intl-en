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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrderEvent extends AbstractModel {

    /**
    * <p>The ID of the order</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>The amount of the order</p>
    */
    @SerializedName("Amount")
    @Expose
    private Amount Amount;

    /**
    * <p>The detail information of the merchant associated with the order</p>
    */
    @SerializedName("Merchant")
    @Expose
    private Merchant Merchant;

    /**
    * <p>The detail information of the bill associated with the order</p>
    */
    @SerializedName("Billing")
    @Expose
    private Billing Billing;

    /**
    * <p>The detail information of the items in the order</p>
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
    * <p>The detail information of the delivery associated with the order</p>
    */
    @SerializedName("Delivery")
    @Expose
    private Delivery Delivery;

    /**
    * <p>The promotion(s) associated with the order</p>
    */
    @SerializedName("Promotions")
    @Expose
    private Promotion [] Promotions;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The ID of the order</p> 
     * @return OrderId <p>The ID of the order</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>The ID of the order</p>
     * @param OrderId <p>The ID of the order</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>The amount of the order</p> 
     * @return Amount <p>The amount of the order</p>
     */
    public Amount getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>The amount of the order</p>
     * @param Amount <p>The amount of the order</p>
     */
    public void setAmount(Amount Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>The detail information of the merchant associated with the order</p> 
     * @return Merchant <p>The detail information of the merchant associated with the order</p>
     */
    public Merchant getMerchant() {
        return this.Merchant;
    }

    /**
     * Set <p>The detail information of the merchant associated with the order</p>
     * @param Merchant <p>The detail information of the merchant associated with the order</p>
     */
    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    /**
     * Get <p>The detail information of the bill associated with the order</p> 
     * @return Billing <p>The detail information of the bill associated with the order</p>
     */
    public Billing getBilling() {
        return this.Billing;
    }

    /**
     * Set <p>The detail information of the bill associated with the order</p>
     * @param Billing <p>The detail information of the bill associated with the order</p>
     */
    public void setBilling(Billing Billing) {
        this.Billing = Billing;
    }

    /**
     * Get <p>The detail information of the items in the order</p> 
     * @return Items <p>The detail information of the items in the order</p>
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>The detail information of the items in the order</p>
     * @param Items <p>The detail information of the items in the order</p>
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>The detail information of the delivery associated with the order</p> 
     * @return Delivery <p>The detail information of the delivery associated with the order</p>
     */
    public Delivery getDelivery() {
        return this.Delivery;
    }

    /**
     * Set <p>The detail information of the delivery associated with the order</p>
     * @param Delivery <p>The detail information of the delivery associated with the order</p>
     */
    public void setDelivery(Delivery Delivery) {
        this.Delivery = Delivery;
    }

    /**
     * Get <p>The promotion(s) associated with the order</p> 
     * @return Promotions <p>The promotion(s) associated with the order</p>
     */
    public Promotion [] getPromotions() {
        return this.Promotions;
    }

    /**
     * Set <p>The promotion(s) associated with the order</p>
     * @param Promotions <p>The promotion(s) associated with the order</p>
     */
    public void setPromotions(Promotion [] Promotions) {
        this.Promotions = Promotions;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public CreateOrderEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrderEvent(CreateOrderEvent source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Amount != null) {
            this.Amount = new Amount(source.Amount);
        }
        if (source.Merchant != null) {
            this.Merchant = new Merchant(source.Merchant);
        }
        if (source.Billing != null) {
            this.Billing = new Billing(source.Billing);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
        if (source.Delivery != null) {
            this.Delivery = new Delivery(source.Delivery);
        }
        if (source.Promotions != null) {
            this.Promotions = new Promotion[source.Promotions.length];
            for (int i = 0; i < source.Promotions.length; i++) {
                this.Promotions[i] = new Promotion(source.Promotions[i]);
            }
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamObj(map, prefix + "Amount.", this.Amount);
        this.setParamObj(map, prefix + "Merchant.", this.Merchant);
        this.setParamObj(map, prefix + "Billing.", this.Billing);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamObj(map, prefix + "Delivery.", this.Delivery);
        this.setParamArrayObj(map, prefix + "Promotions.", this.Promotions);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

