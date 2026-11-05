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

public class ModifyQARequest extends AbstractModel {

    /**
    * <p>Modify field content (used in conjunction with update_mask)</p>
    */
    @SerializedName("Fields")
    @Expose
    private QAModifyFields Fields;

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>QA ID</p>
    */
    @SerializedName("QaId")
    @Expose
    private String QaId;

    /**
    * <p>Field mask: specifies the fields to be modified (supported Paths: Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted)</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get <p>Modify field content (used in conjunction with update_mask)</p> 
     * @return Fields <p>Modify field content (used in conjunction with update_mask)</p>
     */
    public QAModifyFields getFields() {
        return this.Fields;
    }

    /**
     * Set <p>Modify field content (used in conjunction with update_mask)</p>
     * @param Fields <p>Modify field content (used in conjunction with update_mask)</p>
     */
    public void setFields(QAModifyFields Fields) {
        this.Fields = Fields;
    }

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
     * Get <p>QA ID</p> 
     * @return QaId <p>QA ID</p>
     */
    public String getQaId() {
        return this.QaId;
    }

    /**
     * Set <p>QA ID</p>
     * @param QaId <p>QA ID</p>
     */
    public void setQaId(String QaId) {
        this.QaId = QaId;
    }

    /**
     * Get <p>Field mask: specifies the fields to be modified (supported Paths: Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted)</p> 
     * @return UpdateMask <p>Field mask: specifies the fields to be modified (supported Paths: Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted)</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>Field mask: specifies the fields to be modified (supported Paths: Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted)</p>
     * @param UpdateMask <p>Field mask: specifies the fields to be modified (supported Paths: Question, Answer, CategoryId, DocId, LabelRefList, QuestionDescription, ExpirationPolicy, SimilarQuestionList, EffectiveDomain, IsAccepted)</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQARequest(ModifyQARequest source) {
        if (source.Fields != null) {
            this.Fields = new QAModifyFields(source.Fields);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.QaId != null) {
            this.QaId = new String(source.QaId);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "QaId", this.QaId);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

