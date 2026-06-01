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

public class ModifyProtectModeRequest extends AbstractModel {

    /**
    * Data replication method, defaults to 0. Supported values include: 0 - asynchronous replication, 1 - semi-sync replication, 2 - strong sync replication.
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Data replication method, defaults to 0. Supported values include: 0 - asynchronous replication, 1 - semi-sync replication, 2 - strong sync replication. 
     * @return ProtectMode Data replication method, defaults to 0. Supported values include: 0 - asynchronous replication, 1 - semi-sync replication, 2 - strong sync replication.
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication method, defaults to 0. Supported values include: 0 - asynchronous replication, 1 - semi-sync replication, 2 - strong sync replication.
     * @param ProtectMode Data replication method, defaults to 0. Supported values include: 0 - asynchronous replication, 1 - semi-sync replication, 2 - strong sync replication.
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ModifyProtectModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectModeRequest(ModifyProtectModeRequest source) {
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

