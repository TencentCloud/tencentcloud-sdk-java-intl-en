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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSUserAllowBlockIP extends AbstractModel {

    /**
    * Start IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Start mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
    * IP type. `block`: IP blocklist; `allow`: IP allowlist.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Timestamp
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * End IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Ip2")
    @Expose
    private String Ip2;

    /**
    * End mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mask2")
    @Expose
    private Long Mask2;

    /**
     * Get Start IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Ip Start IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Start IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Ip Start IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Start mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Mask Start mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set Start mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Mask Start mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    /**
     * Get IP type. `block`: IP blocklist; `allow`: IP allowlist.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Type IP type. `block`: IP blocklist; `allow`: IP allowlist.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP type. `block`: IP blocklist; `allow`: IP allowlist.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Type IP type. `block`: IP blocklist; `allow`: IP allowlist.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Timestamp
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UpdateTime Timestamp
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Timestamp
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UpdateTime Timestamp
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get End IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Ip2 End IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIp2() {
        return this.Ip2;
    }

    /**
     * Set End IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Ip2 End IP address in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIp2(String Ip2) {
        this.Ip2 = Ip2;
    }

    /**
     * Get End mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Mask2 End mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getMask2() {
        return this.Mask2;
    }

    /**
     * Set End mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Mask2 End mask in a specific range
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMask2(Long Mask2) {
        this.Mask2 = Mask2;
    }

    public DDoSUserAllowBlockIP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSUserAllowBlockIP(DDoSUserAllowBlockIP source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Ip2 != null) {
            this.Ip2 = new String(source.Ip2);
        }
        if (source.Mask2 != null) {
            this.Mask2 = new Long(source.Mask2);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Ip2", this.Ip2);
        this.setParamSimple(map, prefix + "Mask2", this.Mask2);

    }
}

