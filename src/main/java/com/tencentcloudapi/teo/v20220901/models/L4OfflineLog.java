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

public class L4OfflineLog extends AbstractModel{

    /**
    * The start time of the log packaging.
    */
    @SerializedName("LogTime")
    @Expose
    private Long LogTime;

    /**
    * The L4 proxy ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * The log size, in bytes.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * The download address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The log package name.
    */
    @SerializedName("LogPacketName")
    @Expose
    private String LogPacketName;

    /**
    * The acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get The start time of the log packaging. 
     * @return LogTime The start time of the log packaging.
     */
    public Long getLogTime() {
        return this.LogTime;
    }

    /**
     * Set The start time of the log packaging.
     * @param LogTime The start time of the log packaging.
     */
    public void setLogTime(Long LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get The L4 proxy ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyId The L4 proxy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set The L4 proxy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyId The L4 proxy ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get The log size, in bytes. 
     * @return Size The log size, in bytes.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The log size, in bytes.
     * @param Size The log size, in bytes.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get The download address. 
     * @return Url The download address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The download address.
     * @param Url The download address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The log package name. 
     * @return LogPacketName The log package name.
     */
    public String getLogPacketName() {
        return this.LogPacketName;
    }

    /**
     * Set The log package name.
     * @param LogPacketName The log package name.
     */
    public void setLogPacketName(String LogPacketName) {
        this.LogPacketName = LogPacketName;
    }

    /**
     * Get The acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li> 
     * @return Area The acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
     * @param Area The acceleration region. Values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland);</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public L4OfflineLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4OfflineLog(L4OfflineLog source) {
        if (source.LogTime != null) {
            this.LogTime = new Long(source.LogTime);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
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
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LogPacketName", this.LogPacketName);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

