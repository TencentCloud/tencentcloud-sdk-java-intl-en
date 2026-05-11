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

public class MPSAiAnalysisTaskInput extends AbstractModel {

    /**
    * <p>ID of the video analysis template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Additional parameters, whose value is a serialized json string. Note: This parameter is for customization requirements. See the following: <a href="https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1">Intelligent Erasure</a><a href="https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1">Intelligent Splitting</a><a href="https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1">Highlight</a><a href="https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1">Intelligent Landscape-to-Portrait</a></p>
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
     * Get <p>ID of the video analysis template.</p> 
     * @return Definition <p>ID of the video analysis template.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>ID of the video analysis template.</p>
     * @param Definition <p>ID of the video analysis template.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Additional parameters, whose value is a serialized json string. Note: This parameter is for customization requirements. See the following: <a href="https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1">Intelligent Erasure</a><a href="https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1">Intelligent Splitting</a><a href="https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1">Highlight</a><a href="https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1">Intelligent Landscape-to-Portrait</a></p> 
     * @return ExtendedParameter <p>Additional parameters, whose value is a serialized json string. Note: This parameter is for customization requirements. See the following: <a href="https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1">Intelligent Erasure</a><a href="https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1">Intelligent Splitting</a><a href="https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1">Highlight</a><a href="https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1">Intelligent Landscape-to-Portrait</a></p>
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set <p>Additional parameters, whose value is a serialized json string. Note: This parameter is for customization requirements. See the following: <a href="https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1">Intelligent Erasure</a><a href="https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1">Intelligent Splitting</a><a href="https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1">Highlight</a><a href="https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1">Intelligent Landscape-to-Portrait</a></p>
     * @param ExtendedParameter <p>Additional parameters, whose value is a serialized json string. Note: This parameter is for customization requirements. See the following: <a href="https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1">Intelligent Erasure</a><a href="https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1">Intelligent Splitting</a><a href="https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1">Highlight</a><a href="https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1">Intelligent Landscape-to-Portrait</a></p>
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public MPSAiAnalysisTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiAnalysisTaskInput(MPSAiAnalysisTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtendedParameter != null) {
            this.ExtendedParameter = new String(source.ExtendedParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ExtendedParameter", this.ExtendedParameter);

    }
}

