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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SellType extends AbstractModel{

    /**
    * Name of the purchasable instance
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Kernel version number
    */
    @SerializedName("EngineVersion")
    @Expose
    private String [] EngineVersion;

    /**
    * Configuration details of a purchasable specification
    */
    @SerializedName("Configs")
    @Expose
    private SellConfig [] Configs;

    /**
     * Get Name of the purchasable instance 
     * @return TypeName Name of the purchasable instance
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Name of the purchasable instance
     * @param TypeName Name of the purchasable instance
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Kernel version number 
     * @return EngineVersion Kernel version number
     */
    public String [] getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Kernel version number
     * @param EngineVersion Kernel version number
     */
    public void setEngineVersion(String [] EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Configuration details of a purchasable specification 
     * @return Configs Configuration details of a purchasable specification
     */
    public SellConfig [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set Configuration details of a purchasable specification
     * @param Configs Configuration details of a purchasable specification
     */
    public void setConfigs(SellConfig [] Configs) {
        this.Configs = Configs;
    }

    public SellType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SellType(SellType source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String[source.EngineVersion.length];
            for (int i = 0; i < source.EngineVersion.length; i++) {
                this.EngineVersion[i] = new String(source.EngineVersion[i]);
            }
        }
        if (source.Configs != null) {
            this.Configs = new SellConfig[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new SellConfig(source.Configs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArraySimple(map, prefix + "EngineVersion.", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

