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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShareUnitNodesRequest extends AbstractModel {

    /**
    * <p>Shared unit ID.</p>.
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * <P>Offset. its value must be an integer multiple of the limit. default value: 0.</p>.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <P>Limit. value range: 1–50.</p>.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Search keywords. supports department ID search.</p>.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get <p>Shared unit ID.</p>. 
     * @return UnitId <p>Shared unit ID.</p>.
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set <p>Shared unit ID.</p>.
     * @param UnitId <p>Shared unit ID.</p>.
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get <P>Offset. its value must be an integer multiple of the limit. default value: 0.</p>. 
     * @return Offset <P>Offset. its value must be an integer multiple of the limit. default value: 0.</p>.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <P>Offset. its value must be an integer multiple of the limit. default value: 0.</p>.
     * @param Offset <P>Offset. its value must be an integer multiple of the limit. default value: 0.</p>.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <P>Limit. value range: 1–50.</p>. 
     * @return Limit <P>Limit. value range: 1–50.</p>.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <P>Limit. value range: 1–50.</p>.
     * @param Limit <P>Limit. value range: 1–50.</p>.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Search keywords. supports department ID search.</p>. 
     * @return SearchKey <p>Search keywords. supports department ID search.</p>.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>Search keywords. supports department ID search.</p>.
     * @param SearchKey <p>Search keywords. supports department ID search.</p>.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeShareUnitNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShareUnitNodesRequest(DescribeShareUnitNodesRequest source) {
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

