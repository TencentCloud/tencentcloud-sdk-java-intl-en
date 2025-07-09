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

public class DescribeOutputRTPSettings extends AbstractModel {

    /**
    * Destination address information list of RTP push.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Destinations")
    @Expose
    private RTPAddressDestination [] Destinations;

    /**
    * Whether it is FEC.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FEC")
    @Expose
    private String FEC;

    /**
    * Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get Destination address information list of RTP push.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Destinations Destination address information list of RTP push.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RTPAddressDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Destination address information list of RTP push.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Destinations Destination address information list of RTP push.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDestinations(RTPAddressDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get Whether it is FEC.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FEC Whether it is FEC.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFEC() {
        return this.FEC;
    }

    /**
     * Set Whether it is FEC.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FEC Whether it is FEC.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFEC(String FEC) {
        this.FEC = FEC;
    }

    /**
     * Get Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IdleTimeout Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IdleTimeout Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public DescribeOutputRTPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRTPSettings(DescribeOutputRTPSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new RTPAddressDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new RTPAddressDestination(source.Destinations[i]);
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

