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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParamTemplateRequest extends AbstractModel{

    /**
    * Template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template description
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * Parameter list
    */
    @SerializedName("ParamList")
    @Expose
    private ModifyParamItem [] ParamList;

    /**
     * Get Template ID 
     * @return TemplateId Template ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID
     * @param TemplateId Template ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
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

    /**
     * Get Template description 
     * @return TemplateDescription Template description
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Template description
     * @param TemplateDescription Template description
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get Parameter list 
     * @return ParamList Parameter list
     */
    public ModifyParamItem [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set Parameter list
     * @param ParamList Parameter list
     */
    public void setParamList(ModifyParamItem [] ParamList) {
        this.ParamList = ParamList;
    }

    public ModifyParamTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyParamTemplateRequest(ModifyParamTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.ParamList != null) {
            this.ParamList = new ModifyParamItem[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ModifyParamItem(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

