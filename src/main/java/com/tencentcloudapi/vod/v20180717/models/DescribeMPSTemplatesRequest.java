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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * MPS template type. Filter results by the MPS template type you want to query. Value:
<li>Transcode: Query the transcoding template list.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * MPS queries template parameters. This parameter is used for passing through to the media processing service (MPS) to query the MPS template list from the VOD side. Currently only support querying templates of the following task types via this method:
1. Audio and video enhancement: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "retrieval transcoding template list" (https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
2. Intelligent Analysis: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Search Intelligent Analysis Template List" (https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1) interface. Currently only support configuring the above parameters in the Template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.
3. Smart subtitling: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Get Smart Subtitling Template List" (https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
4. Intelligent erasure: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "Search intelligent erasure template list" (https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template. Other parameters are not required. If other parameters are included, the system will automatically ignore.
    */
    @SerializedName("MPSDescribeTemplateParams")
    @Expose
    private String MPSDescribeTemplateParams;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get MPS template type. Filter results by the MPS template type you want to query. Value:
<li>Transcode: Query the transcoding template list.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li> 
     * @return TemplateType MPS template type. Filter results by the MPS template type you want to query. Value:
<li>Transcode: Query the transcoding template list.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set MPS template type. Filter results by the MPS template type you want to query. Value:
<li>Transcode: Query the transcoding template list.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
     * @param TemplateType MPS template type. Filter results by the MPS template type you want to query. Value:
<li>Transcode: Query the transcoding template list.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get MPS queries template parameters. This parameter is used for passing through to the media processing service (MPS) to query the MPS template list from the VOD side. Currently only support querying templates of the following task types via this method:
1. Audio and video enhancement: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "retrieval transcoding template list" (https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
2. Intelligent Analysis: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Search Intelligent Analysis Template List" (https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1) interface. Currently only support configuring the above parameters in the Template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.
3. Smart subtitling: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Get Smart Subtitling Template List" (https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
4. Intelligent erasure: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "Search intelligent erasure template list" (https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template. Other parameters are not required. If other parameters are included, the system will automatically ignore. 
     * @return MPSDescribeTemplateParams MPS queries template parameters. This parameter is used for passing through to the media processing service (MPS) to query the MPS template list from the VOD side. Currently only support querying templates of the following task types via this method:
1. Audio and video enhancement: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "retrieval transcoding template list" (https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
2. Intelligent Analysis: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Search Intelligent Analysis Template List" (https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1) interface. Currently only support configuring the above parameters in the Template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.
3. Smart subtitling: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Get Smart Subtitling Template List" (https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
4. Intelligent erasure: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "Search intelligent erasure template list" (https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template. Other parameters are not required. If other parameters are included, the system will automatically ignore.
     */
    public String getMPSDescribeTemplateParams() {
        return this.MPSDescribeTemplateParams;
    }

    /**
     * Set MPS queries template parameters. This parameter is used for passing through to the media processing service (MPS) to query the MPS template list from the VOD side. Currently only support querying templates of the following task types via this method:
1. Audio and video enhancement: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "retrieval transcoding template list" (https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
2. Intelligent Analysis: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Search Intelligent Analysis Template List" (https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1) interface. Currently only support configuring the above parameters in the Template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.
3. Smart subtitling: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Get Smart Subtitling Template List" (https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
4. Intelligent erasure: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "Search intelligent erasure template list" (https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template. Other parameters are not required. If other parameters are included, the system will automatically ignore.
     * @param MPSDescribeTemplateParams MPS queries template parameters. This parameter is used for passing through to the media processing service (MPS) to query the MPS template list from the VOD side. Currently only support querying templates of the following task types via this method:
1. Audio and video enhancement: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "retrieval transcoding template list" (https://www.tencentcloud.com/document/product/862/37593?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
2. Intelligent Analysis: Only support filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Search Intelligent Analysis Template List" (https://www.tencentcloud.com/document/product/862/40247?from_cn_redirect=1) interface. Currently only support configuring the above parameters in the Template. Other parameters are not required. If other parameters are included, the system will automatically ignore them.
3. Smart subtitling: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters from the "Get Smart Subtitling Template List" (https://www.tencentcloud.com/document/product/862/117002?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template, other parameters not required. If other parameters are included, system will automatically ignore.
4. Intelligent erasure: Only supports filling in the content of Definitions, Type, Name, Offset, and Limit parameters in the "Search intelligent erasure template list" (https://www.tencentcloud.com/document/product/862/123733?from_cn_redirect=1) interface. Currently only support configuring the above parameters in template. Other parameters are not required. If other parameters are included, the system will automatically ignore.
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

