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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomizedConfigAssociateListRequest extends AbstractModel {

    /**
    * Configuration ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Start position of the binding list. Default: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of binding lists to pull. Default: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * search domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Configuration ID 
     * @return ConfigId Configuration ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Configuration ID
     * @param ConfigId Configuration ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Start position of the binding list. Default: 0. 
     * @return Offset Start position of the binding list. Default: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Start position of the binding list. Default: 0.
     * @param Offset Start position of the binding list. Default: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of binding lists to pull. Default: 20. 
     * @return Limit Number of binding lists to pull. Default: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of binding lists to pull. Default: 20.
     * @param Limit Number of binding lists to pull. Default: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get search domain 
     * @return Domain search domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set search domain
     * @param Domain search domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeCustomizedConfigAssociateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomizedConfigAssociateListRequest(DescribeCustomizedConfigAssociateListRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

