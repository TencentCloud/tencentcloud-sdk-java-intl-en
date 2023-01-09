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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRule extends AbstractModel{

    /**
    * Policy, Valid values: `ACCEPT`, `DROP`.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Source or destination IP or IP range, such as 172.16.0.0/12.
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * Port
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * Network protocol. UDP and TCP are supported.
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * The rule description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Policy, Valid values: `ACCEPT`, `DROP`. 
     * @return Action Policy, Valid values: `ACCEPT`, `DROP`.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Policy, Valid values: `ACCEPT`, `DROP`.
     * @param Action Policy, Valid values: `ACCEPT`, `DROP`.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Source or destination IP or IP range, such as 172.16.0.0/12. 
     * @return CidrIp Source or destination IP or IP range, such as 172.16.0.0/12.
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set Source or destination IP or IP range, such as 172.16.0.0/12.
     * @param CidrIp Source or destination IP or IP range, such as 172.16.0.0/12.
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get Port 
     * @return PortRange Port
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set Port
     * @param PortRange Port
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get Network protocol. UDP and TCP are supported. 
     * @return IpProtocol Network protocol. UDP and TCP are supported.
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Network protocol. UDP and TCP are supported.
     * @param IpProtocol Network protocol. UDP and TCP are supported.
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get The rule description 
     * @return Description The rule description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The rule description
     * @param Description The rule description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public PolicyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRule(PolicyRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CidrIp != null) {
            this.CidrIp = new String(source.CidrIp);
        }
        if (source.PortRange != null) {
            this.PortRange = new String(source.PortRange);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

