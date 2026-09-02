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

public class BaselineSyncConf extends AbstractModel {

    /**
    * <p>Whether to automatically sync the baseline configuration to member accounts. true indicates enabled, false indicates disabled.</p>
    */
    @SerializedName("AutoSync")
    @Expose
    private Boolean AutoSync;

    /**
    * <p>List of Appids of target member accounts for automatic synchronization. This parameter is valid only when AutoSync=true.</p>
    */
    @SerializedName("TargetAppidList")
    @Expose
    private Long [] TargetAppidList;

    /**
    * <p>User Configuration List</p>
    */
    @SerializedName("UserConfList")
    @Expose
    private UserConfSyncStatus [] UserConfList;

    /**
     * Get <p>Whether to automatically sync the baseline configuration to member accounts. true indicates enabled, false indicates disabled.</p> 
     * @return AutoSync <p>Whether to automatically sync the baseline configuration to member accounts. true indicates enabled, false indicates disabled.</p>
     */
    public Boolean getAutoSync() {
        return this.AutoSync;
    }

    /**
     * Set <p>Whether to automatically sync the baseline configuration to member accounts. true indicates enabled, false indicates disabled.</p>
     * @param AutoSync <p>Whether to automatically sync the baseline configuration to member accounts. true indicates enabled, false indicates disabled.</p>
     */
    public void setAutoSync(Boolean AutoSync) {
        this.AutoSync = AutoSync;
    }

    /**
     * Get <p>List of Appids of target member accounts for automatic synchronization. This parameter is valid only when AutoSync=true.</p> 
     * @return TargetAppidList <p>List of Appids of target member accounts for automatic synchronization. This parameter is valid only when AutoSync=true.</p>
     */
    public Long [] getTargetAppidList() {
        return this.TargetAppidList;
    }

    /**
     * Set <p>List of Appids of target member accounts for automatic synchronization. This parameter is valid only when AutoSync=true.</p>
     * @param TargetAppidList <p>List of Appids of target member accounts for automatic synchronization. This parameter is valid only when AutoSync=true.</p>
     */
    public void setTargetAppidList(Long [] TargetAppidList) {
        this.TargetAppidList = TargetAppidList;
    }

    /**
     * Get <p>User Configuration List</p> 
     * @return UserConfList <p>User Configuration List</p>
     */
    public UserConfSyncStatus [] getUserConfList() {
        return this.UserConfList;
    }

    /**
     * Set <p>User Configuration List</p>
     * @param UserConfList <p>User Configuration List</p>
     */
    public void setUserConfList(UserConfSyncStatus [] UserConfList) {
        this.UserConfList = UserConfList;
    }

    public BaselineSyncConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineSyncConf(BaselineSyncConf source) {
        if (source.AutoSync != null) {
            this.AutoSync = new Boolean(source.AutoSync);
        }
        if (source.TargetAppidList != null) {
            this.TargetAppidList = new Long[source.TargetAppidList.length];
            for (int i = 0; i < source.TargetAppidList.length; i++) {
                this.TargetAppidList[i] = new Long(source.TargetAppidList[i]);
            }
        }
        if (source.UserConfList != null) {
            this.UserConfList = new UserConfSyncStatus[source.UserConfList.length];
            for (int i = 0; i < source.UserConfList.length; i++) {
                this.UserConfList[i] = new UserConfSyncStatus(source.UserConfList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSync", this.AutoSync);
        this.setParamArraySimple(map, prefix + "TargetAppidList.", this.TargetAppidList);
        this.setParamArrayObj(map, prefix + "UserConfList.", this.UserConfList);

    }
}

