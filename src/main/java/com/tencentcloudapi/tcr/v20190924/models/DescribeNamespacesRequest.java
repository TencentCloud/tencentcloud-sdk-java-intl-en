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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNamespacesRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Specified namespace. If this parameter is left empty, all namespaces will be queried.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Number of entries per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page offset (page number from which to return the results)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether to list all namespaces
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * Filters
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Whether to query only namespaces for which the KMS image signature is enabled
    */
    @SerializedName("KmsSignPolicy")
    @Expose
    private Boolean KmsSignPolicy;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Specified namespace. If this parameter is left empty, all namespaces will be queried. 
     * @return NamespaceName Specified namespace. If this parameter is left empty, all namespaces will be queried.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Specified namespace. If this parameter is left empty, all namespaces will be queried.
     * @param NamespaceName Specified namespace. If this parameter is left empty, all namespaces will be queried.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Number of entries per page 
     * @return Limit Number of entries per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page
     * @param Limit Number of entries per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page offset (page number from which to return the results) 
     * @return Offset Page offset (page number from which to return the results)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset (page number from which to return the results)
     * @param Offset Page offset (page number from which to return the results)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Whether to list all namespaces 
     * @return All Whether to list all namespaces
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to list all namespaces
     * @param All Whether to list all namespaces
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get Filters 
     * @return Filters Filters
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
     * @param Filters Filters
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Whether to query only namespaces for which the KMS image signature is enabled 
     * @return KmsSignPolicy Whether to query only namespaces for which the KMS image signature is enabled
     */
    public Boolean getKmsSignPolicy() {
        return this.KmsSignPolicy;
    }

    /**
     * Set Whether to query only namespaces for which the KMS image signature is enabled
     * @param KmsSignPolicy Whether to query only namespaces for which the KMS image signature is enabled
     */
    public void setKmsSignPolicy(Boolean KmsSignPolicy) {
        this.KmsSignPolicy = KmsSignPolicy;
    }

    public DescribeNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNamespacesRequest(DescribeNamespacesRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.KmsSignPolicy != null) {
            this.KmsSignPolicy = new Boolean(source.KmsSignPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "KmsSignPolicy", this.KmsSignPolicy);

    }
}

