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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7OfflineLog extends AbstractModel {

    /**
    * Offline log domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Log associated region. Valid values:
<li>mainland: within the Chinese mainland; </li>
<li>overseas: global (excluding the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Offline log data packet name.	
    */
    @SerializedName("LogPacketName")
    @Expose
    private String LogPacketName;

    /**
    * Offline log download address.	
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Log packaging time. This parameter has been deprecated.
    */
    @SerializedName("LogTime")
    @Expose
    private Long LogTime;

    /**
    * Log packaging start time.
    */
    @SerializedName("LogStartTime")
    @Expose
    private String LogStartTime;

    /**
    * Log packaging end time.
    */
    @SerializedName("LogEndTime")
    @Expose
    private String LogEndTime;

    /**
    * Log original size in bytes.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Offline log domain name. 
     * @return Domain Offline log domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Offline log domain name.
     * @param Domain Offline log domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Log associated region. Valid values:
<li>mainland: within the Chinese mainland; </li>
<li>overseas: global (excluding the Chinese mainland).</li> 
     * @return Area Log associated region. Valid values:
<li>mainland: within the Chinese mainland; </li>
<li>overseas: global (excluding the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Log associated region. Valid values:
<li>mainland: within the Chinese mainland; </li>
<li>overseas: global (excluding the Chinese mainland).</li>
     * @param Area Log associated region. Valid values:
<li>mainland: within the Chinese mainland; </li>
<li>overseas: global (excluding the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Offline log data packet name.	 
     * @return LogPacketName Offline log data packet name.	
     */
    public String getLogPacketName() {
        return this.LogPacketName;
    }

    /**
     * Set Offline log data packet name.	
     * @param LogPacketName Offline log data packet name.	
     */
    public void setLogPacketName(String LogPacketName) {
        this.LogPacketName = LogPacketName;
    }

    /**
     * Get Offline log download address.	 
     * @return Url Offline log download address.	
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Offline log download address.	
     * @param Url Offline log download address.	
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Log packaging time. This parameter has been deprecated. 
     * @return LogTime Log packaging time. This parameter has been deprecated.
     */
    public Long getLogTime() {
        return this.LogTime;
    }

    /**
     * Set Log packaging time. This parameter has been deprecated.
     * @param LogTime Log packaging time. This parameter has been deprecated.
     */
    public void setLogTime(Long LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get Log packaging start time. 
     * @return LogStartTime Log packaging start time.
     */
    public String getLogStartTime() {
        return this.LogStartTime;
    }

    /**
     * Set Log packaging start time.
     * @param LogStartTime Log packaging start time.
     */
    public void setLogStartTime(String LogStartTime) {
        this.LogStartTime = LogStartTime;
    }

    /**
     * Get Log packaging end time. 
     * @return LogEndTime Log packaging end time.
     */
    public String getLogEndTime() {
        return this.LogEndTime;
    }

    /**
     * Set Log packaging end time.
     * @param LogEndTime Log packaging end time.
     */
    public void setLogEndTime(String LogEndTime) {
        this.LogEndTime = LogEndTime;
    }

    /**
     * Get Log original size in bytes. 
     * @return Size Log original size in bytes.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Log original size in bytes.
     * @param Size Log original size in bytes.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public L7OfflineLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7OfflineLog(L7OfflineLog source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogPacketName", this.LogPacketName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "LogStartTime", this.LogStartTime);
        this.setParamSimple(map, prefix + "LogEndTime", this.LogEndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

