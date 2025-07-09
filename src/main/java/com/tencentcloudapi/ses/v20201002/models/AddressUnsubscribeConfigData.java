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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressUnsubscribeConfigData extends AbstractModel {

    /**
    * Sender address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Unsubscription link option 0: do not include unsubscription link 1: simplified chinese 2: english 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
    */
    @SerializedName("UnsubscribeConfig")
    @Expose
    private String UnsubscribeConfig;

    /**
    * 0: disabled; 1: enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Sender address. 
     * @return Address Sender address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Sender address.
     * @param Address Sender address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Unsubscription link option 0: do not include unsubscription link 1: simplified chinese 2: english 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 
     * @return UnsubscribeConfig Unsubscription link option 0: do not include unsubscription link 1: simplified chinese 2: english 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     */
    public String getUnsubscribeConfig() {
        return this.UnsubscribeConfig;
    }

    /**
     * Set Unsubscription link option 0: do not include unsubscription link 1: simplified chinese 2: english 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     * @param UnsubscribeConfig Unsubscription link option 0: do not include unsubscription link 1: simplified chinese 2: english 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     */
    public void setUnsubscribeConfig(String UnsubscribeConfig) {
        this.UnsubscribeConfig = UnsubscribeConfig;
    }

    /**
     * Get 0: disabled; 1: enabled. 
     * @return Status 0: disabled; 1: enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: disabled; 1: enabled.
     * @param Status 0: disabled; 1: enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AddressUnsubscribeConfigData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressUnsubscribeConfigData(AddressUnsubscribeConfigData source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.UnsubscribeConfig != null) {
            this.UnsubscribeConfig = new String(source.UnsubscribeConfig);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "UnsubscribeConfig", this.UnsubscribeConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

