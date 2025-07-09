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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeJobsRequest extends AbstractModel {

    /**
    * Subscription ID (exact match)
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Subscription name (prefix fuzzy match)
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * Subscribed cloud database instance ID (exact match)
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Payment method. Valid values: 0 (monthly subscription); 1 (pay-as-you-go).
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Subscribed database product. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Data subscription lifecycle status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Data subscription status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
    */
    @SerializedName("SubsStatus")
    @Expose
    private String [] SubsStatus;

    /**
    * Starting offset for returned results. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned at a time. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * Tag filter condition, the relationship between multiple TagFilters is and.
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get Subscription ID (exact match) 
     * @return SubscribeId Subscription ID (exact match)
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Subscription ID (exact match)
     * @param SubscribeId Subscription ID (exact match)
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Subscription name (prefix fuzzy match) 
     * @return SubscribeName Subscription name (prefix fuzzy match)
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set Subscription name (prefix fuzzy match)
     * @param SubscribeName Subscription name (prefix fuzzy match)
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get Subscribed cloud database instance ID (exact match) 
     * @return InstanceId Subscribed cloud database instance ID (exact match)
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Subscribed cloud database instance ID (exact match)
     * @param InstanceId Subscribed cloud database instance ID (exact match)
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Subscribed database product. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported. 
     * @return Product Subscribed database product. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Subscribed database product. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
     * @param Product Subscribed database product. Currently, cynosdbmysql, mariadb, mongodb, mysql, percona, tdpg, tdsqlpercona are supported.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Data subscription lifecycle status. Valid values: normal, isolating, isolated, offline, post2PrePayIng. 
     * @return Status Data subscription lifecycle status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Data subscription lifecycle status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
     * @param Status Data subscription lifecycle status. Valid values: normal, isolating, isolated, offline, post2PrePayIng.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Data subscription status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error. 
     * @return SubsStatus Data subscription status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
     */
    public String [] getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set Data subscription status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
     * @param SubsStatus Data subscription status. Valid values: notStarted, checking, checkNotPass, checkPass, starting, running, error.
     */
    public void setSubsStatus(String [] SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get Starting offset for returned results. Default value: 0. 
     * @return Offset Starting offset for returned results. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset for returned results. Default value: 0.
     * @param Offset Starting offset for returned results. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned at a time. Default value: 20. Maximum value: 100. 
     * @return Limit Number of results to be returned at a time. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned at a time. Default value: 20. Maximum value: 100.
     * @param Limit Number of results to be returned at a time. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time. 
     * @return OrderDirection Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time.
     * @param OrderDirection Sorting order. Valid values: DESC, ASC. Default value: DESC, indicating descending by creation time.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get Tag filter condition, the relationship between multiple TagFilters is and. 
     * @return TagFilters Tag filter condition, the relationship between multiple TagFilters is and.
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filter condition, the relationship between multiple TagFilters is and.
     * @param TagFilters Tag filter condition, the relationship between multiple TagFilters is and.
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeSubscribeJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeJobsRequest(DescribeSubscribeJobsRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "SubsStatus.", this.SubsStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

