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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchItem extends AbstractModel {

    /**
    * Log switch
    */
    @SerializedName("ClsStatus")
    @Expose
    private String ClsStatus;

    /**
    * WAF Switch
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Traffic mode
    */
    @SerializedName("FlowMode")
    @Expose
    private String FlowMode;

    /**
     * Get Log switch 
     * @return ClsStatus Log switch
     */
    public String getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set Log switch
     * @param ClsStatus Log switch
     */
    public void setClsStatus(String ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get WAF Switch 
     * @return Status WAF Switch
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set WAF Switch
     * @param Status WAF Switch
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Traffic mode 
     * @return FlowMode Traffic mode
     */
    public String getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set Traffic mode
     * @param FlowMode Traffic mode
     */
    public void setFlowMode(String FlowMode) {
        this.FlowMode = FlowMode;
    }

    public SearchItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchItem(SearchItem source) {
        if (source.ClsStatus != null) {
            this.ClsStatus = new String(source.ClsStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new String(source.FlowMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);

    }
}

