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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DriverVersion extends AbstractModel {

    /**
    * Version of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Name of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Version of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Version Version of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Version Version of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Name of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Name Name of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Name Name of GPU driver or CUDA

Note: This field may return "null", indicating that no valid value can be obtained.
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

