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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSHConfig extends AbstractModel {

    /**
    * Whether to enable SSH.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Public key information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Port number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Login command.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoginCommand")
    @Expose
    private String LoginCommand;

    /**
    * Whether to change the login address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAddressChanged")
    @Expose
    private Boolean IsAddressChanged;

    /**
    * Pod access information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodSSHInfo")
    @Expose
    private PodSSHInfo PodSSHInfo;

    /**
     * Get Whether to enable SSH.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Whether to enable SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Whether to enable SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Public key information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicKey Public key information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicKey Public key information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Port number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Port number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Port number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Login command.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoginCommand Login command.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoginCommand() {
        return this.LoginCommand;
    }

    /**
     * Set Login command.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoginCommand Login command.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoginCommand(String LoginCommand) {
        this.LoginCommand = LoginCommand;
    }

    /**
     * Get Whether to change the login address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAddressChanged Whether to change the login address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsAddressChanged() {
        return this.IsAddressChanged;
    }

    /**
     * Set Whether to change the login address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAddressChanged Whether to change the login address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAddressChanged(Boolean IsAddressChanged) {
        this.IsAddressChanged = IsAddressChanged;
    }

    /**
     * Get Pod access information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodSSHInfo Pod access information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PodSSHInfo getPodSSHInfo() {
        return this.PodSSHInfo;
    }

    /**
     * Set Pod access information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodSSHInfo Pod access information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodSSHInfo(PodSSHInfo PodSSHInfo) {
        this.PodSSHInfo = PodSSHInfo;
    }

    public SSHConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSHConfig(SSHConfig source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.LoginCommand != null) {
            this.LoginCommand = new String(source.LoginCommand);
        }
        if (source.IsAddressChanged != null) {
            this.IsAddressChanged = new Boolean(source.IsAddressChanged);
        }
        if (source.PodSSHInfo != null) {
            this.PodSSHInfo = new PodSSHInfo(source.PodSSHInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LoginCommand", this.LoginCommand);
        this.setParamSimple(map, prefix + "IsAddressChanged", this.IsAddressChanged);
        this.setParamObj(map, prefix + "PodSSHInfo.", this.PodSSHInfo);

    }
}

