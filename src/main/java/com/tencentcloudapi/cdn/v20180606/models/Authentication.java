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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Authentication extends AbstractModel {

    /**
    * Whether to enable hot linking protection. Values:
`on`: Enable
`off`: Disable
Only one advanced configuration can be enabled. Set the rests to `null`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Authentication algorithm. Values:
`md5`: Calculate the hash using MD5.
`sha256`: Calculate the hash using SHA-256.
Default value: `md5`.
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthAlgorithm")
    @Expose
    private String AuthAlgorithm;

    /**
    * Timestamp hotlink protection mode A configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeA")
    @Expose
    private AuthenticationTypeA TypeA;

    /**
    * Timestamp hotlink protection mode B configuration (mode B is being upgraded and is currently not supported)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeB")
    @Expose
    private AuthenticationTypeB TypeB;

    /**
    * Timestamp hotlink protection mode C configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeC")
    @Expose
    private AuthenticationTypeC TypeC;

    /**
    * Timestamp hotlink protection mode D configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TypeD")
    @Expose
    private AuthenticationTypeD TypeD;

    /**
     * Get Whether to enable hot linking protection. Values:
`on`: Enable
`off`: Disable
Only one advanced configuration can be enabled. Set the rests to `null`. 
     * @return Switch Whether to enable hot linking protection. Values:
`on`: Enable
`off`: Disable
Only one advanced configuration can be enabled. Set the rests to `null`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable hot linking protection. Values:
`on`: Enable
`off`: Disable
Only one advanced configuration can be enabled. Set the rests to `null`.
     * @param Switch Whether to enable hot linking protection. Values:
`on`: Enable
`off`: Disable
Only one advanced configuration can be enabled. Set the rests to `null`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Authentication algorithm. Values:
`md5`: Calculate the hash using MD5.
`sha256`: Calculate the hash using SHA-256.
Default value: `md5`.
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return AuthAlgorithm Authentication algorithm. Values:
`md5`: Calculate the hash using MD5.
`sha256`: Calculate the hash using SHA-256.
Default value: `md5`.
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public String getAuthAlgorithm() {
        return this.AuthAlgorithm;
    }

    /**
     * Set Authentication algorithm. Values:
`md5`: Calculate the hash using MD5.
`sha256`: Calculate the hash using SHA-256.
Default value: `md5`.
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param AuthAlgorithm Authentication algorithm. Values:
`md5`: Calculate the hash using MD5.
`sha256`: Calculate the hash using SHA-256.
Default value: `md5`.
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setAuthAlgorithm(String AuthAlgorithm) {
        this.AuthAlgorithm = AuthAlgorithm;
    }

    /**
     * Get Timestamp hotlink protection mode A configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TypeA Timestamp hotlink protection mode A configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AuthenticationTypeA getTypeA() {
        return this.TypeA;
    }

    /**
     * Set Timestamp hotlink protection mode A configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TypeA Timestamp hotlink protection mode A configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTypeA(AuthenticationTypeA TypeA) {
        this.TypeA = TypeA;
    }

    /**
     * Get Timestamp hotlink protection mode B configuration (mode B is being upgraded and is currently not supported)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TypeB Timestamp hotlink protection mode B configuration (mode B is being upgraded and is currently not supported)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AuthenticationTypeB getTypeB() {
        return this.TypeB;
    }

    /**
     * Set Timestamp hotlink protection mode B configuration (mode B is being upgraded and is currently not supported)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TypeB Timestamp hotlink protection mode B configuration (mode B is being upgraded and is currently not supported)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTypeB(AuthenticationTypeB TypeB) {
        this.TypeB = TypeB;
    }

    /**
     * Get Timestamp hotlink protection mode C configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TypeC Timestamp hotlink protection mode C configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AuthenticationTypeC getTypeC() {
        return this.TypeC;
    }

    /**
     * Set Timestamp hotlink protection mode C configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TypeC Timestamp hotlink protection mode C configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTypeC(AuthenticationTypeC TypeC) {
        this.TypeC = TypeC;
    }

    /**
     * Get Timestamp hotlink protection mode D configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TypeD Timestamp hotlink protection mode D configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AuthenticationTypeD getTypeD() {
        return this.TypeD;
    }

    /**
     * Set Timestamp hotlink protection mode D configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TypeD Timestamp hotlink protection mode D configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTypeD(AuthenticationTypeD TypeD) {
        this.TypeD = TypeD;
    }

    public Authentication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Authentication(Authentication source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AuthAlgorithm != null) {
            this.AuthAlgorithm = new String(source.AuthAlgorithm);
        }
        if (source.TypeA != null) {
            this.TypeA = new AuthenticationTypeA(source.TypeA);
        }
        if (source.TypeB != null) {
            this.TypeB = new AuthenticationTypeB(source.TypeB);
        }
        if (source.TypeC != null) {
            this.TypeC = new AuthenticationTypeC(source.TypeC);
        }
        if (source.TypeD != null) {
            this.TypeD = new AuthenticationTypeD(source.TypeD);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AuthAlgorithm", this.AuthAlgorithm);
        this.setParamObj(map, prefix + "TypeA.", this.TypeA);
        this.setParamObj(map, prefix + "TypeB.", this.TypeB);
        this.setParamObj(map, prefix + "TypeC.", this.TypeC);
        this.setParamObj(map, prefix + "TypeD.", this.TypeD);

    }
}

