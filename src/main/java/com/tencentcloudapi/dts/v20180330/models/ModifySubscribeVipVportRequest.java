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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeVipVportRequest extends AbstractModel {

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Specified destination subnet. If this parameter is passed in, `DstIp` must be in the destination subnet
    */
    @SerializedName("DstUniqSubnetId")
    @Expose
    private String DstUniqSubnetId;

    /**
    * Target IP. Either this field or `DstPort` must be passed in
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * Target port. Value range: [1025-65535]
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
     * Get Data subscription instance ID 
     * @return SubscribeId Data subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Data subscription instance ID
     * @param SubscribeId Data subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Specified destination subnet. If this parameter is passed in, `DstIp` must be in the destination subnet 
     * @return DstUniqSubnetId Specified destination subnet. If this parameter is passed in, `DstIp` must be in the destination subnet
     */
    public String getDstUniqSubnetId() {
        return this.DstUniqSubnetId;
    }

    /**
     * Set Specified destination subnet. If this parameter is passed in, `DstIp` must be in the destination subnet
     * @param DstUniqSubnetId Specified destination subnet. If this parameter is passed in, `DstIp` must be in the destination subnet
     */
    public void setDstUniqSubnetId(String DstUniqSubnetId) {
        this.DstUniqSubnetId = DstUniqSubnetId;
    }

    /**
     * Get Target IP. Either this field or `DstPort` must be passed in 
     * @return DstIp Target IP. Either this field or `DstPort` must be passed in
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set Target IP. Either this field or `DstPort` must be passed in
     * @param DstIp Target IP. Either this field or `DstPort` must be passed in
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get Target port. Value range: [1025-65535] 
     * @return DstPort Target port. Value range: [1025-65535]
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port. Value range: [1025-65535]
     * @param DstPort Target port. Value range: [1025-65535]
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    public ModifySubscribeVipVportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubscribeVipVportRequest(ModifySubscribeVipVportRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.DstUniqSubnetId != null) {
            this.DstUniqSubnetId = new String(source.DstUniqSubnetId);
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
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "DstUniqSubnetId", this.DstUniqSubnetId);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);

    }
}

