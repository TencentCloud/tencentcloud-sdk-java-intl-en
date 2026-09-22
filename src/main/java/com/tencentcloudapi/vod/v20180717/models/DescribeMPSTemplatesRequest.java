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

public class DescribeMPSTemplatesRequest extends AbstractModel {

    /**
    * <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>MPS template type. Filter results by the type of MPS template you want to query. Parameter Value:</p><li>AIAnalysis: intelligent analysis template.</li><li>SmartSubtitle: smart subtitling template.</li><li>SmartErase: intelligent erasure template.</li><li>EmbedSubtitle: subtitle suppression template.</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>MPS query template parameter. This parameter is used to pass through to the media processing service (MPS) to query the MPS task template list from the VOD side. Currently, it only supports querying templates of the following task types through this method:</p><ol><li>Audio and video enhancement: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1">Get transcoding template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1">Get AI analysis template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1">Get smart subtitling template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1">Get intelligent erasure template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
    */
    @SerializedName("MPSDescribeTemplateParams")
    @Expose
    private String MPSDescribeTemplateParams;

    /**
     * Get <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p> 
     * @return SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     * @param SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>MPS template type. Filter results by the type of MPS template you want to query. Parameter Value:</p><li>AIAnalysis: intelligent analysis template.</li><li>SmartSubtitle: smart subtitling template.</li><li>SmartErase: intelligent erasure template.</li><li>EmbedSubtitle: subtitle suppression template.</li> 
     * @return TemplateType <p>MPS template type. Filter results by the type of MPS template you want to query. Parameter Value:</p><li>AIAnalysis: intelligent analysis template.</li><li>SmartSubtitle: smart subtitling template.</li><li>SmartErase: intelligent erasure template.</li><li>EmbedSubtitle: subtitle suppression template.</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>MPS template type. Filter results by the type of MPS template you want to query. Parameter Value:</p><li>AIAnalysis: intelligent analysis template.</li><li>SmartSubtitle: smart subtitling template.</li><li>SmartErase: intelligent erasure template.</li><li>EmbedSubtitle: subtitle suppression template.</li>
     * @param TemplateType <p>MPS template type. Filter results by the type of MPS template you want to query. Parameter Value:</p><li>AIAnalysis: intelligent analysis template.</li><li>SmartSubtitle: smart subtitling template.</li><li>SmartErase: intelligent erasure template.</li><li>EmbedSubtitle: subtitle suppression template.</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>MPS query template parameter. This parameter is used to pass through to the media processing service (MPS) to query the MPS task template list from the VOD side. Currently, it only supports querying templates of the following task types through this method:</p><ol><li>Audio and video enhancement: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1">Get transcoding template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1">Get AI analysis template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1">Get smart subtitling template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1">Get intelligent erasure template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol> 
     * @return MPSDescribeTemplateParams <p>MPS query template parameter. This parameter is used to pass through to the media processing service (MPS) to query the MPS task template list from the VOD side. Currently, it only supports querying templates of the following task types through this method:</p><ol><li>Audio and video enhancement: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1">Get transcoding template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1">Get AI analysis template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1">Get smart subtitling template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1">Get intelligent erasure template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
     */
    public String getMPSDescribeTemplateParams() {
        return this.MPSDescribeTemplateParams;
    }

    /**
     * Set <p>MPS query template parameter. This parameter is used to pass through to the media processing service (MPS) to query the MPS task template list from the VOD side. Currently, it only supports querying templates of the following task types through this method:</p><ol><li>Audio and video enhancement: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1">Get transcoding template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1">Get AI analysis template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1">Get smart subtitling template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1">Get intelligent erasure template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
     * @param MPSDescribeTemplateParams <p>MPS query template parameter. This parameter is used to pass through to the media processing service (MPS) to query the MPS task template list from the VOD side. Currently, it only supports querying templates of the following task types through this method:</p><ol><li>Audio and video enhancement: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1">Get transcoding template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>AI analysis: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1">Get AI analysis template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Smart subtitling: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1">Get smart subtitling template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li><li>Intelligent erasure: only supports filling in the content of the Definitions, Type, Name, Offset, and Limit parameters in the <a href="https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1">Get intelligent erasure template list</a> API. Currently, only the above parameters can be configured in the template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.</li></ol>
     */
    public void setMPSDescribeTemplateParams(String MPSDescribeTemplateParams) {
        this.MPSDescribeTemplateParams = MPSDescribeTemplateParams;
    }

    public DescribeMPSTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMPSTemplatesRequest(DescribeMPSTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MPSDescribeTemplateParams != null) {
            this.MPSDescribeTemplateParams = new String(source.MPSDescribeTemplateParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MPSDescribeTemplateParams", this.MPSDescribeTemplateParams);

    }
}

