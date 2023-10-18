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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRepositoriesRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Specified namespace. If this parameter is left empty, image repositories in all namespaces will be queried.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Specified image repository. If this parameter is left empty, all image repositories in the specified namespace will be queried.
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * Page number, which is used for pagination
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page, which is used for pagination
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sort field. Valid values: -creation_time, -name, -update_time.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

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
     * Get Specified namespace. If this parameter is left empty, image repositories in all namespaces will be queried. 
     * @return NamespaceName Specified namespace. If this parameter is left empty, image repositories in all namespaces will be queried.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Specified namespace. If this parameter is left empty, image repositories in all namespaces will be queried.
     * @param NamespaceName Specified namespace. If this parameter is left empty, image repositories in all namespaces will be queried.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Specified image repository. If this parameter is left empty, all image repositories in the specified namespace will be queried. 
     * @return RepositoryName Specified image repository. If this parameter is left empty, all image repositories in the specified namespace will be queried.
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set Specified image repository. If this parameter is left empty, all image repositories in the specified namespace will be queried.
     * @param RepositoryName Specified image repository. If this parameter is left empty, all image repositories in the specified namespace will be queried.
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get Page number, which is used for pagination 
     * @return Offset Page number, which is used for pagination
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number, which is used for pagination
     * @param Offset Page number, which is used for pagination
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page, which is used for pagination 
     * @return Limit Number of entries per page, which is used for pagination
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page, which is used for pagination
     * @param Limit Number of entries per page, which is used for pagination
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sort field. Valid values: -creation_time, -name, -update_time. 
     * @return SortBy Sort field. Valid values: -creation_time, -name, -update_time.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sort field. Valid values: -creation_time, -name, -update_time.
     * @param SortBy Sort field. Valid values: -creation_time, -name, -update_time.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    public DescribeRepositoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRepositoriesRequest(DescribeRepositoriesRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);

    }
}

