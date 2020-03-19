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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthAlert extends AbstractModel{

    /**
    * Bandwidth cap configuration switch
on: enabled
off: disabled
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Bandwidth cap threshold (in bps)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BpsThreshold")
    @Expose
    private Long BpsThreshold;

    /**
    * Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CounterMeasure")
    @Expose
    private String CounterMeasure;

    /**
    * The last time the bandwidth cap threshold was triggered
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private String LastTriggerTime;

    /**
     * Get Bandwidth cap configuration switch
on: enabled
off: disabled 
     * @return Switch Bandwidth cap configuration switch
on: enabled
off: disabled
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Bandwidth cap configuration switch
on: enabled
off: disabled
     * @param Switch Bandwidth cap configuration switch
on: enabled
off: disabled
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Bandwidth cap threshold (in bps)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BpsThreshold Bandwidth cap threshold (in bps)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBpsThreshold() {
        return this.BpsThreshold;
    }

    /**
     * Set Bandwidth cap threshold (in bps)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BpsThreshold Bandwidth cap threshold (in bps)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBpsThreshold(Long BpsThreshold) {
        this.BpsThreshold = BpsThreshold;
    }

    /**
     * Get Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CounterMeasure Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCounterMeasure() {
        return this.CounterMeasure;
    }

    /**
     * Set Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CounterMeasure Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCounterMeasure(String CounterMeasure) {
        this.CounterMeasure = CounterMeasure;
    }

    /**
     * Get The last time the bandwidth cap threshold was triggered
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastTriggerTime The last time the bandwidth cap threshold was triggered
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set The last time the bandwidth cap threshold was triggered
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastTriggerTime The last time the bandwidth cap threshold was triggered
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTriggerTime(String LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "BpsThreshold", this.BpsThreshold);
        this.setParamSimple(map, prefix + "CounterMeasure", this.CounterMeasure);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);

    }
}

