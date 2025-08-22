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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCollationTimeZoneRequest extends AbstractModel {

    /**
    * Host type of the purchased instance. PM: physical server; CLOUD_PREMIUM: CVM with Premium Cloud Disk;
CLOUD_SSD: CVM with Cloud SSD; CLOUD_HSSD: CVM with Enhanced SSD; CLOUD_TSSD: CVM with Tremendous SSD; CLOUD_BSSD: CVM with Balanced SSD; CLOUD_BASIC: CVM with cloud disk. PM is set as the default value.
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Version number of the purchased instance.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
     * Get Host type of the purchased instance. PM: physical server; CLOUD_PREMIUM: CVM with Premium Cloud Disk;
CLOUD_SSD: CVM with Cloud SSD; CLOUD_HSSD: CVM with Enhanced SSD; CLOUD_TSSD: CVM with Tremendous SSD; CLOUD_BSSD: CVM with Balanced SSD; CLOUD_BASIC: CVM with cloud disk. PM is set as the default value. 
     * @return MachineType Host type of the purchased instance. PM: physical server; CLOUD_PREMIUM: CVM with Premium Cloud Disk;
CLOUD_SSD: CVM with Cloud SSD; CLOUD_HSSD: CVM with Enhanced SSD; CLOUD_TSSD: CVM with Tremendous SSD; CLOUD_BSSD: CVM with Balanced SSD; CLOUD_BASIC: CVM with cloud disk. PM is set as the default value.
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Host type of the purchased instance. PM: physical server; CLOUD_PREMIUM: CVM with Premium Cloud Disk;
CLOUD_SSD: CVM with Cloud SSD; CLOUD_HSSD: CVM with Enhanced SSD; CLOUD_TSSD: CVM with Tremendous SSD; CLOUD_BSSD: CVM with Balanced SSD; CLOUD_BASIC: CVM with cloud disk. PM is set as the default value.
     * @param MachineType Host type of the purchased instance. PM: physical server; CLOUD_PREMIUM: CVM with Premium Cloud Disk;
CLOUD_SSD: CVM with Cloud SSD; CLOUD_HSSD: CVM with Enhanced SSD; CLOUD_TSSD: CVM with Tremendous SSD; CLOUD_BSSD: CVM with Balanced SSD; CLOUD_BASIC: CVM with cloud disk. PM is set as the default value.
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Version number of the purchased instance. 
     * @return DBVersion Version number of the purchased instance.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Version number of the purchased instance.
     * @param DBVersion Version number of the purchased instance.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    public DescribeCollationTimeZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCollationTimeZoneRequest(DescribeCollationTimeZoneRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);

    }
}

