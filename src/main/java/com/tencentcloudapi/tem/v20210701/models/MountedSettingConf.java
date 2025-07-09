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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountedSettingConf extends AbstractModel {

    /**
    * Configuration name
    */
    @SerializedName("ConfigDataName")
    @Expose
    private String ConfigDataName;

    /**
    * Mount point path
    */
    @SerializedName("MountedPath")
    @Expose
    private String MountedPath;

    /**
    * Configuration content
    */
    @SerializedName("Data")
    @Expose
    private Pair [] Data;

    /**
    * Encrypt configuration name
    */
    @SerializedName("SecretDataName")
    @Expose
    private String SecretDataName;

    /**
     * Get Configuration name 
     * @return ConfigDataName Configuration name
     */
    public String getConfigDataName() {
        return this.ConfigDataName;
    }

    /**
     * Set Configuration name
     * @param ConfigDataName Configuration name
     */
    public void setConfigDataName(String ConfigDataName) {
        this.ConfigDataName = ConfigDataName;
    }

    /**
     * Get Mount point path 
     * @return MountedPath Mount point path
     */
    public String getMountedPath() {
        return this.MountedPath;
    }

    /**
     * Set Mount point path
     * @param MountedPath Mount point path
     */
    public void setMountedPath(String MountedPath) {
        this.MountedPath = MountedPath;
    }

    /**
     * Get Configuration content 
     * @return Data Configuration content
     */
    public Pair [] getData() {
        return this.Data;
    }

    /**
     * Set Configuration content
     * @param Data Configuration content
     */
    public void setData(Pair [] Data) {
        this.Data = Data;
    }

    /**
     * Get Encrypt configuration name 
     * @return SecretDataName Encrypt configuration name
     */
    public String getSecretDataName() {
        return this.SecretDataName;
    }

    /**
     * Set Encrypt configuration name
     * @param SecretDataName Encrypt configuration name
     */
    public void setSecretDataName(String SecretDataName) {
        this.SecretDataName = SecretDataName;
    }

    public MountedSettingConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountedSettingConf(MountedSettingConf source) {
        if (source.ConfigDataName != null) {
            this.ConfigDataName = new String(source.ConfigDataName);
        }
        if (source.MountedPath != null) {
            this.MountedPath = new String(source.MountedPath);
        }
        if (source.Data != null) {
            this.Data = new Pair[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new Pair(source.Data[i]);
            }
        }
        if (source.SecretDataName != null) {
            this.SecretDataName = new String(source.SecretDataName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigDataName", this.ConfigDataName);
        this.setParamSimple(map, prefix + "MountedPath", this.MountedPath);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "SecretDataName", this.SecretDataName);

    }
}

