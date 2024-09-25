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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostsRequest extends AbstractModel {

    /**
    * Protection domain. If a specific protection domain is to be queried, this parameter should be input. It requires an accurate domain and does not support fuzzy search.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protection domain ID. If it is to query a specific protection domain, this parameter is input, requiring the accurate domain ID. This parameter does not support fuzzy search.
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Searching criteria, fuzzy search on domain based on this parameter
    */
    @SerializedName("Search")
    @Expose
    private String Search;

    /**
    * Complex search criteria
    */
    @SerializedName("Item")
    @Expose
    private SearchItem Item;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get Protection domain. If a specific protection domain is to be queried, this parameter should be input. It requires an accurate domain and does not support fuzzy search. 
     * @return Domain Protection domain. If a specific protection domain is to be queried, this parameter should be input. It requires an accurate domain and does not support fuzzy search.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Protection domain. If a specific protection domain is to be queried, this parameter should be input. It requires an accurate domain and does not support fuzzy search.
     * @param Domain Protection domain. If a specific protection domain is to be queried, this parameter should be input. It requires an accurate domain and does not support fuzzy search.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protection domain ID. If it is to query a specific protection domain, this parameter is input, requiring the accurate domain ID. This parameter does not support fuzzy search. 
     * @return DomainId Protection domain ID. If it is to query a specific protection domain, this parameter is input, requiring the accurate domain ID. This parameter does not support fuzzy search.
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Protection domain ID. If it is to query a specific protection domain, this parameter is input, requiring the accurate domain ID. This parameter does not support fuzzy search.
     * @param DomainId Protection domain ID. If it is to query a specific protection domain, this parameter is input, requiring the accurate domain ID. This parameter does not support fuzzy search.
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Searching criteria, fuzzy search on domain based on this parameter 
     * @return Search Searching criteria, fuzzy search on domain based on this parameter
     */
    public String getSearch() {
        return this.Search;
    }

    /**
     * Set Searching criteria, fuzzy search on domain based on this parameter
     * @param Search Searching criteria, fuzzy search on domain based on this parameter
     */
    public void setSearch(String Search) {
        this.Search = Search;
    }

    /**
     * Get Complex search criteria 
     * @return Item Complex search criteria
     */
    public SearchItem getItem() {
        return this.Item;
    }

    /**
     * Set Complex search criteria
     * @param Item Complex search criteria
     */
    public void setItem(SearchItem Item) {
        this.Item = Item;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public DescribeHostsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostsRequest(DescribeHostsRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Search != null) {
            this.Search = new String(source.Search);
        }
        if (source.Item != null) {
            this.Item = new SearchItem(source.Item);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Search", this.Search);
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

