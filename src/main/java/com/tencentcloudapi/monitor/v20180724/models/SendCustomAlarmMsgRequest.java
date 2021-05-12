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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendCustomAlarmMsgRequest extends AbstractModel{

    /**
    * API component name. The value for the current API is monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Message policy ID, which is configured on the custom message page of Cloud Monitor.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Custom message content that a user wants to send.
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
     * Get API component name. The value for the current API is monitor. 
     * @return Module API component name. The value for the current API is monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set API component name. The value for the current API is monitor.
     * @param Module API component name. The value for the current API is monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Message policy ID, which is configured on the custom message page of Cloud Monitor. 
     * @return PolicyId Message policy ID, which is configured on the custom message page of Cloud Monitor.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Message policy ID, which is configured on the custom message page of Cloud Monitor.
     * @param PolicyId Message policy ID, which is configured on the custom message page of Cloud Monitor.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Custom message content that a user wants to send. 
     * @return Msg Custom message content that a user wants to send.
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Custom message content that a user wants to send.
     * @param Msg Custom message content that a user wants to send.
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public SendCustomAlarmMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendCustomAlarmMsgRequest(SendCustomAlarmMsgRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Msg", this.Msg);

    }
}

