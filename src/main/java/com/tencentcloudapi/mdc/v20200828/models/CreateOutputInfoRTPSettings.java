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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputInfoRTPSettings extends AbstractModel {

    /**
    * The relay destination addresses. One or two addresses are allowed.
    */
    @SerializedName("Destinations")
    @Expose
    private CreateOutputRTPSettingsDestinations [] Destinations;

    /**
    * This parameter must be set to `none`.
    */
    @SerializedName("FEC")
    @Expose
    private String FEC;

    /**
    * The timeout period (ms).
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get The relay destination addresses. One or two addresses are allowed. 
     * @return Destinations The relay destination addresses. One or two addresses are allowed.
     */
    public CreateOutputRTPSettingsDestinations [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set The relay destination addresses. One or two addresses are allowed.
     * @param Destinations The relay destination addresses. One or two addresses are allowed.
     */
    public void setDestinations(CreateOutputRTPSettingsDestinations [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get This parameter must be set to `none`. 
     * @return FEC This parameter must be set to `none`.
     */
    public String getFEC() {
        return this.FEC;
    }

    /**
     * Set This parameter must be set to `none`.
     * @param FEC This parameter must be set to `none`.
     */
    public void setFEC(String FEC) {
        this.FEC = FEC;
    }

    /**
     * Get The timeout period (ms). 
     * @return IdleTimeout The timeout period (ms).
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set The timeout period (ms).
     * @param IdleTimeout The timeout period (ms).
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public CreateOutputInfoRTPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputInfoRTPSettings(CreateOutputInfoRTPSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new CreateOutputRTPSettingsDestinations[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new CreateOutputRTPSettingsDestinations(source.Destinations[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "FEC", this.FEC);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);

    }
}

