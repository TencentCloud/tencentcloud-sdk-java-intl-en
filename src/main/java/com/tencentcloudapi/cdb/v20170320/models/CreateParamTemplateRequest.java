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

public class CreateParamTemplateRequest extends AbstractModel {

    /**
    * Parameter template name. Up to 60 characters are allowed.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * MySQL version number. Available values: 5.6, 5.7, and 8.0.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Source parameter template ID, which can be obtained through the [DescribeParamTemplates](https://www.tencentcloud.com/document/api/236/32659?from_cn_redirect=1) API.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * List of parameters.
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
    * Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".
Description: RocksDB is only supported in database versions MySQL 5.7 and MySQL 8.0.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get Parameter template name. Up to 60 characters are allowed. 
     * @return Name Parameter template name. Up to 60 characters are allowed.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter template name. Up to 60 characters are allowed.
     * @param Name Parameter template name. Up to 60 characters are allowed.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter template description. 
     * @return Description Parameter template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Parameter template description.
     * @param Description Parameter template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get MySQL version number. Available values: 5.6, 5.7, and 8.0. 
     * @return EngineVersion MySQL version number. Available values: 5.6, 5.7, and 8.0.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set MySQL version number. Available values: 5.6, 5.7, and 8.0.
     * @param EngineVersion MySQL version number. Available values: 5.6, 5.7, and 8.0.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Source parameter template ID, which can be obtained through the [DescribeParamTemplates](https://www.tencentcloud.com/document/api/236/32659?from_cn_redirect=1) API. 
     * @return TemplateId Source parameter template ID, which can be obtained through the [DescribeParamTemplates](https://www.tencentcloud.com/document/api/236/32659?from_cn_redirect=1) API.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Source parameter template ID, which can be obtained through the [DescribeParamTemplates](https://www.tencentcloud.com/document/api/236/32659?from_cn_redirect=1) API.
     * @param TemplateId Source parameter template ID, which can be obtained through the [DescribeParamTemplates](https://www.tencentcloud.com/document/api/236/32659?from_cn_redirect=1) API.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
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

    /**
     * Get Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template). 
     * @return TemplateType Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     * @param TemplateType Type of the default parameter template. Valid values: `HIGH_STABILITY` (high-stability template), `HIGH_PERFORMANCE` (high-performance template).
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".
Description: RocksDB is only supported in database versions MySQL 5.7 and MySQL 8.0. 
     * @return EngineType Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".
Description: RocksDB is only supported in database versions MySQL 5.7 and MySQL 8.0.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".
Description: RocksDB is only supported in database versions MySQL 5.7 and MySQL 8.0.
     * @param EngineType Instance engine type, defaults to "InnoDB". Supported values include "InnoDB" and "RocksDB".
Description: RocksDB is only supported in database versions MySQL 5.7 and MySQL 8.0.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public CreateParamTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateParamTemplateRequest(CreateParamTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.ParamList != null) {
            this.ParamList = new Parameter[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new Parameter(source.ParamList[i]);
            }
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

