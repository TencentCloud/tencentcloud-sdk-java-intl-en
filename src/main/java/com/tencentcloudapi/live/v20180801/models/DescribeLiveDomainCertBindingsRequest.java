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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainCertBindingsRequest extends AbstractModel {

    /**
    * The keyword to use to search for domains.
    */
    @SerializedName("DomainSearch")
    @Expose
    private String DomainSearch;

    /**
    * The number of records to skip before starting to return any results. 0 means to start from the first record and is the default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The maximum number of records to return. The default is 50.
If this parameter is not specified, up to 50 records will be returned.
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * The name of a particular domain to query.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Valid values:
ExpireTimeAsc: Sort the records by certificate expiration time in ascending order.
ExpireTimeDesc: Sort the records by certificate expiration time in descending order.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get The keyword to use to search for domains. 
     * @return DomainSearch The keyword to use to search for domains.
     */
    public String getDomainSearch() {
        return this.DomainSearch;
    }

    /**
     * Set The keyword to use to search for domains.
     * @param DomainSearch The keyword to use to search for domains.
     */
    public void setDomainSearch(String DomainSearch) {
        this.DomainSearch = DomainSearch;
    }

    /**
     * Get The number of records to skip before starting to return any results. 0 means to start from the first record and is the default. 
     * @return Offset The number of records to skip before starting to return any results. 0 means to start from the first record and is the default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The number of records to skip before starting to return any results. 0 means to start from the first record and is the default.
     * @param Offset The number of records to skip before starting to return any results. 0 means to start from the first record and is the default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The maximum number of records to return. The default is 50.
If this parameter is not specified, up to 50 records will be returned. 
     * @return Length The maximum number of records to return. The default is 50.
If this parameter is not specified, up to 50 records will be returned.
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set The maximum number of records to return. The default is 50.
If this parameter is not specified, up to 50 records will be returned.
     * @param Length The maximum number of records to return. The default is 50.
If this parameter is not specified, up to 50 records will be returned.
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get The name of a particular domain to query. 
     * @return DomainName The name of a particular domain to query.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The name of a particular domain to query.
     * @param DomainName The name of a particular domain to query.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Valid values:
ExpireTimeAsc: Sort the records by certificate expiration time in ascending order.
ExpireTimeDesc: Sort the records by certificate expiration time in descending order. 
     * @return OrderBy Valid values:
ExpireTimeAsc: Sort the records by certificate expiration time in ascending order.
ExpireTimeDesc: Sort the records by certificate expiration time in descending order.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Valid values:
ExpireTimeAsc: Sort the records by certificate expiration time in ascending order.
ExpireTimeDesc: Sort the records by certificate expiration time in descending order.
     * @param OrderBy Valid values:
ExpireTimeAsc: Sort the records by certificate expiration time in ascending order.
ExpireTimeDesc: Sort the records by certificate expiration time in descending order.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeLiveDomainCertBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveDomainCertBindingsRequest(DescribeLiveDomainCertBindingsRequest source) {
        if (source.DomainSearch != null) {
            this.DomainSearch = new String(source.DomainSearch);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainSearch", this.DomainSearch);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

