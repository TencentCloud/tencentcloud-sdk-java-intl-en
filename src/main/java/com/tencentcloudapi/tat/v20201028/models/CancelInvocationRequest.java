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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelInvocationRequest extends AbstractModel {

    /**
    * Execution activity ID
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * Instance ID list. A maximum of 100 IDs are allowed. Supported instance types:
<li> `CVM`
<li> `LIGHTHOUSE`
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Execution activity ID 
     * @return InvocationId Execution activity ID
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set Execution activity ID
     * @param InvocationId Execution activity ID
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get Instance ID list. A maximum of 100 IDs are allowed. Supported instance types:
<li> `CVM`
<li> `LIGHTHOUSE` 
     * @return InstanceIds Instance ID list. A maximum of 100 IDs are allowed. Supported instance types:
<li> `CVM`
<li> `LIGHTHOUSE`
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list. A maximum of 100 IDs are allowed. Supported instance types:
<li> `CVM`
<li> `LIGHTHOUSE`
     * @param InstanceIds Instance ID list. A maximum of 100 IDs are allowed. Supported instance types:
<li> `CVM`
<li> `LIGHTHOUSE`
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public CancelInvocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelInvocationRequest(CancelInvocationRequest source) {
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
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
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

