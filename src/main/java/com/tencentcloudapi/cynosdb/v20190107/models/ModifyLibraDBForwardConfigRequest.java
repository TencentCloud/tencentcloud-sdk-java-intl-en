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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraDBForwardConfigRequest extends AbstractModel {

    /**
    * Read-only analysis engine instance Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Forwarding Mode
    */
    @SerializedName("ForwardMode")
    @Expose
    private String ForwardMode;

    /**
    * Forward instance list
    */
    @SerializedName("ForwardList")
    @Expose
    private ForwardInstanceInfo [] ForwardList;

    /**
     * Get Read-only analysis engine instance Id 
     * @return InstanceId Read-only analysis engine instance Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Read-only analysis engine instance Id
     * @param InstanceId Read-only analysis engine instance Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Forwarding Mode 
     * @return ForwardMode Forwarding Mode
     */
    public String getForwardMode() {
        return this.ForwardMode;
    }

    /**
     * Set Forwarding Mode
     * @param ForwardMode Forwarding Mode
     */
    public void setForwardMode(String ForwardMode) {
        this.ForwardMode = ForwardMode;
    }

    /**
     * Get Forward instance list 
     * @return ForwardList Forward instance list
     */
    public ForwardInstanceInfo [] getForwardList() {
        return this.ForwardList;
    }

    /**
     * Set Forward instance list
     * @param ForwardList Forward instance list
     */
    public void setForwardList(ForwardInstanceInfo [] ForwardList) {
        this.ForwardList = ForwardList;
    }

    public ModifyLibraDBForwardConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBForwardConfigRequest(ModifyLibraDBForwardConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ForwardMode != null) {
            this.ForwardMode = new String(source.ForwardMode);
        }
        if (source.ForwardList != null) {
            this.ForwardList = new ForwardInstanceInfo[source.ForwardList.length];
            for (int i = 0; i < source.ForwardList.length; i++) {
                this.ForwardList[i] = new ForwardInstanceInfo(source.ForwardList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForwardMode", this.ForwardMode);
        this.setParamArrayObj(map, prefix + "ForwardList.", this.ForwardList);

    }
}

