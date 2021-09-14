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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSecretsRequest extends AbstractModel{

    /**
    * Starting position of the list, starting at 0. If not specified, 0 is used by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of returned Secrets in a query. If not set or set to 0, 20 is used by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting order according to the creation time. If not set or set to 0, descending order is used; if set to 1, ascending order is used.
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Filter based on credential status.
The default value is 0, indicating to query all.
1: query the list of credentials in `Enabled` status.
2: query the list of credentials in `Disabled` status.
3: query the list of credentials in `PendingDelete` status.
4: query the list of credentials in `PendingCreate` status.
5: query the list of credentials in `CreateFailed` status.
The `PendingCreate` and `CreateFailed` status only take effect when `SecretType` is Tencent Cloud service credential
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Filter according to Secret names. If left empty, this filter is not applied.
    */
    @SerializedName("SearchSecretName")
    @Expose
    private String SearchSecretName;

    /**
    * Tag filter.
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * `0` (default): user-defined secret.
`1`: Tencent Cloud services secret.
`2`: SSH key secret.
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * 
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get Starting position of the list, starting at 0. If not specified, 0 is used by default. 
     * @return Offset Starting position of the list, starting at 0. If not specified, 0 is used by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting position of the list, starting at 0. If not specified, 0 is used by default.
     * @param Offset Starting position of the list, starting at 0. If not specified, 0 is used by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of returned Secrets in a query. If not set or set to 0, 20 is used by default. 
     * @return Limit Maximum number of returned Secrets in a query. If not set or set to 0, 20 is used by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of returned Secrets in a query. If not set or set to 0, 20 is used by default.
     * @param Limit Maximum number of returned Secrets in a query. If not set or set to 0, 20 is used by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting order according to the creation time. If not set or set to 0, descending order is used; if set to 1, ascending order is used. 
     * @return OrderType Sorting order according to the creation time. If not set or set to 0, descending order is used; if set to 1, ascending order is used.
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting order according to the creation time. If not set or set to 0, descending order is used; if set to 1, ascending order is used.
     * @param OrderType Sorting order according to the creation time. If not set or set to 0, descending order is used; if set to 1, ascending order is used.
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Filter based on credential status.
The default value is 0, indicating to query all.
1: query the list of credentials in `Enabled` status.
2: query the list of credentials in `Disabled` status.
3: query the list of credentials in `PendingDelete` status.
4: query the list of credentials in `PendingCreate` status.
5: query the list of credentials in `CreateFailed` status.
The `PendingCreate` and `CreateFailed` status only take effect when `SecretType` is Tencent Cloud service credential 
     * @return State Filter based on credential status.
The default value is 0, indicating to query all.
1: query the list of credentials in `Enabled` status.
2: query the list of credentials in `Disabled` status.
3: query the list of credentials in `PendingDelete` status.
4: query the list of credentials in `PendingCreate` status.
5: query the list of credentials in `CreateFailed` status.
The `PendingCreate` and `CreateFailed` status only take effect when `SecretType` is Tencent Cloud service credential
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Filter based on credential status.
The default value is 0, indicating to query all.
1: query the list of credentials in `Enabled` status.
2: query the list of credentials in `Disabled` status.
3: query the list of credentials in `PendingDelete` status.
4: query the list of credentials in `PendingCreate` status.
5: query the list of credentials in `CreateFailed` status.
The `PendingCreate` and `CreateFailed` status only take effect when `SecretType` is Tencent Cloud service credential
     * @param State Filter based on credential status.
The default value is 0, indicating to query all.
1: query the list of credentials in `Enabled` status.
2: query the list of credentials in `Disabled` status.
3: query the list of credentials in `PendingDelete` status.
4: query the list of credentials in `PendingCreate` status.
5: query the list of credentials in `CreateFailed` status.
The `PendingCreate` and `CreateFailed` status only take effect when `SecretType` is Tencent Cloud service credential
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Filter according to Secret names. If left empty, this filter is not applied. 
     * @return SearchSecretName Filter according to Secret names. If left empty, this filter is not applied.
     */
    public String getSearchSecretName() {
        return this.SearchSecretName;
    }

    /**
     * Set Filter according to Secret names. If left empty, this filter is not applied.
     * @param SearchSecretName Filter according to Secret names. If left empty, this filter is not applied.
     */
    public void setSearchSecretName(String SearchSecretName) {
        this.SearchSecretName = SearchSecretName;
    }

    /**
     * Get Tag filter. 
     * @return TagFilters Tag filter.
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filter.
     * @param TagFilters Tag filter.
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get `0` (default): user-defined secret.
`1`: Tencent Cloud services secret.
`2`: SSH key secret. 
     * @return SecretType `0` (default): user-defined secret.
`1`: Tencent Cloud services secret.
`2`: SSH key secret.
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set `0` (default): user-defined secret.
`1`: Tencent Cloud services secret.
`2`: SSH key secret.
     * @param SecretType `0` (default): user-defined secret.
`1`: Tencent Cloud services secret.
`2`: SSH key secret.
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get  
     * @return ProductName 
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 
     * @param ProductName 
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public ListSecretsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSecretsRequest(ListSecretsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SearchSecretName != null) {
            this.SearchSecretName = new String(source.SearchSecretName);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SearchSecretName", this.SearchSecretName);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

