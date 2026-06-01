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

public class ModifyLocalBinlogConfigRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Local binlog retention duration. Values for different instances are as follows:
1. The local binlog retention duration (hr) for cloud disk edition instances, dual-node instances, and three-node instances defaults to 120, with a range of 6 - 168.
2. The retention duration of local binlog for disaster recovery instance defaults to 120 hr, with a range of 120 - 168.
3. The retention duration (hr) of local binlog for a single-node cloud disk instance defaults to 120, with a range of 0 - 168.
4. If a dual-node instance or three-node instance has no disaster recovery instance, the retention duration (hr) of local binlog for the primary instance ranges from 6 to 168. If a dual-node instance or three-node instance has a disaster recovery instance, or you want to add a disaster recovery instance to a dual-node instance or three-node instance, to avoid synchronization exception, the retention duration (hr) of local binlog for the primary instance cannot be set to less than 120 hr, ranging from 120 to 168.
    */
    @SerializedName("SaveHours")
    @Expose
    private Long SaveHours;

    /**
    * Local binlog space utilization. Valid values: [30,50].
    */
    @SerializedName("MaxUsage")
    @Expose
    private Long MaxUsage;

    /**
     * Get Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. 
     * @return InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     * @param InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Local binlog retention duration. Values for different instances are as follows:
1. The local binlog retention duration (hr) for cloud disk edition instances, dual-node instances, and three-node instances defaults to 120, with a range of 6 - 168.
2. The retention duration of local binlog for disaster recovery instance defaults to 120 hr, with a range of 120 - 168.
3. The retention duration (hr) of local binlog for a single-node cloud disk instance defaults to 120, with a range of 0 - 168.
4. If a dual-node instance or three-node instance has no disaster recovery instance, the retention duration (hr) of local binlog for the primary instance ranges from 6 to 168. If a dual-node instance or three-node instance has a disaster recovery instance, or you want to add a disaster recovery instance to a dual-node instance or three-node instance, to avoid synchronization exception, the retention duration (hr) of local binlog for the primary instance cannot be set to less than 120 hr, ranging from 120 to 168. 
     * @return SaveHours Local binlog retention duration. Values for different instances are as follows:
1. The local binlog retention duration (hr) for cloud disk edition instances, dual-node instances, and three-node instances defaults to 120, with a range of 6 - 168.
2. The retention duration of local binlog for disaster recovery instance defaults to 120 hr, with a range of 120 - 168.
3. The retention duration (hr) of local binlog for a single-node cloud disk instance defaults to 120, with a range of 0 - 168.
4. If a dual-node instance or three-node instance has no disaster recovery instance, the retention duration (hr) of local binlog for the primary instance ranges from 6 to 168. If a dual-node instance or three-node instance has a disaster recovery instance, or you want to add a disaster recovery instance to a dual-node instance or three-node instance, to avoid synchronization exception, the retention duration (hr) of local binlog for the primary instance cannot be set to less than 120 hr, ranging from 120 to 168.
     */
    public Long getSaveHours() {
        return this.SaveHours;
    }

    /**
     * Set Local binlog retention duration. Values for different instances are as follows:
1. The local binlog retention duration (hr) for cloud disk edition instances, dual-node instances, and three-node instances defaults to 120, with a range of 6 - 168.
2. The retention duration of local binlog for disaster recovery instance defaults to 120 hr, with a range of 120 - 168.
3. The retention duration (hr) of local binlog for a single-node cloud disk instance defaults to 120, with a range of 0 - 168.
4. If a dual-node instance or three-node instance has no disaster recovery instance, the retention duration (hr) of local binlog for the primary instance ranges from 6 to 168. If a dual-node instance or three-node instance has a disaster recovery instance, or you want to add a disaster recovery instance to a dual-node instance or three-node instance, to avoid synchronization exception, the retention duration (hr) of local binlog for the primary instance cannot be set to less than 120 hr, ranging from 120 to 168.
     * @param SaveHours Local binlog retention duration. Values for different instances are as follows:
1. The local binlog retention duration (hr) for cloud disk edition instances, dual-node instances, and three-node instances defaults to 120, with a range of 6 - 168.
2. The retention duration of local binlog for disaster recovery instance defaults to 120 hr, with a range of 120 - 168.
3. The retention duration (hr) of local binlog for a single-node cloud disk instance defaults to 120, with a range of 0 - 168.
4. If a dual-node instance or three-node instance has no disaster recovery instance, the retention duration (hr) of local binlog for the primary instance ranges from 6 to 168. If a dual-node instance or three-node instance has a disaster recovery instance, or you want to add a disaster recovery instance to a dual-node instance or three-node instance, to avoid synchronization exception, the retention duration (hr) of local binlog for the primary instance cannot be set to less than 120 hr, ranging from 120 to 168.
     */
    public void setSaveHours(Long SaveHours) {
        this.SaveHours = SaveHours;
    }

    /**
     * Get Local binlog space utilization. Valid values: [30,50]. 
     * @return MaxUsage Local binlog space utilization. Valid values: [30,50].
     */
    public Long getMaxUsage() {
        return this.MaxUsage;
    }

    /**
     * Set Local binlog space utilization. Valid values: [30,50].
     * @param MaxUsage Local binlog space utilization. Valid values: [30,50].
     */
    public void setMaxUsage(Long MaxUsage) {
        this.MaxUsage = MaxUsage;
    }

    public ModifyLocalBinlogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLocalBinlogConfigRequest(ModifyLocalBinlogConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SaveHours != null) {
            this.SaveHours = new Long(source.SaveHours);
        }
        if (source.MaxUsage != null) {
            this.MaxUsage = new Long(source.MaxUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SaveHours", this.SaveHours);
        this.setParamSimple(map, prefix + "MaxUsage", this.MaxUsage);

    }
}

