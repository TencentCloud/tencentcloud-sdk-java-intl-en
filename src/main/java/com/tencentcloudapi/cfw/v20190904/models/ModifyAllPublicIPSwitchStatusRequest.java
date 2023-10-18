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

public class ModifyAllPublicIPSwitchStatusRequest extends AbstractModel {

    /**
    * Status. 0: off; 1: on
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * ID of the selected firewall toggle
    */
    @SerializedName("FireWallPublicIPs")
    @Expose
    private String [] FireWallPublicIPs;

    /**
     * Get Status. 0: off; 1: on 
     * @return Status Status. 0: off; 1: on
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: off; 1: on
     * @param Status Status. 0: off; 1: on
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get ID of the selected firewall toggle 
     * @return FireWallPublicIPs ID of the selected firewall toggle
     */
    public String [] getFireWallPublicIPs() {
        return this.FireWallPublicIPs;
    }

    /**
     * Set ID of the selected firewall toggle
     * @param FireWallPublicIPs ID of the selected firewall toggle
     */
    public void setFireWallPublicIPs(String [] FireWallPublicIPs) {
        this.FireWallPublicIPs = FireWallPublicIPs;
    }

    public ModifyAllPublicIPSwitchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllPublicIPSwitchStatusRequest(ModifyAllPublicIPSwitchStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FireWallPublicIPs != null) {
            this.FireWallPublicIPs = new String[source.FireWallPublicIPs.length];
            for (int i = 0; i < source.FireWallPublicIPs.length; i++) {
                this.FireWallPublicIPs[i] = new String(source.FireWallPublicIPs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "FireWallPublicIPs.", this.FireWallPublicIPs);

    }
}

