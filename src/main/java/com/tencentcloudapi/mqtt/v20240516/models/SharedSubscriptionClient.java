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

public class SharedSubscriptionClient extends AbstractModel {

    /**
    * Client ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Shared subscription group name
    */
    @SerializedName("SharedName")
    @Expose
    private String SharedName;

    /**
    * Expression list of subscriptions under the shared group
    */
    @SerializedName("TopicFilter")
    @Expose
    private String TopicFilter;

    /**
    * Online status
    */
    @SerializedName("Online")
    @Expose
    private Boolean Online;

    /**
     * Get Client ID 
     * @return ClientId Client ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID
     * @param ClientId Client ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Shared subscription group name 
     * @return SharedName Shared subscription group name
     */
    public String getSharedName() {
        return this.SharedName;
    }

    /**
     * Set Shared subscription group name
     * @param SharedName Shared subscription group name
     */
    public void setSharedName(String SharedName) {
        this.SharedName = SharedName;
    }

    /**
     * Get Expression list of subscriptions under the shared group 
     * @return TopicFilter Expression list of subscriptions under the shared group
     */
    public String getTopicFilter() {
        return this.TopicFilter;
    }

    /**
     * Set Expression list of subscriptions under the shared group
     * @param TopicFilter Expression list of subscriptions under the shared group
     */
    public void setTopicFilter(String TopicFilter) {
        this.TopicFilter = TopicFilter;
    }

    /**
     * Get Online status 
     * @return Online Online status
     */
    public Boolean getOnline() {
        return this.Online;
    }

    /**
     * Set Online status
     * @param Online Online status
     */
    public void setOnline(Boolean Online) {
        this.Online = Online;
    }

    public SharedSubscriptionClient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedSubscriptionClient(SharedSubscriptionClient source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.SharedName != null) {
            this.SharedName = new String(source.SharedName);
        }
        if (source.TopicFilter != null) {
            this.TopicFilter = new String(source.TopicFilter);
        }
        if (source.Online != null) {
            this.Online = new Boolean(source.Online);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "SharedName", this.SharedName);
        this.setParamSimple(map, prefix + "TopicFilter", this.TopicFilter);
        this.setParamSimple(map, prefix + "Online", this.Online);

    }
}

