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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductSkuItem extends AbstractModel {

    /**
    * Specification type
BASIC: Basic Edition.
PRO: Professional Edition
PLATINUM: Platinum version
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Specification code
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * whether required or not
1: available for sale
0: unsellable
    */
    @SerializedName("OnSale")
    @Expose
    private Boolean OnSale;

    /**
    * Limit on the number of topics.
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * Sum of the quantity of messages produced and consumed per second in an MQTT cluster.
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * Number of client connections
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * Maximum number of subscriptions for a single client
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * Number of authorization rules
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * Billing item information
    */
    @SerializedName("PriceTags")
    @Expose
    private PriceTag [] PriceTags;

    /**
     * Get Specification type
BASIC: Basic Edition.
PRO: Professional Edition
PLATINUM: Platinum version 
     * @return InstanceType Specification type
BASIC: Basic Edition.
PRO: Professional Edition
PLATINUM: Platinum version
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specification type
BASIC: Basic Edition.
PRO: Professional Edition
PLATINUM: Platinum version
     * @param InstanceType Specification type
BASIC: Basic Edition.
PRO: Professional Edition
PLATINUM: Platinum version
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Specification code 
     * @return SkuCode Specification code
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Specification code
     * @param SkuCode Specification code
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get whether required or not
1: available for sale
0: unsellable 
     * @return OnSale whether required or not
1: available for sale
0: unsellable
     */
    public Boolean getOnSale() {
        return this.OnSale;
    }

    /**
     * Set whether required or not
1: available for sale
0: unsellable
     * @param OnSale whether required or not
1: available for sale
0: unsellable
     */
    public void setOnSale(Boolean OnSale) {
        this.OnSale = OnSale;
    }

    /**
     * Get Limit on the number of topics. 
     * @return TopicNumLimit Limit on the number of topics.
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set Limit on the number of topics.
     * @param TopicNumLimit Limit on the number of topics.
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get Sum of the quantity of messages produced and consumed per second in an MQTT cluster. 
     * @return TpsLimit Sum of the quantity of messages produced and consumed per second in an MQTT cluster.
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set Sum of the quantity of messages produced and consumed per second in an MQTT cluster.
     * @param TpsLimit Sum of the quantity of messages produced and consumed per second in an MQTT cluster.
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get Number of client connections 
     * @return ClientNumLimit Number of client connections
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set Number of client connections
     * @param ClientNumLimit Number of client connections
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get Maximum number of subscriptions for a single client 
     * @return MaxSubscriptionPerClient Maximum number of subscriptions for a single client
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set Maximum number of subscriptions for a single client
     * @param MaxSubscriptionPerClient Maximum number of subscriptions for a single client
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get Number of authorization rules 
     * @return AuthorizationPolicyLimit Number of authorization rules
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set Number of authorization rules
     * @param AuthorizationPolicyLimit Number of authorization rules
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
    }

    /**
     * Get Billing item information 
     * @return PriceTags Billing item information
     */
    public PriceTag [] getPriceTags() {
        return this.PriceTags;
    }

    /**
     * Set Billing item information
     * @param PriceTags Billing item information
     */
    public void setPriceTags(PriceTag [] PriceTags) {
        this.PriceTags = PriceTags;
    }

    public ProductSkuItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductSkuItem(ProductSkuItem source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.OnSale != null) {
            this.OnSale = new Boolean(source.OnSale);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.ClientNumLimit != null) {
            this.ClientNumLimit = new Long(source.ClientNumLimit);
        }
        if (source.MaxSubscriptionPerClient != null) {
            this.MaxSubscriptionPerClient = new Long(source.MaxSubscriptionPerClient);
        }
        if (source.AuthorizationPolicyLimit != null) {
            this.AuthorizationPolicyLimit = new Long(source.AuthorizationPolicyLimit);
        }
        if (source.PriceTags != null) {
            this.PriceTags = new PriceTag[source.PriceTags.length];
            for (int i = 0; i < source.PriceTags.length; i++) {
                this.PriceTags[i] = new PriceTag(source.PriceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "OnSale", this.OnSale);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "ClientNumLimit", this.ClientNumLimit);
        this.setParamSimple(map, prefix + "MaxSubscriptionPerClient", this.MaxSubscriptionPerClient);
        this.setParamSimple(map, prefix + "AuthorizationPolicyLimit", this.AuthorizationPolicyLimit);
        this.setParamArrayObj(map, prefix + "PriceTags.", this.PriceTags);

    }
}

