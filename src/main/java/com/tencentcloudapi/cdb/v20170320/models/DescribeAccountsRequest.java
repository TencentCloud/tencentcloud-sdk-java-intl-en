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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountsRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Record offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned for a single request. Value range: 1-100. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Regex for matching account names, which complies with the rules at MySQL's official website
    */
    @SerializedName("AccountRegexp")
    @Expose
    private String AccountRegexp;

    /**
    * Default none, support: ASC, DESC, asc, desc
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Time field for sorting. Options: CreateTime (account creation time), ModifyTime (update time), ModifyPasswordTime (password modification time).
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Regular expression to match the account host address (Host). The rule is the same as that on the MySQL official website.
    */
    @SerializedName("HostRegexp")
    @Expose
    private String HostRegexp;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Record offset. Default value: `0`. 
     * @return Offset Record offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. Default value: `0`.
     * @param Offset Record offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned for a single request. Value range: 1-100. Default value: `20`. 
     * @return Limit Number of results to be returned for a single request. Value range: 1-100. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned for a single request. Value range: 1-100. Default value: `20`.
     * @param Limit Number of results to be returned for a single request. Value range: 1-100. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Regex for matching account names, which complies with the rules at MySQL's official website 
     * @return AccountRegexp Regex for matching account names, which complies with the rules at MySQL's official website
     */
    public String getAccountRegexp() {
        return this.AccountRegexp;
    }

    /**
     * Set Regex for matching account names, which complies with the rules at MySQL's official website
     * @param AccountRegexp Regex for matching account names, which complies with the rules at MySQL's official website
     */
    public void setAccountRegexp(String AccountRegexp) {
        this.AccountRegexp = AccountRegexp;
    }

    /**
     * Get Default none, support: ASC, DESC, asc, desc 
     * @return SortBy Default none, support: ASC, DESC, asc, desc
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Default none, support: ASC, DESC, asc, desc
     * @param SortBy Default none, support: ASC, DESC, asc, desc
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Time field for sorting. Options: CreateTime (account creation time), ModifyTime (update time), ModifyPasswordTime (password modification time). 
     * @return OrderBy Time field for sorting. Options: CreateTime (account creation time), ModifyTime (update time), ModifyPasswordTime (password modification time).
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Time field for sorting. Options: CreateTime (account creation time), ModifyTime (update time), ModifyPasswordTime (password modification time).
     * @param OrderBy Time field for sorting. Options: CreateTime (account creation time), ModifyTime (update time), ModifyPasswordTime (password modification time).
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Regular expression to match the account host address (Host). The rule is the same as that on the MySQL official website. 
     * @return HostRegexp Regular expression to match the account host address (Host). The rule is the same as that on the MySQL official website.
     */
    public String getHostRegexp() {
        return this.HostRegexp;
    }

    /**
     * Set Regular expression to match the account host address (Host). The rule is the same as that on the MySQL official website.
     * @param HostRegexp Regular expression to match the account host address (Host). The rule is the same as that on the MySQL official website.
     */
    public void setHostRegexp(String HostRegexp) {
        this.HostRegexp = HostRegexp;
    }

    public DescribeAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountsRequest(DescribeAccountsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AccountRegexp != null) {
            this.AccountRegexp = new String(source.AccountRegexp);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.HostRegexp != null) {
            this.HostRegexp = new String(source.HostRegexp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AccountRegexp", this.AccountRegexp);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "HostRegexp", this.HostRegexp);

    }
}

