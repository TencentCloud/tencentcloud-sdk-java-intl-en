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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDataKeyDetailRequest extends AbstractModel {

    /**
    * Meaning matches the Offset in SQL queries, indicates the retrieval starts from the Offset-th element in a sequentially arranged array, defaults to 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Specifies the maximum number of elements to retrieve, same as the Limit in SQL queries. default value is 10. maximum value is 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter by creator role. default 0 means data keys created by the user, 1 means data keys automatically created by authorized cloud services.
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * Sorts according to the creation time of DataKey. 0 indicates descending sort. 1 indicates ascending sort.
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Filter based on DataKey state. 0 means all datakeys, 1 means querying only Enabled datakeys, 2 means querying only Disabled datakeys, 3 means querying datakeys in PendingDelete state (keys in scheduled deletion status).
    */
    @SerializedName("KeyState")
    @Expose
    private Long KeyState;

    /**
    * Performs a fuzzy match query based on DataKeyId or DataKeyName.
    */
    @SerializedName("SearchKeyAlias")
    @Expose
    private String SearchKeyAlias;

    /**
    * Filters data keys by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys requiring user-imported key material. "ALL" or leave unset queries both types. case-sensitive.
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * HSM cluster ID corresponding to KMS advanced edition.
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * Specifies the globally unique identifier of the root key.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Length of the data key.
    */
    @SerializedName("DataKeyLen")
    @Expose
    private Long DataKeyLen;

    /**
    * Tag filtering conditions.
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get Meaning matches the Offset in SQL queries, indicates the retrieval starts from the Offset-th element in a sequentially arranged array, defaults to 0. 
     * @return Offset Meaning matches the Offset in SQL queries, indicates the retrieval starts from the Offset-th element in a sequentially arranged array, defaults to 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Meaning matches the Offset in SQL queries, indicates the retrieval starts from the Offset-th element in a sequentially arranged array, defaults to 0.
     * @param Offset Meaning matches the Offset in SQL queries, indicates the retrieval starts from the Offset-th element in a sequentially arranged array, defaults to 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Specifies the maximum number of elements to retrieve, same as the Limit in SQL queries. default value is 10. maximum value is 200. 
     * @return Limit Specifies the maximum number of elements to retrieve, same as the Limit in SQL queries. default value is 10. maximum value is 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Specifies the maximum number of elements to retrieve, same as the Limit in SQL queries. default value is 10. maximum value is 200.
     * @param Limit Specifies the maximum number of elements to retrieve, same as the Limit in SQL queries. default value is 10. maximum value is 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter by creator role. default 0 means data keys created by the user, 1 means data keys automatically created by authorized cloud services. 
     * @return Role Filter by creator role. default 0 means data keys created by the user, 1 means data keys automatically created by authorized cloud services.
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set Filter by creator role. default 0 means data keys created by the user, 1 means data keys automatically created by authorized cloud services.
     * @param Role Filter by creator role. default 0 means data keys created by the user, 1 means data keys automatically created by authorized cloud services.
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get Sorts according to the creation time of DataKey. 0 indicates descending sort. 1 indicates ascending sort. 
     * @return OrderType Sorts according to the creation time of DataKey. 0 indicates descending sort. 1 indicates ascending sort.
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorts according to the creation time of DataKey. 0 indicates descending sort. 1 indicates ascending sort.
     * @param OrderType Sorts according to the creation time of DataKey. 0 indicates descending sort. 1 indicates ascending sort.
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Filter based on DataKey state. 0 means all datakeys, 1 means querying only Enabled datakeys, 2 means querying only Disabled datakeys, 3 means querying datakeys in PendingDelete state (keys in scheduled deletion status). 
     * @return KeyState Filter based on DataKey state. 0 means all datakeys, 1 means querying only Enabled datakeys, 2 means querying only Disabled datakeys, 3 means querying datakeys in PendingDelete state (keys in scheduled deletion status).
     */
    public Long getKeyState() {
        return this.KeyState;
    }

    /**
     * Set Filter based on DataKey state. 0 means all datakeys, 1 means querying only Enabled datakeys, 2 means querying only Disabled datakeys, 3 means querying datakeys in PendingDelete state (keys in scheduled deletion status).
     * @param KeyState Filter based on DataKey state. 0 means all datakeys, 1 means querying only Enabled datakeys, 2 means querying only Disabled datakeys, 3 means querying datakeys in PendingDelete state (keys in scheduled deletion status).
     */
    public void setKeyState(Long KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get Performs a fuzzy match query based on DataKeyId or DataKeyName. 
     * @return SearchKeyAlias Performs a fuzzy match query based on DataKeyId or DataKeyName.
     */
    public String getSearchKeyAlias() {
        return this.SearchKeyAlias;
    }

    /**
     * Set Performs a fuzzy match query based on DataKeyId or DataKeyName.
     * @param SearchKeyAlias Performs a fuzzy match query based on DataKeyId or DataKeyName.
     */
    public void setSearchKeyAlias(String SearchKeyAlias) {
        this.SearchKeyAlias = SearchKeyAlias;
    }

    /**
     * Get Filters data keys by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys requiring user-imported key material. "ALL" or leave unset queries both types. case-sensitive. 
     * @return Origin Filters data keys by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys requiring user-imported key material. "ALL" or leave unset queries both types. case-sensitive.
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Filters data keys by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys requiring user-imported key material. "ALL" or leave unset queries both types. case-sensitive.
     * @param Origin Filters data keys by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys requiring user-imported key material. "ALL" or leave unset queries both types. case-sensitive.
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get HSM cluster ID corresponding to KMS advanced edition. 
     * @return HsmClusterId HSM cluster ID corresponding to KMS advanced edition.
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HSM cluster ID corresponding to KMS advanced edition.
     * @param HsmClusterId HSM cluster ID corresponding to KMS advanced edition.
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get Specifies the globally unique identifier of the root key. 
     * @return KeyId Specifies the globally unique identifier of the root key.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Specifies the globally unique identifier of the root key.
     * @param KeyId Specifies the globally unique identifier of the root key.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Length of the data key. 
     * @return DataKeyLen Length of the data key.
     */
    public Long getDataKeyLen() {
        return this.DataKeyLen;
    }

    /**
     * Set Length of the data key.
     * @param DataKeyLen Length of the data key.
     */
    public void setDataKeyLen(Long DataKeyLen) {
        this.DataKeyLen = DataKeyLen;
    }

    /**
     * Get Tag filtering conditions. 
     * @return TagFilters Tag filtering conditions.
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filtering conditions.
     * @param TagFilters Tag filtering conditions.
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public ListDataKeyDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDataKeyDetailRequest(ListDataKeyDetailRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.KeyState != null) {
            this.KeyState = new Long(source.KeyState);
        }
        if (source.SearchKeyAlias != null) {
            this.SearchKeyAlias = new String(source.SearchKeyAlias);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.DataKeyLen != null) {
            this.DataKeyLen = new Long(source.DataKeyLen);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "SearchKeyAlias", this.SearchKeyAlias);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "DataKeyLen", this.DataKeyLen);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

