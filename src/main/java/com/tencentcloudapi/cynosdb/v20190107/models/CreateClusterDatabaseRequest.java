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

public class CreateClusterDatabaseRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Character set
    */
    @SerializedName("CharacterSet")
    @Expose
    private String CharacterSet;

    /**
    * Collation
    */
    @SerializedName("CollateRule")
    @Expose
    private String CollateRule;

    /**
    * Host permissions of the authorized user
    */
    @SerializedName("UserHostPrivileges")
    @Expose
    private UserHostPrivilege [] UserHostPrivileges;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Character set 
     * @return CharacterSet Character set
     */
    public String getCharacterSet() {
        return this.CharacterSet;
    }

    /**
     * Set Character set
     * @param CharacterSet Character set
     */
    public void setCharacterSet(String CharacterSet) {
        this.CharacterSet = CharacterSet;
    }

    /**
     * Get Collation 
     * @return CollateRule Collation
     */
    public String getCollateRule() {
        return this.CollateRule;
    }

    /**
     * Set Collation
     * @param CollateRule Collation
     */
    public void setCollateRule(String CollateRule) {
        this.CollateRule = CollateRule;
    }

    /**
     * Get Host permissions of the authorized user 
     * @return UserHostPrivileges Host permissions of the authorized user
     */
    public UserHostPrivilege [] getUserHostPrivileges() {
        return this.UserHostPrivileges;
    }

    /**
     * Set Host permissions of the authorized user
     * @param UserHostPrivileges Host permissions of the authorized user
     */
    public void setUserHostPrivileges(UserHostPrivilege [] UserHostPrivileges) {
        this.UserHostPrivileges = UserHostPrivileges;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateClusterDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterDatabaseRequest(CreateClusterDatabaseRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.CharacterSet != null) {
            this.CharacterSet = new String(source.CharacterSet);
        }
        if (source.CollateRule != null) {
            this.CollateRule = new String(source.CollateRule);
        }
        if (source.UserHostPrivileges != null) {
            this.UserHostPrivileges = new UserHostPrivilege[source.UserHostPrivileges.length];
            for (int i = 0; i < source.UserHostPrivileges.length; i++) {
                this.UserHostPrivileges[i] = new UserHostPrivilege(source.UserHostPrivileges[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "CharacterSet", this.CharacterSet);
        this.setParamSimple(map, prefix + "CollateRule", this.CollateRule);
        this.setParamArrayObj(map, prefix + "UserHostPrivileges.", this.UserHostPrivileges);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

