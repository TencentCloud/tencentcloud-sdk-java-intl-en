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

public class DescribeAsrHotwordsRequest extends AbstractModel {

    /**
    * ID of the hotword lexicon to be queried.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * Hotword lexicon name.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
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
    * Number of returned entries. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Hotword sorting field. Valid values:

 - Default: Sort by the hotword upload sequence.
 - Weight: Sort by the weight.
 - Lexical: Sort by the first letter of hotwords.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Hotword sorting order. 0: ascending (default); 1: descending.
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
     * Get ID of the hotword lexicon to be queried.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.** 
     * @return HotwordsId ID of the hotword lexicon to be queried.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set ID of the hotword lexicon to be queried.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
     * @param HotwordsId ID of the hotword lexicon to be queried.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get Hotword lexicon name.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.** 
     * @return Name Hotword lexicon name.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Hotword lexicon name.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
     * @param Name Hotword lexicon name.
**Note: Either HotwordsId or Name should be specified. If both are specified, HotwordsId has a higher priority than Name.**
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
     * Get Number of returned entries. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Hotword sorting field. Valid values:

 - Default: Sort by the hotword upload sequence.
 - Weight: Sort by the weight.
 - Lexical: Sort by the first letter of hotwords. 
     * @return OrderBy Hotword sorting field. Valid values:

 - Default: Sort by the hotword upload sequence.
 - Weight: Sort by the weight.
 - Lexical: Sort by the first letter of hotwords.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Hotword sorting field. Valid values:

 - Default: Sort by the hotword upload sequence.
 - Weight: Sort by the weight.
 - Lexical: Sort by the first letter of hotwords.
     * @param OrderBy Hotword sorting field. Valid values:

 - Default: Sort by the hotword upload sequence.
 - Weight: Sort by the weight.
 - Lexical: Sort by the first letter of hotwords.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Hotword sorting order. 0: ascending (default); 1: descending. 
     * @return OrderType Hotword sorting order. 0: ascending (default); 1: descending.
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Hotword sorting order. 0: ascending (default); 1: descending.
     * @param OrderType Hotword sorting order. 0: ascending (default); 1: descending.
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeAsrHotwordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsrHotwordsRequest(DescribeAsrHotwordsRequest source) {
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
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
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
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

