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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerAppItem extends AbstractModel {

    /**
    * Application comprehensive type, for example, web, app, or db
    */
    @SerializedName("MainType")
    @Expose
    private String MainType;

    /**
    * Specific application types, such as nginx or redis
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Application version number
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Running username.
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * Executable file path
    */
    @SerializedName("ExePath")
    @Expose
    private String ExePath;

    /**
    * Configuration file path
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

    /**
    * Number of associated processes
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
     * Get Application comprehensive type, for example, web, app, or db 
     * @return MainType Application comprehensive type, for example, web, app, or db
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * Set Application comprehensive type, for example, web, app, or db
     * @param MainType Application comprehensive type, for example, web, app, or db
     */
    public void setMainType(String MainType) {
        this.MainType = MainType;
    }

    /**
     * Get Specific application types, such as nginx or redis 
     * @return Type Specific application types, such as nginx or redis
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specific application types, such as nginx or redis
     * @param Type Specific application types, such as nginx or redis
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Application version number 
     * @return Version Application version number
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Application version number
     * @param Version Application version number
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Running username. 
     * @return RunAs Running username.
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Running username.
     * @param RunAs Running username.
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get Executable file path 
     * @return ExePath Executable file path
     */
    public String getExePath() {
        return this.ExePath;
    }

    /**
     * Set Executable file path
     * @param ExePath Executable file path
     */
    public void setExePath(String ExePath) {
        this.ExePath = ExePath;
    }

    /**
     * Get Configuration file path 
     * @return ConfigPath Configuration file path
     */
    public String getConfigPath() {
        return this.ConfigPath;
    }

    /**
     * Set Configuration file path
     * @param ConfigPath Configuration file path
     */
    public void setConfigPath(String ConfigPath) {
        this.ConfigPath = ConfigPath;
    }

    /**
     * Get Number of associated processes 
     * @return ProcessCnt Number of associated processes
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set Number of associated processes
     * @param ProcessCnt Number of associated processes
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    public ContainerAppItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerAppItem(ContainerAppItem source) {
        if (source.MainType != null) {
            this.MainType = new String(source.MainType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.ExePath != null) {
            this.ExePath = new String(source.ExePath);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainType", this.MainType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "ExePath", this.ExePath);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);

    }
}

