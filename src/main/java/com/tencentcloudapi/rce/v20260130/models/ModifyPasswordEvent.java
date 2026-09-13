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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPasswordEvent extends AbstractModel {

    /**
    * <p>The reason why the password was updated</p><p>Enumeration value:</p><ul><li>user_modify: User self-initiated modification</li><li>forgot_password: Forget password</li><li>forced_reset: System forcing reset</li></ul>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The reason why the password was updated</p><p>Enumeration value:</p><ul><li>user_modify: User self-initiated modification</li><li>forgot_password: Forget password</li><li>forced_reset: System forcing reset</li></ul> 
     * @return Reason <p>The reason why the password was updated</p><p>Enumeration value:</p><ul><li>user_modify: User self-initiated modification</li><li>forgot_password: Forget password</li><li>forced_reset: System forcing reset</li></ul>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>The reason why the password was updated</p><p>Enumeration value:</p><ul><li>user_modify: User self-initiated modification</li><li>forgot_password: Forget password</li><li>forced_reset: System forcing reset</li></ul>
     * @param Reason <p>The reason why the password was updated</p><p>Enumeration value:</p><ul><li>user_modify: User self-initiated modification</li><li>forgot_password: Forget password</li><li>forced_reset: System forcing reset</li></ul>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public ModifyPasswordEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPasswordEvent(ModifyPasswordEvent source) {
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

