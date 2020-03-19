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

public class ResetAccountPasswordRequest extends AbstractModel{

    /**
    * Instance ID in the format of postgres-4wdeb0zv
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance account name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * New password corresponding to `UserName` account
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Instance ID in the format of postgres-4wdeb0zv 
     * @return DBInstanceId Instance ID in the format of postgres-4wdeb0zv
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-4wdeb0zv
     * @param DBInstanceId Instance ID in the format of postgres-4wdeb0zv
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance account name 
     * @return UserName Instance account name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Instance account name
     * @param UserName Instance account name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get New password corresponding to `UserName` account 
     * @return Password New password corresponding to `UserName` account
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set New password corresponding to `UserName` account
     * @param Password New password corresponding to `UserName` account
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

