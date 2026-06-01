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

public class ParamTemplateInfo extends AbstractModel {

    /**
    * parameter template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Parameter template name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter template description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Instance engine version. Values: 5.5, 5.6, 5.7, and 8.0.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Parameter template type. Valid values: HIGH_STABILITY, HIGH_PERFORMANCE.
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * Parameter template engine, values: InnoDB, RocksDB.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
     * Get parameter template ID 
     * @return TemplateId parameter template ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set parameter template ID
     * @param TemplateId parameter template ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Parameter template name 
     * @return Name Parameter template name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter template name
     * @param Name Parameter template name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter template description 
     * @return Description Parameter template description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Parameter template description
     * @param Description Parameter template description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Instance engine version. Values: 5.5, 5.6, 5.7, and 8.0. 
     * @return EngineVersion Instance engine version. Values: 5.5, 5.6, 5.7, and 8.0.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Instance engine version. Values: 5.5, 5.6, 5.7, and 8.0.
     * @param EngineVersion Instance engine version. Values: 5.5, 5.6, 5.7, and 8.0.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Parameter template type. Valid values: HIGH_STABILITY, HIGH_PERFORMANCE. 
     * @return TemplateType Parameter template type. Valid values: HIGH_STABILITY, HIGH_PERFORMANCE.
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set Parameter template type. Valid values: HIGH_STABILITY, HIGH_PERFORMANCE.
     * @param TemplateType Parameter template type. Valid values: HIGH_STABILITY, HIGH_PERFORMANCE.
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get Parameter template engine, values: InnoDB, RocksDB. 
     * @return EngineType Parameter template engine, values: InnoDB, RocksDB.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Parameter template engine, values: InnoDB, RocksDB.
     * @param EngineType Parameter template engine, values: InnoDB, RocksDB.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    public ParamTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamTemplateInfo(ParamTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

