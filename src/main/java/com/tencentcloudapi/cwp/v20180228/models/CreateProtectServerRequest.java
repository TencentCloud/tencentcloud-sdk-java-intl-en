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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProtectServerRequest extends AbstractModel {

    /**
    * Protection directory address
    */
    @SerializedName("ProtectDir")
    @Expose
    private String ProtectDir;

    /**
    * Information of protected machines
    */
    @SerializedName("ProtectHostConfig")
    @Expose
    private ProtectHostConfig [] ProtectHostConfig;

    /**
     * Get Protection directory address 
     * @return ProtectDir Protection directory address
     */
    public String getProtectDir() {
        return this.ProtectDir;
    }

    /**
     * Set Protection directory address
     * @param ProtectDir Protection directory address
     */
    public void setProtectDir(String ProtectDir) {
        this.ProtectDir = ProtectDir;
    }

    /**
     * Get Information of protected machines 
     * @return ProtectHostConfig Information of protected machines
     */
    public ProtectHostConfig [] getProtectHostConfig() {
        return this.ProtectHostConfig;
    }

    /**
     * Set Information of protected machines
     * @param ProtectHostConfig Information of protected machines
     */
    public void setProtectHostConfig(ProtectHostConfig [] ProtectHostConfig) {
        this.ProtectHostConfig = ProtectHostConfig;
    }

    public CreateProtectServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProtectServerRequest(CreateProtectServerRequest source) {
        if (source.ProtectDir != null) {
            this.ProtectDir = new String(source.ProtectDir);
        }
        if (source.ProtectHostConfig != null) {
            this.ProtectHostConfig = new ProtectHostConfig[source.ProtectHostConfig.length];
            for (int i = 0; i < source.ProtectHostConfig.length; i++) {
                this.ProtectHostConfig[i] = new ProtectHostConfig(source.ProtectHostConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectDir", this.ProtectDir);
        this.setParamArrayObj(map, prefix + "ProtectHostConfig.", this.ProtectHostConfig);

    }
}

