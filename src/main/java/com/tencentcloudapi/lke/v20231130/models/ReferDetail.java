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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReferDetail extends AbstractModel {

    /**
    * Reference ID.
    */
    @SerializedName("ReferBizId")
    @Expose
    private String ReferBizId;

    /**
    * Document type (1: Q&A; 2: document paragraph).
    */
    @SerializedName("DocType")
    @Expose
    private Long DocType;

    /**
    * Document name.
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * Fragment content.
    */
    @SerializedName("PageContent")
    @Expose
    private String PageContent;

    /**
    * Question.
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Answer.
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * Confidence.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Mark.
    */
    @SerializedName("Mark")
    @Expose
    private Long Mark;

    /**
    * Fragment highlight content.
    */
    @SerializedName("Highlights")
    @Expose
    private Highlight [] Highlights;

    /**
    * Original content.
    */
    @SerializedName("OrgData")
    @Expose
    private String OrgData;

    /**
    * Page number information.
    */
    @SerializedName("PageInfos")
    @Expose
    private Long [] PageInfos;

    /**
    * Sheet information.
    */
    @SerializedName("SheetInfos")
    @Expose
    private String [] SheetInfos;

    /**
    * Document ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
     * Get Reference ID. 
     * @return ReferBizId Reference ID.
     */
    public String getReferBizId() {
        return this.ReferBizId;
    }

    /**
     * Set Reference ID.
     * @param ReferBizId Reference ID.
     */
    public void setReferBizId(String ReferBizId) {
        this.ReferBizId = ReferBizId;
    }

    /**
     * Get Document type (1: Q&A; 2: document paragraph). 
     * @return DocType Document type (1: Q&A; 2: document paragraph).
     */
    public Long getDocType() {
        return this.DocType;
    }

    /**
     * Set Document type (1: Q&A; 2: document paragraph).
     * @param DocType Document type (1: Q&A; 2: document paragraph).
     */
    public void setDocType(Long DocType) {
        this.DocType = DocType;
    }

    /**
     * Get Document name. 
     * @return DocName Document name.
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set Document name.
     * @param DocName Document name.
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get Fragment content. 
     * @return PageContent Fragment content.
     */
    public String getPageContent() {
        return this.PageContent;
    }

    /**
     * Set Fragment content.
     * @param PageContent Fragment content.
     */
    public void setPageContent(String PageContent) {
        this.PageContent = PageContent;
    }

    /**
     * Get Question. 
     * @return Question Question.
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Question.
     * @param Question Question.
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Answer. 
     * @return Answer Answer.
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set Answer.
     * @param Answer Answer.
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get Confidence. 
     * @return Confidence Confidence.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence.
     * @param Confidence Confidence.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Mark. 
     * @return Mark Mark.
     */
    public Long getMark() {
        return this.Mark;
    }

    /**
     * Set Mark.
     * @param Mark Mark.
     */
    public void setMark(Long Mark) {
        this.Mark = Mark;
    }

    /**
     * Get Fragment highlight content. 
     * @return Highlights Fragment highlight content.
     */
    public Highlight [] getHighlights() {
        return this.Highlights;
    }

    /**
     * Set Fragment highlight content.
     * @param Highlights Fragment highlight content.
     */
    public void setHighlights(Highlight [] Highlights) {
        this.Highlights = Highlights;
    }

    /**
     * Get Original content. 
     * @return OrgData Original content.
     */
    public String getOrgData() {
        return this.OrgData;
    }

    /**
     * Set Original content.
     * @param OrgData Original content.
     */
    public void setOrgData(String OrgData) {
        this.OrgData = OrgData;
    }

    /**
     * Get Page number information. 
     * @return PageInfos Page number information.
     */
    public Long [] getPageInfos() {
        return this.PageInfos;
    }

    /**
     * Set Page number information.
     * @param PageInfos Page number information.
     */
    public void setPageInfos(Long [] PageInfos) {
        this.PageInfos = PageInfos;
    }

    /**
     * Get Sheet information. 
     * @return SheetInfos Sheet information.
     */
    public String [] getSheetInfos() {
        return this.SheetInfos;
    }

    /**
     * Set Sheet information.
     * @param SheetInfos Sheet information.
     */
    public void setSheetInfos(String [] SheetInfos) {
        this.SheetInfos = SheetInfos;
    }

    /**
     * Get Document ID. 
     * @return DocBizId Document ID.
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document ID.
     * @param DocBizId Document ID.
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    public ReferDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReferDetail(ReferDetail source) {
        if (source.ReferBizId != null) {
            this.ReferBizId = new String(source.ReferBizId);
        }
        if (source.DocType != null) {
            this.DocType = new Long(source.DocType);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.PageContent != null) {
            this.PageContent = new String(source.PageContent);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Mark != null) {
            this.Mark = new Long(source.Mark);
        }
        if (source.Highlights != null) {
            this.Highlights = new Highlight[source.Highlights.length];
            for (int i = 0; i < source.Highlights.length; i++) {
                this.Highlights[i] = new Highlight(source.Highlights[i]);
            }
        }
        if (source.OrgData != null) {
            this.OrgData = new String(source.OrgData);
        }
        if (source.PageInfos != null) {
            this.PageInfos = new Long[source.PageInfos.length];
            for (int i = 0; i < source.PageInfos.length; i++) {
                this.PageInfos[i] = new Long(source.PageInfos[i]);
            }
        }
        if (source.SheetInfos != null) {
            this.SheetInfos = new String[source.SheetInfos.length];
            for (int i = 0; i < source.SheetInfos.length; i++) {
                this.SheetInfos[i] = new String(source.SheetInfos[i]);
            }
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReferBizId", this.ReferBizId);
        this.setParamSimple(map, prefix + "DocType", this.DocType);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "PageContent", this.PageContent);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamArrayObj(map, prefix + "Highlights.", this.Highlights);
        this.setParamSimple(map, prefix + "OrgData", this.OrgData);
        this.setParamArraySimple(map, prefix + "PageInfos.", this.PageInfos);
        this.setParamArraySimple(map, prefix + "SheetInfos.", this.SheetInfos);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);

    }
}

