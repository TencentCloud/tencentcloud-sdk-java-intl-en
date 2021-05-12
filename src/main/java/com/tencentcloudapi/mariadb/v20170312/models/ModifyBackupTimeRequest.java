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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupTimeRequest extends AbstractModel{

    /**
    * Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time of daily backup window in the format of `mm:ss`, such as 22:00
    */
    @SerializedName("StartBackupTime")
    @Expose
    private String StartBackupTime;

    /**
    * End time of daily backup window in the format of `mm:ss`, such as 23:59
    */
    @SerializedName("EndBackupTime")
    @Expose
    private String EndBackupTime;

    /**
     * Get Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API. 
     * @return InstanceId Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     * @param InstanceId Instance ID, which is in the format of `tdsql-ow728lmc` and can be obtained through the `DescribeDBInstances` API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time of daily backup window in the format of `mm:ss`, such as 22:00 
     * @return StartBackupTime Start time of daily backup window in the format of `mm:ss`, such as 22:00
     */
    public String getStartBackupTime() {
        return this.StartBackupTime;
    }

    /**
     * Set Start time of daily backup window in the format of `mm:ss`, such as 22:00
     * @param StartBackupTime Start time of daily backup window in the format of `mm:ss`, such as 22:00
     */
    public void setStartBackupTime(String StartBackupTime) {
        this.StartBackupTime = StartBackupTime;
    }

    /**
     * Get End time of daily backup window in the format of `mm:ss`, such as 23:59 
     * @return EndBackupTime End time of daily backup window in the format of `mm:ss`, such as 23:59
     */
    public String getEndBackupTime() {
        return this.EndBackupTime;
    }

    /**
     * Set End time of daily backup window in the format of `mm:ss`, such as 23:59
     * @param EndBackupTime End time of daily backup window in the format of `mm:ss`, such as 23:59
     */
    public void setEndBackupTime(String EndBackupTime) {
        this.EndBackupTime = EndBackupTime;
    }

    public ModifyBackupTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupTimeRequest(ModifyBackupTimeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartBackupTime != null) {
            this.StartBackupTime = new String(source.StartBackupTime);
        }
        if (source.EndBackupTime != null) {
            this.EndBackupTime = new String(source.EndBackupTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartBackupTime", this.StartBackupTime);
        this.setParamSimple(map, prefix + "EndBackupTime", this.EndBackupTime);

    }
}

