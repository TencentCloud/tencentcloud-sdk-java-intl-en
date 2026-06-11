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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGSubscribeMessageTemplateLibraryListRequest extends AbstractModel {

    /**
    * <p>Platform ID.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Mini program appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Limit.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Query type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
    */
    @SerializedName("QueryType")
    @Expose
    private Long QueryType;

    /**
    * <p>Pagination offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Limit.</p>
    */
    @SerializedName("QueryStr")
    @Expose
    private String QueryStr;

    /**
     * Get <p>Platform ID.</p> 
     * @return PlatformId <p>Platform ID.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID.</p>
     * @param PlatformId <p>Platform ID.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Mini program appid.</p> 
     * @return MNPId <p>Mini program appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini program appid.</p>
     * @param MNPId <p>Mini program appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Limit.</p> 
     * @return Limit <p>Limit.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit.</p>
     * @param Limit <p>Limit.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Query type. Valid values: 2: One-time message; 3: Long-term subscription message.</p> 
     * @return QueryType <p>Query type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
     */
    public Long getQueryType() {
        return this.QueryType;
    }

    /**
     * Set <p>Query type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
     * @param QueryType <p>Query type. Valid values: 2: One-time message; 3: Long-term subscription message.</p>
     */
    public void setQueryType(Long QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get <p>Pagination offset.</p> 
     * @return Offset <p>Pagination offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset.</p>
     * @param Offset <p>Pagination offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Limit.</p> 
     * @return QueryStr <p>Limit.</p>
     */
    public String getQueryStr() {
        return this.QueryStr;
    }

    /**
     * Set <p>Limit.</p>
     * @param QueryStr <p>Limit.</p>
     */
    public void setQueryStr(String QueryStr) {
        this.QueryStr = QueryStr;
    }

    public DescribeMNGSubscribeMessageTemplateLibraryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSubscribeMessageTemplateLibraryListRequest(DescribeMNGSubscribeMessageTemplateLibraryListRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueryType != null) {
            this.QueryType = new Long(source.QueryType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.QueryStr != null) {
            this.QueryStr = new String(source.QueryStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "QueryStr", this.QueryStr);

    }
}

