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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateTarget extends AbstractModel{

    /**
    * ID of target instance in the format of mssql-si2823jyl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username of migration target instance
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password of migration target instance
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get ID of target instance in the format of mssql-si2823jyl 
     * @return InstanceId ID of target instance in the format of mssql-si2823jyl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of target instance in the format of mssql-si2823jyl
     * @param InstanceId ID of target instance in the format of mssql-si2823jyl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username of migration target instance 
     * @return UserName Username of migration target instance
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username of migration target instance
     * @param UserName Username of migration target instance
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password of migration target instance 
     * @return Password Password of migration target instance
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password of migration target instance
     * @param Password Password of migration target instance
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
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

