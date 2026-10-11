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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGroupInfo extends AbstractModel {

    /**
    * <p>Resource group ID</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>Resource group name.</p>
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>Resource group status</p><p>Parameter format: 0 // not specified 1 // to be created 2 // creating 3 // running 4 // stopped 5 // stopping 6 // starting 7 // updating 8 // deleting 9 // deleted 10 // user proactive start / automatic startup (task submitted and auto start/stop enabled) 11 // available: unique to data computing 12 // unavailable: unique to data computing 13 // failure</p>
    */
    @SerializedName("ResourceGroupStatus")
    @Expose
    private String ResourceGroupStatus;

    /**
     * Get <p>Resource group ID</p> 
     * @return ResourceGroupId <p>Resource group ID</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>Resource group ID</p>
     * @param ResourceGroupId <p>Resource group ID</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>Resource group name.</p> 
     * @return ResourceGroupName <p>Resource group name.</p>
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>Resource group name.</p>
     * @param ResourceGroupName <p>Resource group name.</p>
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>Resource group status</p><p>Parameter format: 0 // not specified 1 // to be created 2 // creating 3 // running 4 // stopped 5 // stopping 6 // starting 7 // updating 8 // deleting 9 // deleted 10 // user proactive start / automatic startup (task submitted and auto start/stop enabled) 11 // available: unique to data computing 12 // unavailable: unique to data computing 13 // failure</p> 
     * @return ResourceGroupStatus <p>Resource group status</p><p>Parameter format: 0 // not specified 1 // to be created 2 // creating 3 // running 4 // stopped 5 // stopping 6 // starting 7 // updating 8 // deleting 9 // deleted 10 // user proactive start / automatic startup (task submitted and auto start/stop enabled) 11 // available: unique to data computing 12 // unavailable: unique to data computing 13 // failure</p>
     */
    public String getResourceGroupStatus() {
        return this.ResourceGroupStatus;
    }

    /**
     * Set <p>Resource group status</p><p>Parameter format: 0 // not specified 1 // to be created 2 // creating 3 // running 4 // stopped 5 // stopping 6 // starting 7 // updating 8 // deleting 9 // deleted 10 // user proactive start / automatic startup (task submitted and auto start/stop enabled) 11 // available: unique to data computing 12 // unavailable: unique to data computing 13 // failure</p>
     * @param ResourceGroupStatus <p>Resource group status</p><p>Parameter format: 0 // not specified 1 // to be created 2 // creating 3 // running 4 // stopped 5 // stopping 6 // starting 7 // updating 8 // deleting 9 // deleted 10 // user proactive start / automatic startup (task submitted and auto start/stop enabled) 11 // available: unique to data computing 12 // unavailable: unique to data computing 13 // failure</p>
     */
    public void setResourceGroupStatus(String ResourceGroupStatus) {
        this.ResourceGroupStatus = ResourceGroupStatus;
    }

    public ResourceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGroupInfo(ResourceGroupInfo source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.ResourceGroupStatus != null) {
            this.ResourceGroupStatus = new String(source.ResourceGroupStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "ResourceGroupStatus", this.ResourceGroupStatus);

    }
}

