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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclRuleResp extends AbstractModel{

    /**
    * Total number of data entries
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * ACL rule list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AclRuleList")
    @Expose
    private AclRule [] AclRuleList;

    /**
     * Get Total number of data entries 
     * @return TotalCount Total number of data entries
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of data entries
     * @param TotalCount Total number of data entries
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get ACL rule list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AclRuleList ACL rule list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AclRule [] getAclRuleList() {
        return this.AclRuleList;
    }

    /**
     * Set ACL rule list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AclRuleList ACL rule list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAclRuleList(AclRule [] AclRuleList) {
        this.AclRuleList = AclRuleList;
    }

    public AclRuleResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclRuleResp(AclRuleResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AclRuleList != null) {
            this.AclRuleList = new AclRule[source.AclRuleList.length];
            for (int i = 0; i < source.AclRuleList.length; i++) {
                this.AclRuleList[i] = new AclRule(source.AclRuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AclRuleList.", this.AclRuleList);

    }
}

