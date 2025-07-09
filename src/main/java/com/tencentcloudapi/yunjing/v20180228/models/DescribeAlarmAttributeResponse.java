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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmAttributeResponse extends AbstractModel {

    /**
    * CWP deactivation alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
    */
    @SerializedName("Offline")
    @Expose
    private String Offline;

    /**
    * Trojan discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
    */
    @SerializedName("Malware")
    @Expose
    private String Malware;

    /**
    * Unusual login location discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
    */
    @SerializedName("NonlocalLogin")
    @Expose
    private String NonlocalLogin;

    /**
    * Brute force attack success alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
    */
    @SerializedName("CrackSuccess")
    @Expose
    private String CrackSuccess;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CWP deactivation alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li> 
     * @return Offline CWP deactivation alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public String getOffline() {
        return this.Offline;
    }

    /**
     * Set CWP deactivation alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     * @param Offline CWP deactivation alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public void setOffline(String Offline) {
        this.Offline = Offline;
    }

    /**
     * Get Trojan discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li> 
     * @return Malware Trojan discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public String getMalware() {
        return this.Malware;
    }

    /**
     * Set Trojan discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     * @param Malware Trojan discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public void setMalware(String Malware) {
        this.Malware = Malware;
    }

    /**
     * Get Unusual login location discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li> 
     * @return NonlocalLogin Unusual login location discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public String getNonlocalLogin() {
        return this.NonlocalLogin;
    }

    /**
     * Set Unusual login location discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     * @param NonlocalLogin Unusual login location discovery alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public void setNonlocalLogin(String NonlocalLogin) {
        this.NonlocalLogin = NonlocalLogin;
    }

    /**
     * Get Brute force attack success alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li> 
     * @return CrackSuccess Brute force attack success alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public String getCrackSuccess() {
        return this.CrackSuccess;
    }

    /**
     * Set Brute force attack success alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     * @param CrackSuccess Brute force attack success alarm status:
<li>OPEN: alarm enabled</li>
<li>CLOSE: alarm disabled</li>
     */
    public void setCrackSuccess(String CrackSuccess) {
        this.CrackSuccess = CrackSuccess;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAlarmAttributeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmAttributeResponse(DescribeAlarmAttributeResponse source) {
        if (source.Offline != null) {
            this.Offline = new String(source.Offline);
        }
        if (source.Malware != null) {
            this.Malware = new String(source.Malware);
        }
        if (source.NonlocalLogin != null) {
            this.NonlocalLogin = new String(source.NonlocalLogin);
        }
        if (source.CrackSuccess != null) {
            this.CrackSuccess = new String(source.CrackSuccess);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offline", this.Offline);
        this.setParamSimple(map, prefix + "Malware", this.Malware);
        this.setParamSimple(map, prefix + "NonlocalLogin", this.NonlocalLogin);
        this.setParamSimple(map, prefix + "CrackSuccess", this.CrackSuccess);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

