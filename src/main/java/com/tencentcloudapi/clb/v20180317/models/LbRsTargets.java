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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LbRsTargets extends AbstractModel {

    /**
    * Private network IP type, which can be `cvm` or `eni`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Private network IP of the real server.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Port bound to the real server.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * VPC ID of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Weight of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Private network IP type, which can be `cvm` or `eni`. 
     * @return Type Private network IP type, which can be `cvm` or `eni`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Private network IP type, which can be `cvm` or `eni`.
     * @param Type Private network IP type, which can be `cvm` or `eni`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Private network IP of the real server. 
     * @return PrivateIp Private network IP of the real server.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private network IP of the real server.
     * @param PrivateIp Private network IP of the real server.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Port bound to the real server. 
     * @return Port Port bound to the real server.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port bound to the real server.
     * @param Port Port bound to the real server.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get VPC ID of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VpcId VPC ID of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Weight of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Weight Weight of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Weight Weight of the real server.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public LbRsTargets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LbRsTargets(LbRsTargets source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

