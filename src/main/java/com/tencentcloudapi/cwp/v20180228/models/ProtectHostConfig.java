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

public class ProtectHostConfig extends AbstractModel {

    /**
    * Unique host ID.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Protection switch: 0 - off; 1 - on
    */
    @SerializedName("ProtectSwitch")
    @Expose
    private Long ProtectSwitch;

    /**
    * Auto recovery switch. 0: disabled. 1: enabled.
    */
    @SerializedName("AutoRecovery")
    @Expose
    private Long AutoRecovery;

    /**
     * Get Unique host ID. 
     * @return Quuid Unique host ID.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Unique host ID.
     * @param Quuid Unique host ID.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Protection switch: 0 - off; 1 - on 
     * @return ProtectSwitch Protection switch: 0 - off; 1 - on
     */
    public Long getProtectSwitch() {
        return this.ProtectSwitch;
    }

    /**
     * Set Protection switch: 0 - off; 1 - on
     * @param ProtectSwitch Protection switch: 0 - off; 1 - on
     */
    public void setProtectSwitch(Long ProtectSwitch) {
        this.ProtectSwitch = ProtectSwitch;
    }

    /**
     * Get Auto recovery switch. 0: disabled. 1: enabled. 
     * @return AutoRecovery Auto recovery switch. 0: disabled. 1: enabled.
     */
    public Long getAutoRecovery() {
        return this.AutoRecovery;
    }

    /**
     * Set Auto recovery switch. 0: disabled. 1: enabled.
     * @param AutoRecovery Auto recovery switch. 0: disabled. 1: enabled.
     */
    public void setAutoRecovery(Long AutoRecovery) {
        this.AutoRecovery = AutoRecovery;
    }

    public ProtectHostConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectHostConfig(ProtectHostConfig source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.ProtectSwitch != null) {
            this.ProtectSwitch = new Long(source.ProtectSwitch);
        }
        if (source.AutoRecovery != null) {
            this.AutoRecovery = new Long(source.AutoRecovery);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "ProtectSwitch", this.ProtectSwitch);
        this.setParamSimple(map, prefix + "AutoRecovery", this.AutoRecovery);

    }
}

