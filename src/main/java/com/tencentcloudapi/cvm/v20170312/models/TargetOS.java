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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetOS extends AbstractModel {

    /**
    * Target operating system type.
    */
    @SerializedName("TargetOSType")
    @Expose
    private String TargetOSType;

    /**
    * Target operating system version.
    */
    @SerializedName("TargetOSVersion")
    @Expose
    private String TargetOSVersion;

    /**
     * Get Target operating system type. 
     * @return TargetOSType Target operating system type.
     */
    public String getTargetOSType() {
        return this.TargetOSType;
    }

    /**
     * Set Target operating system type.
     * @param TargetOSType Target operating system type.
     */
    public void setTargetOSType(String TargetOSType) {
        this.TargetOSType = TargetOSType;
    }

    /**
     * Get Target operating system version. 
     * @return TargetOSVersion Target operating system version.
     */
    public String getTargetOSVersion() {
        return this.TargetOSVersion;
    }

    /**
     * Set Target operating system version.
     * @param TargetOSVersion Target operating system version.
     */
    public void setTargetOSVersion(String TargetOSVersion) {
        this.TargetOSVersion = TargetOSVersion;
    }

    public TargetOS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetOS(TargetOS source) {
        if (source.TargetOSType != null) {
            this.TargetOSType = new String(source.TargetOSType);
        }
        if (source.TargetOSVersion != null) {
            this.TargetOSVersion = new String(source.TargetOSVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetOSType", this.TargetOSType);
        this.setParamSimple(map, prefix + "TargetOSVersion", this.TargetOSVersion);

    }
}

