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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationMembersRequest extends AbstractModel {

    /**
    * Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit, which defaults to `10`. Value range: 1-50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * Search by member name or ID.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Entity name.
    */
    @SerializedName("AuthName")
    @Expose
    private String AuthName;

    /**
    * Abbreviation of the trusted service, which is required during querying the trusted service admin.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Member tag search list, with a maximum of 10.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Offset, which is an integer multiple of the value of `Limit`. Default value: `0`. 
     * @return Offset Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
     * @param Offset Offset, which is an integer multiple of the value of `Limit`. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit, which defaults to `10`. Value range: 1-50. 
     * @return Limit Limit, which defaults to `10`. Value range: 1-50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit, which defaults to `10`. Value range: 1-50.
     * @param Limit Limit, which defaults to `10`. Value range: 1-50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud). 
     * @return Lang Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
     * @param Lang Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get Search by member name or ID. 
     * @return SearchKey Search by member name or ID.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search by member name or ID.
     * @param SearchKey Search by member name or ID.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Entity name. 
     * @return AuthName Entity name.
     */
    public String getAuthName() {
        return this.AuthName;
    }

    /**
     * Set Entity name.
     * @param AuthName Entity name.
     */
    public void setAuthName(String AuthName) {
        this.AuthName = AuthName;
    }

    /**
     * Get Abbreviation of the trusted service, which is required during querying the trusted service admin. 
     * @return Product Abbreviation of the trusted service, which is required during querying the trusted service admin.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Abbreviation of the trusted service, which is required during querying the trusted service admin.
     * @param Product Abbreviation of the trusted service, which is required during querying the trusted service admin.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Member tag search list, with a maximum of 10. 
     * @return Tags Member tag search list, with a maximum of 10.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Member tag search list, with a maximum of 10.
     * @param Tags Member tag search list, with a maximum of 10.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public DescribeOrganizationMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMembersRequest(DescribeOrganizationMembersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.AuthName != null) {
            this.AuthName = new String(source.AuthName);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "AuthName", this.AuthName);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

