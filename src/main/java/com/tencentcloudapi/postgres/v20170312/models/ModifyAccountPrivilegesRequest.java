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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountPrivilegesRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Modify the permission of this account for a database object. obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1) api.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Permission information to modify. supports batch modification. the maximum number of modifications per batch is 50.
    */
    @SerializedName("ModifyPrivilegeSet")
    @Expose
    private ModifyPrivilege [] ModifyPrivilegeSet;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Modify the permission of this account for a database object. obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1) api. 
     * @return UserName Modify the permission of this account for a database object. obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1) api.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Modify the permission of this account for a database object. obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1) api.
     * @param UserName Modify the permission of this account for a database object. obtain through the [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1) api.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Permission information to modify. supports batch modification. the maximum number of modifications per batch is 50. 
     * @return ModifyPrivilegeSet Permission information to modify. supports batch modification. the maximum number of modifications per batch is 50.
     */
    public ModifyPrivilege [] getModifyPrivilegeSet() {
        return this.ModifyPrivilegeSet;
    }

    /**
     * Set Permission information to modify. supports batch modification. the maximum number of modifications per batch is 50.
     * @param ModifyPrivilegeSet Permission information to modify. supports batch modification. the maximum number of modifications per batch is 50.
     */
    public void setModifyPrivilegeSet(ModifyPrivilege [] ModifyPrivilegeSet) {
        this.ModifyPrivilegeSet = ModifyPrivilegeSet;
    }

    public ModifyAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountPrivilegesRequest(ModifyAccountPrivilegesRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ModifyPrivilegeSet != null) {
            this.ModifyPrivilegeSet = new ModifyPrivilege[source.ModifyPrivilegeSet.length];
            for (int i = 0; i < source.ModifyPrivilegeSet.length; i++) {
                this.ModifyPrivilegeSet[i] = new ModifyPrivilege(source.ModifyPrivilegeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "ModifyPrivilegeSet.", this.ModifyPrivilegeSet);

    }
}

