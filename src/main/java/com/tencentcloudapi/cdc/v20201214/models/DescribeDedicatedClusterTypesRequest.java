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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterTypesRequest extends AbstractModel {

    /**
    * Name of fuzzy matching CDC configuration
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of CDC configuration ids to be queried
    */
    @SerializedName("DedicatedClusterTypeIds")
    @Expose
    private String [] DedicatedClusterTypeIds;

    /**
    * Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Whether to query only the computing type?
    */
    @SerializedName("IsCompute")
    @Expose
    private Boolean IsCompute;

    /**
     * Get Name of fuzzy matching CDC configuration 
     * @return Name Name of fuzzy matching CDC configuration
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of fuzzy matching CDC configuration
     * @param Name Name of fuzzy matching CDC configuration
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of CDC configuration ids to be queried 
     * @return DedicatedClusterTypeIds List of CDC configuration ids to be queried
     */
    public String [] getDedicatedClusterTypeIds() {
        return this.DedicatedClusterTypeIds;
    }

    /**
     * Set List of CDC configuration ids to be queried
     * @param DedicatedClusterTypeIds List of CDC configuration ids to be queried
     */
    public void setDedicatedClusterTypeIds(String [] DedicatedClusterTypeIds) {
        this.DedicatedClusterTypeIds = DedicatedClusterTypeIds;
    }

    /**
     * Get Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset, 0 by default For further information on Offset, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned pieces, 20 by default and can be up to 100. For further information on Limit, please refer to relevant sections in API [Overview] (https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Whether to query only the computing type? 
     * @return IsCompute Whether to query only the computing type?
     */
    public Boolean getIsCompute() {
        return this.IsCompute;
    }

    /**
     * Set Whether to query only the computing type?
     * @param IsCompute Whether to query only the computing type?
     */
    public void setIsCompute(Boolean IsCompute) {
        this.IsCompute = IsCompute;
    }

    public DescribeDedicatedClusterTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterTypesRequest(DescribeDedicatedClusterTypesRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DedicatedClusterTypeIds != null) {
            this.DedicatedClusterTypeIds = new String[source.DedicatedClusterTypeIds.length];
            for (int i = 0; i < source.DedicatedClusterTypeIds.length; i++) {
                this.DedicatedClusterTypeIds[i] = new String(source.DedicatedClusterTypeIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IsCompute != null) {
            this.IsCompute = new Boolean(source.IsCompute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "DedicatedClusterTypeIds.", this.DedicatedClusterTypeIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "IsCompute", this.IsCompute);

    }
}

