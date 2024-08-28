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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenDefendAttackLog extends AbstractModel {

    /**
    * Log ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Source IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Source port
    */
    @SerializedName("SrcPort")
    @Expose
    private Long SrcPort;

    /**
    * Attack method
    */
    @SerializedName("HttpMethod")
    @Expose
    private String HttpMethod;

    /**
    * Threat type
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * Attack time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Target port
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * Host quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Target IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
     * Get Log ID 
     * @return Id Log ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Log ID
     * @param Id Log ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Client ID 
     * @return Uuid Client ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Client ID
     * @param Uuid Client ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Source IP 
     * @return SrcIp Source IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Source IP
     * @param SrcIp Source IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Source port 
     * @return SrcPort Source port
     */
    public Long getSrcPort() {
        return this.SrcPort;
    }

    /**
     * Set Source port
     * @param SrcPort Source port
     */
    public void setSrcPort(Long SrcPort) {
        this.SrcPort = SrcPort;
    }

    /**
     * Get Attack method 
     * @return HttpMethod Attack method
     */
    public String getHttpMethod() {
        return this.HttpMethod;
    }

    /**
     * Set Attack method
     * @param HttpMethod Attack method
     */
    public void setHttpMethod(String HttpMethod) {
        this.HttpMethod = HttpMethod;
    }

    /**
     * Get Threat type 
     * @return VulType Threat type
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set Threat type
     * @param VulType Threat type
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * Get Attack time 
     * @return CreatedTime Attack time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Attack time
     * @param CreatedTime Attack time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Target port 
     * @return DstPort Target port
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port
     * @param DstPort Target port
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Host quuid 
     * @return Quuid Host quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host quuid
     * @param Quuid Host quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Target IP 
     * @return DstIp Target IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set Target IP
     * @param DstIp Target IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    public ScreenDefendAttackLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenDefendAttackLog(ScreenDefendAttackLog source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.SrcPort != null) {
            this.SrcPort = new Long(source.SrcPort);
        }
        if (source.HttpMethod != null) {
            this.HttpMethod = new String(source.HttpMethod);
        }
        if (source.VulType != null) {
            this.VulType = new String(source.VulType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "SrcPort", this.SrcPort);
        this.setParamSimple(map, prefix + "HttpMethod", this.HttpMethod);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);

    }
}

