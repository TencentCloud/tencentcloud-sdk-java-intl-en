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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IsolateDCDBInstanceRequest extends AbstractModel {

    /**
    * Instance ID in the format of `tdsqlshard-avw0207d`,  which is the same as the instance ID displayed on the TencentDB console and can be queried through the `DescribeDBInstances` API.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Instance ID in the format of `tdsqlshard-avw0207d`,  which is the same as the instance ID displayed on the TencentDB console and can be queried through the `DescribeDBInstances` API. 
     * @return InstanceIds Instance ID in the format of `tdsqlshard-avw0207d`,  which is the same as the instance ID displayed on the TencentDB console and can be queried through the `DescribeDBInstances` API.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID in the format of `tdsqlshard-avw0207d`,  which is the same as the instance ID displayed on the TencentDB console and can be queried through the `DescribeDBInstances` API.
     * @param InstanceIds Instance ID in the format of `tdsqlshard-avw0207d`,  which is the same as the instance ID displayed on the TencentDB console and can be queried through the `DescribeDBInstances` API.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public IsolateDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateDCDBInstanceRequest(IsolateDCDBInstanceRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

