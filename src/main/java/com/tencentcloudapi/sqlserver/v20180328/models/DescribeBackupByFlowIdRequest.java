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

public class DescribeBackupByFlowIdRequest extends AbstractModel {

    /**
    * Instance ID, in the format of mssql-3l3fgqn7.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup creation process ID, which can be obtained through the [CreateBackup](https://cloud.tencent.com/document/product/238/19946) API.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
     * Get Instance ID, in the format of mssql-3l3fgqn7. 
     * @return InstanceId Instance ID, in the format of mssql-3l3fgqn7.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of mssql-3l3fgqn7.
     * @param InstanceId Instance ID, in the format of mssql-3l3fgqn7.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup creation process ID, which can be obtained through the [CreateBackup](https://cloud.tencent.com/document/product/238/19946) API. 
     * @return FlowId Backup creation process ID, which can be obtained through the [CreateBackup](https://cloud.tencent.com/document/product/238/19946) API.
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Backup creation process ID, which can be obtained through the [CreateBackup](https://cloud.tencent.com/document/product/238/19946) API.
     * @param FlowId Backup creation process ID, which can be obtained through the [CreateBackup](https://cloud.tencent.com/document/product/238/19946) API.
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    public DescribeBackupByFlowIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupByFlowIdRequest(DescribeBackupByFlowIdRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

