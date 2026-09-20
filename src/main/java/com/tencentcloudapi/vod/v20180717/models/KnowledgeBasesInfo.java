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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeBasesInfo extends AbstractModel {

    /**
    * <p>List of knowledge bases currently importing media assets</p>
    */
    @SerializedName("Bases")
    @Expose
    private String [] Bases;

    /**
    * <p>Media analysis information in the knowledge base</p>
    */
    @SerializedName("KnowledgeAnalysisInfos")
    @Expose
    private KnowledgeAnalysisInfo [] KnowledgeAnalysisInfos;

    /**
    * <p>Detailed information about the repository list currently imported into the media asset and the parsing template used</p>
    */
    @SerializedName("KnowledgeBaseDetails")
    @Expose
    private KnowledgeBaseDetail [] KnowledgeBaseDetails;

    /**
     * Get <p>List of knowledge bases currently importing media assets</p> 
     * @return Bases <p>List of knowledge bases currently importing media assets</p>
     */
    public String [] getBases() {
        return this.Bases;
    }

    /**
     * Set <p>List of knowledge bases currently importing media assets</p>
     * @param Bases <p>List of knowledge bases currently importing media assets</p>
     */
    public void setBases(String [] Bases) {
        this.Bases = Bases;
    }

    /**
     * Get <p>Media analysis information in the knowledge base</p> 
     * @return KnowledgeAnalysisInfos <p>Media analysis information in the knowledge base</p>
     */
    public KnowledgeAnalysisInfo [] getKnowledgeAnalysisInfos() {
        return this.KnowledgeAnalysisInfos;
    }

    /**
     * Set <p>Media analysis information in the knowledge base</p>
     * @param KnowledgeAnalysisInfos <p>Media analysis information in the knowledge base</p>
     */
    public void setKnowledgeAnalysisInfos(KnowledgeAnalysisInfo [] KnowledgeAnalysisInfos) {
        this.KnowledgeAnalysisInfos = KnowledgeAnalysisInfos;
    }

    /**
     * Get <p>Detailed information about the repository list currently imported into the media asset and the parsing template used</p> 
     * @return KnowledgeBaseDetails <p>Detailed information about the repository list currently imported into the media asset and the parsing template used</p>
     */
    public KnowledgeBaseDetail [] getKnowledgeBaseDetails() {
        return this.KnowledgeBaseDetails;
    }

    /**
     * Set <p>Detailed information about the repository list currently imported into the media asset and the parsing template used</p>
     * @param KnowledgeBaseDetails <p>Detailed information about the repository list currently imported into the media asset and the parsing template used</p>
     */
    public void setKnowledgeBaseDetails(KnowledgeBaseDetail [] KnowledgeBaseDetails) {
        this.KnowledgeBaseDetails = KnowledgeBaseDetails;
    }

    public KnowledgeBasesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBasesInfo(KnowledgeBasesInfo source) {
        if (source.Bases != null) {
            this.Bases = new String[source.Bases.length];
            for (int i = 0; i < source.Bases.length; i++) {
                this.Bases[i] = new String(source.Bases[i]);
            }
        }
        if (source.KnowledgeAnalysisInfos != null) {
            this.KnowledgeAnalysisInfos = new KnowledgeAnalysisInfo[source.KnowledgeAnalysisInfos.length];
            for (int i = 0; i < source.KnowledgeAnalysisInfos.length; i++) {
                this.KnowledgeAnalysisInfos[i] = new KnowledgeAnalysisInfo(source.KnowledgeAnalysisInfos[i]);
            }
        }
        if (source.KnowledgeBaseDetails != null) {
            this.KnowledgeBaseDetails = new KnowledgeBaseDetail[source.KnowledgeBaseDetails.length];
            for (int i = 0; i < source.KnowledgeBaseDetails.length; i++) {
                this.KnowledgeBaseDetails[i] = new KnowledgeBaseDetail(source.KnowledgeBaseDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Bases.", this.Bases);
        this.setParamArrayObj(map, prefix + "KnowledgeAnalysisInfos.", this.KnowledgeAnalysisInfos);
        this.setParamArrayObj(map, prefix + "KnowledgeBaseDetails.", this.KnowledgeBaseDetails);

    }
}

