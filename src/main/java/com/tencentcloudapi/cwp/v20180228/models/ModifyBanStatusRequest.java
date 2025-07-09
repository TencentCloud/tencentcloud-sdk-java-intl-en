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

public class ModifyBanStatusRequest extends AbstractModel {

    /**
    * Blocking switch status: 0 -- off; 1 -- advanced blocking; 2 -- basic blocking (Only blocklisted IPs in the intelligence database will be blocked.)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether to enable intelligent over-allowing mode
    */
    @SerializedName("OpenSmartMode")
    @Expose
    private Boolean OpenSmartMode;

    /**
     * Get Blocking switch status: 0 -- off; 1 -- advanced blocking; 2 -- basic blocking (Only blocklisted IPs in the intelligence database will be blocked.) 
     * @return Status Blocking switch status: 0 -- off; 1 -- advanced blocking; 2 -- basic blocking (Only blocklisted IPs in the intelligence database will be blocked.)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Blocking switch status: 0 -- off; 1 -- advanced blocking; 2 -- basic blocking (Only blocklisted IPs in the intelligence database will be blocked.)
     * @param Status Blocking switch status: 0 -- off; 1 -- advanced blocking; 2 -- basic blocking (Only blocklisted IPs in the intelligence database will be blocked.)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to enable intelligent over-allowing mode 
     * @return OpenSmartMode Whether to enable intelligent over-allowing mode
     */
    public Boolean getOpenSmartMode() {
        return this.OpenSmartMode;
    }

    /**
     * Set Whether to enable intelligent over-allowing mode
     * @param OpenSmartMode Whether to enable intelligent over-allowing mode
     */
    public void setOpenSmartMode(Boolean OpenSmartMode) {
        this.OpenSmartMode = OpenSmartMode;
    }

    public ModifyBanStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBanStatusRequest(ModifyBanStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OpenSmartMode != null) {
            this.OpenSmartMode = new Boolean(source.OpenSmartMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OpenSmartMode", this.OpenSmartMode);

    }
}

