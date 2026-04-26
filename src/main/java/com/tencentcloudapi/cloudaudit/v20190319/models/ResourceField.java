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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceField extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 
    */
    @SerializedName("EventNames")
    @Expose
    private String [] EventNames;

    /**
     * Get  
     * @return ResourceType 
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 
     * @param ResourceType 
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get  
     * @return ActionType 
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 
     * @param ActionType 
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get  
     * @return EventNames 
     */
    public String [] getEventNames() {
        return this.EventNames;
    }

    /**
     * Set 
     * @param EventNames 
     */
    public void setEventNames(String [] EventNames) {
        this.EventNames = EventNames;
    }

    public ResourceField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceField(ResourceField source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.EventNames != null) {
            this.EventNames = new String[source.EventNames.length];
            for (int i = 0; i < source.EventNames.length; i++) {
                this.EventNames[i] = new String(source.EventNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamArraySimple(map, prefix + "EventNames.", this.EventNames);

    }
}

