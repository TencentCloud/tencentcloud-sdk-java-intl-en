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
    * 
    */
    @SerializedName("Bases")
    @Expose
    private String [] Bases;

    /**
    * 
    */
    @SerializedName("KnowledgeAnalysisInfos")
    @Expose
    private KnowledgeAnalysisInfo [] KnowledgeAnalysisInfos;

    /**
    * 
    */
    @SerializedName("KnowledgeBaseDetails")
    @Expose
    private KnowledgeBaseDetail [] KnowledgeBaseDetails;

    /**
     * Get  
     * @return Bases 
     */
    public String [] getBases() {
        return this.Bases;
    }

    /**
     * Set 
     * @param Bases 
     */
    public void setBases(String [] Bases) {
        this.Bases = Bases;
    }

    /**
     * Get  
     * @return KnowledgeAnalysisInfos 
     */
    public KnowledgeAnalysisInfo [] getKnowledgeAnalysisInfos() {
        return this.KnowledgeAnalysisInfos;
    }

    /**
     * Set 
     * @param KnowledgeAnalysisInfos 
     */
    public void setKnowledgeAnalysisInfos(KnowledgeAnalysisInfo [] KnowledgeAnalysisInfos) {
        this.KnowledgeAnalysisInfos = KnowledgeAnalysisInfos;
    }

    /**
     * Get  
     * @return KnowledgeBaseDetails 
     */
    public KnowledgeBaseDetail [] getKnowledgeBaseDetails() {
        return this.KnowledgeBaseDetails;
    }

    /**
     * Set 
     * @param KnowledgeBaseDetails 
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

