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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneConf extends AbstractModel {

    /**
    * AZ deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
    */
    @SerializedName("DeployMode")
    @Expose
    private Long [] DeployMode;

    /**
    * AZ where the primary instance is located
    */
    @SerializedName("MasterZone")
    @Expose
    private String [] MasterZone;

    /**
    * AZ where salve database 1 is located when the instance is deployed in multi-AZ mode
    */
    @SerializedName("SlaveZone")
    @Expose
    private String [] SlaveZone;

    /**
    * AZ where salve database 2 is located when the instance is deployed in multi-AZ mode
    */
    @SerializedName("BackupZone")
    @Expose
    private String [] BackupZone;

    /**
     * Get AZ deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ) 
     * @return DeployMode AZ deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     */
    public Long [] getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set AZ deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     * @param DeployMode AZ deployment mode. Value range: 0 (single-AZ), 1 (multi-AZ)
     */
    public void setDeployMode(Long [] DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get AZ where the primary instance is located 
     * @return MasterZone AZ where the primary instance is located
     */
    public String [] getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set AZ where the primary instance is located
     * @param MasterZone AZ where the primary instance is located
     */
    public void setMasterZone(String [] MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get AZ where salve database 1 is located when the instance is deployed in multi-AZ mode 
     * @return SlaveZone AZ where salve database 1 is located when the instance is deployed in multi-AZ mode
     */
    public String [] getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set AZ where salve database 1 is located when the instance is deployed in multi-AZ mode
     * @param SlaveZone AZ where salve database 1 is located when the instance is deployed in multi-AZ mode
     */
    public void setSlaveZone(String [] SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get AZ where salve database 2 is located when the instance is deployed in multi-AZ mode 
     * @return BackupZone AZ where salve database 2 is located when the instance is deployed in multi-AZ mode
     */
    public String [] getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set AZ where salve database 2 is located when the instance is deployed in multi-AZ mode
     * @param BackupZone AZ where salve database 2 is located when the instance is deployed in multi-AZ mode
     */
    public void setBackupZone(String [] BackupZone) {
        this.BackupZone = BackupZone;
    }

    public ZoneConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneConf(ZoneConf source) {
        if (source.DeployMode != null) {
            this.DeployMode = new Long[source.DeployMode.length];
            for (int i = 0; i < source.DeployMode.length; i++) {
                this.DeployMode[i] = new Long(source.DeployMode[i]);
            }
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String[source.MasterZone.length];
            for (int i = 0; i < source.MasterZone.length; i++) {
                this.MasterZone[i] = new String(source.MasterZone[i]);
            }
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String[source.SlaveZone.length];
            for (int i = 0; i < source.SlaveZone.length; i++) {
                this.SlaveZone[i] = new String(source.SlaveZone[i]);
            }
        }
        if (source.BackupZone != null) {
            this.BackupZone = new String[source.BackupZone.length];
            for (int i = 0; i < source.BackupZone.length; i++) {
                this.BackupZone[i] = new String(source.BackupZone[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeployMode.", this.DeployMode);
        this.setParamArraySimple(map, prefix + "MasterZone.", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZone.", this.SlaveZone);
        this.setParamArraySimple(map, prefix + "BackupZone.", this.BackupZone);

    }
}

