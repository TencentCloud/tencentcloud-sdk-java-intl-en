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

public class ListKeyDetailRequest extends AbstractModel {

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
    * <p>Filter by creator role. Default value 0 indicates CMKs created by the user, and 1 indicates CMKs automatically created by authorized other Cloud services.</p>
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * <p>Sort by CMK creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>Filter by CMK status. 0 indicates all CMKs, 1 indicates querying only Enabled CMKs, 2 indicates querying only Disabled CMKs, 3 indicates querying CMKs in PendingDelete state (keys in scheduled deletion status), 4 indicates querying CMKs in PendingImport state, and 5 indicates querying CMKs in Archived state.</p>
    */
    @SerializedName("KeyState")
    @Expose
    private Long KeyState;

    /**
    * <p>Perform a fuzzy match query by KeyId or Alias</p>
    */
    @SerializedName("SearchKeyAlias")
    @Expose
    private String SearchKeyAlias;

    /**
    * <p>Filter by CMK type. "TENCENT_KMS" means to filter CMKs whose key material is created by KMS. "EXTERNAL" means to filter EXTERNAL type CMKs whose key material needs user import. "ALL" or unset means to query both types. Case-sensitive.</p>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * <p>Filter by the KeyUsage of the CMK. ALL indicates filtering all. The parameters used can be: ALL, ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2, ASYMMETRIC_SIGN_VERIFY_SM2, ASYMMETRIC_SIGN_VERIFY_RSA_2048, or ASYMMETRIC_SIGN_VERIFY_ECC. If empty, it filters the ENCRYPT_DECRYPT type by default.</p>
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * <p>Tag filtering condition</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>HSM Cluster ID corresponding to the KMS advanced edition (only applicable to KMS exclusive/managed service instances). When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * <p>Array of member account information of the trusted service</p>
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
     * Get <p>Filter by creator role. Default value 0 indicates CMKs created by the user, and 1 indicates CMKs automatically created by authorized other Cloud services.</p> 
     * @return Role <p>Filter by creator role. Default value 0 indicates CMKs created by the user, and 1 indicates CMKs automatically created by authorized other Cloud services.</p>
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set <p>Filter by creator role. Default value 0 indicates CMKs created by the user, and 1 indicates CMKs automatically created by authorized other Cloud services.</p>
     * @param Role <p>Filter by creator role. Default value 0 indicates CMKs created by the user, and 1 indicates CMKs automatically created by authorized other Cloud services.</p>
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get <p>Sort by CMK creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p> 
     * @return OrderType <p>Sort by CMK creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sort by CMK creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
     * @param OrderType <p>Sort by CMK creation time. 0 indicates sort in descending order, and 1 indicates sort in ascending order.</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>Filter by CMK status. 0 indicates all CMKs, 1 indicates querying only Enabled CMKs, 2 indicates querying only Disabled CMKs, 3 indicates querying CMKs in PendingDelete state (keys in scheduled deletion status), 4 indicates querying CMKs in PendingImport state, and 5 indicates querying CMKs in Archived state.</p> 
     * @return KeyState <p>Filter by CMK status. 0 indicates all CMKs, 1 indicates querying only Enabled CMKs, 2 indicates querying only Disabled CMKs, 3 indicates querying CMKs in PendingDelete state (keys in scheduled deletion status), 4 indicates querying CMKs in PendingImport state, and 5 indicates querying CMKs in Archived state.</p>
     */
    public Long getKeyState() {
        return this.KeyState;
    }

