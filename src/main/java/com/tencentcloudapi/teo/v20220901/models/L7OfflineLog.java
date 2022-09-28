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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7OfflineLog extends AbstractModel{

    /**
    * Start time of the log packaging
    */
    @SerializedName("LogTime")
    @Expose
    private Long LogTime;

    /**
    * The subdomain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Log size, in bytes.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Download address
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Log package name
    */
    @SerializedName("LogPacketName")
    @Expose
    private String LogPacketName;

    /**
    * Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Start time of the log packaging 
     * @return LogTime Start time of the log packaging
     */
    public Long getLogTime() {
        return this.LogTime;
    }

    /**
     * Set Start time of the log packaging
     * @param LogTime Start time of the log packaging
     */
    public void setLogTime(Long LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get The subdomain name. 
     * @return Domain The subdomain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The subdomain name.
     * @param Domain The subdomain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Log size, in bytes. 
     * @return Size Log size, in bytes.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Log size, in bytes.
     * @param Size Log size, in bytes.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Download address 
     * @return Url Download address
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Download address
     * @param Url Download address
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Log package name 
     * @return LogPacketName Log package name
     */
    public String getLogPacketName() {
        return this.LogPacketName;
    }

    /**
     * Set Log package name
     * @param LogPacketName Log package name
     */
    public void setLogPacketName(String LogPacketName) {
        this.LogPacketName = LogPacketName;
    }

    /**
     * Get Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li> 
     * @return Area Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
     * @param Area Acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public L7OfflineLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7OfflineLog(L7OfflineLog source) {
        if (source.LogTime != null) {
            this.LogTime = new Long(source.LogTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.LogPacketName != null) {
            this.LogPacketName = new String(source.LogPacketName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LogPacketName", this.LogPacketName);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

