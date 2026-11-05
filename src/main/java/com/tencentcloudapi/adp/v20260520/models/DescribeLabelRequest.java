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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLabelRequest extends AbstractModel {

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Tag ID.</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>Common filter.</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Standard term ID of the scroll loading cursor (pass 0 for the first request, and subsequently pass the TermId of the last item on the previous page)</p>
    */
    @SerializedName("LastTermId")
    @Expose
    private String LastTermId;

    /**
    * <p>Number of items to load at a time. Default: 10. Maximum: 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Keyword search</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>ID of the knowledge base it belongs to</p> 
     * @return KbId <p>ID of the knowledge base it belongs to</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>ID of the knowledge base it belongs to</p>
     * @param KbId <p>ID of the knowledge base it belongs to</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Tag ID.</p> 
     * @return LabelId <p>Tag ID.</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>Tag ID.</p>
     * @param LabelId <p>Tag ID.</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>Common filter.</p> 
     * @return FilterList <p>Common filter.</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Common filter.</p>
     * @param FilterList <p>Common filter.</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Standard term ID of the scroll loading cursor (pass 0 for the first request, and subsequently pass the TermId of the last item on the previous page)</p> 
     * @return LastTermId <p>Standard term ID of the scroll loading cursor (pass 0 for the first request, and subsequently pass the TermId of the last item on the previous page)</p>
     */
    public String getLastTermId() {
        return this.LastTermId;
    }

    /**
     * Set <p>Standard term ID of the scroll loading cursor (pass 0 for the first request, and subsequently pass the TermId of the last item on the previous page)</p>
     * @param LastTermId <p>Standard term ID of the scroll loading cursor (pass 0 for the first request, and subsequently pass the TermId of the last item on the previous page)</p>
     */
    public void setLastTermId(String LastTermId) {
        this.LastTermId = LastTermId;
    }

    /**
     * Get <p>Number of items to load at a time. Default: 10. Maximum: 100</p> 
     * @return Limit <p>Number of items to load at a time. Default: 10. Maximum: 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items to load at a time. Default: 10. Maximum: 100</p>
     * @param Limit <p>Number of items to load at a time. Default: 10. Maximum: 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Keyword search</p> 
     * @return Query <p>Keyword search</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Keyword search</p>
     * @param Query <p>Keyword search</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLabelRequest(DescribeLabelRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.LastTermId != null) {
            this.LastTermId = new String(source.LastTermId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "LastTermId", this.LastTermId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

