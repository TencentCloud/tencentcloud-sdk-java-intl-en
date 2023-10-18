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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4OfflineLog extends AbstractModel {

    /**
    * L4 proxy instance ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Log query area. Valid values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland). </li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Log packet name.
    */
    @SerializedName("LogPacketName")
    @Expose
    private String LogPacketName;

    /**
    * Log download address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * (Disused) Log packaging time. 
    */
    @SerializedName("LogTime")
    @Expose
    private Long LogTime;

    /**
    * Start time of log packaging.
    */
    @SerializedName("LogStartTime")
    @Expose
    private String LogStartTime;

    /**
    * End time of the log package.
    */
    @SerializedName("LogEndTime")
    @Expose
    private String LogEndTime;

    /**
    * Log size (in bytes).
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get L4 proxy instance ID. 
     * @return ProxyId L4 proxy instance ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set L4 proxy instance ID.
     * @param ProxyId L4 proxy instance ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Log query area. Valid values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland). </li> 
     * @return Area Log query area. Valid values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland). </li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Log query area. Valid values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland). </li>
     * @param Area Log query area. Valid values:
<li>`mainland`: Chinese mainland;</li>
<li>`overseas`: Global (outside the Chinese mainland). </li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Log packet name. 
     * @return LogPacketName Log packet name.
     */
    public String getLogPacketName() {
        return this.LogPacketName;
    }

    /**
     * Set Log packet name.
     * @param LogPacketName Log packet name.
     */
    public void setLogPacketName(String LogPacketName) {
        this.LogPacketName = LogPacketName;
    }

    /**
     * Get Log download address. 
     * @return Url Log download address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Log download address.
     * @param Url Log download address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get (Disused) Log packaging time.  
     * @return LogTime (Disused) Log packaging time. 
     */
    public Long getLogTime() {
        return this.LogTime;
    }

    /**
     * Set (Disused) Log packaging time. 
     * @param LogTime (Disused) Log packaging time. 
     */
    public void setLogTime(Long LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get Start time of log packaging. 
     * @return LogStartTime Start time of log packaging.
     */
    public String getLogStartTime() {
        return this.LogStartTime;
    }

    /**
     * Set Start time of log packaging.
     * @param LogStartTime Start time of log packaging.
     */
    public void setLogStartTime(String LogStartTime) {
        this.LogStartTime = LogStartTime;
    }

    /**
     * Get End time of the log package. 
     * @return LogEndTime End time of the log package.
     */
    public String getLogEndTime() {
        return this.LogEndTime;
    }

    /**
     * Set End time of the log package.
     * @param LogEndTime End time of the log package.
     */
    public void setLogEndTime(String LogEndTime) {
        this.LogEndTime = LogEndTime;
    }

    /**
     * Get Log size (in bytes). 
     * @return Size Log size (in bytes).
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Log size (in bytes).
     * @param Size Log size (in bytes).
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public L4OfflineLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4OfflineLog(L4OfflineLog source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogPacketName != null) {
            this.LogPacketName = new String(source.LogPacketName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.LogTime != null) {
            this.LogTime = new Long(source.LogTime);
        }
        if (source.LogStartTime != null) {
            this.LogStartTime = new String(source.LogStartTime);
        }
        if (source.LogEndTime != null) {
            this.LogEndTime = new String(source.LogEndTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogPacketName", this.LogPacketName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "LogStartTime", this.LogStartTime);
        this.setParamSimple(map, prefix + "LogEndTime", this.LogEndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

