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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnterRescueModeRequest extends AbstractModel {

    /**
    * Instance ID Needs to Enter Rescue Mode
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * System Password in Rescue Mode
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * System Username in Rescue Mode
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Whether to perform forced shutdown.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * 
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get Instance ID Needs to Enter Rescue Mode 
     * @return InstanceId Instance ID Needs to Enter Rescue Mode
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID Needs to Enter Rescue Mode
     * @param InstanceId Instance ID Needs to Enter Rescue Mode
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get System Password in Rescue Mode 
     * @return Password System Password in Rescue Mode
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set System Password in Rescue Mode
     * @param Password System Password in Rescue Mode
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get System Username in Rescue Mode 
     * @return Username System Username in Rescue Mode
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set System Username in Rescue Mode
     * @param Username System Username in Rescue Mode
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Whether to perform forced shutdown. 
     * @return ForceStop Whether to perform forced shutdown.
     * @deprecated
     */
    @Deprecated
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set Whether to perform forced shutdown.
     * @param ForceStop Whether to perform forced shutdown.
     * @deprecated
     */
    @Deprecated
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get  
     * @return StopType 
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set 
     * @param StopType 
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    public EnterRescueModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnterRescueModeRequest(EnterRescueModeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
        if (source.StopType != null) {
            this.StopType = new String(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

