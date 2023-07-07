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

public class CreateParamTemplateRequest extends AbstractModel{

    /**
    * Template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * MySQL version number
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * The description of a template
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * (Optional) ID of the template to be copied
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Database type. Valid values:  `NORMAL` (default), `SERVERLESS`.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * List of the parameters
    */
    @SerializedName("ParamList")
    @Expose
    private ParamItem [] ParamList;

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
     * Get MySQL version number 
     * @return EngineVersion MySQL version number
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MySQL version number
     * @param EngineVersion MySQL version number
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get The description of a template 
     * @return TemplateDescription The description of a template
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set The description of a template
     * @param TemplateDescription The description of a template
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get (Optional) ID of the template to be copied 
     * @return TemplateId (Optional) ID of the template to be copied
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set (Optional) ID of the template to be copied
     * @param TemplateId (Optional) ID of the template to be copied
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Database type. Valid values:  `NORMAL` (default), `SERVERLESS`. 
     * @return DbMode Database type. Valid values:  `NORMAL` (default), `SERVERLESS`.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database type. Valid values:  `NORMAL` (default), `SERVERLESS`.
     * @param DbMode Database type. Valid values:  `NORMAL` (default), `SERVERLESS`.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get List of the parameters 
     * @return ParamList List of the parameters
     */
    public ParamItem [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set List of the parameters
     * @param ParamList List of the parameters
     */
    public void setParamList(ParamItem [] ParamList) {
        this.ParamList = ParamList;
    }

    public CreateParamTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateParamTemplateRequest(CreateParamTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamItem[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamItem(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

