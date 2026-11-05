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

public class QAMetadata extends AbstractModel {

    /**
    * <p>Answer</p>
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * <p>QA characters</p>
    */
    @SerializedName("QaCharCount")
    @Expose
    private String QaCharCount;

    /**
    * <p>QA size (byte, including similar questions)</p>
    */
    @SerializedName("QaSize")
    @Expose
    private String QaSize;

    /**
    * <p>Query</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>Metadata reference field name list (for displaying which QA categories and attributes are set as metadata)</p>
    */
    @SerializedName("RefFieldNameList")
    @Expose
    private String [] RefFieldNameList;

    /**
     * Get <p>Answer</p> 
     * @return Answer <p>Answer</p>
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>Answer</p>
     * @param Answer <p>Answer</p>
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>QA characters</p> 
     * @return QaCharCount <p>QA characters</p>
     */
    public String getQaCharCount() {
        return this.QaCharCount;
    }

    /**
     * Set <p>QA characters</p>
     * @param QaCharCount <p>QA characters</p>
     */
    public void setQaCharCount(String QaCharCount) {
        this.QaCharCount = QaCharCount;
    }

    /**
     * Get <p>QA size (byte, including similar questions)</p> 
     * @return QaSize <p>QA size (byte, including similar questions)</p>
     */
    public String getQaSize() {
        return this.QaSize;
    }

    /**
     * Set <p>QA size (byte, including similar questions)</p>
     * @param QaSize <p>QA size (byte, including similar questions)</p>
     */
    public void setQaSize(String QaSize) {
        this.QaSize = QaSize;
    }

    /**
     * Get <p>Query</p> 
     * @return Question <p>Query</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>Query</p>
     * @param Question <p>Query</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>Metadata reference field name list (for displaying which QA categories and attributes are set as metadata)</p> 
     * @return RefFieldNameList <p>Metadata reference field name list (for displaying which QA categories and attributes are set as metadata)</p>
     */
    public String [] getRefFieldNameList() {
        return this.RefFieldNameList;
    }

    /**
     * Set <p>Metadata reference field name list (for displaying which QA categories and attributes are set as metadata)</p>
     * @param RefFieldNameList <p>Metadata reference field name list (for displaying which QA categories and attributes are set as metadata)</p>
     */
    public void setRefFieldNameList(String [] RefFieldNameList) {
        this.RefFieldNameList = RefFieldNameList;
    }

    public QAMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QAMetadata(QAMetadata source) {
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.QaCharCount != null) {
            this.QaCharCount = new String(source.QaCharCount);
        }
        if (source.QaSize != null) {
            this.QaSize = new String(source.QaSize);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.RefFieldNameList != null) {
            this.RefFieldNameList = new String[source.RefFieldNameList.length];
            for (int i = 0; i < source.RefFieldNameList.length; i++) {
                this.RefFieldNameList[i] = new String(source.RefFieldNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "QaCharCount", this.QaCharCount);
        this.setParamSimple(map, prefix + "QaSize", this.QaSize);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamArraySimple(map, prefix + "RefFieldNameList.", this.RefFieldNameList);

    }
}

