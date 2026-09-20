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
    * <p><b>VOD <a href="/document/product/266/14574">application</a> ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Type of MPS template that needs to be deleted. Parameter values:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li><li>EmbedSubtitle: Subtitle suppression template.</li>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>Unique identifier of the MPS task template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get <p><b>VOD <a href="/document/product/266/14574">application</a> ID.</b></p> 
     * @return SubAppId <p><b>VOD <a href="/document/product/266/14574">application</a> ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="/document/product/266/14574">application</a> ID.</b></p>
     * @param SubAppId <p><b>VOD <a href="/document/product/266/14574">application</a> ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Type of MPS template that needs to be deleted. Parameter values:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li><li>EmbedSubtitle: Subtitle suppression template.</li> 
     * @return TemplateType <p>Type of MPS template that needs to be deleted. Parameter values:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li><li>EmbedSubtitle: Subtitle suppression template.</li>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>Type of MPS template that needs to be deleted. Parameter values:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li><li>EmbedSubtitle: Subtitle suppression template.</li>
     * @param TemplateType <p>Type of MPS template that needs to be deleted. Parameter values:</p><li>AIAnalysis: Create an intelligent analysis template.</li><li>SmartSubtitle: Create an intelligent subtitle template.</li><li>SmartErase: Create an intelligent erasure template.</li><li>EmbedSubtitle: Subtitle suppression template.</li>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>Unique identifier of the MPS task template.</p> 
     * @return Definition <p>Unique identifier of the MPS task template.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique identifier of the MPS task template.</p>
     * @param Definition <p>Unique identifier of the MPS task template.</p>
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

