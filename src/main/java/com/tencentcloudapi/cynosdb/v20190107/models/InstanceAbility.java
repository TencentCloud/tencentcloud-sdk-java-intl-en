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

public class InstanceAbility extends AbstractModel {

    /**
    * Specifies whether the instance supports forced reboot. valid values: yes (supported), no (unsupported).
    */
    @SerializedName("IsSupportForceRestart")
    @Expose
    private String IsSupportForceRestart;

    /**
    * Specifies the causes for not supporting forced reboot.
    */
    @SerializedName("NonsupportForceRestartReason")
    @Expose
    private String NonsupportForceRestartReason;

    /**
     * Get Specifies whether the instance supports forced reboot. valid values: yes (supported), no (unsupported). 
     * @return IsSupportForceRestart Specifies whether the instance supports forced reboot. valid values: yes (supported), no (unsupported).
     */
    public String getIsSupportForceRestart() {
        return this.IsSupportForceRestart;
    }

    /**
     * Set Specifies whether the instance supports forced reboot. valid values: yes (supported), no (unsupported).
     * @param IsSupportForceRestart Specifies whether the instance supports forced reboot. valid values: yes (supported), no (unsupported).
     */
    public void setIsSupportForceRestart(String IsSupportForceRestart) {
        this.IsSupportForceRestart = IsSupportForceRestart;
    }

    /**
     * Get Specifies the causes for not supporting forced reboot. 
     * @return NonsupportForceRestartReason Specifies the causes for not supporting forced reboot.
     */
    public String getNonsupportForceRestartReason() {
        return this.NonsupportForceRestartReason;
    }

    /**
     * Set Specifies the causes for not supporting forced reboot.
     * @param NonsupportForceRestartReason Specifies the causes for not supporting forced reboot.
     */
    public void setNonsupportForceRestartReason(String NonsupportForceRestartReason) {
        this.NonsupportForceRestartReason = NonsupportForceRestartReason;
    }

    public InstanceAbility() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAbility(InstanceAbility source) {
        if (source.IsSupportForceRestart != null) {
            this.IsSupportForceRestart = new String(source.IsSupportForceRestart);
        }
        if (source.NonsupportForceRestartReason != null) {
            this.NonsupportForceRestartReason = new String(source.NonsupportForceRestartReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportForceRestart", this.IsSupportForceRestart);
        this.setParamSimple(map, prefix + "NonsupportForceRestartReason", this.NonsupportForceRestartReason);

    }
}

