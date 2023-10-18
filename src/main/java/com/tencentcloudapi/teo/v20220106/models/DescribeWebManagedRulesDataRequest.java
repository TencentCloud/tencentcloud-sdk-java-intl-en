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

public class DescribeWebManagedRulesDataRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * List of statistical metrics
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * List of site IDs
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * List of subdomain names
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Protocol type
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * "webshell" : WebShell detection prevention
"oa" : Common OA vulnerability prevention
"xss" : XSS attack prevention
"xxe" : XXE attack prevention
"webscan" : Scanner attack vulnerability prevention
"cms" : Common CMS vulnerability prevention
"upload" : Malicious file upload attack prevention
"sql" : SQL injection attack prevention
"cmd_inject": Command/Code injection attack prevention
"osc" : Open-source component vulnerability prevention
"file_read" : Arbitrary file read prevention
"ldap" : LDAP injection attack prevention
"other" : Other vulnerability prevention

"all":"All"
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Query time granularity. Valid values: {min,5min,hour,day}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get List of statistical metrics 
     * @return MetricNames List of statistical metrics
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set List of statistical metrics
     * @param MetricNames List of statistical metrics
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get List of site IDs 
     * @return ZoneIds List of site IDs
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of site IDs
     * @param ZoneIds List of site IDs
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get List of subdomain names 
     * @return Domains List of subdomain names
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of subdomain names
     * @param Domains List of subdomain names
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Protocol type 
     * @return ProtocolType Protocol type
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set Protocol type
     * @param ProtocolType Protocol type
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get "webshell" : WebShell detection prevention
"oa" : Common OA vulnerability prevention
"xss" : XSS attack prevention
"xxe" : XXE attack prevention
"webscan" : Scanner attack vulnerability prevention
"cms" : Common CMS vulnerability prevention
"upload" : Malicious file upload attack prevention
"sql" : SQL injection attack prevention
"cmd_inject": Command/Code injection attack prevention
"osc" : Open-source component vulnerability prevention
"file_read" : Arbitrary file read prevention
"ldap" : LDAP injection attack prevention
"other" : Other vulnerability prevention

"all":"All" 
     * @return AttackType "webshell" : WebShell detection prevention
"oa" : Common OA vulnerability prevention
"xss" : XSS attack prevention
"xxe" : XXE attack prevention
"webscan" : Scanner attack vulnerability prevention
"cms" : Common CMS vulnerability prevention
"upload" : Malicious file upload attack prevention
"sql" : SQL injection attack prevention
"cmd_inject": Command/Code injection attack prevention
"osc" : Open-source component vulnerability prevention
"file_read" : Arbitrary file read prevention
"ldap" : LDAP injection attack prevention
"other" : Other vulnerability prevention

"all":"All"
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set "webshell" : WebShell detection prevention
"oa" : Common OA vulnerability prevention
"xss" : XSS attack prevention
"xxe" : XXE attack prevention
"webscan" : Scanner attack vulnerability prevention
"cms" : Common CMS vulnerability prevention
"upload" : Malicious file upload attack prevention
"sql" : SQL injection attack prevention
"cmd_inject": Command/Code injection attack prevention
"osc" : Open-source component vulnerability prevention
"file_read" : Arbitrary file read prevention
"ldap" : LDAP injection attack prevention
"other" : Other vulnerability prevention

"all":"All"
     * @param AttackType "webshell" : WebShell detection prevention
"oa" : Common OA vulnerability prevention
"xss" : XSS attack prevention
"xxe" : XXE attack prevention
"webscan" : Scanner attack vulnerability prevention
"cms" : Common CMS vulnerability prevention
"upload" : Malicious file upload attack prevention
"sql" : SQL injection attack prevention
"cmd_inject": Command/Code injection attack prevention
"osc" : Open-source component vulnerability prevention
"file_read" : Arbitrary file read prevention
"ldap" : LDAP injection attack prevention
"other" : Other vulnerability prevention

"all":"All"
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Query time granularity. Valid values: {min,5min,hour,day} 
     * @return Interval Query time granularity. Valid values: {min,5min,hour,day}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Query time granularity. Valid values: {min,5min,hour,day}
     * @param Interval Query time granularity. Valid values: {min,5min,hour,day}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeWebManagedRulesDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebManagedRulesDataRequest(DescribeWebManagedRulesDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

