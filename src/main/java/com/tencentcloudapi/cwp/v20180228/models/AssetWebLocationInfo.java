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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetWebLocationInfo extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Site port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Site protocol
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Service type
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Security module status. 0: not enabled; 1: enabled; 999: null (nginx only)
    */
    @SerializedName("SafeStatus")
    @Expose
    private Long SafeStatus;

    /**
    * Running user
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Home directory
    */
    @SerializedName("MainPath")
    @Expose
    private String MainPath;

    /**
    * Startup command
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Bind IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Domain name 
     * @return Name Domain name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Domain name
     * @param Name Domain name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Site port 
     * @return Port Site port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Site port
     * @param Port Site port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Site protocol 
     * @return Proto Site protocol
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Site protocol
     * @param Proto Site protocol
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get Service type 
     * @return ServiceType Service type
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service type
     * @param ServiceType Service type
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Security module status. 0: not enabled; 1: enabled; 999: null (nginx only) 
     * @return SafeStatus Security module status. 0: not enabled; 1: enabled; 999: null (nginx only)
     */
    public Long getSafeStatus() {
        return this.SafeStatus;
    }

    /**
     * Set Security module status. 0: not enabled; 1: enabled; 999: null (nginx only)
     * @param SafeStatus Security module status. 0: not enabled; 1: enabled; 999: null (nginx only)
     */
    public void setSafeStatus(Long SafeStatus) {
        this.SafeStatus = SafeStatus;
    }

    /**
     * Get Running user 
     * @return User Running user
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Running user
     * @param User Running user
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Home directory 
     * @return MainPath Home directory
     */
    public String getMainPath() {
        return this.MainPath;
    }

    /**
     * Set Home directory
     * @param MainPath Home directory
     */
    public void setMainPath(String MainPath) {
        this.MainPath = MainPath;
    }

    /**
     * Get Startup command 
     * @return Command Startup command
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Startup command
     * @param Command Startup command
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Bind IP 
     * @return Ip Bind IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Bind IP
     * @param Ip Bind IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Data update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetWebLocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebLocationInfo(AssetWebLocationInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.SafeStatus != null) {
            this.SafeStatus = new Long(source.SafeStatus);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.MainPath != null) {
            this.MainPath = new String(source.MainPath);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "SafeStatus", this.SafeStatus);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "MainPath", this.MainPath);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

