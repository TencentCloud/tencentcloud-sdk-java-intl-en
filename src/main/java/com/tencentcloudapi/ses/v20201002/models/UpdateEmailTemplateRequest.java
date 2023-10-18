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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEmailTemplateRequest extends AbstractModel {

    /**
    * Template content.
    */
    @SerializedName("TemplateContent")
    @Expose
    private TemplateContent TemplateContent;

    /**
    * Template ID.
    */
    @SerializedName("TemplateID")
    @Expose
    private Long TemplateID;

    /**
    * Template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
     * Get Template content. 
     * @return TemplateContent Template content.
     */
    public TemplateContent getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set Template content.
     * @param TemplateContent Template content.
     */
    public void setTemplateContent(TemplateContent TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    /**
     * Get Template ID. 
     * @return TemplateID Template ID.
     */
    public Long getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set Template ID.
     * @param TemplateID Template ID.
     */
    public void setTemplateID(Long TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get Template name 
     * @return TemplateName Template name
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name
     * @param TemplateName Template name
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    public UpdateEmailTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEmailTemplateRequest(UpdateEmailTemplateRequest source) {
        if (source.TemplateContent != null) {
            this.TemplateContent = new TemplateContent(source.TemplateContent);
        }
        if (source.TemplateID != null) {
            this.TemplateID = new Long(source.TemplateID);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TemplateContent.", this.TemplateContent);
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);

    }
}

