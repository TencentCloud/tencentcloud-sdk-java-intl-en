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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoGroupVipVportRequest extends AbstractModel {

    /**
    * ID of the RO group.
    */
    @SerializedName("UGroupId")
    @Expose
    private String UGroupId;

    /**
    * Target IP address.
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * Target Port.
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
     * Get ID of the RO group. 
     * @return UGroupId ID of the RO group.
     */
    public String getUGroupId() {
        return this.UGroupId;
    }

    /**
     * Set ID of the RO group.
     * @param UGroupId ID of the RO group.
     */
    public void setUGroupId(String UGroupId) {
        this.UGroupId = UGroupId;
    }

    /**
     * Get Target IP address. 
     * @return DstIp Target IP address.
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set Target IP address.
     * @param DstIp Target IP address.
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get Target Port. 
     * @return DstPort Target Port.
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target Port.
     * @param DstPort Target Port.
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    public ModifyRoGroupVipVportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoGroupVipVportRequest(ModifyRoGroupVipVportRequest source) {
        if (source.UGroupId != null) {
            this.UGroupId = new String(source.UGroupId);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UGroupId", this.UGroupId);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);

    }
}

