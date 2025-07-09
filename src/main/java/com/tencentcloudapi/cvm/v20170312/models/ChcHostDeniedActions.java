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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChcHostDeniedActions extends AbstractModel {

    /**
    * CHC instance ID
    */
    @SerializedName("ChcId")
    @Expose
    private String ChcId;

    /**
    * CHC instance status
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Actions not allowed for the current CHC instance
    */
    @SerializedName("DenyActions")
    @Expose
    private String [] DenyActions;

    /**
     * Get CHC instance ID 
     * @return ChcId CHC instance ID
     */
    public String getChcId() {
        return this.ChcId;
    }

    /**
     * Set CHC instance ID
     * @param ChcId CHC instance ID
     */
    public void setChcId(String ChcId) {
        this.ChcId = ChcId;
    }

    /**
     * Get CHC instance status 
     * @return State CHC instance status
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set CHC instance status
     * @param State CHC instance status
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Actions not allowed for the current CHC instance 
     * @return DenyActions Actions not allowed for the current CHC instance
     */
    public String [] getDenyActions() {
        return this.DenyActions;
    }

    /**
     * Set Actions not allowed for the current CHC instance
     * @param DenyActions Actions not allowed for the current CHC instance
     */
    public void setDenyActions(String [] DenyActions) {
        this.DenyActions = DenyActions;
    }

    public ChcHostDeniedActions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChcHostDeniedActions(ChcHostDeniedActions source) {
        if (source.ChcId != null) {
            this.ChcId = new String(source.ChcId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.DenyActions != null) {
            this.DenyActions = new String[source.DenyActions.length];
            for (int i = 0; i < source.DenyActions.length; i++) {
                this.DenyActions[i] = new String(source.DenyActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChcId", this.ChcId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArraySimple(map, prefix + "DenyActions.", this.DenyActions);

    }
}

