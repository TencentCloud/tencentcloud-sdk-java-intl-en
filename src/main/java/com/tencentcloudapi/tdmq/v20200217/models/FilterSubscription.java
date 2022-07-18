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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterSubscription extends AbstractModel{

    /**
    * Whether to only display subscriptions that include real consumers.
    */
    @SerializedName("ConsumerHasCount")
    @Expose
    private Boolean ConsumerHasCount;

    /**
    * Whether to only display subscriptions with heaped messages.
    */
    @SerializedName("ConsumerHasBacklog")
    @Expose
    private Boolean ConsumerHasBacklog;

    /**
    * Whether to only display subscriptions with messages discarded after expiration.
    */
    @SerializedName("ConsumerHasExpired")
    @Expose
    private Boolean ConsumerHasExpired;

    /**
    * Filter by subscription name for exact query.
    */
    @SerializedName("SubscriptionNames")
    @Expose
    private String [] SubscriptionNames;

    /**
     * Get Whether to only display subscriptions that include real consumers. 
     * @return ConsumerHasCount Whether to only display subscriptions that include real consumers.
     */
    public Boolean getConsumerHasCount() {
        return this.ConsumerHasCount;
    }

    /**
     * Set Whether to only display subscriptions that include real consumers.
     * @param ConsumerHasCount Whether to only display subscriptions that include real consumers.
     */
    public void setConsumerHasCount(Boolean ConsumerHasCount) {
        this.ConsumerHasCount = ConsumerHasCount;
    }

    /**
     * Get Whether to only display subscriptions with heaped messages. 
     * @return ConsumerHasBacklog Whether to only display subscriptions with heaped messages.
     */
    public Boolean getConsumerHasBacklog() {
        return this.ConsumerHasBacklog;
    }

    /**
     * Set Whether to only display subscriptions with heaped messages.
     * @param ConsumerHasBacklog Whether to only display subscriptions with heaped messages.
     */
    public void setConsumerHasBacklog(Boolean ConsumerHasBacklog) {
        this.ConsumerHasBacklog = ConsumerHasBacklog;
    }

    /**
     * Get Whether to only display subscriptions with messages discarded after expiration. 
     * @return ConsumerHasExpired Whether to only display subscriptions with messages discarded after expiration.
     */
    public Boolean getConsumerHasExpired() {
        return this.ConsumerHasExpired;
    }

    /**
     * Set Whether to only display subscriptions with messages discarded after expiration.
     * @param ConsumerHasExpired Whether to only display subscriptions with messages discarded after expiration.
     */
    public void setConsumerHasExpired(Boolean ConsumerHasExpired) {
        this.ConsumerHasExpired = ConsumerHasExpired;
    }

    /**
     * Get Filter by subscription name for exact query. 
     * @return SubscriptionNames Filter by subscription name for exact query.
     */
    public String [] getSubscriptionNames() {
        return this.SubscriptionNames;
    }

    /**
     * Set Filter by subscription name for exact query.
     * @param SubscriptionNames Filter by subscription name for exact query.
     */
    public void setSubscriptionNames(String [] SubscriptionNames) {
        this.SubscriptionNames = SubscriptionNames;
    }

    public FilterSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterSubscription(FilterSubscription source) {
        if (source.ConsumerHasCount != null) {
            this.ConsumerHasCount = new Boolean(source.ConsumerHasCount);
        }
        if (source.ConsumerHasBacklog != null) {
            this.ConsumerHasBacklog = new Boolean(source.ConsumerHasBacklog);
        }
        if (source.ConsumerHasExpired != null) {
            this.ConsumerHasExpired = new Boolean(source.ConsumerHasExpired);
        }
        if (source.SubscriptionNames != null) {
            this.SubscriptionNames = new String[source.SubscriptionNames.length];
            for (int i = 0; i < source.SubscriptionNames.length; i++) {
                this.SubscriptionNames[i] = new String(source.SubscriptionNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerHasCount", this.ConsumerHasCount);
        this.setParamSimple(map, prefix + "ConsumerHasBacklog", this.ConsumerHasBacklog);
        this.setParamSimple(map, prefix + "ConsumerHasExpired", this.ConsumerHasExpired);
        this.setParamArraySimple(map, prefix + "SubscriptionNames.", this.SubscriptionNames);

    }
}

