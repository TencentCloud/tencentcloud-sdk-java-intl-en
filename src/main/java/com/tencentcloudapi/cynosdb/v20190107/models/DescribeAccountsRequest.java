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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Account list to filter
    */
    @SerializedName("AccountNames")
    @Expose
    private String [] AccountNames;

    /**
    * Database type. Valid values: 
<li> MYSQL </li>
This parameter is no longer in use.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Account list to filter
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Limit amount
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Fuzzy match a keyword (match both AccountName and AccountHost at the same time, return the union of results, and support regular expressions)
    */
    @SerializedName("AccountRegular")
    @Expose
    private String AccountRegular;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Account list to filter 
     * @return AccountNames Account list to filter
     */
    public String [] getAccountNames() {
        return this.AccountNames;
    }

    /**
     * Set Account list to filter
     * @param AccountNames Account list to filter
     */
    public void setAccountNames(String [] AccountNames) {
        this.AccountNames = AccountNames;
    }

    /**
     * Get Database type. Valid values: 
<li> MYSQL </li>
This parameter is no longer in use. 
     * @return DbType Database type. Valid values: 
<li> MYSQL </li>
This parameter is no longer in use.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type. Valid values: 
<li> MYSQL </li>
This parameter is no longer in use.
     * @param DbType Database type. Valid values: 
<li> MYSQL </li>
This parameter is no longer in use.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Account list to filter 
     * @return Hosts Account list to filter
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Account list to filter
     * @param Hosts Account list to filter
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Limit amount 
     * @return Limit Limit amount
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit amount
     * @param Limit Limit amount
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Fuzzy match a keyword (match both AccountName and AccountHost at the same time, return the union of results, and support regular expressions) 
     * @return AccountRegular Fuzzy match a keyword (match both AccountName and AccountHost at the same time, return the union of results, and support regular expressions)
     */
    public String getAccountRegular() {
        return this.AccountRegular;
    }

    /**
     * Set Fuzzy match a keyword (match both AccountName and AccountHost at the same time, return the union of results, and support regular expressions)
     * @param AccountRegular Fuzzy match a keyword (match both AccountName and AccountHost at the same time, return the union of results, and support regular expressions)
     */
    public void setAccountRegular(String AccountRegular) {
        this.AccountRegular = AccountRegular;
    }

    public DescribeAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountsRequest(DescribeAccountsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountNames != null) {
            this.AccountNames = new String[source.AccountNames.length];
            for (int i = 0; i < source.AccountNames.length; i++) {
                this.AccountNames[i] = new String(source.AccountNames[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountRegular != null) {
            this.AccountRegular = new String(source.AccountRegular);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "AccountNames.", this.AccountNames);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountRegular", this.AccountRegular);

    }
}

