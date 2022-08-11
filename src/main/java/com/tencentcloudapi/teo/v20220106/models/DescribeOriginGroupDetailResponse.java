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

public class DescribeOriginGroupDetailResponse extends AbstractModel{

    /**
    * Origin group ID
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * Origin group name
    */
    @SerializedName("OriginName")
    @Expose
    private String OriginName;

    /**
    * Origin-pull configuration type
`area`: Origin-pull by the client IP’s region specified by `Area` in OriginRecord.
`weight`: Origin-pull by the weight specified by `Weight` in OriginRecord.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Record
    */
    @SerializedName("Record")
    @Expose
    private OriginRecord [] Record;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Origin type
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Whether the origin group uses layer-4 proxy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationProxyUsed")
    @Expose
    private Boolean ApplicationProxyUsed;

    /**
    * Whether the origin group is used for load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancingUsed")
    @Expose
    private Boolean LoadBalancingUsed;

    /**
    * Proxy mode of the load balancing task associated with the origin group.
`none`: Not used for load balancing.
`dns_only`: Used for DNS-only load balancing.
`proxied`: Used for proxied load balancing.
`both`: Used for both DNS-only and proxied load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancingUsedType")
    @Expose
    private String LoadBalancingUsedType;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Origin group ID 
     * @return OriginId Origin group ID
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set Origin group ID
     * @param OriginId Origin group ID
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get Origin group name 
     * @return OriginName Origin group name
     */
    public String getOriginName() {
        return this.OriginName;
    }

    /**
     * Set Origin group name
     * @param OriginName Origin group name
     */
    public void setOriginName(String OriginName) {
        this.OriginName = OriginName;
    }

    /**
     * Get Origin-pull configuration type
`area`: Origin-pull by the client IP’s region specified by `Area` in OriginRecord.
`weight`: Origin-pull by the weight specified by `Weight` in OriginRecord. 
     * @return Type Origin-pull configuration type
`area`: Origin-pull by the client IP’s region specified by `Area` in OriginRecord.
`weight`: Origin-pull by the weight specified by `Weight` in OriginRecord.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin-pull configuration type
`area`: Origin-pull by the client IP’s region specified by `Area` in OriginRecord.
`weight`: Origin-pull by the weight specified by `Weight` in OriginRecord.
     * @param Type Origin-pull configuration type
`area`: Origin-pull by the client IP’s region specified by `Area` in OriginRecord.
`weight`: Origin-pull by the weight specified by `Weight` in OriginRecord.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Record 
     * @return Record Record
     */
    public OriginRecord [] getRecord() {
        return this.Record;
    }

    /**
     * Set Record
     * @param Record Record
     */
    public void setRecord(OriginRecord [] Record) {
        this.Record = Record;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

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
     * Get Site name 
     * @return ZoneName Site name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name
     * @param ZoneName Site name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Origin type
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return OriginType Origin type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin type
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param OriginType Origin type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Whether the origin group uses layer-4 proxy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationProxyUsed Whether the origin group uses layer-4 proxy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getApplicationProxyUsed() {
        return this.ApplicationProxyUsed;
    }

    /**
     * Set Whether the origin group uses layer-4 proxy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationProxyUsed Whether the origin group uses layer-4 proxy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationProxyUsed(Boolean ApplicationProxyUsed) {
        this.ApplicationProxyUsed = ApplicationProxyUsed;
    }

    /**
     * Get Whether the origin group is used for load balancing.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancingUsed Whether the origin group is used for load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getLoadBalancingUsed() {
        return this.LoadBalancingUsed;
    }

    /**
     * Set Whether the origin group is used for load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancingUsed Whether the origin group is used for load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancingUsed(Boolean LoadBalancingUsed) {
        this.LoadBalancingUsed = LoadBalancingUsed;
    }

    /**
     * Get Proxy mode of the load balancing task associated with the origin group.
`none`: Not used for load balancing.
`dns_only`: Used for DNS-only load balancing.
`proxied`: Used for proxied load balancing.
`both`: Used for both DNS-only and proxied load balancing.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancingUsedType Proxy mode of the load balancing task associated with the origin group.
`none`: Not used for load balancing.
`dns_only`: Used for DNS-only load balancing.
`proxied`: Used for proxied load balancing.
`both`: Used for both DNS-only and proxied load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancingUsedType() {
        return this.LoadBalancingUsedType;
    }

    /**
     * Set Proxy mode of the load balancing task associated with the origin group.
`none`: Not used for load balancing.
`dns_only`: Used for DNS-only load balancing.
`proxied`: Used for proxied load balancing.
`both`: Used for both DNS-only and proxied load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancingUsedType Proxy mode of the load balancing task associated with the origin group.
`none`: Not used for load balancing.
`dns_only`: Used for DNS-only load balancing.
`proxied`: Used for proxied load balancing.
`both`: Used for both DNS-only and proxied load balancing.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancingUsedType(String LoadBalancingUsedType) {
        this.LoadBalancingUsedType = LoadBalancingUsedType;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOriginGroupDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginGroupDetailResponse(DescribeOriginGroupDetailResponse source) {
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.OriginName != null) {
            this.OriginName = new String(source.OriginName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Record != null) {
            this.Record = new OriginRecord[source.Record.length];
            for (int i = 0; i < source.Record.length; i++) {
                this.Record[i] = new OriginRecord(source.Record[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.ApplicationProxyUsed != null) {
            this.ApplicationProxyUsed = new Boolean(source.ApplicationProxyUsed);
        }
        if (source.LoadBalancingUsed != null) {
            this.LoadBalancingUsed = new Boolean(source.LoadBalancingUsed);
        }
        if (source.LoadBalancingUsedType != null) {
            this.LoadBalancingUsedType = new String(source.LoadBalancingUsedType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "OriginName", this.OriginName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Record.", this.Record);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "ApplicationProxyUsed", this.ApplicationProxyUsed);
        this.setParamSimple(map, prefix + "LoadBalancingUsed", this.LoadBalancingUsed);
        this.setParamSimple(map, prefix + "LoadBalancingUsedType", this.LoadBalancingUsedType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

