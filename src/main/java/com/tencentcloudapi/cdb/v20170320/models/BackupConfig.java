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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupConfig extends AbstractModel {

    /**
    * Replication mode of secondary database 2. Value range: async, semi-sync
    */
    @SerializedName("ReplicationMode")
    @Expose
    private String ReplicationMode;

    /**
    * Name of the AZ of secondary database 2, such as ap-shanghai-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Private IP address of secondary database 2
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Access port of secondary database 2
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get Replication mode of secondary database 2. Value range: async, semi-sync 
     * @return ReplicationMode Replication mode of secondary database 2. Value range: async, semi-sync
     */
    public String getReplicationMode() {
        return this.ReplicationMode;
    }

    /**
     * Set Replication mode of secondary database 2. Value range: async, semi-sync
     * @param ReplicationMode Replication mode of secondary database 2. Value range: async, semi-sync
     */
    public void setReplicationMode(String ReplicationMode) {
        this.ReplicationMode = ReplicationMode;
    }

    /**
     * Get Name of the AZ of secondary database 2, such as ap-shanghai-2 
     * @return Zone Name of the AZ of secondary database 2, such as ap-shanghai-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Name of the AZ of secondary database 2, such as ap-shanghai-2
     * @param Zone Name of the AZ of secondary database 2, such as ap-shanghai-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Private IP address of secondary database 2 
     * @return Vip Private IP address of secondary database 2
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP address of secondary database 2
     * @param Vip Private IP address of secondary database 2
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Access port of secondary database 2 
     * @return Vport Access port of secondary database 2
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Access port of secondary database 2
     * @param Vport Access port of secondary database 2
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public BackupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupConfig(BackupConfig source) {
        if (source.ReplicationMode != null) {
            this.ReplicationMode = new String(source.ReplicationMode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationMode", this.ReplicationMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

