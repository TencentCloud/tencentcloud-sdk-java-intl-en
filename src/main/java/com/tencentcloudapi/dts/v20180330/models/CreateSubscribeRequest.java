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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubscribeRequest extends AbstractModel {

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
    * A custom instance name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
     * Get A custom instance name. 
     * @return Name A custom instance name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set A custom instance name.
     * @param Name A custom instance name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubscribeRequest(CreateSubscribeRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
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
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

