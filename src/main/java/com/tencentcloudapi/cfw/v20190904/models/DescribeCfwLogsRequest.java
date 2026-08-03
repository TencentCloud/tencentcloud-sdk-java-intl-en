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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwLogsRequest extends AbstractModel {

    /**
    * Log type. Required for the initial query; cannot be passed when using NextToken for continuation. cfw_netflow_border=Internet boundary traffic, cfw_netflow_vpc=VPC east-west traffic, cfw_netflow_nat=NAT firewall traffic, cfw_netflow_nta=NDR/NTA traffic, cfw_netflow_dns=DNS firewall log, cfw_rule_threatinfo=Intrusion defense/Threat Intelligence Alarm, cfw_rule_acl=Internet Boundary Access Control log, cfw_rule_vpc_acl=VPC access control log, cfw_rule_nat_acl=NAT access control log, cfw_ndr_subject_risk=NDR topic risk, cfw_ndr_dataleak_entry=NDR sensitive data leak, cfw_ndr_ai_audit=NDR AI application identification and Large Model Invocation audit, cfw_feature_collect=Statistical feature and baseline anomaly, cfw_behavior_collect=Beacon/DNS/port/cert/VPC mutual access behavior, operate_log_all=Operation audit log.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Log filter expression. Default * means no filtering; for example src_ip:1.1.1.1. Queryable fields vary with LogType. You should preferentially use the field name returned in the corresponding Items. Do not guess non-existing fields. It cannot be passed when using NextToken for continued query.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Query start time. Supports RFC3339, YYYY-MM-DD HH:MM:SS, YYYY-MM-DD, or Unix timestamp. Input to query the TimeRange backward from this time. Cannot be imported when using NextToken for continued querying.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query time range. Default 1h; format is positive integer plus unit m/h/d, such as 5m, 1h, 24h, 7d; cannot be passed when using NextToken for continuation.
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
    * Return limit. Selectable for initial query, default 100; value 1 to 1000; cannot be passed when using NextToken for continued query.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Previous page opaque continuation token returned by Response.Data. Not required for initial query; only required for continuation query with NextToken. Invalid, tampered, or mismatched tenant will be rejected.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get Log type. Required for the initial query; cannot be passed when using NextToken for continuation. cfw_netflow_border=Internet boundary traffic, cfw_netflow_vpc=VPC east-west traffic, cfw_netflow_nat=NAT firewall traffic, cfw_netflow_nta=NDR/NTA traffic, cfw_netflow_dns=DNS firewall log, cfw_rule_threatinfo=Intrusion defense/Threat Intelligence Alarm, cfw_rule_acl=Internet Boundary Access Control log, cfw_rule_vpc_acl=VPC access control log, cfw_rule_nat_acl=NAT access control log, cfw_ndr_subject_risk=NDR topic risk, cfw_ndr_dataleak_entry=NDR sensitive data leak, cfw_ndr_ai_audit=NDR AI application identification and Large Model Invocation audit, cfw_feature_collect=Statistical feature and baseline anomaly, cfw_behavior_collect=Beacon/DNS/port/cert/VPC mutual access behavior, operate_log_all=Operation audit log. 
     * @return LogType Log type. Required for the initial query; cannot be passed when using NextToken for continuation. cfw_netflow_border=Internet boundary traffic, cfw_netflow_vpc=VPC east-west traffic, cfw_netflow_nat=NAT firewall traffic, cfw_netflow_nta=NDR/NTA traffic, cfw_netflow_dns=DNS firewall log, cfw_rule_threatinfo=Intrusion defense/Threat Intelligence Alarm, cfw_rule_acl=Internet Boundary Access Control log, cfw_rule_vpc_acl=VPC access control log, cfw_rule_nat_acl=NAT access control log, cfw_ndr_subject_risk=NDR topic risk, cfw_ndr_dataleak_entry=NDR sensitive data leak, cfw_ndr_ai_audit=NDR AI application identification and Large Model Invocation audit, cfw_feature_collect=Statistical feature and baseline anomaly, cfw_behavior_collect=Beacon/DNS/port/cert/VPC mutual access behavior, operate_log_all=Operation audit log.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type. Required for the initial query; cannot be passed when using NextToken for continuation. cfw_netflow_border=Internet boundary traffic, cfw_netflow_vpc=VPC east-west traffic, cfw_netflow_nat=NAT firewall traffic, cfw_netflow_nta=NDR/NTA traffic, cfw_netflow_dns=DNS firewall log, cfw_rule_threatinfo=Intrusion defense/Threat Intelligence Alarm, cfw_rule_acl=Internet Boundary Access Control log, cfw_rule_vpc_acl=VPC access control log, cfw_rule_nat_acl=NAT access control log, cfw_ndr_subject_risk=NDR topic risk, cfw_ndr_dataleak_entry=NDR sensitive data leak, cfw_ndr_ai_audit=NDR AI application identification and Large Model Invocation audit, cfw_feature_collect=Statistical feature and baseline anomaly, cfw_behavior_collect=Beacon/DNS/port/cert/VPC mutual access behavior, operate_log_all=Operation audit log.
     * @param LogType Log type. Required for the initial query; cannot be passed when using NextToken for continuation. cfw_netflow_border=Internet boundary traffic, cfw_netflow_vpc=VPC east-west traffic, cfw_netflow_nat=NAT firewall traffic, cfw_netflow_nta=NDR/NTA traffic, cfw_netflow_dns=DNS firewall log, cfw_rule_threatinfo=Intrusion defense/Threat Intelligence Alarm, cfw_rule_acl=Internet Boundary Access Control log, cfw_rule_vpc_acl=VPC access control log, cfw_rule_nat_acl=NAT access control log, cfw_ndr_subject_risk=NDR topic risk, cfw_ndr_dataleak_entry=NDR sensitive data leak, cfw_ndr_ai_audit=NDR AI application identification and Large Model Invocation audit, cfw_feature_collect=Statistical feature and baseline anomaly, cfw_behavior_collect=Beacon/DNS/port/cert/VPC mutual access behavior, operate_log_all=Operation audit log.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Log filter expression. Default * means no filtering; for example src_ip:1.1.1.1. Queryable fields vary with LogType. You should preferentially use the field name returned in the corresponding Items. Do not guess non-existing fields. It cannot be passed when using NextToken for continued query. 
     * @return Query Log filter expression. Default * means no filtering; for example src_ip:1.1.1.1. Queryable fields vary with LogType. You should preferentially use the field name returned in the corresponding Items. Do not guess non-existing fields. It cannot be passed when using NextToken for continued query.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Log filter expression. Default * means no filtering; for example src_ip:1.1.1.1. Queryable fields vary with LogType. You should preferentially use the field name returned in the corresponding Items. Do not guess non-existing fields. It cannot be passed when using NextToken for continued query.
     * @param Query Log filter expression. Default * means no filtering; for example src_ip:1.1.1.1. Queryable fields vary with LogType. You should preferentially use the field name returned in the corresponding Items. Do not guess non-existing fields. It cannot be passed when using NextToken for continued query.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Query start time. Supports RFC3339, YYYY-MM-DD HH:MM:SS, YYYY-MM-DD, or Unix timestamp. Input to query the TimeRange backward from this time. Cannot be imported when using NextToken for continued querying. 
     * @return StartTime Query start time. Supports RFC3339, YYYY-MM-DD HH:MM:SS, YYYY-MM-DD, or Unix timestamp. Input to query the TimeRange backward from this time. Cannot be imported when using NextToken for continued querying.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time. Supports RFC3339, YYYY-MM-DD HH:MM:SS, YYYY-MM-DD, or Unix timestamp. Input to query the TimeRange backward from this time. Cannot be imported when using NextToken for continued querying.
     * @param StartTime Query start time. Supports RFC3339, YYYY-MM-DD HH:MM:SS, YYYY-MM-DD, or Unix timestamp. Input to query the TimeRange backward from this time. Cannot be imported when using NextToken for continued querying.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query time range. Default 1h; format is positive integer plus unit m/h/d, such as 5m, 1h, 24h, 7d; cannot be passed when using NextToken for continuation. 
     * @return TimeRange Query time range. Default 1h; format is positive integer plus unit m/h/d, such as 5m, 1h, 24h, 7d; cannot be passed when using NextToken for continuation.
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set Query time range. Default 1h; format is positive integer plus unit m/h/d, such as 5m, 1h, 24h, 7d; cannot be passed when using NextToken for continuation.
     * @param TimeRange Query time range. Default 1h; format is positive integer plus unit m/h/d, such as 5m, 1h, 24h, 7d; cannot be passed when using NextToken for continuation.
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get Return limit. Selectable for initial query, default 100; value 1 to 1000; cannot be passed when using NextToken for continued query. 
     * @return Limit Return limit. Selectable for initial query, default 100; value 1 to 1000; cannot be passed when using NextToken for continued query.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Return limit. Selectable for initial query, default 100; value 1 to 1000; cannot be passed when using NextToken for continued query.
     * @param Limit Return limit. Selectable for initial query, default 100; value 1 to 1000; cannot be passed when using NextToken for continued query.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Previous page opaque continuation token returned by Response.Data. Not required for initial query; only required for continuation query with NextToken. Invalid, tampered, or mismatched tenant will be rejected. 
     * @return NextToken Previous page opaque continuation token returned by Response.Data. Not required for initial query; only required for continuation query with NextToken. Invalid, tampered, or mismatched tenant will be rejected.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Previous page opaque continuation token returned by Response.Data. Not required for initial query; only required for continuation query with NextToken. Invalid, tampered, or mismatched tenant will be rejected.
     * @param NextToken Previous page opaque continuation token returned by Response.Data. Not required for initial query; only required for continuation query with NextToken. Invalid, tampered, or mismatched tenant will be rejected.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeCfwLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwLogsRequest(DescribeCfwLogsRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