    /**
     * Set <p>Filter by CMK status. 0 indicates all CMKs, 1 indicates querying only Enabled CMKs, 2 indicates querying only Disabled CMKs, 3 indicates querying CMKs in PendingDelete state (keys in scheduled deletion status), 4 indicates querying CMKs in PendingImport state, and 5 indicates querying CMKs in Archived state.</p>
     * @param KeyState <p>Filter by CMK status. 0 indicates all CMKs, 1 indicates querying only Enabled CMKs, 2 indicates querying only Disabled CMKs, 3 indicates querying CMKs in PendingDelete state (keys in scheduled deletion status), 4 indicates querying CMKs in PendingImport state, and 5 indicates querying CMKs in Archived state.</p>
     */
    public void setKeyState(Long KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get <p>Perform a fuzzy match query by KeyId or Alias</p> 
     * @return SearchKeyAlias <p>Perform a fuzzy match query by KeyId or Alias</p>
     */
    public String getSearchKeyAlias() {
        return this.SearchKeyAlias;
    }

    /**
     * Set <p>Perform a fuzzy match query by KeyId or Alias</p>
     * @param SearchKeyAlias <p>Perform a fuzzy match query by KeyId or Alias</p>
     */
    public void setSearchKeyAlias(String SearchKeyAlias) {
        this.SearchKeyAlias = SearchKeyAlias;
    }

    /**
     * Get <p>Filter by CMK type. "TENCENT_KMS" means to filter CMKs whose key material is created by KMS. "EXTERNAL" means to filter EXTERNAL type CMKs whose key material needs user import. "ALL" or unset means to query both types. Case-sensitive.</p> 
     * @return Origin <p>Filter by CMK type. "TENCENT_KMS" means to filter CMKs whose key material is created by KMS. "EXTERNAL" means to filter EXTERNAL type CMKs whose key material needs user import. "ALL" or unset means to query both types. Case-sensitive.</p>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>Filter by CMK type. "TENCENT_KMS" means to filter CMKs whose key material is created by KMS. "EXTERNAL" means to filter EXTERNAL type CMKs whose key material needs user import. "ALL" or unset means to query both types. Case-sensitive.</p>
     * @param Origin <p>Filter by CMK type. "TENCENT_KMS" means to filter CMKs whose key material is created by KMS. "EXTERNAL" means to filter EXTERNAL type CMKs whose key material needs user import. "ALL" or unset means to query both types. Case-sensitive.</p>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>Filter by the KeyUsage of the CMK. ALL indicates filtering all. The parameters used can be: ALL, ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2, ASYMMETRIC_SIGN_VERIFY_SM2, ASYMMETRIC_SIGN_VERIFY_RSA_2048, or ASYMMETRIC_SIGN_VERIFY_ECC. If empty, it filters the ENCRYPT_DECRYPT type by default.</p> 
     * @return KeyUsage <p>Filter by the KeyUsage of the CMK. ALL indicates filtering all. The parameters used can be: ALL, ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2, ASYMMETRIC_SIGN_VERIFY_SM2, ASYMMETRIC_SIGN_VERIFY_RSA_2048, or ASYMMETRIC_SIGN_VERIFY_ECC. If empty, it filters the ENCRYPT_DECRYPT type by default.</p>
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set <p>Filter by the KeyUsage of the CMK. ALL indicates filtering all. The parameters used can be: ALL, ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2, ASYMMETRIC_SIGN_VERIFY_SM2, ASYMMETRIC_SIGN_VERIFY_RSA_2048, or ASYMMETRIC_SIGN_VERIFY_ECC. If empty, it filters the ENCRYPT_DECRYPT type by default.</p>
     * @param KeyUsage <p>Filter by the KeyUsage of the CMK. ALL indicates filtering all. The parameters used can be: ALL, ENCRYPT_DECRYPT, ASYMMETRIC_DECRYPT_RSA_2048, ASYMMETRIC_DECRYPT_SM2, ASYMMETRIC_SIGN_VERIFY_SM2, ASYMMETRIC_SIGN_VERIFY_RSA_2048, or ASYMMETRIC_SIGN_VERIFY_ECC. If empty, it filters the ENCRYPT_DECRYPT type by default.</p>
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
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
     * Get <p>HSM Cluster ID corresponding to the KMS advanced edition (only applicable to KMS exclusive/managed service instances). When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p> 
     * @return HsmClusterId <p>HSM Cluster ID corresponding to the KMS advanced edition (only applicable to KMS exclusive/managed service instances). When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>HSM Cluster ID corresponding to the KMS advanced edition (only applicable to KMS exclusive/managed service instances). When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
     * @param HsmClusterId <p>HSM Cluster ID corresponding to the KMS advanced edition (only applicable to KMS exclusive/managed service instances). When specifying a cluster ID, query the key list within the specified cluster. When specifying default, query the key list of the public cloud shared version. If empty, query all key lists by default, including cluster and non-cluster.</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get <p>Array of member account information of the trusted service</p> 
     * @return MemberAccounts <p>Array of member account information of the trusted service</p>
     */
    public MemberAccount [] getMemberAccounts() {
        return this.MemberAccounts;
    }

    /**
     * Set <p>Array of member account information of the trusted service</p>
     * @param MemberAccounts <p>Array of member account information of the trusted service</p>
     */
    public void setMemberAccounts(MemberAccount [] MemberAccounts) {
        this.MemberAccounts = MemberAccounts;
    }

    public ListKeyDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListKeyDetailRequest(ListKeyDetailRequest source) {
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
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
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
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamArrayObj(map, prefix + "MemberAccounts.", this.MemberAccounts);

    }
}

