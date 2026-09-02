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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentRunPolicyRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Custom running policy (CPU/Memory/NetworkPps). No modification if not passed in</p>
    */
    @SerializedName("CustomPolicy")
    @Expose
    private CustomAgentRunModePolicy CustomPolicy;

    /**
    * <p>Advanced mode machine instance_id list, automatically convert to quuid for storage in the backend</p>
    */
    @SerializedName("AdvanceModeInstanceIDs")
    @Expose
    private String [] AdvanceModeInstanceIDs;

    /**
    * <p>List of instance_id in custom mode machines, automatically convert to quuid for storage by the backend</p>
    */
    @SerializedName("CustomModeInstanceIDs")
    @Expose
    private String [] CustomModeInstanceIDs;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Custom running policy (CPU/Memory/NetworkPps). No modification if not passed in</p> 
     * @return CustomPolicy <p>Custom running policy (CPU/Memory/NetworkPps). No modification if not passed in</p>
     */
    public CustomAgentRunModePolicy getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set <p>Custom running policy (CPU/Memory/NetworkPps). No modification if not passed in</p>
     * @param CustomPolicy <p>Custom running policy (CPU/Memory/NetworkPps). No modification if not passed in</p>
     */
    public void setCustomPolicy(CustomAgentRunModePolicy CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    /**
     * Get <p>Advanced mode machine instance_id list, automatically convert to quuid for storage in the backend</p> 
     * @return AdvanceModeInstanceIDs <p>Advanced mode machine instance_id list, automatically convert to quuid for storage in the backend</p>
     */
    public String [] getAdvanceModeInstanceIDs() {
        return this.AdvanceModeInstanceIDs;
    }

    /**
     * Set <p>Advanced mode machine instance_id list, automatically convert to quuid for storage in the backend</p>
     * @param AdvanceModeInstanceIDs <p>Advanced mode machine instance_id list, automatically convert to quuid for storage in the backend</p>
     */
    public void setAdvanceModeInstanceIDs(String [] AdvanceModeInstanceIDs) {
        this.AdvanceModeInstanceIDs = AdvanceModeInstanceIDs;
    }

    /**
     * Get <p>List of instance_id in custom mode machines, automatically convert to quuid for storage by the backend</p> 
     * @return CustomModeInstanceIDs <p>List of instance_id in custom mode machines, automatically convert to quuid for storage by the backend</p>
     */
    public String [] getCustomModeInstanceIDs() {
        return this.CustomModeInstanceIDs;
    }

    /**
     * Set <p>List of instance_id in custom mode machines, automatically convert to quuid for storage by the backend</p>
     * @param CustomModeInstanceIDs <p>List of instance_id in custom mode machines, automatically convert to quuid for storage by the backend</p>
     */
    public void setCustomModeInstanceIDs(String [] CustomModeInstanceIDs) {
        this.CustomModeInstanceIDs = CustomModeInstanceIDs;
    }

    public ModifyAgentRunPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRunPolicyRequest(ModifyAgentRunPolicyRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new CustomAgentRunModePolicy(source.CustomPolicy);
        }
        if (source.AdvanceModeInstanceIDs != null) {
            this.AdvanceModeInstanceIDs = new String[source.AdvanceModeInstanceIDs.length];
            for (int i = 0; i < source.AdvanceModeInstanceIDs.length; i++) {
                this.AdvanceModeInstanceIDs[i] = new String(source.AdvanceModeInstanceIDs[i]);
            }
        }
        if (source.CustomModeInstanceIDs != null) {
            this.CustomModeInstanceIDs = new String[source.CustomModeInstanceIDs.length];
            for (int i = 0; i < source.CustomModeInstanceIDs.length; i++) {
                this.CustomModeInstanceIDs[i] = new String(source.CustomModeInstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "CustomPolicy.", this.CustomPolicy);
        this.setParamArraySimple(map, prefix + "AdvanceModeInstanceIDs.", this.AdvanceModeInstanceIDs);
        this.setParamArraySimple(map, prefix + "CustomModeInstanceIDs.", this.CustomModeInstanceIDs);

    }
}

