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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalDomainACLRequest extends AbstractModel {

    /**
    * Page offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Domain type. 1: Allowed; 2: Blocked
    */
    @SerializedName("DomainTypes")
    @Expose
    private Long [] DomainTypes;

    /**
    * Domain names to be queried
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Page offset 
     * @return Offset Page offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset
     * @param Offset Page offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page 
     * @return Limit Number of results per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page
     * @param Limit Number of results per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Domain type. 1: Allowed; 2: Blocked 
     * @return DomainTypes Domain type. 1: Allowed; 2: Blocked
     */
    public Long [] getDomainTypes() {
        return this.DomainTypes;
    }

    /**
     * Set Domain type. 1: Allowed; 2: Blocked
     * @param DomainTypes Domain type. 1: Allowed; 2: Blocked
     */
    public void setDomainTypes(Long [] DomainTypes) {
        this.DomainTypes = DomainTypes;
    }

    /**
     * Get Domain names to be queried 
     * @return Keyword Domain names to be queried
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Domain names to be queried
     * @param Keyword Domain names to be queried
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeGlobalDomainACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalDomainACLRequest(DescribeGlobalDomainACLRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.DomainTypes != null) {
            this.DomainTypes = new Long[source.DomainTypes.length];
            for (int i = 0; i < source.DomainTypes.length; i++) {
                this.DomainTypes[i] = new Long(source.DomainTypes[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamArraySimple(map, prefix + "DomainTypes.", this.DomainTypes);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

