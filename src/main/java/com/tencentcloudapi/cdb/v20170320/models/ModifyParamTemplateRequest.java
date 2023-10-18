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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParamTemplateRequest extends AbstractModel {

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template name (up to 64 characters)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description (up to 255 characters)
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * List of parameters.
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template name (up to 64 characters) 
     * @return Name Template name (up to 64 characters)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name (up to 64 characters)
     * @param Name Template name (up to 64 characters)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description (up to 255 characters) 
     * @return Description Template description (up to 255 characters)
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Template description (up to 255 characters)
     * @param Description Template description (up to 255 characters)
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get List of parameters. 
     * @return ParamList List of parameters.
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set List of parameters.
     * @param ParamList List of parameters.
     */
    public void setParamList(Parameter [] ParamList) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParamList != null) {
            this.ParamList = new Parameter[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new Parameter(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

