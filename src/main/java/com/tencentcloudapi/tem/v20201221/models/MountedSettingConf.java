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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountedSettingConf extends AbstractModel {

    /**
    * Configuration Name
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
    * Configuration Content
    */
    @SerializedName("Data")
    @Expose
    private Pair [] Data;

    /**
     * Get Configuration Name 
     * @return ConfigDataName Configuration Name
     */
    public String getConfigDataName() {
        return this.ConfigDataName;
    }

    /**
     * Set Configuration Name
     * @param ConfigDataName Configuration Name
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
     * Get Configuration Content 
     * @return Data Configuration Content
     */
    public Pair [] getData() {
        return this.Data;
    }

    /**
     * Set Configuration Content
     * @param Data Configuration Content
     */
    public void setData(Pair [] Data) {
        this.Data = Data;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigDataName", this.ConfigDataName);
        this.setParamSimple(map, prefix + "MountedPath", this.MountedPath);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

