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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDbInstanceVersionRequest extends AbstractModel {

    /**
    * List of instance IDs, which are in the format of cmgo-p8vnipr5. It is the same as the format of the instance ID displayed on the TencentDB for MongoDB console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The newly upgraded database version. Currently supported versions are as follows. Upgrade from an earlier version to a high version is supported. Cross-version upgrade is not supported.
- MONGO_40_WT: Version 4.0.
- MONGO_42_WT: Version 4.2.
- MONGO_44_WT: Version 4.4.
- MONGO_50_WT: Version 5.0.
- MONGO_60_WT: Version 6.0.
-MONGO_70_WT: Version 7.0.
- MONGO_80_WT: Version 8.0.
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * Specify whether to perform the upgrade during the maintenance period.
-0: Upgrade now.
- 1: Upgrade during the maintenance window.
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
     * Get List of instance IDs, which are in the format of cmgo-p8vnipr5. It is the same as the format of the instance ID displayed on the TencentDB for MongoDB console page. 
     * @return InstanceId List of instance IDs, which are in the format of cmgo-p8vnipr5. It is the same as the format of the instance ID displayed on the TencentDB for MongoDB console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set List of instance IDs, which are in the format of cmgo-p8vnipr5. It is the same as the format of the instance ID displayed on the TencentDB for MongoDB console page.
     * @param InstanceId List of instance IDs, which are in the format of cmgo-p8vnipr5. It is the same as the format of the instance ID displayed on the TencentDB for MongoDB console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The newly upgraded database version. Currently supported versions are as follows. Upgrade from an earlier version to a high version is supported. Cross-version upgrade is not supported.
- MONGO_40_WT: Version 4.0.
- MONGO_42_WT: Version 4.2.
- MONGO_44_WT: Version 4.4.
- MONGO_50_WT: Version 5.0.
- MONGO_60_WT: Version 6.0.
-MONGO_70_WT: Version 7.0.
- MONGO_80_WT: Version 8.0. 
     * @return MongoVersion The newly upgraded database version. Currently supported versions are as follows. Upgrade from an earlier version to a high version is supported. Cross-version upgrade is not supported.
- MONGO_40_WT: Version 4.0.
- MONGO_42_WT: Version 4.2.
- MONGO_44_WT: Version 4.4.
- MONGO_50_WT: Version 5.0.
- MONGO_60_WT: Version 6.0.
-MONGO_70_WT: Version 7.0.
- MONGO_80_WT: Version 8.0.
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set The newly upgraded database version. Currently supported versions are as follows. Upgrade from an earlier version to a high version is supported. Cross-version upgrade is not supported.
- MONGO_40_WT: Version 4.0.
- MONGO_42_WT: Version 4.2.
- MONGO_44_WT: Version 4.4.
- MONGO_50_WT: Version 5.0.
- MONGO_60_WT: Version 6.0.
-MONGO_70_WT: Version 7.0.
- MONGO_80_WT: Version 8.0.
     * @param MongoVersion The newly upgraded database version. Currently supported versions are as follows. Upgrade from an earlier version to a high version is supported. Cross-version upgrade is not supported.
- MONGO_40_WT: Version 4.0.
- MONGO_42_WT: Version 4.2.
- MONGO_44_WT: Version 4.4.
- MONGO_50_WT: Version 5.0.
- MONGO_60_WT: Version 6.0.
-MONGO_70_WT: Version 7.0.
- MONGO_80_WT: Version 8.0.
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get Specify whether to perform the upgrade during the maintenance period.
-0: Upgrade now.
- 1: Upgrade during the maintenance window. 
     * @return InMaintenance Specify whether to perform the upgrade during the maintenance period.
-0: Upgrade now.
- 1: Upgrade during the maintenance window.
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set Specify whether to perform the upgrade during the maintenance period.
-0: Upgrade now.
- 1: Upgrade during the maintenance window.
     * @param InMaintenance Specify whether to perform the upgrade during the maintenance period.
-0: Upgrade now.
- 1: Upgrade during the maintenance window.
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    public UpgradeDbInstanceVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDbInstanceVersionRequest(UpgradeDbInstanceVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.InMaintenance != null) {
            this.InMaintenance = new Long(source.InMaintenance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "InMaintenance", this.InMaintenance);

    }
}

