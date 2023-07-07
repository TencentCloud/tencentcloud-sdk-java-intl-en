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

public class DbInfo extends AbstractModel{

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
    * Database status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Collation rule
    */
    @SerializedName("CollateRule")
    @Expose
    private String CollateRule;

    /**
    * Database remarks Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * User permissions Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserHostPrivileges")
    @Expose
    private UserHostPrivilege [] UserHostPrivileges;

    /**
    * Database ID Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbId")
    @Expose
    private Long DbId;

    /**
    * Creation time Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * User appid Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User Uin Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Cluster ID Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
     * Get Database status 
     * @return Status Database status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Database status
     * @param Status Database status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Collation rule 
     * @return CollateRule Collation rule
     */
    public String getCollateRule() {
        return this.CollateRule;
    }

    /**
     * Set Collation rule
     * @param CollateRule Collation rule
     */
    public void setCollateRule(String CollateRule) {
        this.CollateRule = CollateRule;
    }

    /**
     * Get Database remarks Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Database remarks Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Database remarks Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Database remarks Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get User permissions Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserHostPrivileges User permissions Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserHostPrivilege [] getUserHostPrivileges() {
        return this.UserHostPrivileges;
    }

    /**
     * Set User permissions Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserHostPrivileges User permissions Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserHostPrivileges(UserHostPrivilege [] UserHostPrivileges) {
        this.UserHostPrivileges = UserHostPrivileges;
    }

    /**
     * Get Database ID Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbId Database ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDbId() {
        return this.DbId;
    }

    /**
     * Set Database ID Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbId Database ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbId(Long DbId) {
        this.DbId = DbId;
    }

    /**
     * Get Creation time Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get User appid Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId User appid Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId User appid Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User Uin Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin User Uin Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User Uin Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin User Uin Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Cluster ID Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbInfo(DbInfo source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.CharacterSet != null) {
            this.CharacterSet = new String(source.CharacterSet);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CollateRule != null) {
            this.CollateRule = new String(source.CollateRule);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserHostPrivileges != null) {
            this.UserHostPrivileges = new UserHostPrivilege[source.UserHostPrivileges.length];
            for (int i = 0; i < source.UserHostPrivileges.length; i++) {
                this.UserHostPrivileges[i] = new UserHostPrivilege(source.UserHostPrivileges[i]);
            }
        }
        if (source.DbId != null) {
            this.DbId = new Long(source.DbId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "CharacterSet", this.CharacterSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CollateRule", this.CollateRule);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "UserHostPrivileges.", this.UserHostPrivileges);
        this.setParamSimple(map, prefix + "DbId", this.DbId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

