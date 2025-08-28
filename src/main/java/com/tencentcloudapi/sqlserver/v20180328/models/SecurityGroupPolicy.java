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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicy extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * 
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
     * Get  
     * @return Action 
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 
     * @param Action 
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get  
     * @return CidrIp 
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set 
     * @param CidrIp 
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get  
     * @return PortRange 
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 
     * @param PortRange 
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get  
     * @return IpProtocol 
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 
     * @param IpProtocol 
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get  
     * @return Dir 
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set 
     * @param Dir 
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public SecurityGroupPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicy(SecurityGroupPolicy source) {
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
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
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
        this.setParamSimple(map, prefix + "Dir", this.Dir);

    }
}

