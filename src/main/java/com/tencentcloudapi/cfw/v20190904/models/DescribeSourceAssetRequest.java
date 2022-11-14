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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSourceAssetRequest extends AbstractModel{

    /**
    * Fuzzy search
    */
    @SerializedName("FuzzySearch")
    @Expose
    private String FuzzySearch;

    /**
    * Asset type. 1: public network; 2: private network
    */
    @SerializedName("InsType")
    @Expose
    private String InsType;

    /**
    * If ChooseType is 1, grouped assets are queried; if ChooseType is not 1, non-grouped assets are queried
    */
    @SerializedName("ChooseType")
    @Expose
    private String ChooseType;

    /**
    * Region
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Maximum number of results returned per page. For example, if it is set to 10, 10 results will be returned at most.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset of search results
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Fuzzy search 
     * @return FuzzySearch Fuzzy search
     */
    public String getFuzzySearch() {
        return this.FuzzySearch;
    }

    /**
     * Set Fuzzy search
     * @param FuzzySearch Fuzzy search
     */
    public void setFuzzySearch(String FuzzySearch) {
        this.FuzzySearch = FuzzySearch;
    }

    /**
     * Get Asset type. 1: public network; 2: private network 
     * @return InsType Asset type. 1: public network; 2: private network
     */
    public String getInsType() {
        return this.InsType;
    }

    /**
     * Set Asset type. 1: public network; 2: private network
     * @param InsType Asset type. 1: public network; 2: private network
     */
    public void setInsType(String InsType) {
        this.InsType = InsType;
    }

    /**
     * Get If ChooseType is 1, grouped assets are queried; if ChooseType is not 1, non-grouped assets are queried 
     * @return ChooseType If ChooseType is 1, grouped assets are queried; if ChooseType is not 1, non-grouped assets are queried
     */
    public String getChooseType() {
        return this.ChooseType;
    }

    /**
     * Set If ChooseType is 1, grouped assets are queried; if ChooseType is not 1, non-grouped assets are queried
     * @param ChooseType If ChooseType is 1, grouped assets are queried; if ChooseType is not 1, non-grouped assets are queried
     */
    public void setChooseType(String ChooseType) {
        this.ChooseType = ChooseType;
    }

    /**
     * Get Region 
     * @return Zone Region
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region
     * @param Zone Region
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Maximum number of results returned per page. For example, if it is set to 10, 10 results will be returned at most. 
     * @return Limit Maximum number of results returned per page. For example, if it is set to 10, 10 results will be returned at most.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results returned per page. For example, if it is set to 10, 10 results will be returned at most.
     * @param Limit Maximum number of results returned per page. For example, if it is set to 10, 10 results will be returned at most.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset of search results 
     * @return Offset Offset of search results
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of search results
     * @param Offset Offset of search results
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSourceAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSourceAssetRequest(DescribeSourceAssetRequest source) {
        if (source.FuzzySearch != null) {
            this.FuzzySearch = new String(source.FuzzySearch);
        }
        if (source.InsType != null) {
            this.InsType = new String(source.InsType);
        }
        if (source.ChooseType != null) {
            this.ChooseType = new String(source.ChooseType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FuzzySearch", this.FuzzySearch);
        this.setParamSimple(map, prefix + "InsType", this.InsType);
        this.setParamSimple(map, prefix + "ChooseType", this.ChooseType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

