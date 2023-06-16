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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Authentication extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("TypeA")
    @Expose
    private AuthenticationTypeA TypeA;

    /**
    * 
    */
    @SerializedName("TypeB")
    @Expose
    private AuthenticationTypeB TypeB;

    /**
    * 
    */
    @SerializedName("TypeC")
    @Expose
    private AuthenticationTypeC TypeC;

    /**
    * 
    */
    @SerializedName("TypeD")
    @Expose
    private AuthenticationTypeD TypeD;

    /**
     * Get  
     * @return Switch 
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 
     * @param Switch 
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return TypeA 
     */
    public AuthenticationTypeA getTypeA() {
        return this.TypeA;
    }

    /**
     * Set 
     * @param TypeA 
     */
    public void setTypeA(AuthenticationTypeA TypeA) {
        this.TypeA = TypeA;
    }

    /**
     * Get  
     * @return TypeB 
     */
    public AuthenticationTypeB getTypeB() {
        return this.TypeB;
    }

    /**
     * Set 
     * @param TypeB 
     */
    public void setTypeB(AuthenticationTypeB TypeB) {
        this.TypeB = TypeB;
    }

    /**
     * Get  
     * @return TypeC 
     */
    public AuthenticationTypeC getTypeC() {
        return this.TypeC;
    }

    /**
     * Set 
     * @param TypeC 
     */
    public void setTypeC(AuthenticationTypeC TypeC) {
        this.TypeC = TypeC;
    }

    /**
     * Get  
     * @return TypeD 
     */
    public AuthenticationTypeD getTypeD() {
        return this.TypeD;
    }

    /**
     * Set 
     * @param TypeD 
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
        this.setParamObj(map, prefix + "TypeA.", this.TypeA);
        this.setParamObj(map, prefix + "TypeB.", this.TypeB);
        this.setParamObj(map, prefix + "TypeC.", this.TypeC);
        this.setParamObj(map, prefix + "TypeD.", this.TypeD);

    }
}

