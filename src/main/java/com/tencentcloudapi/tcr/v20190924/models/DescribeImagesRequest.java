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

public class DescribeImagesRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Namespace name
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Image repository name
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * Image tag specified for fuzzy search
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * Number of entries per page, which is used for pagination. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number. Default value: 1.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Image digest specified for search
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * Whether to use exact matching. Valid values: `true` (exact matching), `null` (fuzzy matching).
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

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
     * Get Namespace name 
     * @return NamespaceName Namespace name
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
     * @param NamespaceName Namespace name
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Image repository name 
     * @return RepositoryName Image repository name
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set Image repository name
     * @param RepositoryName Image repository name
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get Image tag specified for fuzzy search 
     * @return ImageVersion Image tag specified for fuzzy search
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Image tag specified for fuzzy search
     * @param ImageVersion Image tag specified for fuzzy search
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get Number of entries per page, which is used for pagination. Default value: 20. 
     * @return Limit Number of entries per page, which is used for pagination. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page, which is used for pagination. Default value: 20.
     * @param Limit Number of entries per page, which is used for pagination. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. Default value: 1. 
     * @return Offset Page number. Default value: 1.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 1.
     * @param Offset Page number. Default value: 1.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Image digest specified for search 
     * @return Digest Image digest specified for search
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set Image digest specified for search
     * @param Digest Image digest specified for search
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get Whether to use exact matching. Valid values: `true` (exact matching), `null` (fuzzy matching). 
     * @return ExactMatch Whether to use exact matching. Valid values: `true` (exact matching), `null` (fuzzy matching).
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set Whether to use exact matching. Valid values: `true` (exact matching), `null` (fuzzy matching).
     * @param ExactMatch Whether to use exact matching. Valid values: `true` (exact matching), `null` (fuzzy matching).
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public DescribeImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesRequest(DescribeImagesRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);

    }
}

