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

public class ListQARequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Page number.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query a question.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Verification status (1: not verified 2: adopted 3: not adopted).
    */
    @SerializedName("AcceptStatus")
    @Expose
    private Long [] AcceptStatus;

    /**
    * Release status (2: pending release; 3: releasing; 4: released; 7: under review; 8: review failed; 9: under manual appeal; 11: manual appeal failed; 12: expired; 13: excessive invalid; 14: excessive invalid recovered).
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long [] ReleaseStatus;

    /**
    * Document ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * Source (1: generated from document; 2: import in batches; 3: manually added).
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Query an answer.
    */
    @SerializedName("QueryAnswer")
    @Expose
    private String QueryAnswer;

    /**
    * Category ID.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * Q&A business ID list.
    */
    @SerializedName("QaBizIds")
    @Expose
    private String [] QaBizIds;

    /**
    * Query type: filename; attribute label.
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Page number. 
     * @return PageNumber Page number.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number.
     * @param PageNumber Page number.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size. 
     * @return PageSize Page size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size.
     * @param PageSize Page size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query a question. 
     * @return Query Query a question.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query a question.
     * @param Query Query a question.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Verification status (1: not verified 2: adopted 3: not adopted). 
     * @return AcceptStatus Verification status (1: not verified 2: adopted 3: not adopted).
     */
    public Long [] getAcceptStatus() {
        return this.AcceptStatus;
    }

    /**
     * Set Verification status (1: not verified 2: adopted 3: not adopted).
     * @param AcceptStatus Verification status (1: not verified 2: adopted 3: not adopted).
     */
    public void setAcceptStatus(Long [] AcceptStatus) {
        this.AcceptStatus = AcceptStatus;
    }

    /**
     * Get Release status (2: pending release; 3: releasing; 4: released; 7: under review; 8: review failed; 9: under manual appeal; 11: manual appeal failed; 12: expired; 13: excessive invalid; 14: excessive invalid recovered). 
     * @return ReleaseStatus Release status (2: pending release; 3: releasing; 4: released; 7: under review; 8: review failed; 9: under manual appeal; 11: manual appeal failed; 12: expired; 13: excessive invalid; 14: excessive invalid recovered).
     */
    public Long [] getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set Release status (2: pending release; 3: releasing; 4: released; 7: under review; 8: review failed; 9: under manual appeal; 11: manual appeal failed; 12: expired; 13: excessive invalid; 14: excessive invalid recovered).
     * @param ReleaseStatus Release status (2: pending release; 3: releasing; 4: released; 7: under review; 8: review failed; 9: under manual appeal; 11: manual appeal failed; 12: expired; 13: excessive invalid; 14: excessive invalid recovered).
     */
    public void setReleaseStatus(Long [] ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
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

    /**
     * Get Source (1: generated from document; 2: import in batches; 3: manually added). 
     * @return Source Source (1: generated from document; 2: import in batches; 3: manually added).
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Source (1: generated from document; 2: import in batches; 3: manually added).
     * @param Source Source (1: generated from document; 2: import in batches; 3: manually added).
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Query an answer. 
     * @return QueryAnswer Query an answer.
     */
    public String getQueryAnswer() {
        return this.QueryAnswer;
    }

    /**
     * Set Query an answer.
     * @param QueryAnswer Query an answer.
     */
    public void setQueryAnswer(String QueryAnswer) {
        this.QueryAnswer = QueryAnswer;
    }

    /**
     * Get Category ID. 
     * @return CateBizId Category ID.
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set Category ID.
     * @param CateBizId Category ID.
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get Q&A business ID list. 
     * @return QaBizIds Q&A business ID list.
     */
    public String [] getQaBizIds() {
        return this.QaBizIds;
    }

    /**
     * Set Q&A business ID list.
     * @param QaBizIds Q&A business ID list.
     */
    public void setQaBizIds(String [] QaBizIds) {
        this.QaBizIds = QaBizIds;
    }

    /**
     * Get Query type: filename; attribute label. 
     * @return QueryType Query type: filename; attribute label.
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set Query type: filename; attribute label.
     * @param QueryType Query type: filename; attribute label.
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    public ListQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQARequest(ListQARequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.AcceptStatus != null) {
            this.AcceptStatus = new Long[source.AcceptStatus.length];
            for (int i = 0; i < source.AcceptStatus.length; i++) {
                this.AcceptStatus[i] = new Long(source.AcceptStatus[i]);
            }
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Long[source.ReleaseStatus.length];
            for (int i = 0; i < source.ReleaseStatus.length; i++) {
                this.ReleaseStatus[i] = new Long(source.ReleaseStatus[i]);
            }
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.QueryAnswer != null) {
            this.QueryAnswer = new String(source.QueryAnswer);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.QaBizIds != null) {
            this.QaBizIds = new String[source.QaBizIds.length];
            for (int i = 0; i < source.QaBizIds.length; i++) {
                this.QaBizIds[i] = new String(source.QaBizIds[i]);
            }
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "AcceptStatus.", this.AcceptStatus);
        this.setParamArraySimple(map, prefix + "ReleaseStatus.", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "QueryAnswer", this.QueryAnswer);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamArraySimple(map, prefix + "QaBizIds.", this.QaBizIds);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);

    }
}

