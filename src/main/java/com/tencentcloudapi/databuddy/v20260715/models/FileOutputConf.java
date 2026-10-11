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

public class FileOutputConf extends AbstractModel {

    /**
    * Cell ID
    */
    @SerializedName("CellId")
    @Expose
    private String CellId;

    /**
    * Dashboard chart configuration, JSON string
    */
    @SerializedName("DashboardConf")
    @Expose
    private String DashboardConf;

    /**
    * Pre-signed download URL of the execution result file
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
     * Get Cell ID 
     * @return CellId Cell ID
     */
    public String getCellId() {
        return this.CellId;
    }

    /**
     * Set Cell ID
     * @param CellId Cell ID
     */
    public void setCellId(String CellId) {
        this.CellId = CellId;
    }

    /**
     * Get Dashboard chart configuration, JSON string 
     * @return DashboardConf Dashboard chart configuration, JSON string
     */
    public String getDashboardConf() {
        return this.DashboardConf;
    }

    /**
     * Set Dashboard chart configuration, JSON string
     * @param DashboardConf Dashboard chart configuration, JSON string
     */
    public void setDashboardConf(String DashboardConf) {
        this.DashboardConf = DashboardConf;
    }

    /**
     * Get Pre-signed download URL of the execution result file 
     * @return OutputPath Pre-signed download URL of the execution result file
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set Pre-signed download URL of the execution result file
     * @param OutputPath Pre-signed download URL of the execution result file
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    public FileOutputConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileOutputConf(FileOutputConf source) {
        if (source.CellId != null) {
            this.CellId = new String(source.CellId);
        }
        if (source.DashboardConf != null) {
            this.DashboardConf = new String(source.DashboardConf);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CellId", this.CellId);
        this.setParamSimple(map, prefix + "DashboardConf", this.DashboardConf);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);

    }
}

