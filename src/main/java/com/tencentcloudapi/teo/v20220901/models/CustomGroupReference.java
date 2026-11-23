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

public class CustomGroupReference extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Entity type.</p><p>Valid values:</p><ul><li>WebSec.ZonePolicy: Site-level protection policy</li><li>WebSec.HostPolicy: Domain-level protection policy</li><li>WebSec.Template: Policy template</li><li>WebSec.APIResource: API resource</li><li>WebSec.JSInjectionRule: Injection rule</li><li>DDoS.L4Proxy: Layer-4 proxy DDoS protection</li><li>DDoS.L3Transit: Layer-3 transit DDoS protection</li></ul>
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Site ID</li><li>WebSec.HostPolicy: Domain</li><li>WebSec.Template: Template ID</li><li>WebSec.APIResource: API resource ID</li><li>WebSec.JSInjectionRule: JavaScript injection rule ID</li><li>DDoS.L4Proxy: Instance ID</li><li>DDoS.L3Transit: Instance ID</li></ul>
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Empty</li><li>WebSec.HostPolicy: Empty</li><li>WebSec.Template: Template name</li><li>WebSec.APIResource: API resource name</li><li>WebSec.JSInjectionRule: JavaScript injection rule name</li><li>DDoS.L4Proxy: Empty</li><li>DDoS.L3Transit: Empty</li></ul>
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * <p>Sub-entity type.</p><p>Valid values:</p><ul><li>WebSec.ExceptionRule: Protection exception rule</li><li>WebSec.BasicAccessRule: Basic access control</li><li>WebSec.PreciseMatchRule: Precise match rule</li><li>WebSec.RateLimitRule: Precise rate limiting</li><li>WebSec.BotCustomRule: Advanced Bot management - Custom rule</li><li>DDoS.L4Proxy.IpAccessControl: Layer-4 proxy DDoS protection - IP allowlist/blocklist</li><li>DDoS.L3Transit.IpAccessControl: Layer-3 transit DDoS protection - IP allowlist/blocklist</li></ul>
    */
    @SerializedName("SubEntityType")
    @Expose
    private String SubEntityType;

    /**
    * <p>Sub-entity identifier, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule ID</li><li>WebSec.BasicAccessRule: Rule ID</li><li>WebSec.PreciseMatchRule: Rule ID</li><li>WebSec.RateLimitRule: Rule ID</li><li>WebSec.BotCustomRule: Rule ID</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul><p>EntityType and SubEntityType are in a mapping relationship. Different EntityTypes support different SubEntityTypes.<br>WebSec.ZonePolicy, WebSec.HostPolicy, and WebSec.Template support the following SubEntityTypes:</p><ul><li>WebSec.ExceptionRule</li><li>WebSec.BasicAccessRule</li><li>WebSec.PreciseMatchRule</li><li>WebSec.RateLimitRule</li><li>WebSec.BotCustomRule</li></ul>DDoS.L4Proxy supports the following SubEntityType:<ul><li>DDoS.L4Proxy.IpAccessControl</li></ul>DDoS.L3Transit supports the following SubEntityType:<ul><li>DDoS.L3Transit.IpAccessControl</li></ul>
    */
    @SerializedName("SubEntityId")
    @Expose
    private String SubEntityId;

    /**
    * <p>Sub-entity name, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule name</li><li>WebSec.BasicAccessRule: Rule name</li><li>WebSec.PreciseMatchRule: Rule name</li><li>WebSec.RateLimitRule: Rule name</li><li>WebSec.BotCustomRule: Rule name</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul>
    */
    @SerializedName("SubEntityName")
    @Expose
    private String SubEntityName;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Entity type.</p><p>Valid values:</p><ul><li>WebSec.ZonePolicy: Site-level protection policy</li><li>WebSec.HostPolicy: Domain-level protection policy</li><li>WebSec.Template: Policy template</li><li>WebSec.APIResource: API resource</li><li>WebSec.JSInjectionRule: Injection rule</li><li>DDoS.L4Proxy: Layer-4 proxy DDoS protection</li><li>DDoS.L3Transit: Layer-3 transit DDoS protection</li></ul> 
     * @return EntityType <p>Entity type.</p><p>Valid values:</p><ul><li>WebSec.ZonePolicy: Site-level protection policy</li><li>WebSec.HostPolicy: Domain-level protection policy</li><li>WebSec.Template: Policy template</li><li>WebSec.APIResource: API resource</li><li>WebSec.JSInjectionRule: Injection rule</li><li>DDoS.L4Proxy: Layer-4 proxy DDoS protection</li><li>DDoS.L3Transit: Layer-3 transit DDoS protection</li></ul>
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set <p>Entity type.</p><p>Valid values:</p><ul><li>WebSec.ZonePolicy: Site-level protection policy</li><li>WebSec.HostPolicy: Domain-level protection policy</li><li>WebSec.Template: Policy template</li><li>WebSec.APIResource: API resource</li><li>WebSec.JSInjectionRule: Injection rule</li><li>DDoS.L4Proxy: Layer-4 proxy DDoS protection</li><li>DDoS.L3Transit: Layer-3 transit DDoS protection</li></ul>
     * @param EntityType <p>Entity type.</p><p>Valid values:</p><ul><li>WebSec.ZonePolicy: Site-level protection policy</li><li>WebSec.HostPolicy: Domain-level protection policy</li><li>WebSec.Template: Policy template</li><li>WebSec.APIResource: API resource</li><li>WebSec.JSInjectionRule: Injection rule</li><li>DDoS.L4Proxy: Layer-4 proxy DDoS protection</li><li>DDoS.L3Transit: Layer-3 transit DDoS protection</li></ul>
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Site ID</li><li>WebSec.HostPolicy: Domain</li><li>WebSec.Template: Template ID</li><li>WebSec.APIResource: API resource ID</li><li>WebSec.JSInjectionRule: JavaScript injection rule ID</li><li>DDoS.L4Proxy: Instance ID</li><li>DDoS.L3Transit: Instance ID</li></ul> 
     * @return EntityId <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Site ID</li><li>WebSec.HostPolicy: Domain</li><li>WebSec.Template: Template ID</li><li>WebSec.APIResource: API resource ID</li><li>WebSec.JSInjectionRule: JavaScript injection rule ID</li><li>DDoS.L4Proxy: Instance ID</li><li>DDoS.L3Transit: Instance ID</li></ul>
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Site ID</li><li>WebSec.HostPolicy: Domain</li><li>WebSec.Template: Template ID</li><li>WebSec.APIResource: API resource ID</li><li>WebSec.JSInjectionRule: JavaScript injection rule ID</li><li>DDoS.L4Proxy: Instance ID</li><li>DDoS.L3Transit: Instance ID</li></ul>
     * @param EntityId <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Site ID</li><li>WebSec.HostPolicy: Domain</li><li>WebSec.Template: Template ID</li><li>WebSec.APIResource: API resource ID</li><li>WebSec.JSInjectionRule: JavaScript injection rule ID</li><li>DDoS.L4Proxy: Instance ID</li><li>DDoS.L3Transit: Instance ID</li></ul>
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Empty</li><li>WebSec.HostPolicy: Empty</li><li>WebSec.Template: Template name</li><li>WebSec.APIResource: API resource name</li><li>WebSec.JSInjectionRule: JavaScript injection rule name</li><li>DDoS.L4Proxy: Empty</li><li>DDoS.L3Transit: Empty</li></ul> 
     * @return EntityName <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Empty</li><li>WebSec.HostPolicy: Empty</li><li>WebSec.Template: Template name</li><li>WebSec.APIResource: API resource name</li><li>WebSec.JSInjectionRule: JavaScript injection rule name</li><li>DDoS.L4Proxy: Empty</li><li>DDoS.L3Transit: Empty</li></ul>
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Empty</li><li>WebSec.HostPolicy: Empty</li><li>WebSec.Template: Template name</li><li>WebSec.APIResource: API resource name</li><li>WebSec.JSInjectionRule: JavaScript injection rule name</li><li>DDoS.L4Proxy: Empty</li><li>DDoS.L3Transit: Empty</li></ul>
     * @param EntityName <p>Entity identifier, which has different meanings depending on EntityType:</p><ul><li>WebSec.ZonePolicy: Empty</li><li>WebSec.HostPolicy: Empty</li><li>WebSec.Template: Template name</li><li>WebSec.APIResource: API resource name</li><li>WebSec.JSInjectionRule: JavaScript injection rule name</li><li>DDoS.L4Proxy: Empty</li><li>DDoS.L3Transit: Empty</li></ul>
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get <p>Sub-entity type.</p><p>Valid values:</p><ul><li>WebSec.ExceptionRule: Protection exception rule</li><li>WebSec.BasicAccessRule: Basic access control</li><li>WebSec.PreciseMatchRule: Precise match rule</li><li>WebSec.RateLimitRule: Precise rate limiting</li><li>WebSec.BotCustomRule: Advanced Bot management - Custom rule</li><li>DDoS.L4Proxy.IpAccessControl: Layer-4 proxy DDoS protection - IP allowlist/blocklist</li><li>DDoS.L3Transit.IpAccessControl: Layer-3 transit DDoS protection - IP allowlist/blocklist</li></ul> 
     * @return SubEntityType <p>Sub-entity type.</p><p>Valid values:</p><ul><li>WebSec.ExceptionRule: Protection exception rule</li><li>WebSec.BasicAccessRule: Basic access control</li><li>WebSec.PreciseMatchRule: Precise match rule</li><li>WebSec.RateLimitRule: Precise rate limiting</li><li>WebSec.BotCustomRule: Advanced Bot management - Custom rule</li><li>DDoS.L4Proxy.IpAccessControl: Layer-4 proxy DDoS protection - IP allowlist/blocklist</li><li>DDoS.L3Transit.IpAccessControl: Layer-3 transit DDoS protection - IP allowlist/blocklist</li></ul>
     */
    public String getSubEntityType() {
        return this.SubEntityType;
    }

    /**
     * Set <p>Sub-entity type.</p><p>Valid values:</p><ul><li>WebSec.ExceptionRule: Protection exception rule</li><li>WebSec.BasicAccessRule: Basic access control</li><li>WebSec.PreciseMatchRule: Precise match rule</li><li>WebSec.RateLimitRule: Precise rate limiting</li><li>WebSec.BotCustomRule: Advanced Bot management - Custom rule</li><li>DDoS.L4Proxy.IpAccessControl: Layer-4 proxy DDoS protection - IP allowlist/blocklist</li><li>DDoS.L3Transit.IpAccessControl: Layer-3 transit DDoS protection - IP allowlist/blocklist</li></ul>
     * @param SubEntityType <p>Sub-entity type.</p><p>Valid values:</p><ul><li>WebSec.ExceptionRule: Protection exception rule</li><li>WebSec.BasicAccessRule: Basic access control</li><li>WebSec.PreciseMatchRule: Precise match rule</li><li>WebSec.RateLimitRule: Precise rate limiting</li><li>WebSec.BotCustomRule: Advanced Bot management - Custom rule</li><li>DDoS.L4Proxy.IpAccessControl: Layer-4 proxy DDoS protection - IP allowlist/blocklist</li><li>DDoS.L3Transit.IpAccessControl: Layer-3 transit DDoS protection - IP allowlist/blocklist</li></ul>
     */
    public void setSubEntityType(String SubEntityType) {
        this.SubEntityType = SubEntityType;
    }

    /**
     * Get <p>Sub-entity identifier, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule ID</li><li>WebSec.BasicAccessRule: Rule ID</li><li>WebSec.PreciseMatchRule: Rule ID</li><li>WebSec.RateLimitRule: Rule ID</li><li>WebSec.BotCustomRule: Rule ID</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul><p>EntityType and SubEntityType are in a mapping relationship. Different EntityTypes support different SubEntityTypes.<br>WebSec.ZonePolicy, WebSec.HostPolicy, and WebSec.Template support the following SubEntityTypes:</p><ul><li>WebSec.ExceptionRule</li><li>WebSec.BasicAccessRule</li><li>WebSec.PreciseMatchRule</li><li>WebSec.RateLimitRule</li><li>WebSec.BotCustomRule</li></ul>DDoS.L4Proxy supports the following SubEntityType:<ul><li>DDoS.L4Proxy.IpAccessControl</li></ul>DDoS.L3Transit supports the following SubEntityType:<ul><li>DDoS.L3Transit.IpAccessControl</li></ul> 
     * @return SubEntityId <p>Sub-entity identifier, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule ID</li><li>WebSec.BasicAccessRule: Rule ID</li><li>WebSec.PreciseMatchRule: Rule ID</li><li>WebSec.RateLimitRule: Rule ID</li><li>WebSec.BotCustomRule: Rule ID</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul><p>EntityType and SubEntityType are in a mapping relationship. Different EntityTypes support different SubEntityTypes.<br>WebSec.ZonePolicy, WebSec.HostPolicy, and WebSec.Template support the following SubEntityTypes:</p><ul><li>WebSec.ExceptionRule</li><li>WebSec.BasicAccessRule</li><li>WebSec.PreciseMatchRule</li><li>WebSec.RateLimitRule</li><li>WebSec.BotCustomRule</li></ul>DDoS.L4Proxy supports the following SubEntityType:<ul><li>DDoS.L4Proxy.IpAccessControl</li></ul>DDoS.L3Transit supports the following SubEntityType:<ul><li>DDoS.L3Transit.IpAccessControl</li></ul>
     */
    public String getSubEntityId() {
        return this.SubEntityId;
    }

    /**
     * Set <p>Sub-entity identifier, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule ID</li><li>WebSec.BasicAccessRule: Rule ID</li><li>WebSec.PreciseMatchRule: Rule ID</li><li>WebSec.RateLimitRule: Rule ID</li><li>WebSec.BotCustomRule: Rule ID</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul><p>EntityType and SubEntityType are in a mapping relationship. Different EntityTypes support different SubEntityTypes.<br>WebSec.ZonePolicy, WebSec.HostPolicy, and WebSec.Template support the following SubEntityTypes:</p><ul><li>WebSec.ExceptionRule</li><li>WebSec.BasicAccessRule</li><li>WebSec.PreciseMatchRule</li><li>WebSec.RateLimitRule</li><li>WebSec.BotCustomRule</li></ul>DDoS.L4Proxy supports the following SubEntityType:<ul><li>DDoS.L4Proxy.IpAccessControl</li></ul>DDoS.L3Transit supports the following SubEntityType:<ul><li>DDoS.L3Transit.IpAccessControl</li></ul>
     * @param SubEntityId <p>Sub-entity identifier, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule ID</li><li>WebSec.BasicAccessRule: Rule ID</li><li>WebSec.PreciseMatchRule: Rule ID</li><li>WebSec.RateLimitRule: Rule ID</li><li>WebSec.BotCustomRule: Rule ID</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul><p>EntityType and SubEntityType are in a mapping relationship. Different EntityTypes support different SubEntityTypes.<br>WebSec.ZonePolicy, WebSec.HostPolicy, and WebSec.Template support the following SubEntityTypes:</p><ul><li>WebSec.ExceptionRule</li><li>WebSec.BasicAccessRule</li><li>WebSec.PreciseMatchRule</li><li>WebSec.RateLimitRule</li><li>WebSec.BotCustomRule</li></ul>DDoS.L4Proxy supports the following SubEntityType:<ul><li>DDoS.L4Proxy.IpAccessControl</li></ul>DDoS.L3Transit supports the following SubEntityType:<ul><li>DDoS.L3Transit.IpAccessControl</li></ul>
     */
    public void setSubEntityId(String SubEntityId) {
        this.SubEntityId = SubEntityId;
    }

    /**
     * Get <p>Sub-entity name, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule name</li><li>WebSec.BasicAccessRule: Rule name</li><li>WebSec.PreciseMatchRule: Rule name</li><li>WebSec.RateLimitRule: Rule name</li><li>WebSec.BotCustomRule: Rule name</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul> 
     * @return SubEntityName <p>Sub-entity name, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule name</li><li>WebSec.BasicAccessRule: Rule name</li><li>WebSec.PreciseMatchRule: Rule name</li><li>WebSec.RateLimitRule: Rule name</li><li>WebSec.BotCustomRule: Rule name</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul>
     */
    public String getSubEntityName() {
        return this.SubEntityName;
    }

    /**
     * Set <p>Sub-entity name, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule name</li><li>WebSec.BasicAccessRule: Rule name</li><li>WebSec.PreciseMatchRule: Rule name</li><li>WebSec.RateLimitRule: Rule name</li><li>WebSec.BotCustomRule: Rule name</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul>
     * @param SubEntityName <p>Sub-entity name, which has different meanings depending on SubEntityType:</p><ul><li>WebSec.ExceptionRule: Rule name</li><li>WebSec.BasicAccessRule: Rule name</li><li>WebSec.PreciseMatchRule: Rule name</li><li>WebSec.RateLimitRule: Rule name</li><li>WebSec.BotCustomRule: Rule name</li><li>DDoS.L4Proxy.IpAccessControl: Empty</li><li>DDoS.L3Transit.IpAccessControl: Empty</li></ul>
     */
    public void setSubEntityName(String SubEntityName) {
        this.SubEntityName = SubEntityName;
    }

    public CustomGroupReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGroupReference(CustomGroupReference source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.SubEntityType != null) {
            this.SubEntityType = new String(source.SubEntityType);
        }
        if (source.SubEntityId != null) {
            this.SubEntityId = new String(source.SubEntityId);
        }
        if (source.SubEntityName != null) {
            this.SubEntityName = new String(source.SubEntityName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamSimple(map, prefix + "SubEntityType", this.SubEntityType);
        this.setParamSimple(map, prefix + "SubEntityId", this.SubEntityId);
        this.setParamSimple(map, prefix + "SubEntityName", this.SubEntityName);

    }
}

