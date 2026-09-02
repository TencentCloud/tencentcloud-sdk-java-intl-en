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

public class ContainerWebServiceItem extends AbstractModel {

    /**
    * Web service type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Service version No.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Service startup user
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
     * Get Web service type 
     * @return Type Web service type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Web service type
     * @param Type Web service type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Service version No. 
     * @return Version Service version No.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Service version No.
     * @param Version Service version No.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Service startup user 
     * @return RunAs Service startup user
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Service startup user
     * @param RunAs Service startup user
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

    public ContainerWebServiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerWebServiceItem(ContainerWebServiceItem source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "ExePath", this.ExePath);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);

    }
}

