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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskInput extends AbstractModel {

    /**
    * Video content analysis template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Additional parameters, whose value is a serialized json string.
Note: This parameter is used to meet customization requirements. See the following:
[Smart Erase Tutorial](https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1)
[Video Splitting (Long Videos to Short Videos) Tutorial](https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1)
[Intelligent Highlights Tutorial](https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1)
[Horizontal-to-Video Transformation](https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1)
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
     * Get Video content analysis template ID. 
     * @return Definition Video content analysis template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Video content analysis template ID.
     * @param Definition Video content analysis template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Additional parameters, whose value is a serialized json string.
Note: This parameter is used to meet customization requirements. See the following:
[Smart Erase Tutorial](https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1)
[Video Splitting (Long Videos to Short Videos) Tutorial](https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1)
[Intelligent Highlights Tutorial](https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1)
[Horizontal-to-Video Transformation](https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1) 
     * @return ExtendedParameter Additional parameters, whose value is a serialized json string.
Note: This parameter is used to meet customization requirements. See the following:
[Smart Erase Tutorial](https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1)
[Video Splitting (Long Videos to Short Videos) Tutorial](https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1)
[Intelligent Highlights Tutorial](https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1)
[Horizontal-to-Video Transformation](https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1)
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set Additional parameters, whose value is a serialized json string.
Note: This parameter is used to meet customization requirements. See the following:
[Smart Erase Tutorial](https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1)
[Video Splitting (Long Videos to Short Videos) Tutorial](https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1)
[Intelligent Highlights Tutorial](https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1)
[Horizontal-to-Video Transformation](https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1)
     * @param ExtendedParameter Additional parameters, whose value is a serialized json string.
Note: This parameter is used to meet customization requirements. See the following:
[Smart Erase Tutorial](https://www.tencentcloud.com/document/product/862/101530?from_cn_redirect=1)
[Video Splitting (Long Videos to Short Videos) Tutorial](https://www.tencentcloud.com/document/product/862/112098?from_cn_redirect=1)
[Intelligent Highlights Tutorial](https://www.tencentcloud.com/document/product/862/107280?from_cn_redirect=1)
[Horizontal-to-Video Transformation](https://www.tencentcloud.com/document/product/862/112112?from_cn_redirect=1)
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public AiAnalysisTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskInput(AiAnalysisTaskInput source) {
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

