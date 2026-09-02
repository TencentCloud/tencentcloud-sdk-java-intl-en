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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineLoginType extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Host Quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Login method: 0-original login method, 1-scan code for password-free log-in, 2-enable scan code, 3-disable scan code</p>
    */
    @SerializedName("LoginType")
    @Expose
    private Long LoginType;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Host Quuid</p> 
     * @return Quuid <p>Host Quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host Quuid</p>
     * @param Quuid <p>Host Quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Login method: 0-original login method, 1-scan code for password-free log-in, 2-enable scan code, 3-disable scan code</p> 
     * @return LoginType <p>Login method: 0-original login method, 1-scan code for password-free log-in, 2-enable scan code, 3-disable scan code</p>
     */
    public Long getLoginType() {
        return this.LoginType;
    }

    /**
     * Set <p>Login method: 0-original login method, 1-scan code for password-free log-in, 2-enable scan code, 3-disable scan code</p>
     * @param LoginType <p>Login method: 0-original login method, 1-scan code for password-free log-in, 2-enable scan code, 3-disable scan code</p>
     */
    public void setLoginType(Long LoginType) {
        this.LoginType = LoginType;
    }

    public MachineLoginType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineLoginType(MachineLoginType source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.LoginType != null) {
            this.LoginType = new Long(source.LoginType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);

    }
}

