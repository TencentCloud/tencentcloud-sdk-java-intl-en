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

public class DescribeRollbackRangeTimeRequest extends AbstractModel {

    /**
    * Instance ID list. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether the clone instance and the source instance are in the same AZ. Valid values: `true` (yes), `false` (no).
    */
    @SerializedName("IsRemoteZone")
    @Expose
    private String IsRemoteZone;

    /**
    * The region of the clone instance, such as `ap-guangzhou`.
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
     * Get Instance ID list. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceIds Instance ID list. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceIds Instance ID list. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Whether the clone instance and the source instance are in the same AZ. Valid values: `true` (yes), `false` (no). 
     * @return IsRemoteZone Whether the clone instance and the source instance are in the same AZ. Valid values: `true` (yes), `false` (no).
     */
    public String getIsRemoteZone() {
        return this.IsRemoteZone;
    }

    /**
     * Set Whether the clone instance and the source instance are in the same AZ. Valid values: `true` (yes), `false` (no).
     * @param IsRemoteZone Whether the clone instance and the source instance are in the same AZ. Valid values: `true` (yes), `false` (no).
     */
    public void setIsRemoteZone(String IsRemoteZone) {
        this.IsRemoteZone = IsRemoteZone;
    }

    /**
     * Get The region of the clone instance, such as `ap-guangzhou`. 
     * @return BackupRegion The region of the clone instance, such as `ap-guangzhou`.
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set The region of the clone instance, such as `ap-guangzhou`.
     * @param BackupRegion The region of the clone instance, such as `ap-guangzhou`.
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
    }

    public DescribeRollbackRangeTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackRangeTimeRequest(DescribeRollbackRangeTimeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.IsRemoteZone != null) {
            this.IsRemoteZone = new String(source.IsRemoteZone);
        }
        if (source.BackupRegion != null) {
            this.BackupRegion = new String(source.BackupRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "IsRemoteZone", this.IsRemoteZone);
        this.setParamSimple(map, prefix + "BackupRegion", this.BackupRegion);

    }
}

