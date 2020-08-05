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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetAccountPasswordRequest extends AbstractModel{

    /**
    * Instance ID in the format of dcdbt-ow728lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Login username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Access host allowed for a user. An account is uniquely identified by username and host.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * New password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Instance ID in the format of dcdbt-ow728lmc. 
     * @return InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of dcdbt-ow728lmc.
     * @param InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Login username. 
     * @return UserName Login username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Login username.
     * @param UserName Login username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Access host allowed for a user. An account is uniquely identified by username and host. 
     * @return Host Access host allowed for a user. An account is uniquely identified by username and host.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Access host allowed for a user. An account is uniquely identified by username and host.
     * @param Host Access host allowed for a user. An account is uniquely identified by username and host.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get New password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks. 
     * @return Password New password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set New password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
     * @param Password New password, which can contain 6-32 letters, digits, and common symbols but not semicolons, single quotation marks, and double quotation marks.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

