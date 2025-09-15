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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalConfigRequest extends AbstractModel {

    /**
    * English ID of the EMR cluster.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * List of modified configurations. Key values have a one-to-one correspondence with the output parameters of the `DescribeGlobalConfig` API and are case-insensitive (if an error occurs indicating the key cannot be found, refer to the output parameters). The values are:
1. enableResourceSchedule: Enables or disables resource scheduling. When disabling, a synchronous operation option (sync) is available with values true or false.
2. scheduler type: scheduler.
2. enableLabel: Enables or disables tags, with values true or false.
2. tag directory: labelDir.
3. whether to overwrite the user-specified queue, with values true or false.
4. userMaxAppsDefault: program upper limit.
5. dynamic configuration item: Corresponds to the Name field in the DefaultSettings object returned by the DescribeGlobalConfig API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, a full transmission is required to perform overwriting.
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
     * Get English ID of the EMR cluster. 
     * @return InstanceId English ID of the EMR cluster.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set English ID of the EMR cluster.
     * @param InstanceId English ID of the EMR cluster.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get List of modified configurations. Key values have a one-to-one correspondence with the output parameters of the `DescribeGlobalConfig` API and are case-insensitive (if an error occurs indicating the key cannot be found, refer to the output parameters). The values are:
1. enableResourceSchedule: Enables or disables resource scheduling. When disabling, a synchronous operation option (sync) is available with values true or false.
2. scheduler type: scheduler.
2. enableLabel: Enables or disables tags, with values true or false.
2. tag directory: labelDir.
3. whether to overwrite the user-specified queue, with values true or false.
4. userMaxAppsDefault: program upper limit.
5. dynamic configuration item: Corresponds to the Name field in the DefaultSettings object returned by the DescribeGlobalConfig API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, a full transmission is required to perform overwriting. 
     * @return Items List of modified configurations. Key values have a one-to-one correspondence with the output parameters of the `DescribeGlobalConfig` API and are case-insensitive (if an error occurs indicating the key cannot be found, refer to the output parameters). The values are:
1. enableResourceSchedule: Enables or disables resource scheduling. When disabling, a synchronous operation option (sync) is available with values true or false.
2. scheduler type: scheduler.
2. enableLabel: Enables or disables tags, with values true or false.
2. tag directory: labelDir.
3. whether to overwrite the user-specified queue, with values true or false.
4. userMaxAppsDefault: program upper limit.
5. dynamic configuration item: Corresponds to the Name field in the DefaultSettings object returned by the DescribeGlobalConfig API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, a full transmission is required to perform overwriting.
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set List of modified configurations. Key values have a one-to-one correspondence with the output parameters of the `DescribeGlobalConfig` API and are case-insensitive (if an error occurs indicating the key cannot be found, refer to the output parameters). The values are:
1. enableResourceSchedule: Enables or disables resource scheduling. When disabling, a synchronous operation option (sync) is available with values true or false.
2. scheduler type: scheduler.
2. enableLabel: Enables or disables tags, with values true or false.
2. tag directory: labelDir.
3. whether to overwrite the user-specified queue, with values true or false.
4. userMaxAppsDefault: program upper limit.
5. dynamic configuration item: Corresponds to the Name field in the DefaultSettings object returned by the DescribeGlobalConfig API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, a full transmission is required to perform overwriting.
     * @param Items List of modified configurations. Key values have a one-to-one correspondence with the output parameters of the `DescribeGlobalConfig` API and are case-insensitive (if an error occurs indicating the key cannot be found, refer to the output parameters). The values are:
1. enableResourceSchedule: Enables or disables resource scheduling. When disabling, a synchronous operation option (sync) is available with values true or false.
2. scheduler type: scheduler.
2. enableLabel: Enables or disables tags, with values true or false.
2. tag directory: labelDir.
3. whether to overwrite the user-specified queue, with values true or false.
4. userMaxAppsDefault: program upper limit.
5. dynamic configuration item: Corresponds to the Name field in the DefaultSettings object returned by the DescribeGlobalConfig API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, a full transmission is required to perform overwriting.
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    public ModifyGlobalConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalConfigRequest(ModifyGlobalConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

