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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBaselineSyncConfRequest extends AbstractModel {

    /**
    * <p>Baseline synchronization configuration to be updated.</p>
    */
    @SerializedName("SyncConf")
    @Expose
    private BaselineSyncConf SyncConf;

    /**
    * List of member account Appids in the group account scenario. Leave it empty for non-group accounts or when querying only the current account.
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Baseline synchronization configuration to be updated.</p> 
     * @return SyncConf <p>Baseline synchronization configuration to be updated.</p>
     */
    public BaselineSyncConf getSyncConf() {
        return this.SyncConf;
    }

    /**
     * Set <p>Baseline synchronization configuration to be updated.</p>
     * @param SyncConf <p>Baseline synchronization configuration to be updated.</p>
     */
    public void setSyncConf(BaselineSyncConf SyncConf) {
        this.SyncConf = SyncConf;
    }

    /**
     * Get List of member account Appids in the group account scenario. Leave it empty for non-group accounts or when querying only the current account. 
     * @return MemberId List of member account Appids in the group account scenario. Leave it empty for non-group accounts or when querying only the current account.
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set List of member account Appids in the group account scenario. Leave it empty for non-group accounts or when querying only the current account.
     * @param MemberId List of member account Appids in the group account scenario. Leave it empty for non-group accounts or when querying only the current account.
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyBaselineSyncConfRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineSyncConfRequest(ModifyBaselineSyncConfRequest source) {
        if (source.SyncConf != null) {
            this.SyncConf = new BaselineSyncConf(source.SyncConf);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SyncConf.", this.SyncConf);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

