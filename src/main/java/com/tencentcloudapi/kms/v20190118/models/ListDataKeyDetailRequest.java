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
    * <p>It means the same as the Offset in SQL queries, indicating that this retrieval starts from the Offset-th element of the sequentially arranged array. It defaults to 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>The meaning is consistent with the Limit in SQL queries, indicating that this time up to Limit elements can be retrieved. The default value is 10, and the maximum value is 200.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter by creator role. Default value 0 indicates data keys created by the user, and 1 indicates data keys automatically created by authorized other Cloud services.</p>
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * <p>Sort by DataKey creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>Filter by DataKey status. 0 indicates all DataKeys, 1 indicates querying only Enabled DataKeys, 2 indicates querying only Disabled DataKeys, and 3 indicates querying DataKeys in PendingDelete state (keys in scheduled deletion status).</p>
    */
    @SerializedName("KeyState")
    @Expose
    private Long KeyState;

    /**
    * <p>Perform a fuzzy match query by DataKeyId or DataKeyName</p>
    */
    @SerializedName("SearchKeyAlias")
    @Expose
    private String SearchKeyAlias;

    /**
    * <p>Filter by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys with key material to import. "ALL" or leave unset queries both types. Case-sensitive.</p>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * <p>HSM Cluster ID corresponding to the KMS advanced edition. When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * <p>Root key globally unique identifier</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>Length of the data key</p>
    */
    @SerializedName("DataKeyLen")
    @Expose
    private Long DataKeyLen;

    /**
    * <p>Tag filtering condition</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>Member account information array</p>
    */
    @SerializedName("MemberAccounts")
    @Expose
    private MemberAccount [] MemberAccounts;

    /**
     * Get <p>It means the same as the Offset in SQL queries, indicating that this retrieval starts from the Offset-th element of the sequentially arranged array. It defaults to 0.</p> 
     * @return Offset <p>It means the same as the Offset in SQL queries, indicating that this retrieval starts from the Offset-th element of the sequentially arranged array. It defaults to 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>It means the same as the Offset in SQL queries, indicating that this retrieval starts from the Offset-th element of the sequentially arranged array. It defaults to 0.</p>
     * @param Offset <p>It means the same as the Offset in SQL queries, indicating that this retrieval starts from the Offset-th element of the sequentially arranged array. It defaults to 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>The meaning is consistent with the Limit in SQL queries, indicating that this time up to Limit elements can be retrieved. The default value is 10, and the maximum value is 200.</p> 
     * @return Limit <p>The meaning is consistent with the Limit in SQL queries, indicating that this time up to Limit elements can be retrieved. The default value is 10, and the maximum value is 200.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>The meaning is consistent with the Limit in SQL queries, indicating that this time up to Limit elements can be retrieved. The default value is 10, and the maximum value is 200.</p>
     * @param Limit <p>The meaning is consistent with the Limit in SQL queries, indicating that this time up to Limit elements can be retrieved. The default value is 10, and the maximum value is 200.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter by creator role. Default value 0 indicates data keys created by the user, and 1 indicates data keys automatically created by authorized other Cloud services.</p> 
     * @return Role <p>Filter by creator role. Default value 0 indicates data keys created by the user, and 1 indicates data keys automatically created by authorized other Cloud services.</p>
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set <p>Filter by creator role. Default value 0 indicates data keys created by the user, and 1 indicates data keys automatically created by authorized other Cloud services.</p>
     * @param Role <p>Filter by creator role. Default value 0 indicates data keys created by the user, and 1 indicates data keys automatically created by authorized other Cloud services.</p>
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get <p>Sort by DataKey creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p> 
     * @return OrderType <p>Sort by DataKey creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sort by DataKey creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
     * @param OrderType <p>Sort by DataKey creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>Filter by DataKey status. 0 indicates all DataKeys, 1 indicates querying only Enabled DataKeys, 2 indicates querying only Disabled DataKeys, and 3 indicates querying DataKeys in PendingDelete state (keys in scheduled deletion status).</p> 
     * @return KeyState <p>Filter by DataKey status. 0 indicates all DataKeys, 1 indicates querying only Enabled DataKeys, 2 indicates querying only Disabled DataKeys, and 3 indicates querying DataKeys in PendingDelete state (keys in scheduled deletion status).</p>
     */
    public Long getKeyState() {
        return this.KeyState;
    }

    /**
     * Set <p>Filter by DataKey status. 0 indicates all DataKeys, 1 indicates querying only Enabled DataKeys, 2 indicates querying only Disabled DataKeys, and 3 indicates querying DataKeys in PendingDelete state (keys in scheduled deletion status).</p>
     * @param KeyState <p>Filter by DataKey status. 0 indicates all DataKeys, 1 indicates querying only Enabled DataKeys, 2 indicates querying only Disabled DataKeys, and 3 indicates querying DataKeys in PendingDelete state (keys in scheduled deletion status).</p>
     */
    public void setKeyState(Long KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get <p>Perform a fuzzy match query by DataKeyId or DataKeyName</p> 
     * @return SearchKeyAlias <p>Perform a fuzzy match query by DataKeyId or DataKeyName</p>
     */
    public String getSearchKeyAlias() {
        return this.SearchKeyAlias;
    }

    /**
     * Set <p>Perform a fuzzy match query by DataKeyId or DataKeyName</p>
     * @param SearchKeyAlias <p>Perform a fuzzy match query by DataKeyId or DataKeyName</p>
     */
    public void setSearchKeyAlias(String SearchKeyAlias) {
        this.SearchKeyAlias = SearchKeyAlias;
    }

    /**
     * Get <p>Filter by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys with key material to import. "ALL" or leave unset queries both types. Case-sensitive.</p> 
     * @return Origin <p>Filter by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys with key material to import. "ALL" or leave unset queries both types. Case-sensitive.</p>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>Filter by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys with key material to import. "ALL" or leave unset queries both types. Case-sensitive.</p>
     * @param Origin <p>Filter by DateKey type. "TENCENT_KMS" filters data keys with key material created by KMS. "EXTERNAL" filters EXTERNAL type data keys with key material to import. "ALL" or leave unset queries both types. Case-sensitive.</p>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>HSM Cluster ID corresponding to the KMS advanced edition. When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p> 
     * @return HsmClusterId <p>HSM Cluster ID corresponding to the KMS advanced edition. When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>HSM Cluster ID corresponding to the KMS advanced edition. When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
     * @param HsmClusterId <p>HSM Cluster ID corresponding to the KMS advanced edition. When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get <p>Root key globally unique identifier</p> 
     * @return KeyId <p>Root key globally unique identifier</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>Root key globally unique identifier</p>
     * @param KeyId <p>Root key globally unique identifier</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>Length of the data key</p> 
     * @return DataKeyLen <p>Length of the data key</p>
     */
    public Long getDataKeyLen() {
        return this.DataKeyLen;
    }

    /**
     * Set <p>Length of the data key</p>
     * @param DataKeyLen <p>Length of the data key</p>
     */
    public void setDataKeyLen(Long DataKeyLen) {
        this.DataKeyLen = DataKeyLen;
    }

    /**
     * Get <p>Tag filtering condition</p> 
     * @return TagFilters <p>Tag filtering condition</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>Tag filtering condition</p>
     * @param TagFilters <p>Tag filtering condition</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>Member account information array</p> 
     * @return MemberAccounts <p>Member account information array</p>
     */
    public MemberAccount [] getMemberAccounts() {
        return this.MemberAccounts;
    }

    /**
     * Set <p>Member account information array</p>
     * @param MemberAccounts <p>Member account information array</p>
     */
    public void setMemberAccounts(MemberAccount [] MemberAccounts) {
        this.MemberAccounts = MemberAccounts;
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
        if (source.MemberAccounts != null) {
            this.MemberAccounts = new MemberAccount[source.MemberAccounts.length];
            for (int i = 0; i < source.MemberAccounts.length; i++) {
                this.MemberAccounts[i] = new MemberAccount(source.MemberAccounts[i]);
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
        this.setParamArrayObj(map, prefix + "MemberAccounts.", this.MemberAccounts);

    }
}

