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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodLimitsByType extends AbstractModel {

    /**
    * The number of Pods supported by a TKE shared ENI in non-static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TKERouteENINonStaticIP")
    @Expose
    private Long TKERouteENINonStaticIP;

    /**
    * The number of Pods supported by a TKE shared ENI in static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TKERouteENIStaticIP")
    @Expose
    private Long TKERouteENIStaticIP;

    /**
    * The number of Pods supported by TKE independent ENI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TKEDirectENI")
    @Expose
    private Long TKEDirectENI;

    /**
    * Number of Pods supported by TKE relay network card mode
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("TKESubENI")
    @Expose
    private Long TKESubENI;

    /**
     * Get The number of Pods supported by a TKE shared ENI in non-static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return TKERouteENINonStaticIP The number of Pods supported by a TKE shared ENI in non-static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTKERouteENINonStaticIP() {
        return this.TKERouteENINonStaticIP;
    }

    /**
     * Set The number of Pods supported by a TKE shared ENI in non-static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param TKERouteENINonStaticIP The number of Pods supported by a TKE shared ENI in non-static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTKERouteENINonStaticIP(Long TKERouteENINonStaticIP) {
        this.TKERouteENINonStaticIP = TKERouteENINonStaticIP;
    }

    /**
     * Get The number of Pods supported by a TKE shared ENI in static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return TKERouteENIStaticIP The number of Pods supported by a TKE shared ENI in static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTKERouteENIStaticIP() {
        return this.TKERouteENIStaticIP;
    }

    /**
     * Set The number of Pods supported by a TKE shared ENI in static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param TKERouteENIStaticIP The number of Pods supported by a TKE shared ENI in static IP address mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTKERouteENIStaticIP(Long TKERouteENIStaticIP) {
        this.TKERouteENIStaticIP = TKERouteENIStaticIP;
    }

    /**
     * Get The number of Pods supported by TKE independent ENI mode
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return TKEDirectENI The number of Pods supported by TKE independent ENI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getTKEDirectENI() {
        return this.TKEDirectENI;
    }

    /**
     * Set The number of Pods supported by TKE independent ENI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param TKEDirectENI The number of Pods supported by TKE independent ENI mode
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTKEDirectENI(Long TKEDirectENI) {
        this.TKEDirectENI = TKEDirectENI;
    }

    /**
     * Get Number of Pods supported by TKE relay network card mode
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return TKESubENI Number of Pods supported by TKE relay network card mode
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getTKESubENI() {
        return this.TKESubENI;
    }

    /**
     * Set Number of Pods supported by TKE relay network card mode
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param TKESubENI Number of Pods supported by TKE relay network card mode
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setTKESubENI(Long TKESubENI) {
        this.TKESubENI = TKESubENI;
    }

    public PodLimitsByType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodLimitsByType(PodLimitsByType source) {
        if (source.TKERouteENINonStaticIP != null) {
            this.TKERouteENINonStaticIP = new Long(source.TKERouteENINonStaticIP);
        }
        if (source.TKERouteENIStaticIP != null) {
            this.TKERouteENIStaticIP = new Long(source.TKERouteENIStaticIP);
        }
        if (source.TKEDirectENI != null) {
            this.TKEDirectENI = new Long(source.TKEDirectENI);
        }
        if (source.TKESubENI != null) {
            this.TKESubENI = new Long(source.TKESubENI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TKERouteENINonStaticIP", this.TKERouteENINonStaticIP);
        this.setParamSimple(map, prefix + "TKERouteENIStaticIP", this.TKERouteENIStaticIP);
        this.setParamSimple(map, prefix + "TKEDirectENI", this.TKEDirectENI);
        this.setParamSimple(map, prefix + "TKESubENI", this.TKESubENI);

    }
}

