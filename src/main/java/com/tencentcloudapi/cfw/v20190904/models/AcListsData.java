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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcListsData extends AbstractModel{

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Access source
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * Access destination
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * Protocol
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Policy
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Description
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Hit count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Priority
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * Alert rule ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Access source
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SourceIp Access source
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Access source
Note: This field may return `null`, indicating that no valid value was found.
     * @param SourceIp Access source
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get Access destination
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TargetIp Access destination
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set Access destination
Note: This field may return `null`, indicating that no valid value was found.
     * @param TargetIp Access destination
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get Protocol
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Protocol Protocol
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
Note: This field may return `null`, indicating that no valid value was found.
     * @param Protocol Protocol
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Port Port
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port
Note: This field may return `null`, indicating that no valid value was found.
     * @param Port Port
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Policy
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Strategy Policy
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Policy
Note: This field may return `null`, indicating that no valid value was found.
     * @param Strategy Policy
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Description
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Detail Description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Description
Note: This field may return `null`, indicating that no valid value was found.
     * @param Detail Description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Hit count 
     * @return Count Hit count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Hit count
     * @param Count Hit count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Priority 
     * @return OrderIndex Priority
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set Priority
     * @param OrderIndex Priority
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get Alert rule ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return LogId Alert rule ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set Alert rule ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param LogId Alert rule ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    public AcListsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcListsData(AcListsData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "LogId", this.LogId);

    }
}

