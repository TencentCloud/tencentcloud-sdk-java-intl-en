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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterTemplate extends AbstractModel {

    /**
    * Parameter template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Parameter template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Database version applicable to a parameter template
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * Database engine applicable to a parameter template
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * Parameter template description
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
     * Get Parameter template ID 
     * @return TemplateId Parameter template ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Parameter template ID
     * @param TemplateId Parameter template ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Parameter template name 
     * @return TemplateName Parameter template name
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Parameter template name
     * @param TemplateName Parameter template name
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Database version applicable to a parameter template 
     * @return DBMajorVersion Database version applicable to a parameter template
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set Database version applicable to a parameter template
     * @param DBMajorVersion Database version applicable to a parameter template
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get Database engine applicable to a parameter template 
     * @return DBEngine Database engine applicable to a parameter template
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engine applicable to a parameter template
     * @param DBEngine Database engine applicable to a parameter template
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get Parameter template description 
     * @return TemplateDescription Parameter template description
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Parameter template description
     * @param TemplateDescription Parameter template description
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    public ParameterTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParameterTemplate(ParameterTemplate source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);

    }
}

