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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAccess extends AbstractModel{

    /**
    * Credentials required for instance access
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * Service deployment ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Public IP of instance
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * OS
    */
    @SerializedName("OperatingSystem")
    @Expose
    private String OperatingSystem;

    /**
     * Get Credentials required for instance access 
     * @return Credentials Credentials required for instance access
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set Credentials required for instance access
     * @param Credentials Credentials required for instance access
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get Service deployment ID 
     * @return FleetId Service deployment ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Service deployment ID
     * @param FleetId Service deployment ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Public IP of instance 
     * @return IpAddress Public IP of instance
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set Public IP of instance
     * @param IpAddress Public IP of instance
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get OS 
     * @return OperatingSystem OS
     */
    public String getOperatingSystem() {
        return this.OperatingSystem;
    }

    /**
     * Set OS
     * @param OperatingSystem OS
     */
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    public InstanceAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAccess(InstanceAccess source) {
        if (source.Credentials != null) {
            this.Credentials = new Credentials(source.Credentials);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.OperatingSystem != null) {
            this.OperatingSystem = new String(source.OperatingSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "OperatingSystem", this.OperatingSystem);

    }
}

