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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubscribeRequest extends AbstractModel{

    /**
    * Subscribed database type. Currently, MySQL is supported
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance billing mode, which is always 1 (hourly billing),
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Purchase duration in months, which is required if `PayType` is 0. Maximum value: 120 (this field is not required of global site users and is better to be hidden)
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Quantity. Default value: 1. Maximum value: 10
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Whether to auto-renew. Default value: 0. This flag does not take effect for hourly billed instances (this field should be hidden from global site users)
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Instance resource tags
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
     * Get Subscribed database type. Currently, MySQL is supported 
     * @return Product Subscribed database type. Currently, MySQL is supported
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Subscribed database type. Currently, MySQL is supported
     * @param Product Subscribed database type. Currently, MySQL is supported
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Instance billing mode, which is always 1 (hourly billing), 
     * @return PayType Instance billing mode, which is always 1 (hourly billing),
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Instance billing mode, which is always 1 (hourly billing),
     * @param PayType Instance billing mode, which is always 1 (hourly billing),
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Purchase duration in months, which is required if `PayType` is 0. Maximum value: 120 (this field is not required of global site users and is better to be hidden) 
     * @return Duration Purchase duration in months, which is required if `PayType` is 0. Maximum value: 120 (this field is not required of global site users and is better to be hidden)
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Purchase duration in months, which is required if `PayType` is 0. Maximum value: 120 (this field is not required of global site users and is better to be hidden)
     * @param Duration Purchase duration in months, which is required if `PayType` is 0. Maximum value: 120 (this field is not required of global site users and is better to be hidden)
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Quantity. Default value: 1. Maximum value: 10 
     * @return Count Quantity. Default value: 1. Maximum value: 10
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantity. Default value: 1. Maximum value: 10
     * @param Count Quantity. Default value: 1. Maximum value: 10
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Whether to auto-renew. Default value: 0. This flag does not take effect for hourly billed instances (this field should be hidden from global site users) 
     * @return AutoRenew Whether to auto-renew. Default value: 0. This flag does not take effect for hourly billed instances (this field should be hidden from global site users)
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Whether to auto-renew. Default value: 0. This flag does not take effect for hourly billed instances (this field should be hidden from global site users)
     * @param AutoRenew Whether to auto-renew. Default value: 0. This flag does not take effect for hourly billed instances (this field should be hidden from global site users)
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Instance resource tags 
     * @return Tags Instance resource tags
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Instance resource tags
     * @param Tags Instance resource tags
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

