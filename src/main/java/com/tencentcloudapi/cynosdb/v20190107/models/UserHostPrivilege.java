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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserHostPrivilege extends AbstractModel{

    /**
    * Authorized user
    */
    @SerializedName("DbUserName")
    @Expose
    private String DbUserName;

    /**
    * Client IP Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * User permissions Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Client IP Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbHost Client IP Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set Client IP Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbHost Client IP Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get User permissions Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbPrivilege User permissions Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbPrivilege() {
        return this.DbPrivilege;
    }

    /**
     * Set User permissions Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbPrivilege User permissions Note: This field may return null, indicating that no valid values can be obtained.
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

