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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestIpInfo extends AbstractModel {

    /**
    * Time: s
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Gateway IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GatewayIp")
    @Expose
    private String GatewayIp;

    /**
    * gateway address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GatewaySite")
    @Expose
    private String GatewaySite;

    /**
    * Number of target IPs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * Target IP list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get Time: s 
     * @return Time Time: s
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time: s
     * @param Time Time: s
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Gateway IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GatewayIp Gateway IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGatewayIp() {
        return this.GatewayIp;
    }

    /**
     * Set Gateway IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GatewayIp Gateway IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGatewayIp(String GatewayIp) {
        this.GatewayIp = GatewayIp;
    }

    /**
     * Get gateway address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GatewaySite gateway address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGatewaySite() {
        return this.GatewaySite;
    }

    /**
     * Set gateway address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GatewaySite gateway address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGatewaySite(String GatewaySite) {
        this.GatewaySite = GatewaySite;
    }

    /**
     * Get Number of target IPs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpCount Number of target IPs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set Number of target IPs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpCount Number of target IPs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get Target IP list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpList Target IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set Target IP list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpList Target IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public DestIpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestIpInfo(DestIpInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.GatewayIp != null) {
            this.GatewayIp = new String(source.GatewayIp);
        }
        if (source.GatewaySite != null) {
            this.GatewaySite = new String(source.GatewaySite);
        }
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "GatewayIp", this.GatewayIp);
        this.setParamSimple(map, prefix + "GatewaySite", this.GatewaySite);
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

