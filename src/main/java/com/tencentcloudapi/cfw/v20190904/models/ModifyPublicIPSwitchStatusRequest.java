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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPublicIPSwitchStatusRequest extends AbstractModel {

    /**
    * Public IP
    */
    @SerializedName("FireWallPublicIP")
    @Expose
    private String FireWallPublicIP;

    /**
    * Status value. 0: off; 1: on
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Public IP 
     * @return FireWallPublicIP Public IP
     */
    public String getFireWallPublicIP() {
        return this.FireWallPublicIP;
    }

    /**
     * Set Public IP
     * @param FireWallPublicIP Public IP
     */
    public void setFireWallPublicIP(String FireWallPublicIP) {
        this.FireWallPublicIP = FireWallPublicIP;
    }

    /**
     * Get Status value. 0: off; 1: on 
     * @return Status Status value. 0: off; 1: on
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value. 0: off; 1: on
     * @param Status Status value. 0: off; 1: on
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyPublicIPSwitchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPublicIPSwitchStatusRequest(ModifyPublicIPSwitchStatusRequest source) {
        if (source.FireWallPublicIP != null) {
            this.FireWallPublicIP = new String(source.FireWallPublicIP);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FireWallPublicIP", this.FireWallPublicIP);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

