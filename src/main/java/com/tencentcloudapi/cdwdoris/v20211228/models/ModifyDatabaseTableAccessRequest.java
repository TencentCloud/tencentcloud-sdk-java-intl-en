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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDatabaseTableAccessRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Table name. If it is null, it indicates that the entire database is authorized.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Permission list
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
    * Role name, if authorized to the role
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Operation type: GRANT or REVOKE
    */
    @SerializedName("GrantOrRevoke")
    @Expose
    private String GrantOrRevoke;

    /**
    * Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * Catalog name, defaults to internal if not specified.
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * InstanceId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Machine Group, defaults to % if not specified.
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Table name. If it is null, it indicates that the entire database is authorized. 
     * @return Table Table name. If it is null, it indicates that the entire database is authorized.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name. If it is null, it indicates that the entire database is authorized.
     * @param Table Table name. If it is null, it indicates that the entire database is authorized.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Permission list 
     * @return Privileges Permission list
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission list
     * @param Privileges Permission list
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get Role name, if authorized to the role 
     * @return Role Role name, if authorized to the role
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role name, if authorized to the role
     * @param Role Role name, if authorized to the role
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Operation type: GRANT or REVOKE 
     * @return GrantOrRevoke Operation type: GRANT or REVOKE
     */
    public String getGrantOrRevoke() {
        return this.GrantOrRevoke;
    }

    /**
     * Set Operation type: GRANT or REVOKE
     * @param GrantOrRevoke Operation type: GRANT or REVOKE
     */
    public void setGrantOrRevoke(String GrantOrRevoke) {
        this.GrantOrRevoke = GrantOrRevoke;
    }

    /**
     * Get Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get Catalog name, defaults to internal if not specified. 
     * @return CatalogName Catalog name, defaults to internal if not specified.
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Catalog name, defaults to internal if not specified.
     * @param CatalogName Catalog name, defaults to internal if not specified.
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get InstanceId 
     * @return InstanceId InstanceId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId
     * @param InstanceId InstanceId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Machine Group, defaults to % if not specified. 
     * @return WhiteHost Machine Group, defaults to % if not specified.
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set Machine Group, defaults to % if not specified.
     * @param WhiteHost Machine Group, defaults to % if not specified.
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    public ModifyDatabaseTableAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatabaseTableAccessRequest(ModifyDatabaseTableAccessRequest source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.GrantOrRevoke != null) {
            this.GrantOrRevoke = new String(source.GrantOrRevoke);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "GrantOrRevoke", this.GrantOrRevoke);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);

    }
}

