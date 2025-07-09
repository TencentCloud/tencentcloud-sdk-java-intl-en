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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribesRequest extends AbstractModel {

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Data subscription instance name
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * ID of bound database instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Data subscription instance channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Billing mode filter. Default value: 1 (pay-as-you-go)
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * Subscribed database product, such as MySQL
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
    */
    @SerializedName("SubsStatus")
    @Expose
    private String [] SubsStatus;

    /**
    * Starting offset of returned results
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned at a time
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * Tag filtering condition
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * Subscription instance edition. `txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
     * Get Data subscription instance ID 
     * @return SubscribeId Data subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Data subscription instance ID
     * @param SubscribeId Data subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Data subscription instance name 
     * @return SubscribeName Data subscription instance name
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set Data subscription instance name
     * @param SubscribeName Data subscription instance name
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get ID of bound database instance 
     * @return InstanceId ID of bound database instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of bound database instance
     * @param InstanceId ID of bound database instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Data subscription instance channel ID 
     * @return ChannelId Data subscription instance channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Data subscription instance channel ID
     * @param ChannelId Data subscription instance channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Billing mode filter. Default value: 1 (pay-as-you-go) 
     * @return PayType Billing mode filter. Default value: 1 (pay-as-you-go)
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing mode filter. Default value: 1 (pay-as-you-go)
     * @param PayType Billing mode filter. Default value: 1 (pay-as-you-go)
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Subscribed database product, such as MySQL 
     * @return Product Subscribed database product, such as MySQL
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Subscribed database product, such as MySQL
     * @param Product Subscribed database product, such as MySQL
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining 
     * @return Status Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining
     * @param Status Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Data subscription instance configuration status. Valid values: unconfigure, configuring, configured 
     * @return SubsStatus Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
     */
    public String [] getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
     * @param SubsStatus Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
     */
    public void setSubsStatus(String [] SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get Starting offset of returned results 
     * @return Offset Starting offset of returned results
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of returned results
     * @param Offset Starting offset of returned results
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned at a time 
     * @return Limit Number of results to be returned at a time
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned at a time
     * @param Limit Number of results to be returned at a time
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time 
     * @return OrderDirection Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time
     * @param OrderDirection Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get Tag filtering condition 
     * @return TagFilters Tag filtering condition
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filtering condition
     * @param TagFilters Tag filtering condition
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get Subscription instance edition. `txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition 
     * @return SubscribeVersion Subscription instance edition. `txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set Subscription instance edition. `txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
     * @param SubscribeVersion Subscription instance edition. `txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
    }

    public DescribeSubscribesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribesRequest(DescribeSubscribesRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.SubsStatus != null) {
            this.SubsStatus = new String[source.SubsStatus.length];
            for (int i = 0; i < source.SubsStatus.length; i++) {
                this.SubsStatus[i] = new String(source.SubsStatus[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.SubscribeVersion != null) {
            this.SubscribeVersion = new String(source.SubscribeVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "SubsStatus.", this.SubsStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);

    }
}

