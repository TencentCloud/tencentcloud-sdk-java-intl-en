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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplatesRequest extends AbstractModel {

    /**
    * Engine version. If it is left empty, all parameter templates will be queried.
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * Engine type. If it is left empty, all engine types will be queried.
    */
    @SerializedName("EngineTypes")
    @Expose
    private String [] EngineTypes;

    /**
    * Template name. If it is left empty, all template names will be queried.
    */
    @SerializedName("TemplateNames")
    @Expose
    private String [] TemplateNames;

    /**
    * Template ID. If it is left empty, all template IDs will be queried.
    */
    @SerializedName("TemplateIds")
    @Expose
    private Long [] TemplateIds;

    /**
     * Get Engine version. If it is left empty, all parameter templates will be queried. 
     * @return EngineVersions Engine version. If it is left empty, all parameter templates will be queried.
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set Engine version. If it is left empty, all parameter templates will be queried.
     * @param EngineVersions Engine version. If it is left empty, all parameter templates will be queried.
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get Engine type. If it is left empty, all engine types will be queried. 
     * @return EngineTypes Engine type. If it is left empty, all engine types will be queried.
     */
    public String [] getEngineTypes() {
        return this.EngineTypes;
    }

    /**
     * Set Engine type. If it is left empty, all engine types will be queried.
     * @param EngineTypes Engine type. If it is left empty, all engine types will be queried.
     */
    public void setEngineTypes(String [] EngineTypes) {
        this.EngineTypes = EngineTypes;
    }

    /**
     * Get Template name. If it is left empty, all template names will be queried. 
     * @return TemplateNames Template name. If it is left empty, all template names will be queried.
     */
    public String [] getTemplateNames() {
        return this.TemplateNames;
    }

    /**
     * Set Template name. If it is left empty, all template names will be queried.
     * @param TemplateNames Template name. If it is left empty, all template names will be queried.
     */
    public void setTemplateNames(String [] TemplateNames) {
        this.TemplateNames = TemplateNames;
    }

    /**
     * Get Template ID. If it is left empty, all template IDs will be queried. 
     * @return TemplateIds Template ID. If it is left empty, all template IDs will be queried.
     */
    public Long [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set Template ID. If it is left empty, all template IDs will be queried.
     * @param TemplateIds Template ID. If it is left empty, all template IDs will be queried.
     */
    public void setTemplateIds(Long [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    public DescribeParamTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplatesRequest(DescribeParamTemplatesRequest source) {
        if (source.EngineVersions != null) {
            this.EngineVersions = new String[source.EngineVersions.length];
            for (int i = 0; i < source.EngineVersions.length; i++) {
                this.EngineVersions[i] = new String(source.EngineVersions[i]);
            }
        }
        if (source.EngineTypes != null) {
            this.EngineTypes = new String[source.EngineTypes.length];
            for (int i = 0; i < source.EngineTypes.length; i++) {
                this.EngineTypes[i] = new String(source.EngineTypes[i]);
            }
        }
        if (source.TemplateNames != null) {
            this.TemplateNames = new String[source.TemplateNames.length];
            for (int i = 0; i < source.TemplateNames.length; i++) {
                this.TemplateNames[i] = new String(source.TemplateNames[i]);
            }
        }
        if (source.TemplateIds != null) {
            this.TemplateIds = new Long[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new Long(source.TemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EngineVersions.", this.EngineVersions);
        this.setParamArraySimple(map, prefix + "EngineTypes.", this.EngineTypes);
        this.setParamArraySimple(map, prefix + "TemplateNames.", this.TemplateNames);
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);

    }
}

