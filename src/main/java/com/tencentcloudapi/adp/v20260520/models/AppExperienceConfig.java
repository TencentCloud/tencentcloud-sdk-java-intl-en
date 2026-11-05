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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppExperienceConfig extends AbstractModel {

    /**
    * Advanced configuration
    */
    @SerializedName("Advanced")
    @Expose
    private AppAdvancedConf Advanced;

    /**
    * Dialogue experience configuration
    */
    @SerializedName("Conversation")
    @Expose
    private ConversationExperience Conversation;

    /**
    * Role configuration
    */
    @SerializedName("Role")
    @Expose
    private RoleConfig Role;

    /**
     * Get Advanced configuration 
     * @return Advanced Advanced configuration
     */
    public AppAdvancedConf getAdvanced() {
        return this.Advanced;
    }

    /**
     * Set Advanced configuration
     * @param Advanced Advanced configuration
     */
    public void setAdvanced(AppAdvancedConf Advanced) {
        this.Advanced = Advanced;
    }

    /**
     * Get Dialogue experience configuration 
     * @return Conversation Dialogue experience configuration
     */
    public ConversationExperience getConversation() {
        return this.Conversation;
    }

    /**
     * Set Dialogue experience configuration
     * @param Conversation Dialogue experience configuration
     */
    public void setConversation(ConversationExperience Conversation) {
        this.Conversation = Conversation;
    }

    /**
     * Get Role configuration 
     * @return Role Role configuration
     */
    public RoleConfig getRole() {
        return this.Role;
    }

    /**
     * Set Role configuration
     * @param Role Role configuration
     */
    public void setRole(RoleConfig Role) {
        this.Role = Role;
    }

    public AppExperienceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppExperienceConfig(AppExperienceConfig source) {
        if (source.Advanced != null) {
            this.Advanced = new AppAdvancedConf(source.Advanced);
        }
        if (source.Conversation != null) {
            this.Conversation = new ConversationExperience(source.Conversation);
        }
        if (source.Role != null) {
            this.Role = new RoleConfig(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Advanced.", this.Advanced);
        this.setParamObj(map, prefix + "Conversation.", this.Conversation);
        this.setParamObj(map, prefix + "Role.", this.Role);

    }
}

