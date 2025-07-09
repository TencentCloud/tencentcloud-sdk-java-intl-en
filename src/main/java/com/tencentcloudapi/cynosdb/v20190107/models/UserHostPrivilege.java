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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserHostPrivilege extends AbstractModel {

    /**
    * Authorized user
    */
    @SerializedName("DbUserName")
    @Expose
    private String DbUserName;

    /**
    * Client IP
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * User permission
    */
    @SerializedName("DbPrivilege")
    @Expose
    private String DbPrivilege;

    /**
     * Get Authorized user 
     * @return DbUserName Authorized user
     */
    public String getDbUserName() {
        return this.DbUserName;
    }

    /**
     * Set Authorized user
     * @param DbUserName Authorized user
     */
    public void setDbUserName(String DbUserName) {
        this.DbUserName = DbUserName;
    }

    /**
     * Get Client IP 
     * @return DbHost Client IP
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set Client IP
     * @param DbHost Client IP
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get User permission 
     * @return DbPrivilege User permission
     */
    public String getDbPrivilege() {
        return this.DbPrivilege;
    }

    /**
     * Set User permission
     * @param DbPrivilege User permission
     */
    public void setDbPrivilege(String DbPrivilege) {
        this.DbPrivilege = DbPrivilege;
    }

    public UserHostPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserHostPrivilege(UserHostPrivilege source) {
        if (source.DbUserName != null) {
            this.DbUserName = new String(source.DbUserName);
        }
        if (source.DbHost != null) {
            this.DbHost = new String(source.DbHost);
        }
        if (source.DbPrivilege != null) {
            this.DbPrivilege = new String(source.DbPrivilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbUserName", this.DbUserName);
        this.setParamSimple(map, prefix + "DbHost", this.DbHost);
        this.setParamSimple(map, prefix + "DbPrivilege", this.DbPrivilege);

    }
}

