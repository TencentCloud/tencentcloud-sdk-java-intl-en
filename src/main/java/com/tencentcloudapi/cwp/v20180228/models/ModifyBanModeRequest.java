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

public class ModifyBanModeRequest extends AbstractModel {

    /**
    * Blocking mode. STANDARD_MODE: standard mode; DEEP_MODE: deep mode.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Blocking time. This parameter is valid in standard blocking mode.
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
     * Get Blocking mode. STANDARD_MODE: standard mode; DEEP_MODE: deep mode. 
     * @return Mode Blocking mode. STANDARD_MODE: standard mode; DEEP_MODE: deep mode.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Blocking mode. STANDARD_MODE: standard mode; DEEP_MODE: deep mode.
     * @param Mode Blocking mode. STANDARD_MODE: standard mode; DEEP_MODE: deep mode.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Blocking time. This parameter is valid in standard blocking mode. 
     * @return Ttl Blocking time. This parameter is valid in standard blocking mode.
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set Blocking time. This parameter is valid in standard blocking mode.
     * @param Ttl Blocking time. This parameter is valid in standard blocking mode.
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    public ModifyBanModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBanModeRequest(ModifyBanModeRequest source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);

    }
}

