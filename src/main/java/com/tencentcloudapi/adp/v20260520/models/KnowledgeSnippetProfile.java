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

public class KnowledgeSnippetProfile extends AbstractModel {

    /**
    * <p>Content</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Associated document ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>Document name</p>
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Knowledge ID</p>
    */
    @SerializedName("KnowledgeId")
    @Expose
    private String KnowledgeId;

    /**
    * <p>Query</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>Document title</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get <p>Content</p> 
     * @return Content <p>Content</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Content</p>
     * @param Content <p>Content</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Associated document ID</p> 
     * @return DocId <p>Associated document ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>Associated document ID</p>
     * @param DocId <p>Associated document ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>Document name</p> 
     * @return DocName <p>Document name</p>
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set <p>Document name</p>
     * @param DocName <p>Document name</p>
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KbId <p>Knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KbId <p>Knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Knowledge ID</p> 
     * @return KnowledgeId <p>Knowledge ID</p>
     */
    public String getKnowledgeId() {
        return this.KnowledgeId;
    }

    /**
     * Set <p>Knowledge ID</p>
     * @param KnowledgeId <p>Knowledge ID</p>
     */
    public void setKnowledgeId(String KnowledgeId) {
        this.KnowledgeId = KnowledgeId;
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
     * Get <p>Document title</p> 
     * @return Title <p>Document title</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>Document title</p>
     * @param Title <p>Document title</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public KnowledgeSnippetProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeSnippetProfile(KnowledgeSnippetProfile source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.KnowledgeId != null) {
            this.KnowledgeId = new String(source.KnowledgeId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "KnowledgeId", this.KnowledgeId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

