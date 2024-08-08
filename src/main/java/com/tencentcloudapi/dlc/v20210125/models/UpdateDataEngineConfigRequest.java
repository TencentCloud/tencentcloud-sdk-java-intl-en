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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDataEngineConfigRequest extends AbstractModel {

    /**
    * Engine ID
    */
    @SerializedName("DataEngineIds")
    @Expose
    private String [] DataEngineIds;

    /**
    * Commands of engine configuration. UpdateSparkSQLLakefsPath (updates the configuration of the native table) and UpdateSparkSQLResultPath (updates the configuration of the result path) are supported.
    */
    @SerializedName("DataEngineConfigCommand")
    @Expose
    private String DataEngineConfigCommand;

    /**
    * Whether to use lakeFS as result storage
    */
    @SerializedName("UseLakeFs")
    @Expose
    private Boolean UseLakeFs;

    /**
    * User-defined result path
    */
    @SerializedName("CustomResultPath")
    @Expose
    private String CustomResultPath;

    /**
     * Get Engine ID 
     * @return DataEngineIds Engine ID
     */
    public String [] getDataEngineIds() {
        return this.DataEngineIds;
    }

    /**
     * Set Engine ID
     * @param DataEngineIds Engine ID
     */
    public void setDataEngineIds(String [] DataEngineIds) {
        this.DataEngineIds = DataEngineIds;
    }

    /**
     * Get Commands of engine configuration. UpdateSparkSQLLakefsPath (updates the configuration of the native table) and UpdateSparkSQLResultPath (updates the configuration of the result path) are supported. 
     * @return DataEngineConfigCommand Commands of engine configuration. UpdateSparkSQLLakefsPath (updates the configuration of the native table) and UpdateSparkSQLResultPath (updates the configuration of the result path) are supported.
     */
    public String getDataEngineConfigCommand() {
        return this.DataEngineConfigCommand;
    }

    /**
     * Set Commands of engine configuration. UpdateSparkSQLLakefsPath (updates the configuration of the native table) and UpdateSparkSQLResultPath (updates the configuration of the result path) are supported.
     * @param DataEngineConfigCommand Commands of engine configuration. UpdateSparkSQLLakefsPath (updates the configuration of the native table) and UpdateSparkSQLResultPath (updates the configuration of the result path) are supported.
     */
    public void setDataEngineConfigCommand(String DataEngineConfigCommand) {
        this.DataEngineConfigCommand = DataEngineConfigCommand;
    }

    /**
     * Get Whether to use lakeFS as result storage 
     * @return UseLakeFs Whether to use lakeFS as result storage
     */
    public Boolean getUseLakeFs() {
        return this.UseLakeFs;
    }

    /**
     * Set Whether to use lakeFS as result storage
     * @param UseLakeFs Whether to use lakeFS as result storage
     */
    public void setUseLakeFs(Boolean UseLakeFs) {
        this.UseLakeFs = UseLakeFs;
    }

    /**
     * Get User-defined result path 
     * @return CustomResultPath User-defined result path
     */
    public String getCustomResultPath() {
        return this.CustomResultPath;
    }

    /**
     * Set User-defined result path
     * @param CustomResultPath User-defined result path
     */
    public void setCustomResultPath(String CustomResultPath) {
        this.CustomResultPath = CustomResultPath;
    }

    public UpdateDataEngineConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataEngineConfigRequest(UpdateDataEngineConfigRequest source) {
        if (source.DataEngineIds != null) {
            this.DataEngineIds = new String[source.DataEngineIds.length];
            for (int i = 0; i < source.DataEngineIds.length; i++) {
                this.DataEngineIds[i] = new String(source.DataEngineIds[i]);
            }
        }
        if (source.DataEngineConfigCommand != null) {
            this.DataEngineConfigCommand = new String(source.DataEngineConfigCommand);
        }
        if (source.UseLakeFs != null) {
            this.UseLakeFs = new Boolean(source.UseLakeFs);
        }
        if (source.CustomResultPath != null) {
            this.CustomResultPath = new String(source.CustomResultPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataEngineIds.", this.DataEngineIds);
        this.setParamSimple(map, prefix + "DataEngineConfigCommand", this.DataEngineConfigCommand);
        this.setParamSimple(map, prefix + "UseLakeFs", this.UseLakeFs);
        this.setParamSimple(map, prefix + "CustomResultPath", this.CustomResultPath);

    }
}

