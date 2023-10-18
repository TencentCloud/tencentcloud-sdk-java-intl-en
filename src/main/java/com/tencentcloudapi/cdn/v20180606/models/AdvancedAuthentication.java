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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedAuthentication extends AbstractModel {

    /**
    * Hotlink protection configuration switch (which can be on or off). If it is enabled, only one mode can and must be configured, while other modes are null.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Timestamp hotlink protection advanced configuration mode A
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeA")
    @Expose
    private AdvancedAuthenticationTypeA TypeA;

    /**
    * Timestamp hotlink protection advanced configuration mode B
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeB")
    @Expose
    private AdvancedAuthenticationTypeB TypeB;

    /**
    * Timestamp hotlink protection advanced configuration mode C
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeC")
    @Expose
    private AdvancedAuthenticationTypeC TypeC;

    /**
    * Timestamp hotlink protection advanced configuration mode D
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeD")
    @Expose
    private AdvancedAuthenticationTypeD TypeD;

    /**
    * Timestamp hotlink protection advanced configuration mode E
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeE")
    @Expose
    private AdvancedAuthenticationTypeE TypeE;

    /**
    * Timestamp hotlink protection advanced configuration mode F
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeF")
    @Expose
    private AdvancedAuthenticationTypeF TypeF;

    /**
     * Get Hotlink protection configuration switch (which can be on or off). If it is enabled, only one mode can and must be configured, while other modes are null. 
     * @return Switch Hotlink protection configuration switch (which can be on or off). If it is enabled, only one mode can and must be configured, while other modes are null.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Hotlink protection configuration switch (which can be on or off). If it is enabled, only one mode can and must be configured, while other modes are null.
     * @param Switch Hotlink protection configuration switch (which can be on or off). If it is enabled, only one mode can and must be configured, while other modes are null.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration mode A
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TypeA Timestamp hotlink protection advanced configuration mode A
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AdvancedAuthenticationTypeA getTypeA() {
        return this.TypeA;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration mode A
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TypeA Timestamp hotlink protection advanced configuration mode A
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTypeA(AdvancedAuthenticationTypeA TypeA) {
        this.TypeA = TypeA;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration mode B
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TypeB Timestamp hotlink protection advanced configuration mode B
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AdvancedAuthenticationTypeB getTypeB() {
        return this.TypeB;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration mode B
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TypeB Timestamp hotlink protection advanced configuration mode B
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTypeB(AdvancedAuthenticationTypeB TypeB) {
        this.TypeB = TypeB;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration mode C
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TypeC Timestamp hotlink protection advanced configuration mode C
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AdvancedAuthenticationTypeC getTypeC() {
        return this.TypeC;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration mode C
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TypeC Timestamp hotlink protection advanced configuration mode C
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTypeC(AdvancedAuthenticationTypeC TypeC) {
        this.TypeC = TypeC;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration mode D
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TypeD Timestamp hotlink protection advanced configuration mode D
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AdvancedAuthenticationTypeD getTypeD() {
        return this.TypeD;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration mode D
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TypeD Timestamp hotlink protection advanced configuration mode D
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTypeD(AdvancedAuthenticationTypeD TypeD) {
        this.TypeD = TypeD;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration mode E
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TypeE Timestamp hotlink protection advanced configuration mode E
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AdvancedAuthenticationTypeE getTypeE() {
        return this.TypeE;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration mode E
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TypeE Timestamp hotlink protection advanced configuration mode E
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTypeE(AdvancedAuthenticationTypeE TypeE) {
        this.TypeE = TypeE;
    }

    /**
     * Get Timestamp hotlink protection advanced configuration mode F
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TypeF Timestamp hotlink protection advanced configuration mode F
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public AdvancedAuthenticationTypeF getTypeF() {
        return this.TypeF;
    }

    /**
     * Set Timestamp hotlink protection advanced configuration mode F
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TypeF Timestamp hotlink protection advanced configuration mode F
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTypeF(AdvancedAuthenticationTypeF TypeF) {
        this.TypeF = TypeF;
    }

    public AdvancedAuthentication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthentication(AdvancedAuthentication source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.TypeA != null) {
            this.TypeA = new AdvancedAuthenticationTypeA(source.TypeA);
        }
        if (source.TypeB != null) {
            this.TypeB = new AdvancedAuthenticationTypeB(source.TypeB);
        }
        if (source.TypeC != null) {
            this.TypeC = new AdvancedAuthenticationTypeC(source.TypeC);
        }
        if (source.TypeD != null) {
            this.TypeD = new AdvancedAuthenticationTypeD(source.TypeD);
        }
        if (source.TypeE != null) {
            this.TypeE = new AdvancedAuthenticationTypeE(source.TypeE);
        }
        if (source.TypeF != null) {
            this.TypeF = new AdvancedAuthenticationTypeF(source.TypeF);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "TypeA.", this.TypeA);
        this.setParamObj(map, prefix + "TypeB.", this.TypeB);
        this.setParamObj(map, prefix + "TypeC.", this.TypeC);
        this.setParamObj(map, prefix + "TypeD.", this.TypeD);
        this.setParamObj(map, prefix + "TypeE.", this.TypeE);
        this.setParamObj(map, prefix + "TypeF.", this.TypeF);

    }
}

