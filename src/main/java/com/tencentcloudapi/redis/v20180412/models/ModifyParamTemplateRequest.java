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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParamTemplateRequest extends AbstractModel{

    /**
    * ID of the parameter template to be modified.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * New name of the parameter template.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * New description of the parameter template.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * List of new parameters.
    */
    @SerializedName("ParamList")
    @Expose
    private InstanceParam [] ParamList;

    /**
     * Get ID of the parameter template to be modified. 
     * @return TemplateId ID of the parameter template to be modified.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set ID of the parameter template to be modified.
     * @param TemplateId ID of the parameter template to be modified.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get New name of the parameter template. 
     * @return Name New name of the parameter template.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set New name of the parameter template.
     * @param Name New name of the parameter template.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get New description of the parameter template. 
     * @return Description New description of the parameter template.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set New description of the parameter template.
     * @param Description New description of the parameter template.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get List of new parameters. 
     * @return ParamList List of new parameters.
     */
    public InstanceParam [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set List of new parameters.
     * @param ParamList List of new parameters.
     */
    public void setParamList(InstanceParam [] ParamList) {
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
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParamList != null) {
            this.ParamList = new InstanceParam[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new InstanceParam(source.ParamList[i]);
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

