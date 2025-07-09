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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamTemplateListInfo extends AbstractModel {

    /**
    * Parameter template ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Parameter template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Parameter template description
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * Engine version
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Database Type. Valid values: `NORMAL`, `SERVERLESS`.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Parameter template details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamInfoSet")
    @Expose
    private TemplateParamInfo [] ParamInfoSet;

    /**
     * Get Parameter template ID 
     * @return Id Parameter template ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Parameter template ID
     * @param Id Parameter template ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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

    /**
     * Get Engine version 
     * @return EngineVersion Engine version
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Engine version
     * @param EngineVersion Engine version
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Database Type. Valid values: `NORMAL`, `SERVERLESS`. 
     * @return DbMode Database Type. Valid values: `NORMAL`, `SERVERLESS`.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database Type. Valid values: `NORMAL`, `SERVERLESS`.
     * @param DbMode Database Type. Valid values: `NORMAL`, `SERVERLESS`.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get Parameter template details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamInfoSet Parameter template details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TemplateParamInfo [] getParamInfoSet() {
        return this.ParamInfoSet;
    }

    /**
     * Set Parameter template details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamInfoSet Parameter template details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamInfoSet(TemplateParamInfo [] ParamInfoSet) {
        this.ParamInfoSet = ParamInfoSet;
    }

    public ParamTemplateListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamTemplateListInfo(ParamTemplateListInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.ParamInfoSet != null) {
            this.ParamInfoSet = new TemplateParamInfo[source.ParamInfoSet.length];
            for (int i = 0; i < source.ParamInfoSet.length; i++) {
                this.ParamInfoSet[i] = new TemplateParamInfo(source.ParamInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArrayObj(map, prefix + "ParamInfoSet.", this.ParamInfoSet);

    }
}

