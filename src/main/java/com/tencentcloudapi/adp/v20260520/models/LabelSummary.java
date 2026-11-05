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

public class LabelSummary extends AbstractModel {

    /**
    * <p>Tag ID.</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>Metadata configuration (configuration message when the tag is set to metadata)</p>
    */
    @SerializedName("MetaValue")
    @Expose
    private MetaValue MetaValue;

    /**
    * <p>Tag name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Number of resources referring to the tag</p>
    */
    @SerializedName("RefCount")
    @Expose
    private Long RefCount;

    /**
    * <p>Tag value (standard word + synonym list)</p>
    */
    @SerializedName("TermList")
    @Expose
    private LabelTerm [] TermList;

    /**
    * <p>Total number of tag values.</p>
    */
    @SerializedName("TermTotalCount")
    @Expose
    private Long TermTotalCount;

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
     * Get <p>Metadata configuration (configuration message when the tag is set to metadata)</p> 
     * @return MetaValue <p>Metadata configuration (configuration message when the tag is set to metadata)</p>
     */
    public MetaValue getMetaValue() {
        return this.MetaValue;
    }

    /**
     * Set <p>Metadata configuration (configuration message when the tag is set to metadata)</p>
     * @param MetaValue <p>Metadata configuration (configuration message when the tag is set to metadata)</p>
     */
    public void setMetaValue(MetaValue MetaValue) {
        this.MetaValue = MetaValue;
    }

    /**
     * Get <p>Tag name.</p> 
     * @return Name <p>Tag name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Tag name.</p>
     * @param Name <p>Tag name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Number of resources referring to the tag</p> 
     * @return RefCount <p>Number of resources referring to the tag</p>
     */
    public Long getRefCount() {
        return this.RefCount;
    }

    /**
     * Set <p>Number of resources referring to the tag</p>
     * @param RefCount <p>Number of resources referring to the tag</p>
     */
    public void setRefCount(Long RefCount) {
        this.RefCount = RefCount;
    }

    /**
     * Get <p>Tag value (standard word + synonym list)</p> 
     * @return TermList <p>Tag value (standard word + synonym list)</p>
     */
    public LabelTerm [] getTermList() {
        return this.TermList;
    }

    /**
     * Set <p>Tag value (standard word + synonym list)</p>
     * @param TermList <p>Tag value (standard word + synonym list)</p>
     */
    public void setTermList(LabelTerm [] TermList) {
        this.TermList = TermList;
    }

    /**
     * Get <p>Total number of tag values.</p> 
     * @return TermTotalCount <p>Total number of tag values.</p>
     */
    public Long getTermTotalCount() {
        return this.TermTotalCount;
    }

    /**
     * Set <p>Total number of tag values.</p>
     * @param TermTotalCount <p>Total number of tag values.</p>
     */
    public void setTermTotalCount(Long TermTotalCount) {
        this.TermTotalCount = TermTotalCount;
    }

    public LabelSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelSummary(LabelSummary source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.MetaValue != null) {
            this.MetaValue = new MetaValue(source.MetaValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RefCount != null) {
            this.RefCount = new Long(source.RefCount);
        }
        if (source.TermList != null) {
            this.TermList = new LabelTerm[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new LabelTerm(source.TermList[i]);
            }
        }
        if (source.TermTotalCount != null) {
            this.TermTotalCount = new Long(source.TermTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamObj(map, prefix + "MetaValue.", this.MetaValue);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RefCount", this.RefCount);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "TermTotalCount", this.TermTotalCount);

    }
}

