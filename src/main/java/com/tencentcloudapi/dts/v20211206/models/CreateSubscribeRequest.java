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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubscribeRequest extends AbstractModel {

    /**
    * Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, and tdsqlpercona are supported.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Purchase duration. This field needs to be filled in when the payType is monthly subscription. The unit is month. Value range: 1-120. Default value: 1.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Whether to renew automatically. This field needs to be filled in when the payType is monthly subscription. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled). Automatic renewal is not performed by default. This flag is invalid for pay-as-you-go.
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Quantity. Default value: 1. Maximum value: 10.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Instance resource tags
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Custom task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, and tdsqlpercona are supported. 
     * @return Product Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, and tdsqlpercona are supported.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, and tdsqlpercona are supported.
     * @param Product Subscription database type. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, and tdsqlpercona are supported.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go). 
     * @return PayType Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
     * @param PayType Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Purchase duration. This field needs to be filled in when the payType is monthly subscription. The unit is month. Value range: 1-120. Default value: 1. 
     * @return Duration Purchase duration. This field needs to be filled in when the payType is monthly subscription. The unit is month. Value range: 1-120. Default value: 1.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Purchase duration. This field needs to be filled in when the payType is monthly subscription. The unit is month. Value range: 1-120. Default value: 1.
     * @param Duration Purchase duration. This field needs to be filled in when the payType is monthly subscription. The unit is month. Value range: 1-120. Default value: 1.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Whether to renew automatically. This field needs to be filled in when the payType is monthly subscription. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled). Automatic renewal is not performed by default. This flag is invalid for pay-as-you-go. 
     * @return AutoRenew Whether to renew automatically. This field needs to be filled in when the payType is monthly subscription. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled). Automatic renewal is not performed by default. This flag is invalid for pay-as-you-go.
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Whether to renew automatically. This field needs to be filled in when the payType is monthly subscription. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled). Automatic renewal is not performed by default. This flag is invalid for pay-as-you-go.
     * @param AutoRenew Whether to renew automatically. This field needs to be filled in when the payType is monthly subscription. Valid values: 0 (auto-renewal disabled); 1 (auto-renewal enabled). Automatic renewal is not performed by default. This flag is invalid for pay-as-you-go.
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Quantity. Default value: 1. Maximum value: 10. 
     * @return Count Quantity. Default value: 1. Maximum value: 10.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantity. Default value: 1. Maximum value: 10.
     * @param Count Quantity. Default value: 1. Maximum value: 10.
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
     * Get Custom task name 
     * @return Name Custom task name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Custom task name
     * @param Name Custom task name
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
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

