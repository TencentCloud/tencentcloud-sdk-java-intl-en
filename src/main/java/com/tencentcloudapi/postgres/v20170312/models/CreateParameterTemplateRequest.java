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

public class CreateParameterTemplateRequest extends AbstractModel {

    /**
    * Template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * The major database version number, such as 11, 12, 13.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * Database engine, such as postgresql, mssql_compatible.
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
     * Get Template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). 
     * @return TemplateName Template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
     * @param TemplateName Template name, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get The major database version number, such as 11, 12, 13. 
     * @return DBMajorVersion The major database version number, such as 11, 12, 13.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set The major database version number, such as 11, 12, 13.
     * @param DBMajorVersion The major database version number, such as 11, 12, 13.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get Database engine, such as postgresql, mssql_compatible. 
     * @return DBEngine Database engine, such as postgresql, mssql_compatible.
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engine, such as postgresql, mssql_compatible.
     * @param DBEngine Database engine, such as postgresql, mssql_compatible.
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@). 
     * @return TemplateDescription Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
     * @param TemplateDescription Parameter template description, which can contain 1-60 letters, digits, and symbols (-_./()[]()+=:@).
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    public CreateParameterTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateParameterTemplateRequest(CreateParameterTemplateRequest source) {
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
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);

    }
}

