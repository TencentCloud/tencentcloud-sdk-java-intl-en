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

public class QaReference extends AbstractModel {

    /**
    * <p>QA business ID</p>
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * <p>Document fragment reference ID</p>
    */
    @SerializedName("ReferBizId")
    @Expose
    private String ReferBizId;

    /**
    * <p>Business ID of the knowledge base where the QA resides</p>
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * <p>Name of the knowledge base where the QA resides</p>
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
     * Get <p>QA business ID</p> 
     * @return QaBizId <p>QA business ID</p>
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set <p>QA business ID</p>
     * @param QaBizId <p>QA business ID</p>
     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get <p>Document fragment reference ID</p> 
     * @return ReferBizId <p>Document fragment reference ID</p>
     */
    public String getReferBizId() {
        return this.ReferBizId;
    }

    /**
     * Set <p>Document fragment reference ID</p>
     * @param ReferBizId <p>Document fragment reference ID</p>
     */
    public void setReferBizId(String ReferBizId) {
        this.ReferBizId = ReferBizId;
    }

    /**
     * Get <p>Business ID of the knowledge base where the QA resides</p> 
     * @return KnowledgeBizId <p>Business ID of the knowledge base where the QA resides</p>
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set <p>Business ID of the knowledge base where the QA resides</p>
     * @param KnowledgeBizId <p>Business ID of the knowledge base where the QA resides</p>
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get <p>Name of the knowledge base where the QA resides</p> 
     * @return KnowledgeName <p>Name of the knowledge base where the QA resides</p>
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set <p>Name of the knowledge base where the QA resides</p>
     * @param KnowledgeName <p>Name of the knowledge base where the QA resides</p>
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    public QaReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QaReference(QaReference source) {
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.ReferBizId != null) {
            this.ReferBizId = new String(source.ReferBizId);
        }
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "ReferBizId", this.ReferBizId);
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);

    }
}

