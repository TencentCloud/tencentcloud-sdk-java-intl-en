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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDnsRecordRequest extends AbstractModel{

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Record type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Record name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Record content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Proxy mode. Valid values: `dns_only`, `cdn_only`, and `secure_cdn`.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Record type 
     * @return Type Record type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Record type
     * @param Type Record type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Record name 
     * @return Name Record name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Record name
     * @param Name Record name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Record content 
     * @return Content Record content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Record content
     * @param Content Record content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Proxy mode. Valid values: `dns_only`, `cdn_only`, and `secure_cdn`. 
     * @return Mode Proxy mode. Valid values: `dns_only`, `cdn_only`, and `secure_cdn`.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Proxy mode. Valid values: `dns_only`, `cdn_only`, and `secure_cdn`.
     * @param Mode Proxy mode. Valid values: `dns_only`, `cdn_only`, and `secure_cdn`.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get  
     * @return Ttl 
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set 
     * @param Ttl 
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get Priority 
     * @return Priority Priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority
     * @param Priority Priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CreateDnsRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDnsRecordRequest(CreateDnsRecordRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

