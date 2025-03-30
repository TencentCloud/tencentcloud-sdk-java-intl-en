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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsrHotwordsListRequest extends AbstractModel {

    /**
    * Parameter for querying by hotword lexicon ID.
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * Parameter for querying by hotword lexicon name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. All hotword lexicons are returned by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Hotword lexicon sorting order.

0: ascending (default)
1: descending
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Sorts hotword lexicons by a specific field. By default, hotword lexicons are sorted by creation time. If an invalid field is used for sorting, the default sorting field applies.

 - CreateTime: sort by creation time
 - UpdateTime: sort by update time
 - Name: sort by hotword lexicon name
 - WordCount: sort by the number of hotwords
 - HotwordsId: sort by hotword lexicon ID
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 0: temporary hotword; 1 file-based hotword.
    */
    @SerializedName("Types")
    @Expose
    private Long [] Types;

    /**
     * Get Parameter for querying by hotword lexicon ID. 
     * @return HotwordsId Parameter for querying by hotword lexicon ID.
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set Parameter for querying by hotword lexicon ID.
     * @param HotwordsId Parameter for querying by hotword lexicon ID.
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get Parameter for querying by hotword lexicon name. 
     * @return Name Parameter for querying by hotword lexicon name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter for querying by hotword lexicon name.
     * @param Name Parameter for querying by hotword lexicon name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. All hotword lexicons are returned by default. 
     * @return Limit Number of returned entries. All hotword lexicons are returned by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. All hotword lexicons are returned by default.
     * @param Limit Number of returned entries. All hotword lexicons are returned by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Hotword lexicon sorting order.

0: ascending (default)
1: descending 
     * @return OrderType Hotword lexicon sorting order.

0: ascending (default)
1: descending
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Hotword lexicon sorting order.

0: ascending (default)
1: descending
     * @param OrderType Hotword lexicon sorting order.

0: ascending (default)
1: descending
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Sorts hotword lexicons by a specific field. By default, hotword lexicons are sorted by creation time. If an invalid field is used for sorting, the default sorting field applies.

 - CreateTime: sort by creation time
 - UpdateTime: sort by update time
 - Name: sort by hotword lexicon name
 - WordCount: sort by the number of hotwords
 - HotwordsId: sort by hotword lexicon ID 
     * @return OrderBy Sorts hotword lexicons by a specific field. By default, hotword lexicons are sorted by creation time. If an invalid field is used for sorting, the default sorting field applies.

 - CreateTime: sort by creation time
 - UpdateTime: sort by update time
 - Name: sort by hotword lexicon name
 - WordCount: sort by the number of hotwords
 - HotwordsId: sort by hotword lexicon ID
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorts hotword lexicons by a specific field. By default, hotword lexicons are sorted by creation time. If an invalid field is used for sorting, the default sorting field applies.

 - CreateTime: sort by creation time
 - UpdateTime: sort by update time
 - Name: sort by hotword lexicon name
 - WordCount: sort by the number of hotwords
 - HotwordsId: sort by hotword lexicon ID
     * @param OrderBy Sorts hotword lexicons by a specific field. By default, hotword lexicons are sorted by creation time. If an invalid field is used for sorting, the default sorting field applies.

 - CreateTime: sort by creation time
 - UpdateTime: sort by update time
 - Name: sort by hotword lexicon name
 - WordCount: sort by the number of hotwords
 - HotwordsId: sort by hotword lexicon ID
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 0: temporary hotword; 1 file-based hotword. 
     * @return Types 0: temporary hotword; 1 file-based hotword.
     */
    public Long [] getTypes() {
        return this.Types;
    }

    /**
     * Set 0: temporary hotword; 1 file-based hotword.
     * @param Types 0: temporary hotword; 1 file-based hotword.
     */
    public void setTypes(Long [] Types) {
        this.Types = Types;
    }

    public DescribeAsrHotwordsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsrHotwordsListRequest(DescribeAsrHotwordsListRequest source) {
        if (source.HotwordsId != null) {
            this.HotwordsId = new String(source.HotwordsId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Types != null) {
            this.Types = new Long[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new Long(source.Types[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HotwordsId", this.HotwordsId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);

    }
}

