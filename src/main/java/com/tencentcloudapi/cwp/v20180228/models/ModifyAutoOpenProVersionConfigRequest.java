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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoOpenProVersionConfigRequest extends AbstractModel {

    /**
    * Set the auto-activation status.
<li>CLOSE: off</li>
<li>OPEN: on</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Automatic purchase/expansion authorization switch, 1 by default, 0 for OFF, 1 for ON.
    */
    @SerializedName("AutoRepurchaseSwitch")
    @Expose
    private Long AutoRepurchaseSwitch;

    /**
    * Auto-renewal or not for auto-purchased orders, 0 by default, 0 for OFF, 1 for ON
    */
    @SerializedName("AutoRepurchaseRenewSwitch")
    @Expose
    private Long AutoRepurchaseRenewSwitch;

    /**
    * Whether the manually purchased order is automatically renewed (defaults to 0): 0 - off; 1 - on
    */
    @SerializedName("RepurchaseRenewSwitch")
    @Expose
    private Long RepurchaseRenewSwitch;

    /**
     * Get Set the auto-activation status.
<li>CLOSE: off</li>
<li>OPEN: on</li> 
     * @return Status Set the auto-activation status.
<li>CLOSE: off</li>
<li>OPEN: on</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Set the auto-activation status.
<li>CLOSE: off</li>
<li>OPEN: on</li>
     * @param Status Set the auto-activation status.
<li>CLOSE: off</li>
<li>OPEN: on</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Automatic purchase/expansion authorization switch, 1 by default, 0 for OFF, 1 for ON. 
     * @return AutoRepurchaseSwitch Automatic purchase/expansion authorization switch, 1 by default, 0 for OFF, 1 for ON.
     */
    public Long getAutoRepurchaseSwitch() {
        return this.AutoRepurchaseSwitch;
    }

    /**
     * Set Automatic purchase/expansion authorization switch, 1 by default, 0 for OFF, 1 for ON.
     * @param AutoRepurchaseSwitch Automatic purchase/expansion authorization switch, 1 by default, 0 for OFF, 1 for ON.
     */
    public void setAutoRepurchaseSwitch(Long AutoRepurchaseSwitch) {
        this.AutoRepurchaseSwitch = AutoRepurchaseSwitch;
    }

    /**
     * Get Auto-renewal or not for auto-purchased orders, 0 by default, 0 for OFF, 1 for ON 
     * @return AutoRepurchaseRenewSwitch Auto-renewal or not for auto-purchased orders, 0 by default, 0 for OFF, 1 for ON
     */
    public Long getAutoRepurchaseRenewSwitch() {
        return this.AutoRepurchaseRenewSwitch;
    }

    /**
     * Set Auto-renewal or not for auto-purchased orders, 0 by default, 0 for OFF, 1 for ON
     * @param AutoRepurchaseRenewSwitch Auto-renewal or not for auto-purchased orders, 0 by default, 0 for OFF, 1 for ON
     */
    public void setAutoRepurchaseRenewSwitch(Long AutoRepurchaseRenewSwitch) {
        this.AutoRepurchaseRenewSwitch = AutoRepurchaseRenewSwitch;
    }

    /**
     * Get Whether the manually purchased order is automatically renewed (defaults to 0): 0 - off; 1 - on 
     * @return RepurchaseRenewSwitch Whether the manually purchased order is automatically renewed (defaults to 0): 0 - off; 1 - on
     */
    public Long getRepurchaseRenewSwitch() {
        return this.RepurchaseRenewSwitch;
    }

    /**
     * Set Whether the manually purchased order is automatically renewed (defaults to 0): 0 - off; 1 - on
     * @param RepurchaseRenewSwitch Whether the manually purchased order is automatically renewed (defaults to 0): 0 - off; 1 - on
     */
    public void setRepurchaseRenewSwitch(Long RepurchaseRenewSwitch) {
        this.RepurchaseRenewSwitch = RepurchaseRenewSwitch;
    }

    public ModifyAutoOpenProVersionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoOpenProVersionConfigRequest(ModifyAutoOpenProVersionConfigRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AutoRepurchaseSwitch != null) {
            this.AutoRepurchaseSwitch = new Long(source.AutoRepurchaseSwitch);
        }
        if (source.AutoRepurchaseRenewSwitch != null) {
            this.AutoRepurchaseRenewSwitch = new Long(source.AutoRepurchaseRenewSwitch);
        }
        if (source.RepurchaseRenewSwitch != null) {
            this.RepurchaseRenewSwitch = new Long(source.RepurchaseRenewSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoRepurchaseSwitch", this.AutoRepurchaseSwitch);
        this.setParamSimple(map, prefix + "AutoRepurchaseRenewSwitch", this.AutoRepurchaseRenewSwitch);
        this.setParamSimple(map, prefix + "RepurchaseRenewSwitch", this.RepurchaseRenewSwitch);

    }
}

