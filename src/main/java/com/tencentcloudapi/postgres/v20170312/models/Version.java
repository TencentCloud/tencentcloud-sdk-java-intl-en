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

public class Version extends AbstractModel {

    /**
    * Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * Database version, such as 12.4.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Database major version, such as 12.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * Database kernel version, such as v12.4_r1.3.
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * List of features supported by the database kernel, such as:
TDE: Supports data encryption.
    */
    @SerializedName("SupportedFeatureNames")
    @Expose
    private String [] SupportedFeatureNames;

    /**
    * Database version status. Valid values:
`AVAILABLE`.
`DEPRECATED`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * List of versions to which this database version (`DBKernelVersion`) can be upgraded, including minor and major version numbers available for upgrade (complete kernel version format example: v15.1_v1.6).
    */
    @SerializedName("AvailableUpgradeTarget")
    @Expose
    private String [] AvailableUpgradeTarget;

    /**
     * Get Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL) 
     * @return DBEngine Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
     * @param DBEngine Database engines. Valid values:
1. `postgresql` (TencentDB for PostgreSQL)
2. `mssql_compatible` (MSSQL compatible-TencentDB for PostgreSQL)
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get Database version, such as 12.4. 
     * @return DBVersion Database version, such as 12.4.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Database version, such as 12.4.
     * @param DBVersion Database version, such as 12.4.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Database major version, such as 12. 
     * @return DBMajorVersion Database major version, such as 12.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set Database major version, such as 12.
     * @param DBMajorVersion Database major version, such as 12.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get Database kernel version, such as v12.4_r1.3. 
     * @return DBKernelVersion Database kernel version, such as v12.4_r1.3.
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set Database kernel version, such as v12.4_r1.3.
     * @param DBKernelVersion Database kernel version, such as v12.4_r1.3.
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get List of features supported by the database kernel, such as:
TDE: Supports data encryption. 
     * @return SupportedFeatureNames List of features supported by the database kernel, such as:
TDE: Supports data encryption.
     */
    public String [] getSupportedFeatureNames() {
        return this.SupportedFeatureNames;
    }

    /**
     * Set List of features supported by the database kernel, such as:
TDE: Supports data encryption.
     * @param SupportedFeatureNames List of features supported by the database kernel, such as:
TDE: Supports data encryption.
     */
    public void setSupportedFeatureNames(String [] SupportedFeatureNames) {
        this.SupportedFeatureNames = SupportedFeatureNames;
    }

    /**
     * Get Database version status. Valid values:
`AVAILABLE`.
`DEPRECATED`. 
     * @return Status Database version status. Valid values:
`AVAILABLE`.
`DEPRECATED`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Database version status. Valid values:
`AVAILABLE`.
`DEPRECATED`.
     * @param Status Database version status. Valid values:
`AVAILABLE`.
`DEPRECATED`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get List of versions to which this database version (`DBKernelVersion`) can be upgraded, including minor and major version numbers available for upgrade (complete kernel version format example: v15.1_v1.6). 
     * @return AvailableUpgradeTarget List of versions to which this database version (`DBKernelVersion`) can be upgraded, including minor and major version numbers available for upgrade (complete kernel version format example: v15.1_v1.6).
     */
    public String [] getAvailableUpgradeTarget() {
        return this.AvailableUpgradeTarget;
    }

    /**
     * Set List of versions to which this database version (`DBKernelVersion`) can be upgraded, including minor and major version numbers available for upgrade (complete kernel version format example: v15.1_v1.6).
     * @param AvailableUpgradeTarget List of versions to which this database version (`DBKernelVersion`) can be upgraded, including minor and major version numbers available for upgrade (complete kernel version format example: v15.1_v1.6).
     */
    public void setAvailableUpgradeTarget(String [] AvailableUpgradeTarget) {
        this.AvailableUpgradeTarget = AvailableUpgradeTarget;
    }

    public Version() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Version(Version source) {
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.SupportedFeatureNames != null) {
            this.SupportedFeatureNames = new String[source.SupportedFeatureNames.length];
            for (int i = 0; i < source.SupportedFeatureNames.length; i++) {
                this.SupportedFeatureNames[i] = new String(source.SupportedFeatureNames[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AvailableUpgradeTarget != null) {
            this.AvailableUpgradeTarget = new String[source.AvailableUpgradeTarget.length];
            for (int i = 0; i < source.AvailableUpgradeTarget.length; i++) {
                this.AvailableUpgradeTarget[i] = new String(source.AvailableUpgradeTarget[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamArraySimple(map, prefix + "SupportedFeatureNames.", this.SupportedFeatureNames);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "AvailableUpgradeTarget.", this.AvailableUpgradeTarget);

    }
}

