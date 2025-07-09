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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpdatableDataEnginesRequest extends AbstractModel {

    /**
    * Operation commands of engine configuration. UpdateSparkSQLLakefsPath updates the path of managed tables, and UpdateSparkSQLResultPath updates the path of result buckets.
    */
    @SerializedName("DataEngineConfigCommand")
    @Expose
    private String DataEngineConfigCommand;

    /**
    * 
    */
    @SerializedName("UseLakeFs")
    @Expose
    private Boolean UseLakeFs;

    /**
    * 
    */
    @SerializedName("CustomResultPath")
    @Expose
    private String CustomResultPath;

    /**
     * Get Operation commands of engine configuration. UpdateSparkSQLLakefsPath updates the path of managed tables, and UpdateSparkSQLResultPath updates the path of result buckets. 
     * @return DataEngineConfigCommand Operation commands of engine configuration. UpdateSparkSQLLakefsPath updates the path of managed tables, and UpdateSparkSQLResultPath updates the path of result buckets.
     */
    public String getDataEngineConfigCommand() {
        return this.DataEngineConfigCommand;
    }

    /**
     * Set Operation commands of engine configuration. UpdateSparkSQLLakefsPath updates the path of managed tables, and UpdateSparkSQLResultPath updates the path of result buckets.
     * @param DataEngineConfigCommand Operation commands of engine configuration. UpdateSparkSQLLakefsPath updates the path of managed tables, and UpdateSparkSQLResultPath updates the path of result buckets.
     */
    public void setDataEngineConfigCommand(String DataEngineConfigCommand) {
        this.DataEngineConfigCommand = DataEngineConfigCommand;
    }

    /**
     * Get  
     * @return UseLakeFs 
     */
    public Boolean getUseLakeFs() {
        return this.UseLakeFs;
    }

    /**
     * Set 
     * @param UseLakeFs 
     */
    public void setUseLakeFs(Boolean UseLakeFs) {
        this.UseLakeFs = UseLakeFs;
    }

    /**
     * Get  
     * @return CustomResultPath 
     */
    public String getCustomResultPath() {
        return this.CustomResultPath;
    }

    /**
     * Set 
     * @param CustomResultPath 
     */
    public void setCustomResultPath(String CustomResultPath) {
        this.CustomResultPath = CustomResultPath;
    }

    public DescribeUpdatableDataEnginesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpdatableDataEnginesRequest(DescribeUpdatableDataEnginesRequest source) {
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
        this.setParamSimple(map, prefix + "DataEngineConfigCommand", this.DataEngineConfigCommand);
        this.setParamSimple(map, prefix + "UseLakeFs", this.UseLakeFs);
        this.setParamSimple(map, prefix + "CustomResultPath", this.CustomResultPath);

    }
}

