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

public class DescribeSplunkPreviewRequest extends AbstractModel {

    /**
    * <p>Log topic id. Obtain the log topic id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>splunk delivery task meta-information</p>
    */
    @SerializedName("MetadataInfo")
    @Expose
    private MetadataInfo MetadataInfo;

    /**
    * <p>splunk delivery task - deliver splunk filtered raw log statements</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>Log topic id. Obtain the log topic id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</p> 
     * @return TopicId <p>Log topic id. Obtain the log topic id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic id. Obtain the log topic id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</p>
     * @param TopicId <p>Log topic id. Obtain the log topic id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>splunk delivery task meta-information</p> 
     * @return MetadataInfo <p>splunk delivery task meta-information</p>
     */
    public MetadataInfo getMetadataInfo() {
        return this.MetadataInfo;
    }

    /**
     * Set <p>splunk delivery task meta-information</p>
     * @param MetadataInfo <p>splunk delivery task meta-information</p>
     */
    public void setMetadataInfo(MetadataInfo MetadataInfo) {
        this.MetadataInfo = MetadataInfo;
    }

    /**
     * Get <p>splunk delivery task - deliver splunk filtered raw log statements</p> 
     * @return DSLFilter <p>splunk delivery task - deliver splunk filtered raw log statements</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>splunk delivery task - deliver splunk filtered raw log statements</p>
     * @param DSLFilter <p>splunk delivery task - deliver splunk filtered raw log statements</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public DescribeSplunkPreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSplunkPreviewRequest(DescribeSplunkPreviewRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.MetadataInfo != null) {
            this.MetadataInfo = new MetadataInfo(source.MetadataInfo);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamObj(map, prefix + "MetadataInfo.", this.MetadataInfo);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

