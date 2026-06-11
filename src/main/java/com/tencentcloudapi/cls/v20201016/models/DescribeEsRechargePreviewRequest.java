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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEsRechargePreviewRequest extends AbstractModel {

    /**
    * Name: Length not exceeding 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Index information. Different indexes can be separated by English commas and support wildcards.
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Elasticsearch Query Statement.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * es cluster configuration.
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * es import information.
    */
    @SerializedName("ImportInfo")
    @Expose
    private EsImportInfo ImportInfo;

    /**
    * Field information of es import time.
    */
    @SerializedName("TimeInfo")
    @Expose
    private EsTimeInfo TimeInfo;

    /**
     * Get Name: Length not exceeding 64 characters. 
     * @return Name Name: Length not exceeding 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name: Length not exceeding 64 characters.
     * @param Name Name: Length not exceeding 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). 
     * @return TopicId Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     * @param TopicId Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Index information. Different indexes can be separated by English commas and support wildcards. 
     * @return Index Index information. Different indexes can be separated by English commas and support wildcards.
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Index information. Different indexes can be separated by English commas and support wildcards.
     * @param Index Index information. Different indexes can be separated by English commas and support wildcards.
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Elasticsearch Query Statement. 
     * @return Query Elasticsearch Query Statement.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Elasticsearch Query Statement.
     * @param Query Elasticsearch Query Statement.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get es cluster configuration. 
     * @return EsInfo es cluster configuration.
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set es cluster configuration.
     * @param EsInfo es cluster configuration.
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get es import information. 
     * @return ImportInfo es import information.
     */
    public EsImportInfo getImportInfo() {
        return this.ImportInfo;
    }

    /**
     * Set es import information.
     * @param ImportInfo es import information.
     */
    public void setImportInfo(EsImportInfo ImportInfo) {
        this.ImportInfo = ImportInfo;
    }

    /**
     * Get Field information of es import time. 
     * @return TimeInfo Field information of es import time.
     */
    public EsTimeInfo getTimeInfo() {
        return this.TimeInfo;
    }

    /**
     * Set Field information of es import time.
     * @param TimeInfo Field information of es import time.
     */
    public void setTimeInfo(EsTimeInfo TimeInfo) {
        this.TimeInfo = TimeInfo;
    }

    public DescribeEsRechargePreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEsRechargePreviewRequest(DescribeEsRechargePreviewRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EsInfo != null) {
            this.EsInfo = new EsInfo(source.EsInfo);
        }
        if (source.ImportInfo != null) {
            this.ImportInfo = new EsImportInfo(source.ImportInfo);
        }
        if (source.TimeInfo != null) {
            this.TimeInfo = new EsTimeInfo(source.TimeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamObj(map, prefix + "ImportInfo.", this.ImportInfo);
        this.setParamObj(map, prefix + "TimeInfo.", this.TimeInfo);

    }
}

