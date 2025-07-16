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

public class ListDataKeysRequest extends AbstractModel {

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
    * Filter criteria based on the creator role. default 0 means data key created by oneself, 1 means data key automatically created by other cloud services.
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * HSM cluster ID corresponding to KMS advanced edition (only applicable to KMS exclusive/managed service instance).
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

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
     * Get Filter criteria based on the creator role. default 0 means data key created by oneself, 1 means data key automatically created by other cloud services. 
     * @return Role Filter criteria based on the creator role. default 0 means data key created by oneself, 1 means data key automatically created by other cloud services.
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set Filter criteria based on the creator role. default 0 means data key created by oneself, 1 means data key automatically created by other cloud services.
     * @param Role Filter criteria based on the creator role. default 0 means data key created by oneself, 1 means data key automatically created by other cloud services.
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get HSM cluster ID corresponding to KMS advanced edition (only applicable to KMS exclusive/managed service instance). 
     * @return HsmClusterId HSM cluster ID corresponding to KMS advanced edition (only applicable to KMS exclusive/managed service instance).
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HSM cluster ID corresponding to KMS advanced edition (only applicable to KMS exclusive/managed service instance).
     * @param HsmClusterId HSM cluster ID corresponding to KMS advanced edition (only applicable to KMS exclusive/managed service instance).
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    public ListDataKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDataKeysRequest(ListDataKeysRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);

    }
}

