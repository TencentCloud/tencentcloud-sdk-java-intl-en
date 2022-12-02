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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrateDBInstancesRequest extends AbstractModel{

    /**
    * Database type, such as `mysql`.
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * Specifies whether the instance is the migration source or target. Valid values: `src` (source); `dts` (target).
    */
    @SerializedName("MigrateRole")
    @Expose
    private String MigrateRole;

    /**
    * Database instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Number of results to be returned
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
    */
    @SerializedName("AccountMode")
    @Expose
    private String AccountMode;

    /**
    * ID of the temporary key, which is required if the operation is performed across accounts.
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Key of the temporary key, which is required if the operation is performed across accounts.
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * Temporary token, which is required if the operation is performed across accounts.
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
     * Get Database type, such as `mysql`. 
     * @return DatabaseType Database type, such as `mysql`.
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set Database type, such as `mysql`.
     * @param DatabaseType Database type, such as `mysql`.
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get Specifies whether the instance is the migration source or target. Valid values: `src` (source); `dts` (target). 
     * @return MigrateRole Specifies whether the instance is the migration source or target. Valid values: `src` (source); `dts` (target).
     */
    public String getMigrateRole() {
        return this.MigrateRole;
    }

    /**
     * Set Specifies whether the instance is the migration source or target. Valid values: `src` (source); `dts` (target).
     * @param MigrateRole Specifies whether the instance is the migration source or target. Valid values: `src` (source); `dts` (target).
     */
    public void setMigrateRole(String MigrateRole) {
        this.MigrateRole = MigrateRole;
    }

    /**
     * Get Database instance ID 
     * @return InstanceId Database instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID
     * @param InstanceId Database instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database instance name 
     * @return InstanceName Database instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Database instance name
     * @param InstanceName Database instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Number of results to be returned 
     * @return Limit Number of results to be returned
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned
     * @param Limit Number of results to be returned
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account). 
     * @return AccountMode The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
     */
    public String getAccountMode() {
        return this.AccountMode;
    }

    /**
     * Set The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
     * @param AccountMode The account to which the resource belongs. Valid values: empty or `self` (the current account); `other` (another account).
     */
    public void setAccountMode(String AccountMode) {
        this.AccountMode = AccountMode;
    }

    /**
     * Get ID of the temporary key, which is required if the operation is performed across accounts. 
     * @return TmpSecretId ID of the temporary key, which is required if the operation is performed across accounts.
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set ID of the temporary key, which is required if the operation is performed across accounts.
     * @param TmpSecretId ID of the temporary key, which is required if the operation is performed across accounts.
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Key of the temporary key, which is required if the operation is performed across accounts. 
     * @return TmpSecretKey Key of the temporary key, which is required if the operation is performed across accounts.
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Key of the temporary key, which is required if the operation is performed across accounts.
     * @param TmpSecretKey Key of the temporary key, which is required if the operation is performed across accounts.
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get Temporary token, which is required if the operation is performed across accounts. 
     * @return TmpToken Temporary token, which is required if the operation is performed across accounts.
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set Temporary token, which is required if the operation is performed across accounts.
     * @param TmpToken Temporary token, which is required if the operation is performed across accounts.
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    public DescribeMigrateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrateDBInstancesRequest(DescribeMigrateDBInstancesRequest source) {
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.MigrateRole != null) {
            this.MigrateRole = new String(source.MigrateRole);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountMode != null) {
            this.AccountMode = new String(source.AccountMode);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.TmpToken != null) {
            this.TmpToken = new String(source.TmpToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "MigrateRole", this.MigrateRole);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountMode", this.AccountMode);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);

    }
}

