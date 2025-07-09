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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefendAttackLog extends AbstractModel {

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
    * Attack description
    */
    @SerializedName("HttpCgi")
    @Expose
    private String HttpCgi;

    /**
    * Attack parameter
    */
    @SerializedName("HttpParam")
    @Expose
    private String HttpParam;

    /**
    * Threat type
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * Attack time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Target server IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Target server name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Target IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * Target port
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * Attack content
    */
    @SerializedName("HttpContent")
    @Expose
    private String HttpContent;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

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
     * Get Attack description 
     * @return HttpCgi Attack description
     */
    public String getHttpCgi() {
        return this.HttpCgi;
    }

    /**
     * Set Attack description
     * @param HttpCgi Attack description
     */
    public void setHttpCgi(String HttpCgi) {
        this.HttpCgi = HttpCgi;
    }

    /**
     * Get Attack parameter 
     * @return HttpParam Attack parameter
     */
    public String getHttpParam() {
        return this.HttpParam;
    }

    /**
     * Set Attack parameter
     * @param HttpParam Attack parameter
     */
    public void setHttpParam(String HttpParam) {
        this.HttpParam = HttpParam;
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
     * @return CreatedAt Attack time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Attack time
     * @param CreatedAt Attack time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Target server IP 
     * @return MachineIp Target server IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Target server IP
     * @param MachineIp Target server IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Target server name 
     * @return MachineName Target server name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Target server name
     * @param MachineName Target server name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
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
     * Get Attack content 
     * @return HttpContent Attack content
     */
    public String getHttpContent() {
        return this.HttpContent;
    }

    /**
     * Set Attack content
     * @param HttpContent Attack content
     */
    public void setHttpContent(String HttpContent) {
        this.HttpContent = HttpContent;
    }

    /**
     * Get Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public DefendAttackLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefendAttackLog(DefendAttackLog source) {
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
        if (source.HttpCgi != null) {
            this.HttpCgi = new String(source.HttpCgi);
        }
        if (source.HttpParam != null) {
            this.HttpParam = new String(source.HttpParam);
        }
        if (source.VulType != null) {
            this.VulType = new String(source.VulType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.HttpContent != null) {
            this.HttpContent = new String(source.HttpContent);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
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
        this.setParamSimple(map, prefix + "HttpCgi", this.HttpCgi);
        this.setParamSimple(map, prefix + "HttpParam", this.HttpParam);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "HttpContent", this.HttpContent);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

