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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHistogramRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("FromTime")
    @Expose
    private String FromTime;

    /**
    * End time
    */
    @SerializedName("ToTime")
    @Expose
    private String ToTime;

    /**
    * Clustering fields. ip: IP aggregation; art: response time aggregation; url: URL aggregation; local: city aggregation after IP conversion; qps: second-level peak request count aggregation; up: peak upstream bandwidth aggregation; down: peak downstream bandwidth aggregation
    */
    @SerializedName("QueryField")
    @Expose
    private String QueryField;

    /**
    * Condition, access for access logs, attack for attack logs
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Compatible host, gradually phasing out Host field
    */
    @SerializedName("Host")
    @Expose
    private String Host;

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
    * Domain filtering, not applied if not input, used to replace Host field and phase out Host
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Start time 
     * @return FromTime Start time
     */
    public String getFromTime() {
        return this.FromTime;
    }

    /**
     * Set Start time
     * @param FromTime Start time
     */
    public void setFromTime(String FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get End time 
     * @return ToTime End time
     */
    public String getToTime() {
        return this.ToTime;
    }

    /**
     * Set End time
     * @param ToTime End time
     */
    public void setToTime(String ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get Clustering fields. ip: IP aggregation; art: response time aggregation; url: URL aggregation; local: city aggregation after IP conversion; qps: second-level peak request count aggregation; up: peak upstream bandwidth aggregation; down: peak downstream bandwidth aggregation 
     * @return QueryField Clustering fields. ip: IP aggregation; art: response time aggregation; url: URL aggregation; local: city aggregation after IP conversion; qps: second-level peak request count aggregation; up: peak upstream bandwidth aggregation; down: peak downstream bandwidth aggregation
     */
    public String getQueryField() {
        return this.QueryField;
    }

    /**
     * Set Clustering fields. ip: IP aggregation; art: response time aggregation; url: URL aggregation; local: city aggregation after IP conversion; qps: second-level peak request count aggregation; up: peak upstream bandwidth aggregation; down: peak downstream bandwidth aggregation
     * @param QueryField Clustering fields. ip: IP aggregation; art: response time aggregation; url: URL aggregation; local: city aggregation after IP conversion; qps: second-level peak request count aggregation; up: peak upstream bandwidth aggregation; down: peak downstream bandwidth aggregation
     */
    public void setQueryField(String QueryField) {
        this.QueryField = QueryField;
    }

    /**
     * Get Condition, access for access logs, attack for attack logs 
     * @return Source Condition, access for access logs, attack for attack logs
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Condition, access for access logs, attack for attack logs
     * @param Source Condition, access for access logs, attack for attack logs
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Compatible host, gradually phasing out Host field 
     * @return Host Compatible host, gradually phasing out Host field
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Compatible host, gradually phasing out Host field
     * @param Host Compatible host, gradually phasing out Host field
     */
    public void setHost(String Host) {
        this.Host = Host;
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
     * Get Domain filtering, not applied if not input, used to replace Host field and phase out Host 
     * @return Domain Domain filtering, not applied if not input, used to replace Host field and phase out Host
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain filtering, not applied if not input, used to replace Host field and phase out Host
     * @param Domain Domain filtering, not applied if not input, used to replace Host field and phase out Host
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public DescribeHistogramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHistogramRequest(DescribeHistogramRequest source) {
        if (source.FromTime != null) {
            this.FromTime = new String(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new String(source.ToTime);
        }
        if (source.QueryField != null) {
            this.QueryField = new String(source.QueryField);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);
        this.setParamSimple(map, prefix + "QueryField", this.QueryField);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

