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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeQaSearch extends AbstractModel {

    /**
    * Knowledge source: doc (document), qa (question & answering), taskflow (business process), search (search enhancement).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Q&A - reply flexibility, 1: directly reply if the answer has been accepted. 2: reply after the accepted answer has been polished.
    */
    @SerializedName("ReplyFlexibility")
    @Expose
    private Long ReplyFlexibility;

    /**
    * Search enhancement - search engine status.
    */
    @SerializedName("UseSearchEngine")
    @Expose
    private Boolean UseSearchEngine;

    /**
    * Whether to display the search engine retrieval status.
    */
    @SerializedName("ShowSearchEngine")
    @Expose
    private Boolean ShowSearchEngine;

    /**
    * Knowledge source, whether to select.
    */
    @SerializedName("IsEnabled")
    @Expose
    private Boolean IsEnabled;

    /**
    * Maximum number of Q&A recalls, defaults to 2, limited to 5.
    */
    @SerializedName("QaTopN")
    @Expose
    private Long QaTopN;

    /**
    * Maximum number of documents recalls, defaults to 3, limited to 5.
    */
    @SerializedName("DocTopN")
    @Expose
    private Long DocTopN;

    /**
    * Retrieval confidence degree, valid for documents and Q&A. Value range: 0.01 - 0.99.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Resource status, 1: the resource is available; 2: the resource is exhausted.
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get Knowledge source: doc (document), qa (question & answering), taskflow (business process), search (search enhancement). 
     * @return Type Knowledge source: doc (document), qa (question & answering), taskflow (business process), search (search enhancement).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Knowledge source: doc (document), qa (question & answering), taskflow (business process), search (search enhancement).
     * @param Type Knowledge source: doc (document), qa (question & answering), taskflow (business process), search (search enhancement).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Q&A - reply flexibility, 1: directly reply if the answer has been accepted. 2: reply after the accepted answer has been polished. 
     * @return ReplyFlexibility Q&A - reply flexibility, 1: directly reply if the answer has been accepted. 2: reply after the accepted answer has been polished.
     */
    public Long getReplyFlexibility() {
        return this.ReplyFlexibility;
    }

    /**
     * Set Q&A - reply flexibility, 1: directly reply if the answer has been accepted. 2: reply after the accepted answer has been polished.
     * @param ReplyFlexibility Q&A - reply flexibility, 1: directly reply if the answer has been accepted. 2: reply after the accepted answer has been polished.
     */
    public void setReplyFlexibility(Long ReplyFlexibility) {
        this.ReplyFlexibility = ReplyFlexibility;
    }

    /**
     * Get Search enhancement - search engine status. 
     * @return UseSearchEngine Search enhancement - search engine status.
     */
    public Boolean getUseSearchEngine() {
        return this.UseSearchEngine;
    }

    /**
     * Set Search enhancement - search engine status.
     * @param UseSearchEngine Search enhancement - search engine status.
     */
    public void setUseSearchEngine(Boolean UseSearchEngine) {
        this.UseSearchEngine = UseSearchEngine;
    }

    /**
     * Get Whether to display the search engine retrieval status. 
     * @return ShowSearchEngine Whether to display the search engine retrieval status.
     */
    public Boolean getShowSearchEngine() {
        return this.ShowSearchEngine;
    }

    /**
     * Set Whether to display the search engine retrieval status.
     * @param ShowSearchEngine Whether to display the search engine retrieval status.
     */
    public void setShowSearchEngine(Boolean ShowSearchEngine) {
        this.ShowSearchEngine = ShowSearchEngine;
    }

    /**
     * Get Knowledge source, whether to select. 
     * @return IsEnabled Knowledge source, whether to select.
     */
    public Boolean getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Knowledge source, whether to select.
     * @param IsEnabled Knowledge source, whether to select.
     */
    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Maximum number of Q&A recalls, defaults to 2, limited to 5. 
     * @return QaTopN Maximum number of Q&A recalls, defaults to 2, limited to 5.
     */
    public Long getQaTopN() {
        return this.QaTopN;
    }

    /**
     * Set Maximum number of Q&A recalls, defaults to 2, limited to 5.
     * @param QaTopN Maximum number of Q&A recalls, defaults to 2, limited to 5.
     */
    public void setQaTopN(Long QaTopN) {
        this.QaTopN = QaTopN;
    }

    /**
     * Get Maximum number of documents recalls, defaults to 3, limited to 5. 
     * @return DocTopN Maximum number of documents recalls, defaults to 3, limited to 5.
     */
    public Long getDocTopN() {
        return this.DocTopN;
    }

    /**
     * Set Maximum number of documents recalls, defaults to 3, limited to 5.
     * @param DocTopN Maximum number of documents recalls, defaults to 3, limited to 5.
     */
    public void setDocTopN(Long DocTopN) {
        this.DocTopN = DocTopN;
    }

    /**
     * Get Retrieval confidence degree, valid for documents and Q&A. Value range: 0.01 - 0.99. 
     * @return Confidence Retrieval confidence degree, valid for documents and Q&A. Value range: 0.01 - 0.99.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Retrieval confidence degree, valid for documents and Q&A. Value range: 0.01 - 0.99.
     * @param Confidence Retrieval confidence degree, valid for documents and Q&A. Value range: 0.01 - 0.99.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Resource status, 1: the resource is available; 2: the resource is exhausted. 
     * @return ResourceStatus Resource status, 1: the resource is available; 2: the resource is exhausted.
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set Resource status, 1: the resource is available; 2: the resource is exhausted.
     * @param ResourceStatus Resource status, 1: the resource is available; 2: the resource is exhausted.
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    public KnowledgeQaSearch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaSearch(KnowledgeQaSearch source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ReplyFlexibility != null) {
            this.ReplyFlexibility = new Long(source.ReplyFlexibility);
        }
        if (source.UseSearchEngine != null) {
            this.UseSearchEngine = new Boolean(source.UseSearchEngine);
        }
        if (source.ShowSearchEngine != null) {
            this.ShowSearchEngine = new Boolean(source.ShowSearchEngine);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Boolean(source.IsEnabled);
        }
        if (source.QaTopN != null) {
            this.QaTopN = new Long(source.QaTopN);
        }
        if (source.DocTopN != null) {
            this.DocTopN = new Long(source.DocTopN);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ReplyFlexibility", this.ReplyFlexibility);
        this.setParamSimple(map, prefix + "UseSearchEngine", this.UseSearchEngine);
        this.setParamSimple(map, prefix + "ShowSearchEngine", this.ShowSearchEngine);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "QaTopN", this.QaTopN);
        this.setParamSimple(map, prefix + "DocTopN", this.DocTopN);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}

