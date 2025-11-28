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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientSubscriptionInfo extends AbstractModel {

    /**
    * Client ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * Subscribed topic.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Subscription expression.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * Subscription method.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

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
     * Get Client IP.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientAddr Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientAddr Client IP.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get Subscribed topic.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Topic Subscribed topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Subscribed topic.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Topic Subscribed topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Subscription expression.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubString Subscription expression.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set Subscription expression.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubString Subscription expression.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get Subscription method.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpressionType Subscription method.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set Subscription method.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpressionType Subscription method.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    public ClientSubscriptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientSubscriptionInfo(ClientSubscriptionInfo source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);

    }
}

