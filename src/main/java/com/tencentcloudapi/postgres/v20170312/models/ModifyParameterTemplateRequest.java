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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParameterTemplateRequest extends AbstractModel {

    /**
    * Parameter template ID, which uniquely identifies a parameter template and cannot be modified.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Parameter template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this field is empty, the original parameter template name will be used.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this parameter is not passed in, the original parameter template description will be used.
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * The set of parameters to be modified or added. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
    */
    @SerializedName("ModifyParamEntrySet")
    @Expose
    private ParamEntry [] ModifyParamEntrySet;

    /**
    * The set of parameters to be deleted in the template. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
    */
    @SerializedName("DeleteParamSet")
    @Expose
    private String [] DeleteParamSet;

    /**
     * Get Parameter template ID, which uniquely identifies a parameter template and cannot be modified. 
     * @return TemplateId Parameter template ID, which uniquely identifies a parameter template and cannot be modified.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Parameter template ID, which uniquely identifies a parameter template and cannot be modified.
     * @param TemplateId Parameter template ID, which uniquely identifies a parameter template and cannot be modified.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Parameter template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this field is empty, the original parameter template name will be used. 
     * @return TemplateName Parameter template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this field is empty, the original parameter template name will be used.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Parameter template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this field is empty, the original parameter template name will be used.
     * @param TemplateName Parameter template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this field is empty, the original parameter template name will be used.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this parameter is not passed in, the original parameter template description will be used. 
     * @return TemplateDescription Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this parameter is not passed in, the original parameter template description will be used.
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this parameter is not passed in, the original parameter template description will be used.
     * @param TemplateDescription Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). If this parameter is not passed in, the original parameter template description will be used.
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get The set of parameters to be modified or added. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time. 
     * @return ModifyParamEntrySet The set of parameters to be modified or added. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
     */
    public ParamEntry [] getModifyParamEntrySet() {
        return this.ModifyParamEntrySet;
    }

    /**
     * Set The set of parameters to be modified or added. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
     * @param ModifyParamEntrySet The set of parameters to be modified or added. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
     */
    public void setModifyParamEntrySet(ParamEntry [] ModifyParamEntrySet) {
        this.ModifyParamEntrySet = ModifyParamEntrySet;
    }

    /**
     * Get The set of parameters to be deleted in the template. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time. 
     * @return DeleteParamSet The set of parameters to be deleted in the template. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
     */
    public String [] getDeleteParamSet() {
        return this.DeleteParamSet;
    }

    /**
     * Set The set of parameters to be deleted in the template. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
     * @param DeleteParamSet The set of parameters to be deleted in the template. A parameter cannot be put to `ModifyParamEntrySet` and `DeleteParamSet` at the same time, that is, it cannot be modified/added and deleted at the same time.
     */
    public void setDeleteParamSet(String [] DeleteParamSet) {
        this.DeleteParamSet = DeleteParamSet;
    }

    public ModifyParameterTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyParameterTemplateRequest(ModifyParameterTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.ModifyParamEntrySet != null) {
            this.ModifyParamEntrySet = new ParamEntry[source.ModifyParamEntrySet.length];
            for (int i = 0; i < source.ModifyParamEntrySet.length; i++) {
                this.ModifyParamEntrySet[i] = new ParamEntry(source.ModifyParamEntrySet[i]);
            }
        }
        if (source.DeleteParamSet != null) {
            this.DeleteParamSet = new String[source.DeleteParamSet.length];
            for (int i = 0; i < source.DeleteParamSet.length; i++) {
                this.DeleteParamSet[i] = new String(source.DeleteParamSet[i]);
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
        this.setParamArrayObj(map, prefix + "ModifyParamEntrySet.", this.ModifyParamEntrySet);
        this.setParamArraySimple(map, prefix + "DeleteParamSet.", this.DeleteParamSet);

    }
}

