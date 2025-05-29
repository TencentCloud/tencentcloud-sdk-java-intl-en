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

public class AgentReference extends AbstractModel {

    /**
    * Source document ID.
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Document business ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * Document name.
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * Q&A business ID.
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * Index of search engine.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * Title.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get Source document ID. 
     * @return DocId Source document ID.
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set Source document ID.
     * @param DocId Source document ID.
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get ID. 
     * @return Id ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID.
     * @param Id ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type. 
     * @return Type Type.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get URL. 
     * @return Url URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL.
     * @param Url URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Document business ID. 
     * @return DocBizId Document business ID.
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document business ID.
     * @param DocBizId Document business ID.
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
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
     * Get Q&A business ID. 
     * @return QaBizId Q&A business ID.
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set Q&A business ID.
     * @param QaBizId Q&A business ID.
     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get Index of search engine. 
     * @return Index Index of search engine.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Index of search engine.
     * @param Index Index of search engine.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get Title. 
     * @return Title Title.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Title.
     * @param Title Title.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public AgentReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentReference(AgentReference source) {
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

