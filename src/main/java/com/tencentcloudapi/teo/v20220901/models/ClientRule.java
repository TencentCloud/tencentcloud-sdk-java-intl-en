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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientRule extends AbstractModel{

    /**
    * The client IP.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * The rule type.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * The rule description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The blocking status. Values:
<li>`block`: Block;</li>
<li>`allow`: Allow.</li>
    */
    @SerializedName("IpStatus")
    @Expose
    private String IpStatus;

    /**
    * The blocking time recorded in UNIX timestamp.
    */
    @SerializedName("BlockTime")
    @Expose
    private Long BlockTime;

    /**
    * The data entry ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get The client IP. 
     * @return ClientIp The client IP.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set The client IP.
     * @param ClientIp The client IP.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get The rule type. 
     * @return RuleType The rule type.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set The rule type.
     * @param RuleType The rule type.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get The rule ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get The rule description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description The rule description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The rule description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description The rule description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The blocking status. Values:
<li>`block`: Block;</li>
<li>`allow`: Allow.</li> 
     * @return IpStatus The blocking status. Values:
<li>`block`: Block;</li>
<li>`allow`: Allow.</li>
     */
    public String getIpStatus() {
        return this.IpStatus;
    }

    /**
     * Set The blocking status. Values:
<li>`block`: Block;</li>
<li>`allow`: Allow.</li>
     * @param IpStatus The blocking status. Values:
<li>`block`: Block;</li>
<li>`allow`: Allow.</li>
     */
    public void setIpStatus(String IpStatus) {
        this.IpStatus = IpStatus;
    }

    /**
     * Get The blocking time recorded in UNIX timestamp. 
     * @return BlockTime The blocking time recorded in UNIX timestamp.
     */
    public Long getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set The blocking time recorded in UNIX timestamp.
     * @param BlockTime The blocking time recorded in UNIX timestamp.
     */
    public void setBlockTime(Long BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * Get The data entry ID. 
     * @return Id The data entry ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The data entry ID.
     * @param Id The data entry ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public ClientRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientRule(ClientRule source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IpStatus != null) {
            this.IpStatus = new String(source.IpStatus);
        }
        if (source.BlockTime != null) {
            this.BlockTime = new Long(source.BlockTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IpStatus", this.IpStatus);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

