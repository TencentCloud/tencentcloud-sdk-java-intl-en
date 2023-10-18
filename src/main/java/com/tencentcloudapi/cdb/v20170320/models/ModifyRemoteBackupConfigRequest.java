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

public class ModifyRemoteBackupConfigRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Remote data backup. Valid values:`off` (disable), `on` (enable).
    */
    @SerializedName("RemoteBackupSave")
    @Expose
    private String RemoteBackupSave;

    /**
    * Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
    */
    @SerializedName("RemoteBinlogSave")
    @Expose
    private String RemoteBinlogSave;

    /**
    * The custom backup region list
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String [] RemoteRegion;

    /**
    * Remote backup retention period in days
    */
    @SerializedName("ExpireDays")
    @Expose
    private Long ExpireDays;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Remote data backup. Valid values:`off` (disable), `on` (enable). 
     * @return RemoteBackupSave Remote data backup. Valid values:`off` (disable), `on` (enable).
     */
    public String getRemoteBackupSave() {
        return this.RemoteBackupSave;
    }

    /**
     * Set Remote data backup. Valid values:`off` (disable), `on` (enable).
     * @param RemoteBackupSave Remote data backup. Valid values:`off` (disable), `on` (enable).
     */
    public void setRemoteBackupSave(String RemoteBackupSave) {
        this.RemoteBackupSave = RemoteBackupSave;
    }

    /**
     * Get Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`. 
     * @return RemoteBinlogSave Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
     */
    public String getRemoteBinlogSave() {
        return this.RemoteBinlogSave;
    }

    /**
     * Set Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
     * @param RemoteBinlogSave Remote log backup. Valid values: `off` (disable), `on` (enable). Only when the parameter `RemoteBackupSave` is `on`, the `RemoteBinlogSave` parameter can be set to `on`.
     */
    public void setRemoteBinlogSave(String RemoteBinlogSave) {
        this.RemoteBinlogSave = RemoteBinlogSave;
    }

    /**
     * Get The custom backup region list 
     * @return RemoteRegion The custom backup region list
     */
    public String [] getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set The custom backup region list
     * @param RemoteRegion The custom backup region list
     */
    public void setRemoteRegion(String [] RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
    }

    /**
     * Get Remote backup retention period in days 
     * @return ExpireDays Remote backup retention period in days
     */
    public Long getExpireDays() {
        return this.ExpireDays;
    }

    /**
     * Set Remote backup retention period in days
     * @param ExpireDays Remote backup retention period in days
     */
    public void setExpireDays(Long ExpireDays) {
        this.ExpireDays = ExpireDays;
    }

    public ModifyRemoteBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRemoteBackupConfigRequest(ModifyRemoteBackupConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RemoteBackupSave != null) {
            this.RemoteBackupSave = new String(source.RemoteBackupSave);
        }
        if (source.RemoteBinlogSave != null) {
            this.RemoteBinlogSave = new String(source.RemoteBinlogSave);
        }
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String[source.RemoteRegion.length];
            for (int i = 0; i < source.RemoteRegion.length; i++) {
                this.RemoteRegion[i] = new String(source.RemoteRegion[i]);
            }
        }
        if (source.ExpireDays != null) {
            this.ExpireDays = new Long(source.ExpireDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RemoteBackupSave", this.RemoteBackupSave);
        this.setParamSimple(map, prefix + "RemoteBinlogSave", this.RemoteBinlogSave);
        this.setParamArraySimple(map, prefix + "RemoteRegion.", this.RemoteRegion);
        this.setParamSimple(map, prefix + "ExpireDays", this.ExpireDays);

    }
}

