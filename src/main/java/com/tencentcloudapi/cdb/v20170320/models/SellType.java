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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArraySimple(map, prefix + "EngineVersion.", this.EngineVersion);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

