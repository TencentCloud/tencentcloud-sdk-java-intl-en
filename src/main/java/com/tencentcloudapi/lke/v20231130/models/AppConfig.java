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

public class AppConfig extends AbstractModel {

    /**
    * Knowledge Q&A management application configuration
    */
    @SerializedName("KnowledgeQa")
    @Expose
    private KnowledgeQaConfig KnowledgeQa;

    /**
    * Knowledge summary application configuration.
    */
    @SerializedName("Summary")
    @Expose
    private SummaryConfig Summary;

    /**
    * Label extraction application configuration.
    */
    @SerializedName("Classify")
    @Expose
    private ClassifyConfig Classify;

    /**
     * Get Knowledge Q&A management application configuration 
     * @return KnowledgeQa Knowledge Q&A management application configuration
     */
    public KnowledgeQaConfig getKnowledgeQa() {
        return this.KnowledgeQa;
    }

    /**
     * Set Knowledge Q&A management application configuration
     * @param KnowledgeQa Knowledge Q&A management application configuration
     */
    public void setKnowledgeQa(KnowledgeQaConfig KnowledgeQa) {
        this.KnowledgeQa = KnowledgeQa;
    }

    /**
     * Get Knowledge summary application configuration. 
     * @return Summary Knowledge summary application configuration.
     */
    public SummaryConfig getSummary() {
        return this.Summary;
    }

    /**
     * Set Knowledge summary application configuration.
     * @param Summary Knowledge summary application configuration.
     */
    public void setSummary(SummaryConfig Summary) {
        this.Summary = Summary;
    }

    /**
     * Get Label extraction application configuration. 
     * @return Classify Label extraction application configuration.
     */
    public ClassifyConfig getClassify() {
        return this.Classify;
    }

    /**
     * Set Label extraction application configuration.
     * @param Classify Label extraction application configuration.
     */
    public void setClassify(ClassifyConfig Classify) {
        this.Classify = Classify;
    }

    public AppConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppConfig(AppConfig source) {
        if (source.KnowledgeQa != null) {
            this.KnowledgeQa = new KnowledgeQaConfig(source.KnowledgeQa);
        }
        if (source.Summary != null) {
            this.Summary = new SummaryConfig(source.Summary);
        }
        if (source.Classify != null) {
            this.Classify = new ClassifyConfig(source.Classify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "KnowledgeQa.", this.KnowledgeQa);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Classify.", this.Classify);

    }
}

