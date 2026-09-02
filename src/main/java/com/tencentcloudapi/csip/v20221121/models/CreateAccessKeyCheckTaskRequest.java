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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessKeyCheckTaskRequest extends AbstractModel {

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Risk list.
    */
    @SerializedName("RiskIDList")
    @Expose
    private Long [] RiskIDList;

    /**
    * Access key list
    */
    @SerializedName("AccessKeyList")
    @Expose
    private String [] AccessKeyList;

    /**
    * List of account uins
    */
    @SerializedName("SubUinList")
    @Expose
    private String [] SubUinList;

    /**
    * List of risk rule IDs
    */
    @SerializedName("RiskRuleIDList")
    @Expose
    private Long [] RiskRuleIDList;

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Risk list. 
     * @return RiskIDList Risk list.
     */
    public Long [] getRiskIDList() {
        return this.RiskIDList;
    }

    /**
     * Set Risk list.
     * @param RiskIDList Risk list.
     */
    public void setRiskIDList(Long [] RiskIDList) {
        this.RiskIDList = RiskIDList;
    }

    /**
     * Get Access key list 
     * @return AccessKeyList Access key list
     */
    public String [] getAccessKeyList() {
        return this.AccessKeyList;
    }

    /**
     * Set Access key list
     * @param AccessKeyList Access key list
     */
    public void setAccessKeyList(String [] AccessKeyList) {
        this.AccessKeyList = AccessKeyList;
    }

    /**
     * Get List of account uins 
     * @return SubUinList List of account uins
     */
    public String [] getSubUinList() {
        return this.SubUinList;
    }

    /**
     * Set List of account uins
     * @param SubUinList List of account uins
     */
    public void setSubUinList(String [] SubUinList) {
        this.SubUinList = SubUinList;
    }

    /**
     * Get List of risk rule IDs 
     * @return RiskRuleIDList List of risk rule IDs
     */
    public Long [] getRiskRuleIDList() {
        return this.RiskRuleIDList;
    }

    /**
     * Set List of risk rule IDs
     * @param RiskRuleIDList List of risk rule IDs
     */
    public void setRiskRuleIDList(Long [] RiskRuleIDList) {
        this.RiskRuleIDList = RiskRuleIDList;
    }

    public CreateAccessKeyCheckTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessKeyCheckTaskRequest(CreateAccessKeyCheckTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RiskIDList != null) {
            this.RiskIDList = new Long[source.RiskIDList.length];
            for (int i = 0; i < source.RiskIDList.length; i++) {
                this.RiskIDList[i] = new Long(source.RiskIDList[i]);
            }
        }
        if (source.AccessKeyList != null) {
            this.AccessKeyList = new String[source.AccessKeyList.length];
            for (int i = 0; i < source.AccessKeyList.length; i++) {
                this.AccessKeyList[i] = new String(source.AccessKeyList[i]);
            }
        }
        if (source.SubUinList != null) {
            this.SubUinList = new String[source.SubUinList.length];
            for (int i = 0; i < source.SubUinList.length; i++) {
                this.SubUinList[i] = new String(source.SubUinList[i]);
            }
        }
        if (source.RiskRuleIDList != null) {
            this.RiskRuleIDList = new Long[source.RiskRuleIDList.length];
            for (int i = 0; i < source.RiskRuleIDList.length; i++) {
                this.RiskRuleIDList[i] = new Long(source.RiskRuleIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "RiskIDList.", this.RiskIDList);
        this.setParamArraySimple(map, prefix + "AccessKeyList.", this.AccessKeyList);
        this.setParamArraySimple(map, prefix + "SubUinList.", this.SubUinList);
        this.setParamArraySimple(map, prefix + "RiskRuleIDList.", this.RiskRuleIDList);

    }
}

