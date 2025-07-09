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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAllVPCSwitchStatusRequest extends AbstractModel {

    /**
    * Status. 0: off; 1: on
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * ID of the selected firewall toggle
    */
    @SerializedName("FireWallVpcIds")
    @Expose
    private String [] FireWallVpcIds;

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
     * @return FireWallVpcIds ID of the selected firewall toggle
     */
    public String [] getFireWallVpcIds() {
        return this.FireWallVpcIds;
    }

    /**
     * Set ID of the selected firewall toggle
     * @param FireWallVpcIds ID of the selected firewall toggle
     */
    public void setFireWallVpcIds(String [] FireWallVpcIds) {
        this.FireWallVpcIds = FireWallVpcIds;
    }

    public ModifyAllVPCSwitchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllVPCSwitchStatusRequest(ModifyAllVPCSwitchStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FireWallVpcIds != null) {
            this.FireWallVpcIds = new String[source.FireWallVpcIds.length];
            for (int i = 0; i < source.FireWallVpcIds.length; i++) {
                this.FireWallVpcIds[i] = new String(source.FireWallVpcIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "FireWallVpcIds.", this.FireWallVpcIds);

    }
}

