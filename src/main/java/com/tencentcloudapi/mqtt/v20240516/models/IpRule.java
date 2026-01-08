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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpRule extends AbstractModel {

    /**
    * IP address.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Currently only support allowed by default.
    */
    @SerializedName("Allow")
    @Expose
    private Boolean Allow;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get IP address. 
     * @return Ip IP address.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address.
     * @param Ip IP address.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Currently only support allowed by default. 
     * @return Allow Currently only support allowed by default.
     */
    public Boolean getAllow() {
        return this.Allow;
    }

    /**
     * Set Currently only support allowed by default.
     * @param Allow Currently only support allowed by default.
     */
    public void setAllow(Boolean Allow) {
        this.Allow = Allow;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public IpRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpRule(IpRule source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Allow != null) {
            this.Allow = new Boolean(source.Allow);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Allow", this.Allow);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

