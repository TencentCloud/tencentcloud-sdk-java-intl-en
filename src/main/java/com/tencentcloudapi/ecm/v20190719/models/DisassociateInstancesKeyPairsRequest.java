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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateInstancesKeyPairsRequest extends AbstractModel {

    /**
    * You can get available instance IDs in the following ways:
Log in to the console to query instance IDs.
Get the instance IDs from the `InstanceId` field in the information returned by the `DescribeInstances` API.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * List of key pair IDs. Each request can contain up to 100 key pairs. The key pair ID takes the form of `skey-11112222`.

You can get available key IDs in the following ways:
Log in to the console to query key IDs.
Get the key pair IDs from the `KeyId` field in the information returned by the `DescribeKeyPairs` API.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Whether to force shut down the running instance. We recommend you manually shut down the running instance before unbinding the key. Valid values:
TRUE: yes.
FALSE: no.

Default value: FALSE.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get You can get available instance IDs in the following ways:
Log in to the console to query instance IDs.
Get the instance IDs from the `InstanceId` field in the information returned by the `DescribeInstances` API. 
     * @return InstanceIds You can get available instance IDs in the following ways:
Log in to the console to query instance IDs.
Get the instance IDs from the `InstanceId` field in the information returned by the `DescribeInstances` API.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set You can get available instance IDs in the following ways:
Log in to the console to query instance IDs.
Get the instance IDs from the `InstanceId` field in the information returned by the `DescribeInstances` API.
     * @param InstanceIds You can get available instance IDs in the following ways:
Log in to the console to query instance IDs.
Get the instance IDs from the `InstanceId` field in the information returned by the `DescribeInstances` API.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get List of key pair IDs. Each request can contain up to 100 key pairs. The key pair ID takes the form of `skey-11112222`.

You can get available key IDs in the following ways:
Log in to the console to query key IDs.
Get the key pair IDs from the `KeyId` field in the information returned by the `DescribeKeyPairs` API. 
     * @return KeyIds List of key pair IDs. Each request can contain up to 100 key pairs. The key pair ID takes the form of `skey-11112222`.

You can get available key IDs in the following ways:
Log in to the console to query key IDs.
Get the key pair IDs from the `KeyId` field in the information returned by the `DescribeKeyPairs` API.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set List of key pair IDs. Each request can contain up to 100 key pairs. The key pair ID takes the form of `skey-11112222`.

You can get available key IDs in the following ways:
Log in to the console to query key IDs.
Get the key pair IDs from the `KeyId` field in the information returned by the `DescribeKeyPairs` API.
     * @param KeyIds List of key pair IDs. Each request can contain up to 100 key pairs. The key pair ID takes the form of `skey-11112222`.

You can get available key IDs in the following ways:
Log in to the console to query key IDs.
Get the key pair IDs from the `KeyId` field in the information returned by the `DescribeKeyPairs` API.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get Whether to force shut down the running instance. We recommend you manually shut down the running instance before unbinding the key. Valid values:
TRUE: yes.
FALSE: no.

Default value: FALSE. 
     * @return ForceStop Whether to force shut down the running instance. We recommend you manually shut down the running instance before unbinding the key. Valid values:
TRUE: yes.
FALSE: no.

Default value: FALSE.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set Whether to force shut down the running instance. We recommend you manually shut down the running instance before unbinding the key. Valid values:
TRUE: yes.
FALSE: no.

Default value: FALSE.
     * @param ForceStop Whether to force shut down the running instance. We recommend you manually shut down the running instance before unbinding the key. Valid values:
TRUE: yes.
FALSE: no.

Default value: FALSE.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    public DisassociateInstancesKeyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateInstancesKeyPairsRequest(DisassociateInstancesKeyPairsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

