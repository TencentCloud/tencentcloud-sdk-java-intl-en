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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePeakPointsRequest extends AbstractModel {

    /**
    * Query start time
    */
    @SerializedName("FromTime")
    @Expose
    private String FromTime;

    /**
    * Query End Time
    */
    @SerializedName("ToTime")
    @Expose
    private String ToTime;

    /**
    * The domain to query, leave this parameter blank if querying data for all domains
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * WAF instance ID. No filter will be carried out if it is not input.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Twelve available values:
access: peak QPS trend chart
botAccess: peak bot QPS trend chart
down: downstream peak bandwidth trend chart
up: upstream peak bandwidth trend chart
attack: trend chart of total web attacks
cc: trend chart of total CC attacks
bw: trend chart of total attacks from blocklisted IP addresses
tamper: trend chart of total tampering attacks
leak: total leakage trend chart
acl: trend chart of total access control attacks
http_status: status code trend chart
wx_access: trend chart of peak WeChat mini program QPS
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get Query start time 
     * @return FromTime Query start time
     */
    public String getFromTime() {
        return this.FromTime;
    }

    /**
     * Set Query start time
     * @param FromTime Query start time
     */
    public void setFromTime(String FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get Query End Time 
     * @return ToTime Query End Time
     */
    public String getToTime() {
        return this.ToTime;
    }

    /**
     * Set Query End Time
     * @param ToTime Query End Time
     */
    public void setToTime(String ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get The domain to query, leave this parameter blank if querying data for all domains 
     * @return Domain The domain to query, leave this parameter blank if querying data for all domains
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain to query, leave this parameter blank if querying data for all domains
     * @param Domain The domain to query, leave this parameter blank if querying data for all domains
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Only two values are valid: sparta-waf, clb-waf. No filtering if not input. 
     * @return Edition Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
     * @param Edition Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get WAF instance ID. No filter will be carried out if it is not input. 
     * @return InstanceID WAF instance ID. No filter will be carried out if it is not input.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set WAF instance ID. No filter will be carried out if it is not input.
     * @param InstanceID WAF instance ID. No filter will be carried out if it is not input.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Twelve available values:
access: peak QPS trend chart
botAccess: peak bot QPS trend chart
down: downstream peak bandwidth trend chart
up: upstream peak bandwidth trend chart
attack: trend chart of total web attacks
cc: trend chart of total CC attacks
bw: trend chart of total attacks from blocklisted IP addresses
tamper: trend chart of total tampering attacks
leak: total leakage trend chart
acl: trend chart of total access control attacks
http_status: status code trend chart
wx_access: trend chart of peak WeChat mini program QPS 
     * @return MetricName Twelve available values:
access: peak QPS trend chart
botAccess: peak bot QPS trend chart
down: downstream peak bandwidth trend chart
up: upstream peak bandwidth trend chart
attack: trend chart of total web attacks
cc: trend chart of total CC attacks
bw: trend chart of total attacks from blocklisted IP addresses
tamper: trend chart of total tampering attacks
leak: total leakage trend chart
acl: trend chart of total access control attacks
http_status: status code trend chart
wx_access: trend chart of peak WeChat mini program QPS
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Twelve available values:
access: peak QPS trend chart
botAccess: peak bot QPS trend chart
down: downstream peak bandwidth trend chart
up: upstream peak bandwidth trend chart
attack: trend chart of total web attacks
cc: trend chart of total CC attacks
bw: trend chart of total attacks from blocklisted IP addresses
tamper: trend chart of total tampering attacks
leak: total leakage trend chart
acl: trend chart of total access control attacks
http_status: status code trend chart
wx_access: trend chart of peak WeChat mini program QPS
     * @param MetricName Twelve available values:
access: peak QPS trend chart
botAccess: peak bot QPS trend chart
down: downstream peak bandwidth trend chart
up: upstream peak bandwidth trend chart
attack: trend chart of total web attacks
cc: trend chart of total CC attacks
bw: trend chart of total attacks from blocklisted IP addresses
tamper: trend chart of total tampering attacks
leak: total leakage trend chart
acl: trend chart of total access control attacks
http_status: status code trend chart
wx_access: trend chart of peak WeChat mini program QPS
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    public DescribePeakPointsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePeakPointsRequest(DescribePeakPointsRequest source) {
        if (source.FromTime != null) {
            this.FromTime = new String(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new String(source.ToTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

