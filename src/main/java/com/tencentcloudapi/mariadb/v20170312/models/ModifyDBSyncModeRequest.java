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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBSyncModeRequest extends AbstractModel {

    /**
    * ID of the instance for which to modify the sync mode. The ID is in the format of `tdsql-ow728lmc`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sync mode. Valid values: `0` (async), `1` (strong sync), `2` (downgradable strong sync).
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
     * Get ID of the instance for which to modify the sync mode. The ID is in the format of `tdsql-ow728lmc`. 
     * @return InstanceId ID of the instance for which to modify the sync mode. The ID is in the format of `tdsql-ow728lmc`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance for which to modify the sync mode. The ID is in the format of `tdsql-ow728lmc`.
     * @param InstanceId ID of the instance for which to modify the sync mode. The ID is in the format of `tdsql-ow728lmc`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sync mode. Valid values: `0` (async), `1` (strong sync), `2` (downgradable strong sync). 
     * @return SyncMode Sync mode. Valid values: `0` (async), `1` (strong sync), `2` (downgradable strong sync).
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Sync mode. Valid values: `0` (async), `1` (strong sync), `2` (downgradable strong sync).
     * @param SyncMode Sync mode. Valid values: `0` (async), `1` (strong sync), `2` (downgradable strong sync).
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    public ModifyDBSyncModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBSyncModeRequest(ModifyDBSyncModeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new Long(source.SyncMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);

    }
}

