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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakPointsItem extends AbstractModel {

    /**
    * Second-level Timestamp
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * QPS
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * Upstream bandwidth peak, unit: B
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * Downstream bandwidth peak, unit: B
    */
    @SerializedName("Down")
    @Expose
    private Long Down;

    /**
    * Web attack count
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * CC attack count
    */
    @SerializedName("Cc")
    @Expose
    private Long Cc;

    /**
    * Bot qps
    */
    @SerializedName("BotAccess")
    @Expose
    private Long BotAccess;

    /**
    * Number of 5xx status codes returned by WAF to client

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusServerError")
    @Expose
    private Long StatusServerError;

    /**
    * Number of times WAF returned 4xx status codes to client

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusClientError")
    @Expose
    private Long StatusClientError;

    /**
    * WAF Returned to Client Status Code 302 Count

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusRedirect")
    @Expose
    private Long StatusRedirect;

    /**
    * Number of Times WAF Returns Status Code 202 to Client

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusOk")
    @Expose
    private Long StatusOk;

    /**
    * Number of Times the Origin Server Returned 5xx Status Codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamServerError")
    @Expose
    private Long UpstreamServerError;

    /**
    * Number of times the origin server returned 4xx status codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamClientError")
    @Expose
    private Long UpstreamClientError;

    /**
    * Number of times the original server returns status code 302 to WAF

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpstreamRedirect")
    @Expose
    private Long UpstreamRedirect;

    /**
    * Blocklist Count

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BlackIP")
    @Expose
    private Long BlackIP;

    /**
    * Tamper-Proof Attempts

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tamper")
    @Expose
    private Long Tamper;

    /**
    * Information Leakage Prevention Count

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Leak")
    @Expose
    private Long Leak;

    /**
    * Access control
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ACL")
    @Expose
    private Long ACL;

    /**
    * Mini Program QPS

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WxAccess")
    @Expose
    private Long WxAccess;

    /**
    * Number of mini program requests
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WxCount")
    @Expose
    private Long WxCount;

    /**
    * Peak upstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WxUp")
    @Expose
    private Long WxUp;

    /**
    * Peak downstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WxDown")
    @Expose
    private Long WxDown;

    /**
     * Get Second-level Timestamp 
     * @return Time Second-level Timestamp
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Second-level Timestamp
     * @param Time Second-level Timestamp
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get QPS 
     * @return Access QPS
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set QPS
     * @param Access QPS
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get Upstream bandwidth peak, unit: B 
     * @return Up Upstream bandwidth peak, unit: B
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set Upstream bandwidth peak, unit: B
     * @param Up Upstream bandwidth peak, unit: B
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    /**
     * Get Downstream bandwidth peak, unit: B 
     * @return Down Downstream bandwidth peak, unit: B
     */
    public Long getDown() {
        return this.Down;
    }

    /**
     * Set Downstream bandwidth peak, unit: B
     * @param Down Downstream bandwidth peak, unit: B
     */
    public void setDown(Long Down) {
        this.Down = Down;
    }

    /**
     * Get Web attack count 
     * @return Attack Web attack count
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Web attack count
     * @param Attack Web attack count
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get CC attack count 
     * @return Cc CC attack count
     */
    public Long getCc() {
        return this.Cc;
    }

    /**
     * Set CC attack count
     * @param Cc CC attack count
     */
    public void setCc(Long Cc) {
        this.Cc = Cc;
    }

    /**
     * Get Bot qps 
     * @return BotAccess Bot qps
     */
    public Long getBotAccess() {
        return this.BotAccess;
    }

    /**
     * Set Bot qps
     * @param BotAccess Bot qps
     */
    public void setBotAccess(Long BotAccess) {
        this.BotAccess = BotAccess;
    }

    /**
     * Get Number of 5xx status codes returned by WAF to client

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusServerError Number of 5xx status codes returned by WAF to client

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatusServerError() {
        return this.StatusServerError;
    }

    /**
     * Set Number of 5xx status codes returned by WAF to client

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusServerError Number of 5xx status codes returned by WAF to client

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusServerError(Long StatusServerError) {
        this.StatusServerError = StatusServerError;
    }

    /**
     * Get Number of times WAF returned 4xx status codes to client

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusClientError Number of times WAF returned 4xx status codes to client

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatusClientError() {
        return this.StatusClientError;
    }

    /**
     * Set Number of times WAF returned 4xx status codes to client

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusClientError Number of times WAF returned 4xx status codes to client

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusClientError(Long StatusClientError) {
        this.StatusClientError = StatusClientError;
    }

    /**
     * Get WAF Returned to Client Status Code 302 Count

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusRedirect WAF Returned to Client Status Code 302 Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatusRedirect() {
        return this.StatusRedirect;
    }

    /**
     * Set WAF Returned to Client Status Code 302 Count

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusRedirect WAF Returned to Client Status Code 302 Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusRedirect(Long StatusRedirect) {
        this.StatusRedirect = StatusRedirect;
    }

    /**
     * Get Number of Times WAF Returns Status Code 202 to Client

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusOk Number of Times WAF Returns Status Code 202 to Client

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatusOk() {
        return this.StatusOk;
    }

    /**
     * Set Number of Times WAF Returns Status Code 202 to Client

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusOk Number of Times WAF Returns Status Code 202 to Client

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusOk(Long StatusOk) {
        this.StatusOk = StatusOk;
    }

    /**
     * Get Number of Times the Origin Server Returned 5xx Status Codes to WAF

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamServerError Number of Times the Origin Server Returned 5xx Status Codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpstreamServerError() {
        return this.UpstreamServerError;
    }

    /**
     * Set Number of Times the Origin Server Returned 5xx Status Codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamServerError Number of Times the Origin Server Returned 5xx Status Codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamServerError(Long UpstreamServerError) {
        this.UpstreamServerError = UpstreamServerError;
    }

    /**
     * Get Number of times the origin server returned 4xx status codes to WAF

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamClientError Number of times the origin server returned 4xx status codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpstreamClientError() {
        return this.UpstreamClientError;
    }

    /**
     * Set Number of times the origin server returned 4xx status codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamClientError Number of times the origin server returned 4xx status codes to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamClientError(Long UpstreamClientError) {
        this.UpstreamClientError = UpstreamClientError;
    }

    /**
     * Get Number of times the original server returns status code 302 to WAF

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpstreamRedirect Number of times the original server returns status code 302 to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpstreamRedirect() {
        return this.UpstreamRedirect;
    }

    /**
     * Set Number of times the original server returns status code 302 to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpstreamRedirect Number of times the original server returns status code 302 to WAF

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpstreamRedirect(Long UpstreamRedirect) {
        this.UpstreamRedirect = UpstreamRedirect;
    }

    /**
     * Get Blocklist Count

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BlackIP Blocklist Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBlackIP() {
        return this.BlackIP;
    }

    /**
     * Set Blocklist Count

Note: This field may return null, indicating that no valid values can be obtained.
     * @param BlackIP Blocklist Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBlackIP(Long BlackIP) {
        this.BlackIP = BlackIP;
    }

    /**
     * Get Tamper-Proof Attempts

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tamper Tamper-Proof Attempts

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTamper() {
        return this.Tamper;
    }

    /**
     * Set Tamper-Proof Attempts

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tamper Tamper-Proof Attempts

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTamper(Long Tamper) {
        this.Tamper = Tamper;
    }

    /**
     * Get Information Leakage Prevention Count

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Leak Information Leakage Prevention Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLeak() {
        return this.Leak;
    }

    /**
     * Set Information Leakage Prevention Count

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Leak Information Leakage Prevention Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLeak(Long Leak) {
        this.Leak = Leak;
    }

    /**
     * Get Access control
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ACL Access control
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getACL() {
        return this.ACL;
    }

    /**
     * Set Access control
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ACL Access control
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setACL(Long ACL) {
        this.ACL = ACL;
    }

    /**
     * Get Mini Program QPS

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WxAccess Mini Program QPS

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWxAccess() {
        return this.WxAccess;
    }

    /**
     * Set Mini Program QPS

Note: This field may return null, indicating that no valid values can be obtained.
     * @param WxAccess Mini Program QPS

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWxAccess(Long WxAccess) {
        this.WxAccess = WxAccess;
    }

    /**
     * Get Number of mini program requests
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WxCount Number of mini program requests
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWxCount() {
        return this.WxCount;
    }

    /**
     * Set Number of mini program requests
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WxCount Number of mini program requests
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWxCount(Long WxCount) {
        this.WxCount = WxCount;
    }

    /**
     * Get Peak upstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WxUp Peak upstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWxUp() {
        return this.WxUp;
    }

    /**
     * Set Peak upstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WxUp Peak upstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWxUp(Long WxUp) {
        this.WxUp = WxUp;
    }

    /**
     * Get Peak downstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WxDown Peak downstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWxDown() {
        return this.WxDown;
    }

    /**
     * Set Peak downstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WxDown Peak downstream bandwidth of the mini program. Unit: B
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWxDown(Long WxDown) {
        this.WxDown = WxDown;
    }

    public PeakPointsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakPointsItem(PeakPointsItem source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Access != null) {
            this.Access = new Long(source.Access);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.Down != null) {
            this.Down = new Long(source.Down);
        }
        if (source.Attack != null) {
            this.Attack = new Long(source.Attack);
        }
        if (source.Cc != null) {
            this.Cc = new Long(source.Cc);
        }
        if (source.BotAccess != null) {
            this.BotAccess = new Long(source.BotAccess);
        }
        if (source.StatusServerError != null) {
            this.StatusServerError = new Long(source.StatusServerError);
        }
        if (source.StatusClientError != null) {
            this.StatusClientError = new Long(source.StatusClientError);
        }
        if (source.StatusRedirect != null) {
            this.StatusRedirect = new Long(source.StatusRedirect);
        }
        if (source.StatusOk != null) {
            this.StatusOk = new Long(source.StatusOk);
        }
        if (source.UpstreamServerError != null) {
            this.UpstreamServerError = new Long(source.UpstreamServerError);
        }
        if (source.UpstreamClientError != null) {
            this.UpstreamClientError = new Long(source.UpstreamClientError);
        }
        if (source.UpstreamRedirect != null) {
            this.UpstreamRedirect = new Long(source.UpstreamRedirect);
        }
        if (source.BlackIP != null) {
            this.BlackIP = new Long(source.BlackIP);
        }
        if (source.Tamper != null) {
            this.Tamper = new Long(source.Tamper);
        }
        if (source.Leak != null) {
            this.Leak = new Long(source.Leak);
        }
        if (source.ACL != null) {
            this.ACL = new Long(source.ACL);
        }
        if (source.WxAccess != null) {
            this.WxAccess = new Long(source.WxAccess);
        }
        if (source.WxCount != null) {
            this.WxCount = new Long(source.WxCount);
        }
        if (source.WxUp != null) {
            this.WxUp = new Long(source.WxUp);
        }
        if (source.WxDown != null) {
            this.WxDown = new Long(source.WxDown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "Down", this.Down);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Cc", this.Cc);
        this.setParamSimple(map, prefix + "BotAccess", this.BotAccess);
        this.setParamSimple(map, prefix + "StatusServerError", this.StatusServerError);
        this.setParamSimple(map, prefix + "StatusClientError", this.StatusClientError);
        this.setParamSimple(map, prefix + "StatusRedirect", this.StatusRedirect);
        this.setParamSimple(map, prefix + "StatusOk", this.StatusOk);
        this.setParamSimple(map, prefix + "UpstreamServerError", this.UpstreamServerError);
        this.setParamSimple(map, prefix + "UpstreamClientError", this.UpstreamClientError);
        this.setParamSimple(map, prefix + "UpstreamRedirect", this.UpstreamRedirect);
        this.setParamSimple(map, prefix + "BlackIP", this.BlackIP);
        this.setParamSimple(map, prefix + "Tamper", this.Tamper);
        this.setParamSimple(map, prefix + "Leak", this.Leak);
        this.setParamSimple(map, prefix + "ACL", this.ACL);
        this.setParamSimple(map, prefix + "WxAccess", this.WxAccess);
        this.setParamSimple(map, prefix + "WxCount", this.WxCount);
        this.setParamSimple(map, prefix + "WxUp", this.WxUp);
        this.setParamSimple(map, prefix + "WxDown", this.WxDown);

    }
}

