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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBlackWhiteIpListRequest extends AbstractModel {

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of IPs
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Anti-DDoS instance ID 
     * @return InstanceId Anti-DDoS instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param InstanceId Anti-DDoS instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get List of IPs 
     * @return IpList List of IPs
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set List of IPs
     * @param IpList List of IPs
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP). 
     * @return Type IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     * @param Type IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateBlackWhiteIpListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlackWhiteIpListRequest(CreateBlackWhiteIpListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

