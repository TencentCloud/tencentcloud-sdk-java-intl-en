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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceConfigResponse extends AbstractModel{

    /**
    * Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * Instance AZ information in the format of "ap-shanghai-1".
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Configuration information of the secondary database.
    */
    @SerializedName("SlaveConfig")
    @Expose
    private SlaveConfig SlaveConfig;

    /**
    * Configuration information of secondary database 2 of a strong sync instance.
    */
    @SerializedName("BackupConfig")
    @Expose
    private BackupConfig BackupConfig;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication). 
     * @return ProtectMode Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
     * @param ProtectMode Data protection mode of the primary instance. Value range: 0 (async replication), 1 (semi-sync replication), 2 (strong sync replication).
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ) 
     * @return DeployMode Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     * @param DeployMode Master instance deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Instance AZ information in the format of "ap-shanghai-1". 
     * @return Zone Instance AZ information in the format of "ap-shanghai-1".
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ information in the format of "ap-shanghai-1".
     * @param Zone Instance AZ information in the format of "ap-shanghai-1".
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Configuration information of the secondary database. 
     * @return SlaveConfig Configuration information of the secondary database.
     */
    public SlaveConfig getSlaveConfig() {
        return this.SlaveConfig;
    }

    /**
     * Set Configuration information of the secondary database.
     * @param SlaveConfig Configuration information of the secondary database.
     */
    public void setSlaveConfig(SlaveConfig SlaveConfig) {
        this.SlaveConfig = SlaveConfig;
    }

    /**
     * Get Configuration information of secondary database 2 of a strong sync instance. 
     * @return BackupConfig Configuration information of secondary database 2 of a strong sync instance.
     */
    public BackupConfig getBackupConfig() {
        return this.BackupConfig;
    }

    /**
     * Set Configuration information of secondary database 2 of a strong sync instance.
     * @param BackupConfig Configuration information of secondary database 2 of a strong sync instance.
     */
    public void setBackupConfig(BackupConfig BackupConfig) {
        this.BackupConfig = BackupConfig;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "SlaveConfig.", this.SlaveConfig);
        this.setParamObj(map, prefix + "BackupConfig.", this.BackupConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

