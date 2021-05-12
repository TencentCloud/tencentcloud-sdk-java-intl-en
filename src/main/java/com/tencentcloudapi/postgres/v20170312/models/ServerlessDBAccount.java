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

public class ServerlessDBAccount extends AbstractModel{

    /**
    * Username
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBUser")
    @Expose
    private String DBUser;

    /**
    * Password
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBPassword")
    @Expose
    private String DBPassword;

    /**
    * The maximum number of connections
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DBConnLimit")
    @Expose
    private Long DBConnLimit;

    /**
     * Get Username
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBUser Username
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBUser() {
        return this.DBUser;
    }

    /**
     * Set Username
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBUser Username
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBUser(String DBUser) {
        this.DBUser = DBUser;
    }

    /**
     * Get Password
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBPassword Password
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDBPassword() {
        return this.DBPassword;
    }

    /**
     * Set Password
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBPassword Password
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBPassword(String DBPassword) {
        this.DBPassword = DBPassword;
    }

    /**
     * Get The maximum number of connections
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DBConnLimit The maximum number of connections
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDBConnLimit() {
        return this.DBConnLimit;
    }

    /**
     * Set The maximum number of connections
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DBConnLimit The maximum number of connections
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDBConnLimit(Long DBConnLimit) {
        this.DBConnLimit = DBConnLimit;
    }

    public ServerlessDBAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessDBAccount(ServerlessDBAccount source) {
        if (source.DBUser != null) {
            this.DBUser = new String(source.DBUser);
        }
        if (source.DBPassword != null) {
            this.DBPassword = new String(source.DBPassword);
        }
        if (source.DBConnLimit != null) {
            this.DBConnLimit = new Long(source.DBConnLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBUser", this.DBUser);
        this.setParamSimple(map, prefix + "DBPassword", this.DBPassword);
        this.setParamSimple(map, prefix + "DBConnLimit", this.DBConnLimit);

    }
}

