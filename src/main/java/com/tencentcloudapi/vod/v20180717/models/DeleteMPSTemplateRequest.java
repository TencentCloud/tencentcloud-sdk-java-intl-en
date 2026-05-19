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

public class DeleteMPSTemplateRequest extends AbstractModel {

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Type of the MPS Template that needs to be deleted. Value:
<li>Transcode: delete transcoding template.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * Template Unique Identifier of the MPS task.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

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
     * Get Type of the MPS Template that needs to be deleted. Value:
<li>Transcode: delete transcoding template.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li> 
     * @return TemplateType Type of the MPS Template that needs to be deleted. Value:
<li>Transcode: delete transcoding template.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set Type of the MPS Template that needs to be deleted. Value:
<li>Transcode: delete transcoding template.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
     * @param TemplateType Type of the MPS Template that needs to be deleted. Value:
<li>Transcode: delete transcoding template.</li>
<li>AIAnalysis: Create intelligent analysis template.</li>
<li>SmartSubtitle: Create an intelligent subtitle template.</li>
<li>SmartErase: Create an intelligent erasure template.</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get Template Unique Identifier of the MPS task. 
     * @return Definition Template Unique Identifier of the MPS task.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Template Unique Identifier of the MPS task.
     * @param Definition Template Unique Identifier of the MPS task.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public DeleteMPSTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMPSTemplateRequest(DeleteMPSTemplateRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

