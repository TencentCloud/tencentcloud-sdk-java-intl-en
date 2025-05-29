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

public class DescribeTokenUsageGraphRequest extends AbstractModel {

    /**
    * Root account of Tencent Cloud.
    */
    @SerializedName("UinAccount")
    @Expose
    private String [] UinAccount;

    /**
    * Sub-business types of Tencent Cloud Agent Development Platform/TCADP: fileparse (document parsing), Embedding, Rewrite (multi-round rewriting), Concurrency, KnowledgeSummary (knowledge summary), KnowledgeQA (knowledge Q&A), KnowledgeCapacity (knowledge base capacity), SearchEngine (search engine).
    */
    @SerializedName("SubBizType")
    @Expose
    private String SubBizType;

    /**
    * Model identifier.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Start timestamp, in seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End timestamp, in seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Application ID list.
    */
    @SerializedName("AppBizIds")
    @Expose
    private String [] AppBizIds;

    /**
     * Get Root account of Tencent Cloud. 
     * @return UinAccount Root account of Tencent Cloud.
     */
    public String [] getUinAccount() {
        return this.UinAccount;
    }

    /**
     * Set Root account of Tencent Cloud.
     * @param UinAccount Root account of Tencent Cloud.
     */
    public void setUinAccount(String [] UinAccount) {
        this.UinAccount = UinAccount;
    }

    /**
     * Get Sub-business types of Tencent Cloud Agent Development Platform/TCADP: fileparse (document parsing), Embedding, Rewrite (multi-round rewriting), Concurrency, KnowledgeSummary (knowledge summary), KnowledgeQA (knowledge Q&A), KnowledgeCapacity (knowledge base capacity), SearchEngine (search engine). 
     * @return SubBizType Sub-business types of Tencent Cloud Agent Development Platform/TCADP: fileparse (document parsing), Embedding, Rewrite (multi-round rewriting), Concurrency, KnowledgeSummary (knowledge summary), KnowledgeQA (knowledge Q&A), KnowledgeCapacity (knowledge base capacity), SearchEngine (search engine).
     */
    public String getSubBizType() {
        return this.SubBizType;
    }

    /**
     * Set Sub-business types of Tencent Cloud Agent Development Platform/TCADP: fileparse (document parsing), Embedding, Rewrite (multi-round rewriting), Concurrency, KnowledgeSummary (knowledge summary), KnowledgeQA (knowledge Q&A), KnowledgeCapacity (knowledge base capacity), SearchEngine (search engine).
     * @param SubBizType Sub-business types of Tencent Cloud Agent Development Platform/TCADP: fileparse (document parsing), Embedding, Rewrite (multi-round rewriting), Concurrency, KnowledgeSummary (knowledge summary), KnowledgeQA (knowledge Q&A), KnowledgeCapacity (knowledge base capacity), SearchEngine (search engine).
     */
    public void setSubBizType(String SubBizType) {
        this.SubBizType = SubBizType;
    }

    /**
     * Get Model identifier. 
     * @return ModelName Model identifier.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model identifier.
     * @param ModelName Model identifier.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Start timestamp, in seconds. 
     * @return StartTime Start timestamp, in seconds.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp, in seconds.
     * @param StartTime Start timestamp, in seconds.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp, in seconds. 
     * @return EndTime End timestamp, in seconds.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp, in seconds.
     * @param EndTime End timestamp, in seconds.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Application ID list. 
     * @return AppBizIds Application ID list.
     */
    public String [] getAppBizIds() {
        return this.AppBizIds;
    }

    /**
     * Set Application ID list.
     * @param AppBizIds Application ID list.
     */
    public void setAppBizIds(String [] AppBizIds) {
        this.AppBizIds = AppBizIds;
    }

    public DescribeTokenUsageGraphRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenUsageGraphRequest(DescribeTokenUsageGraphRequest source) {
        if (source.UinAccount != null) {
            this.UinAccount = new String[source.UinAccount.length];
            for (int i = 0; i < source.UinAccount.length; i++) {
                this.UinAccount[i] = new String(source.UinAccount[i]);
            }
        }
        if (source.SubBizType != null) {
            this.SubBizType = new String(source.SubBizType);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AppBizIds != null) {
            this.AppBizIds = new String[source.AppBizIds.length];
            for (int i = 0; i < source.AppBizIds.length; i++) {
                this.AppBizIds[i] = new String(source.AppBizIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UinAccount.", this.UinAccount);
        this.setParamSimple(map, prefix + "SubBizType", this.SubBizType);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "AppBizIds.", this.AppBizIds);

    }
}

