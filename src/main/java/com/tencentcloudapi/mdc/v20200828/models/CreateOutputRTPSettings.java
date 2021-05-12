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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputRTPSettings extends AbstractModel{

    /**
    * Push destination address. You can enter one or two addresses.
    */
    @SerializedName("Destinations")
    @Expose
    private CreateOutputRTPSettingsDestinations Destinations;

    /**
    * Only `none` can be entered.
    */
    @SerializedName("FEC")
    @Expose
    private String FEC;

    /**
    * Idle timeout period.
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get Push destination address. You can enter one or two addresses. 
     * @return Destinations Push destination address. You can enter one or two addresses.
     */
    public CreateOutputRTPSettingsDestinations getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Push destination address. You can enter one or two addresses.
     * @param Destinations Push destination address. You can enter one or two addresses.
     */
    public void setDestinations(CreateOutputRTPSettingsDestinations Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get Only `none` can be entered. 
     * @return FEC Only `none` can be entered.
     */
    public String getFEC() {
        return this.FEC;
    }

    /**
     * Set Only `none` can be entered.
     * @param FEC Only `none` can be entered.
     */
    public void setFEC(String FEC) {
        this.FEC = FEC;
    }

    /**
     * Get Idle timeout period. 
     * @return IdleTimeout Idle timeout period.
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set Idle timeout period.
     * @param IdleTimeout Idle timeout period.
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public CreateOutputRTPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputRTPSettings(CreateOutputRTPSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new CreateOutputRTPSettingsDestinations(source.Destinations);
        }
        if (source.FEC != null) {
            this.FEC = new String(source.FEC);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "FEC", this.FEC);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);

    }
}

