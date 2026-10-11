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
    * List of modified configurations. Key values have a one-to-one correspondence with the response parameters of the `DescribeGlobalConfig` API and are case-insensitive (If an error occurs indicating that the key cannot be found, refer to the response parameters). Valid values:
1. enableResourceSchedule: Whether to enable or disable resource scheduling. When it is disabled, a synchronization option with Key set to sync is available. Valid values: true and false.
2. scheduler: Scheduler type.
2. enableLabel: Whether to enable or disable the tag. Valid values: true and false.
2. labelDir: Tag directory.
3. queueMappingOverride: Whether to overwrite user-specified queue. Valid values: true and false.
4. userMaxAppsDefault: Program upper limit.
5. Dynamic configuration item: Name field in DefaultSettings returned by the `DescribeGlobalConfig` API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, pass all values to overwrite the existing ones.
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
     * Get List of modified configurations. Key values have a one-to-one correspondence with the response parameters of the `DescribeGlobalConfig` API and are case-insensitive (If an error occurs indicating that the key cannot be found, refer to the response parameters). Valid values:
1. enableResourceSchedule: Whether to enable or disable resource scheduling. When it is disabled, a synchronization option with Key set to sync is available. Valid values: true and false.
2. scheduler: Scheduler type.
2. enableLabel: Whether to enable or disable the tag. Valid values: true and false.
2. labelDir: Tag directory.
3. queueMappingOverride: Whether to overwrite user-specified queue. Valid values: true and false.
4. userMaxAppsDefault: Program upper limit.
5. Dynamic configuration item: Name field in DefaultSettings returned by the `DescribeGlobalConfig` API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, pass all values to overwrite the existing ones. 
     * @return Items List of modified configurations. Key values have a one-to-one correspondence with the response parameters of the `DescribeGlobalConfig` API and are case-insensitive (If an error occurs indicating that the key cannot be found, refer to the response parameters). Valid values:
1. enableResourceSchedule: Whether to enable or disable resource scheduling. When it is disabled, a synchronization option with Key set to sync is available. Valid values: true and false.
2. scheduler: Scheduler type.
2. enableLabel: Whether to enable or disable the tag. Valid values: true and false.
2. labelDir: Tag directory.
3. queueMappingOverride: Whether to overwrite user-specified queue. Valid values: true and false.
4. userMaxAppsDefault: Program upper limit.
5. Dynamic configuration item: Name field in DefaultSettings returned by the `DescribeGlobalConfig` API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, pass all values to overwrite the existing ones.
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set List of modified configurations. Key values have a one-to-one correspondence with the response parameters of the `DescribeGlobalConfig` API and are case-insensitive (If an error occurs indicating that the key cannot be found, refer to the response parameters). Valid values:
1. enableResourceSchedule: Whether to enable or disable resource scheduling. When it is disabled, a synchronization option with Key set to sync is available. Valid values: true and false.
2. scheduler: Scheduler type.
2. enableLabel: Whether to enable or disable the tag. Valid values: true and false.
2. labelDir: Tag directory.
3. queueMappingOverride: Whether to overwrite user-specified queue. Valid values: true and false.
4. userMaxAppsDefault: Program upper limit.
5. Dynamic configuration item: Name field in DefaultSettings returned by the `DescribeGlobalConfig` API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, pass all values to overwrite the existing ones.
     * @param Items List of modified configurations. Key values have a one-to-one correspondence with the response parameters of the `DescribeGlobalConfig` API and are case-insensitive (If an error occurs indicating that the key cannot be found, refer to the response parameters). Valid values:
1. enableResourceSchedule: Whether to enable or disable resource scheduling. When it is disabled, a synchronization option with Key set to sync is available. Valid values: true and false.
2. scheduler: Scheduler type.
2. enableLabel: Whether to enable or disable the tag. Valid values: true and false.
2. labelDir: Tag directory.
3. queueMappingOverride: Whether to overwrite user-specified queue. Valid values: true and false.
4. userMaxAppsDefault: Program upper limit.
5. Dynamic configuration item: Name field in DefaultSettings returned by the `DescribeGlobalConfig` API.
The values are strings. For **whether to overwrite the user-specified queue** and **program upper limit**, null in the JSON specifications means clearing the value of this configuration. Individual configuration items can be modified. For **dynamic configurations**, pass all values to overwrite the existing ones.
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

