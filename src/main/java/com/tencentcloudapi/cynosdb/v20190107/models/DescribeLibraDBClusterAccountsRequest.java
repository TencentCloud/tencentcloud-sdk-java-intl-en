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

public class DescribeLibraDBClusterAccountsRequest extends AbstractModel {

    /**
    * Analysis Cluster id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Account name.
    */
    @SerializedName("AccountNames")
    @Expose
    private String [] AccountNames;

    /**
    * Fuzzy matching keyword
    */
    @SerializedName("AccountRegular")
    @Expose
    private String AccountRegular;

    /**
    * host name
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Analysis Cluster id 
     * @return ClusterId Analysis Cluster id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Analysis Cluster id
     * @param ClusterId Analysis Cluster id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Account name. 
     * @return AccountNames Account name.
     */
    public String [] getAccountNames() {
        return this.AccountNames;
    }

    /**
     * Set Account name.
     * @param AccountNames Account name.
     */
    public void setAccountNames(String [] AccountNames) {
        this.AccountNames = AccountNames;
    }

    /**
     * Get Fuzzy matching keyword 
     * @return AccountRegular Fuzzy matching keyword
     */
    public String getAccountRegular() {
        return this.AccountRegular;
    }

    /**
     * Set Fuzzy matching keyword
     * @param AccountRegular Fuzzy matching keyword
     */
    public void setAccountRegular(String AccountRegular) {
        this.AccountRegular = AccountRegular;
    }

    /**
     * Get host name 
     * @return Hosts host name
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set host name
     * @param Hosts host name
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLibraDBClusterAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBClusterAccountsRequest(DescribeLibraDBClusterAccountsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountNames != null) {
            this.AccountNames = new String[source.AccountNames.length];
            for (int i = 0; i < source.AccountNames.length; i++) {
                this.AccountNames[i] = new String(source.AccountNames[i]);
            }
        }
        if (source.AccountRegular != null) {
            this.AccountRegular = new String(source.AccountRegular);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "AccountNames.", this.AccountNames);
        this.setParamSimple(map, prefix + "AccountRegular", this.AccountRegular);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

