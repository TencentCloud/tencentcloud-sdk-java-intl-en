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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SQLScriptConfig extends AbstractModel {

    /**
    * Data source Id.

    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Specifies the data source environment.

    */
    @SerializedName("DatasourceEnv")
    @Expose
    private String DatasourceEnv;

    /**
    * Computational resource.

    */
    @SerializedName("ComputeResource")
    @Expose
    private String ComputeResource;

    /**
    * Specifies the execution resource group.

    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Advanced running parameter variable replacement map-json String,String.

    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Advanced setting. executes configuration parameters. map-json String,String. use Base64 encode.

    */
    @SerializedName("AdvanceConfig")
    @Expose
    private String AdvanceConfig;

    /**
     * Get Data source Id.
 
     * @return DatasourceId Data source Id.

     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source Id.

     * @param DatasourceId Data source Id.

     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Specifies the data source environment.
 
     * @return DatasourceEnv Specifies the data source environment.

     */
    public String getDatasourceEnv() {
        return this.DatasourceEnv;
    }

    /**
     * Set Specifies the data source environment.

     * @param DatasourceEnv Specifies the data source environment.

     */
    public void setDatasourceEnv(String DatasourceEnv) {
        this.DatasourceEnv = DatasourceEnv;
    }

    /**
     * Get Computational resource.
 
     * @return ComputeResource Computational resource.

     */
    public String getComputeResource() {
        return this.ComputeResource;
    }

    /**
     * Set Computational resource.

     * @param ComputeResource Computational resource.

     */
    public void setComputeResource(String ComputeResource) {
        this.ComputeResource = ComputeResource;
    }

    /**
     * Get Specifies the execution resource group.
 
     * @return ExecutorGroupId Specifies the execution resource group.

     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Specifies the execution resource group.

     * @param ExecutorGroupId Specifies the execution resource group.

     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Advanced running parameter variable replacement map-json String,String.
 
     * @return Params Advanced running parameter variable replacement map-json String,String.

     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Advanced running parameter variable replacement map-json String,String.

     * @param Params Advanced running parameter variable replacement map-json String,String.

     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Advanced setting. executes configuration parameters. map-json String,String. use Base64 encode.
 
     * @return AdvanceConfig Advanced setting. executes configuration parameters. map-json String,String. use Base64 encode.

     */
    public String getAdvanceConfig() {
        return this.AdvanceConfig;
    }

    /**
     * Set Advanced setting. executes configuration parameters. map-json String,String. use Base64 encode.

     * @param AdvanceConfig Advanced setting. executes configuration parameters. map-json String,String. use Base64 encode.

     */
    public void setAdvanceConfig(String AdvanceConfig) {
        this.AdvanceConfig = AdvanceConfig;
    }

    public SQLScriptConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLScriptConfig(SQLScriptConfig source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceEnv != null) {
            this.DatasourceEnv = new String(source.DatasourceEnv);
        }
        if (source.ComputeResource != null) {
            this.ComputeResource = new String(source.ComputeResource);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.AdvanceConfig != null) {
            this.AdvanceConfig = new String(source.AdvanceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceEnv", this.DatasourceEnv);
        this.setParamSimple(map, prefix + "ComputeResource", this.ComputeResource);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "AdvanceConfig", this.AdvanceConfig);

    }
}

