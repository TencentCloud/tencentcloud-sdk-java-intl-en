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

public class SimilarQuestion extends AbstractModel {

    /**
    * Similar question ID.
    */
    @SerializedName("SimBizId")
    @Expose
    private String SimBizId;

    /**
    * Similar question content.
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Similar question review status, 1: audit failure.
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
     * Get Similar question ID. 
     * @return SimBizId Similar question ID.
     */
    public String getSimBizId() {
        return this.SimBizId;
    }

    /**
     * Set Similar question ID.
     * @param SimBizId Similar question ID.
     */
    public void setSimBizId(String SimBizId) {
        this.SimBizId = SimBizId;
    }

    /**
     * Get Similar question content. 
     * @return Question Similar question content.
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Similar question content.
     * @param Question Similar question content.
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Similar question review status, 1: audit failure. 
     * @return AuditStatus Similar question review status, 1: audit failure.
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Similar question review status, 1: audit failure.
     * @param AuditStatus Similar question review status, 1: audit failure.
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    public SimilarQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimilarQuestion(SimilarQuestion source) {
        if (source.SimBizId != null) {
            this.SimBizId = new String(source.SimBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SimBizId", this.SimBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);

    }
}

