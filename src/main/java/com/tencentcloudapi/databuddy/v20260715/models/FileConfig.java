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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileConfig extends AbstractModel {

    /**
    * <p>Advanced running parameter, used for variable replacement, map-json String,String</p>
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * <p>Execution resource ID. Source: ResourceId returned by the ListComputeResources API</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Default catalog</p>
    */
    @SerializedName("DefaultCatalog")
    @Expose
    private String DefaultCatalog;

    /**
    * <p>Default schema</p>
    */
    @SerializedName("DefaultSchema")
    @Expose
    private String DefaultSchema;

    /**
    * <p>Advanced configuration, JSON string</p>
    */
    @SerializedName("AdvanceConfig")
    @Expose
    private String AdvanceConfig;

    /**
    * <p>Extended parameter, JSON string</p>
    */
    @SerializedName("ExtraParams")
    @Expose
    private String ExtraParams;

    /**
    * <p>Notebook interactive control definition, JSON string</p>
    */
    @SerializedName("Widgets")
    @Expose
    private String Widgets;

    /**
    * <p>Output configuration of each cell. Returned only in Get output parameters; input parameters are ignored.</p>
    */
    @SerializedName("OutputConf")
    @Expose
    private FileOutputConf [] OutputConf;

    /**
    * <p>SQL script grammar tag</p>
    */
    @SerializedName("SqlSyntax")
    @Expose
    private String SqlSyntax;

    /**
    * <p>Platform cluster id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>The source type of the default Catalog, used to identify which Catalog system the default Catalog belongs to. Selectable. Maximum length: 32. Values: METALAKE - TC Catalog (metadata lake Catalog); SETATS - Setats Catalog. If the value is empty or illegal, the backend falls back to METALAKE.</p>
    */
    @SerializedName("DefaultCatalogSource")
    @Expose
    private String DefaultCatalogSource;

    /**
     * Get <p>Advanced running parameter, used for variable replacement, map-json String,String</p> 
     * @return Params <p>Advanced running parameter, used for variable replacement, map-json String,String</p>
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>Advanced running parameter, used for variable replacement, map-json String,String</p>
     * @param Params <p>Advanced running parameter, used for variable replacement, map-json String,String</p>
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get <p>Execution resource ID. Source: ResourceId returned by the ListComputeResources API</p> 
     * @return ResourceId <p>Execution resource ID. Source: ResourceId returned by the ListComputeResources API</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Execution resource ID. Source: ResourceId returned by the ListComputeResources API</p>
     * @param ResourceId <p>Execution resource ID. Source: ResourceId returned by the ListComputeResources API</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Default catalog</p> 
     * @return DefaultCatalog <p>Default catalog</p>
     */
    public String getDefaultCatalog() {
        return this.DefaultCatalog;
    }

    /**
     * Set <p>Default catalog</p>
     * @param DefaultCatalog <p>Default catalog</p>
     */
    public void setDefaultCatalog(String DefaultCatalog) {
        this.DefaultCatalog = DefaultCatalog;
    }

    /**
     * Get <p>Default schema</p> 
     * @return DefaultSchema <p>Default schema</p>
     */
    public String getDefaultSchema() {
        return this.DefaultSchema;
    }

    /**
     * Set <p>Default schema</p>
     * @param DefaultSchema <p>Default schema</p>
     */
    public void setDefaultSchema(String DefaultSchema) {
        this.DefaultSchema = DefaultSchema;
    }

    /**
     * Get <p>Advanced configuration, JSON string</p> 
     * @return AdvanceConfig <p>Advanced configuration, JSON string</p>
     */
    public String getAdvanceConfig() {
        return this.AdvanceConfig;
    }

    /**
     * Set <p>Advanced configuration, JSON string</p>
     * @param AdvanceConfig <p>Advanced configuration, JSON string</p>
     */
    public void setAdvanceConfig(String AdvanceConfig) {
        this.AdvanceConfig = AdvanceConfig;
    }

    /**
     * Get <p>Extended parameter, JSON string</p> 
     * @return ExtraParams <p>Extended parameter, JSON string</p>
     */
    public String getExtraParams() {
        return this.ExtraParams;
    }

    /**
     * Set <p>Extended parameter, JSON string</p>
     * @param ExtraParams <p>Extended parameter, JSON string</p>
     */
    public void setExtraParams(String ExtraParams) {
        this.ExtraParams = ExtraParams;
    }

    /**
     * Get <p>Notebook interactive control definition, JSON string</p> 
     * @return Widgets <p>Notebook interactive control definition, JSON string</p>
     */
    public String getWidgets() {
        return this.Widgets;
    }

    /**
     * Set <p>Notebook interactive control definition, JSON string</p>
     * @param Widgets <p>Notebook interactive control definition, JSON string</p>
     */
    public void setWidgets(String Widgets) {
        this.Widgets = Widgets;
    }

    /**
     * Get <p>Output configuration of each cell. Returned only in Get output parameters; input parameters are ignored.</p> 
     * @return OutputConf <p>Output configuration of each cell. Returned only in Get output parameters; input parameters are ignored.</p>
     */
    public FileOutputConf [] getOutputConf() {
        return this.OutputConf;
    }

    /**
     * Set <p>Output configuration of each cell. Returned only in Get output parameters; input parameters are ignored.</p>
     * @param OutputConf <p>Output configuration of each cell. Returned only in Get output parameters; input parameters are ignored.</p>
     */
    public void setOutputConf(FileOutputConf [] OutputConf) {
        this.OutputConf = OutputConf;
    }

    /**
     * Get <p>SQL script grammar tag</p> 
     * @return SqlSyntax <p>SQL script grammar tag</p>
     */
    public String getSqlSyntax() {
        return this.SqlSyntax;
    }

    /**
     * Set <p>SQL script grammar tag</p>
     * @param SqlSyntax <p>SQL script grammar tag</p>
     */
    public void setSqlSyntax(String SqlSyntax) {
        this.SqlSyntax = SqlSyntax;
    }

    /**
     * Get <p>Platform cluster id</p> 
     * @return ClusterId <p>Platform cluster id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Platform cluster id</p>
     * @param ClusterId <p>Platform cluster id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>The source type of the default Catalog, used to identify which Catalog system the default Catalog belongs to. Selectable. Maximum length: 32. Values: METALAKE - TC Catalog (metadata lake Catalog); SETATS - Setats Catalog. If the value is empty or illegal, the backend falls back to METALAKE.</p> 
     * @return DefaultCatalogSource <p>The source type of the default Catalog, used to identify which Catalog system the default Catalog belongs to. Selectable. Maximum length: 32. Values: METALAKE - TC Catalog (metadata lake Catalog); SETATS - Setats Catalog. If the value is empty or illegal, the backend falls back to METALAKE.</p>
     */
    public String getDefaultCatalogSource() {
        return this.DefaultCatalogSource;
    }

    /**
     * Set <p>The source type of the default Catalog, used to identify which Catalog system the default Catalog belongs to. Selectable. Maximum length: 32. Values: METALAKE - TC Catalog (metadata lake Catalog); SETATS - Setats Catalog. If the value is empty or illegal, the backend falls back to METALAKE.</p>
     * @param DefaultCatalogSource <p>The source type of the default Catalog, used to identify which Catalog system the default Catalog belongs to. Selectable. Maximum length: 32. Values: METALAKE - TC Catalog (metadata lake Catalog); SETATS - Setats Catalog. If the value is empty or illegal, the backend falls back to METALAKE.</p>
     */
    public void setDefaultCatalogSource(String DefaultCatalogSource) {
        this.DefaultCatalogSource = DefaultCatalogSource;
    }

    public FileConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileConfig(FileConfig source) {
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DefaultCatalog != null) {
            this.DefaultCatalog = new String(source.DefaultCatalog);
        }
        if (source.DefaultSchema != null) {
            this.DefaultSchema = new String(source.DefaultSchema);
        }
        if (source.AdvanceConfig != null) {
            this.AdvanceConfig = new String(source.AdvanceConfig);
        }
        if (source.ExtraParams != null) {
            this.ExtraParams = new String(source.ExtraParams);
        }
        if (source.Widgets != null) {
            this.Widgets = new String(source.Widgets);
        }
        if (source.OutputConf != null) {
            this.OutputConf = new FileOutputConf[source.OutputConf.length];
            for (int i = 0; i < source.OutputConf.length; i++) {
                this.OutputConf[i] = new FileOutputConf(source.OutputConf[i]);
            }
        }
        if (source.SqlSyntax != null) {
            this.SqlSyntax = new String(source.SqlSyntax);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DefaultCatalogSource != null) {
            this.DefaultCatalogSource = new String(source.DefaultCatalogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "DefaultCatalog", this.DefaultCatalog);
        this.setParamSimple(map, prefix + "DefaultSchema", this.DefaultSchema);
        this.setParamSimple(map, prefix + "AdvanceConfig", this.AdvanceConfig);
        this.setParamSimple(map, prefix + "ExtraParams", this.ExtraParams);
        this.setParamSimple(map, prefix + "Widgets", this.Widgets);
        this.setParamArrayObj(map, prefix + "OutputConf.", this.OutputConf);
        this.setParamSimple(map, prefix + "SqlSyntax", this.SqlSyntax);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DefaultCatalogSource", this.DefaultCatalogSource);

    }
}

