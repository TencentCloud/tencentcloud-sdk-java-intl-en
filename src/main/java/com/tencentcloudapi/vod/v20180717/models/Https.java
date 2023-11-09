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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Https extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("Http2")
    @Expose
    private String Http2;

    /**
    * Server certificate configuration information
    */
    @SerializedName("CertInfo")
    @Expose
    private CDNCertInfo CertInfo;

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
     * @return Http2 
     */
    public String getHttp2() {
        return this.Http2;
    }

    /**
     * Set 
     * @param Http2 
     */
    public void setHttp2(String Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get Server certificate configuration information 
     * @return CertInfo Server certificate configuration information
     */
    public CDNCertInfo getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set Server certificate configuration information
     * @param CertInfo Server certificate configuration information
     */
    public void setCertInfo(CDNCertInfo CertInfo) {
        this.CertInfo = CertInfo;
    }

    public Https() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Https(Https source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Http2 != null) {
            this.Http2 = new String(source.Http2);
        }
        if (source.CertInfo != null) {
            this.CertInfo = new CDNCertInfo(source.CertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamObj(map, prefix + "CertInfo.", this.CertInfo);

    }
}

