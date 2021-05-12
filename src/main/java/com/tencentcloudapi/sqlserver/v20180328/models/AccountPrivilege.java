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

public class AccountPrivilege extends AbstractModel{

    /**
    * Database username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Database permissions. ReadWrite: read/write, ReadOnly: read-only
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
     * Get Database username 
     * @return UserName Database username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Database username
     * @param UserName Database username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Database permissions. ReadWrite: read/write, ReadOnly: read-only 
     * @return Privilege Database permissions. ReadWrite: read/write, ReadOnly: read-only
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Database permissions. ReadWrite: read/write, ReadOnly: read-only
     * @param Privilege Database permissions. ReadWrite: read/write, ReadOnly: read-only
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    public AccountPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountPrivilege(AccountPrivilege source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

