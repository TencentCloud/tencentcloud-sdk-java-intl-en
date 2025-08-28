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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublishSubscribeRequest extends AbstractModel {

    /**
    * Instance ID. For example, mssql-j8kv137v.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Publish/subscribe instance ID, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by subscription instance ID is performed for this field. When the value of InstanceId is a subscription instance, filtering by publishing instance ID is performed for this field.
    */
    @SerializedName("PubOrSubInstanceId")
    @Expose
    private String PubOrSubInstanceId;

    /**
    * Private address of the publish/subscribe instance, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by private IP address of the subscription instance is performed for this field. When the value of InstanceId is a subscription instance, filtering by private IP address of the publishing instance is performed for this field.
    */
    @SerializedName("PubOrSubInstanceIp")
    @Expose
    private String PubOrSubInstanceIp;

    /**
    * Publish/subscribe ID, which is used for filtering.
    */
    @SerializedName("PublishSubscribeId")
    @Expose
    private Long PublishSubscribeId;

    /**
    * Publish/subscribe name, which is used for filtering.
    */
    @SerializedName("PublishSubscribeName")
    @Expose
    private String PublishSubscribeName;

    /**
    * Publishing database name, which is used for filtering.
    */
    @SerializedName("PublishDBName")
    @Expose
    private String PublishDBName;

    /**
    * Subscription database name, which is used for filtering.
    */
    @SerializedName("SubscribeDBName")
    @Expose
    private String SubscribeDBName;

    /**
    * Pagination number.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID. For example, mssql-j8kv137v. 
     * @return InstanceId Instance ID. For example, mssql-j8kv137v.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. For example, mssql-j8kv137v.
     * @param InstanceId Instance ID. For example, mssql-j8kv137v.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Publish/subscribe instance ID, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by subscription instance ID is performed for this field. When the value of InstanceId is a subscription instance, filtering by publishing instance ID is performed for this field. 
     * @return PubOrSubInstanceId Publish/subscribe instance ID, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by subscription instance ID is performed for this field. When the value of InstanceId is a subscription instance, filtering by publishing instance ID is performed for this field.
     */
    public String getPubOrSubInstanceId() {
        return this.PubOrSubInstanceId;
    }

    /**
     * Set Publish/subscribe instance ID, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by subscription instance ID is performed for this field. When the value of InstanceId is a subscription instance, filtering by publishing instance ID is performed for this field.
     * @param PubOrSubInstanceId Publish/subscribe instance ID, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by subscription instance ID is performed for this field. When the value of InstanceId is a subscription instance, filtering by publishing instance ID is performed for this field.
     */
    public void setPubOrSubInstanceId(String PubOrSubInstanceId) {
        this.PubOrSubInstanceId = PubOrSubInstanceId;
    }

    /**
     * Get Private address of the publish/subscribe instance, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by private IP address of the subscription instance is performed for this field. When the value of InstanceId is a subscription instance, filtering by private IP address of the publishing instance is performed for this field. 
     * @return PubOrSubInstanceIp Private address of the publish/subscribe instance, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by private IP address of the subscription instance is performed for this field. When the value of InstanceId is a subscription instance, filtering by private IP address of the publishing instance is performed for this field.
     */
    public String getPubOrSubInstanceIp() {
        return this.PubOrSubInstanceIp;
    }

    /**
     * Set Private address of the publish/subscribe instance, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by private IP address of the subscription instance is performed for this field. When the value of InstanceId is a subscription instance, filtering by private IP address of the publishing instance is performed for this field.
     * @param PubOrSubInstanceIp Private address of the publish/subscribe instance, which is related to whether InstanceId is a publishing instance or a subscription instance. When the value of InstanceId is a publishing instance, filtering by private IP address of the subscription instance is performed for this field. When the value of InstanceId is a subscription instance, filtering by private IP address of the publishing instance is performed for this field.
     */
    public void setPubOrSubInstanceIp(String PubOrSubInstanceIp) {
        this.PubOrSubInstanceIp = PubOrSubInstanceIp;
    }

    /**
     * Get Publish/subscribe ID, which is used for filtering. 
     * @return PublishSubscribeId Publish/subscribe ID, which is used for filtering.
     */
    public Long getPublishSubscribeId() {
        return this.PublishSubscribeId;
    }

    /**
     * Set Publish/subscribe ID, which is used for filtering.
     * @param PublishSubscribeId Publish/subscribe ID, which is used for filtering.
     */
    public void setPublishSubscribeId(Long PublishSubscribeId) {
        this.PublishSubscribeId = PublishSubscribeId;
    }

    /**
     * Get Publish/subscribe name, which is used for filtering. 
     * @return PublishSubscribeName Publish/subscribe name, which is used for filtering.
     */
    public String getPublishSubscribeName() {
        return this.PublishSubscribeName;
    }

    /**
     * Set Publish/subscribe name, which is used for filtering.
     * @param PublishSubscribeName Publish/subscribe name, which is used for filtering.
     */
    public void setPublishSubscribeName(String PublishSubscribeName) {
        this.PublishSubscribeName = PublishSubscribeName;
    }

    /**
     * Get Publishing database name, which is used for filtering. 
     * @return PublishDBName Publishing database name, which is used for filtering.
     */
    public String getPublishDBName() {
        return this.PublishDBName;
    }

    /**
     * Set Publishing database name, which is used for filtering.
     * @param PublishDBName Publishing database name, which is used for filtering.
     */
    public void setPublishDBName(String PublishDBName) {
        this.PublishDBName = PublishDBName;
    }

    /**
     * Get Subscription database name, which is used for filtering. 
     * @return SubscribeDBName Subscription database name, which is used for filtering.
     */
    public String getSubscribeDBName() {
        return this.SubscribeDBName;
    }

    /**
     * Set Subscription database name, which is used for filtering.
     * @param SubscribeDBName Subscription database name, which is used for filtering.
     */
    public void setSubscribeDBName(String SubscribeDBName) {
        this.SubscribeDBName = SubscribeDBName;
    }

    /**
     * Get Pagination number. 
     * @return Offset Pagination number.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination number.
     * @param Offset Pagination number.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination size. 
     * @return Limit Pagination size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size.
     * @param Limit Pagination size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePublishSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublishSubscribeRequest(DescribePublishSubscribeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PubOrSubInstanceId != null) {
            this.PubOrSubInstanceId = new String(source.PubOrSubInstanceId);
        }
        if (source.PubOrSubInstanceIp != null) {
            this.PubOrSubInstanceIp = new String(source.PubOrSubInstanceIp);
        }
        if (source.PublishSubscribeId != null) {
            this.PublishSubscribeId = new Long(source.PublishSubscribeId);
        }
        if (source.PublishSubscribeName != null) {
            this.PublishSubscribeName = new String(source.PublishSubscribeName);
        }
        if (source.PublishDBName != null) {
            this.PublishDBName = new String(source.PublishDBName);
        }
        if (source.SubscribeDBName != null) {
            this.SubscribeDBName = new String(source.SubscribeDBName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PubOrSubInstanceId", this.PubOrSubInstanceId);
        this.setParamSimple(map, prefix + "PubOrSubInstanceIp", this.PubOrSubInstanceIp);
        this.setParamSimple(map, prefix + "PublishSubscribeId", this.PublishSubscribeId);
        this.setParamSimple(map, prefix + "PublishSubscribeName", this.PublishSubscribeName);
        this.setParamSimple(map, prefix + "PublishDBName", this.PublishDBName);
        this.setParamSimple(map, prefix + "SubscribeDBName", this.SubscribeDBName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

