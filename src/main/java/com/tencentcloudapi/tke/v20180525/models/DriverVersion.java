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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DriverVersion extends AbstractModel {

    /**
    * Version of GPU driver or CUDA
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Name of GPU driver or CUDA
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Version of GPU driver or CUDA 
     * @return Version Version of GPU driver or CUDA
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version of GPU driver or CUDA
     * @param Version Version of GPU driver or CUDA
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Name of GPU driver or CUDA 
     * @return Name Name of GPU driver or CUDA
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of GPU driver or CUDA
     * @param Name Name of GPU driver or CUDA
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DriverVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DriverVersion(DriverVersion source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

