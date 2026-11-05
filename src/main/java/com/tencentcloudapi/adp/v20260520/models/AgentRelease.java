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

public class AgentRelease extends AbstractModel {

    /**
    * <p>Name.</p>
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * <p>Update time, unix timestamp in seconds (s)</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Action description.</p>
    */
    @SerializedName("ActionDescription")
    @Expose
    private String ActionDescription;

    /**
    * <p>Change to test</p>
    */
    @SerializedName("ReleaseMessage")
    @Expose
    private String ReleaseMessage;

    /**
     * Get <p>Name.</p> 
     * @return ItemName <p>Name.</p>
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set <p>Name.</p>
     * @param ItemName <p>Name.</p>
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get <p>Update time, unix timestamp in seconds (s)</p> 
     * @return UpdateTime <p>Update time, unix timestamp in seconds (s)</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time, unix timestamp in seconds (s)</p>
     * @param UpdateTime <p>Update time, unix timestamp in seconds (s)</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Action description.</p> 
     * @return ActionDescription <p>Action description.</p>
     */
    public String getActionDescription() {
        return this.ActionDescription;
    }

    /**
     * Set <p>Action description.</p>
     * @param ActionDescription <p>Action description.</p>
     */
    public void setActionDescription(String ActionDescription) {
        this.ActionDescription = ActionDescription;
    }

    /**
     * Get <p>Change to test</p> 
     * @return ReleaseMessage <p>Change to test</p>
     */
    public String getReleaseMessage() {
        return this.ReleaseMessage;
    }

    /**
     * Set <p>Change to test</p>
     * @param ReleaseMessage <p>Change to test</p>
     */
    public void setReleaseMessage(String ReleaseMessage) {
        this.ReleaseMessage = ReleaseMessage;
    }

    public AgentRelease() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentRelease(AgentRelease source) {
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ActionDescription != null) {
            this.ActionDescription = new String(source.ActionDescription);
        }
        if (source.ReleaseMessage != null) {
            this.ReleaseMessage = new String(source.ReleaseMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ActionDescription", this.ActionDescription);
        this.setParamSimple(map, prefix + "ReleaseMessage", this.ReleaseMessage);

    }
}

