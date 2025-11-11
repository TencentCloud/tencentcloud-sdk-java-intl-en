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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAclRuleRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Specifies whether to apply to newly-added topics when importing predefined rule modifications.
    */
    @SerializedName("IsApplied")
    @Expose
    private Long IsApplied;

    /**
     * Get The ckafka cluster instance Id. 
     * @return InstanceId The ckafka cluster instance Id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id.
     * @param InstanceId The ckafka cluster instance Id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ACL rule name. 
     * @return RuleName ACL rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set ACL rule name.
     * @param RuleName ACL rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Specifies whether to apply to newly-added topics when importing predefined rule modifications. 
     * @return IsApplied Specifies whether to apply to newly-added topics when importing predefined rule modifications.
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set Specifies whether to apply to newly-added topics when importing predefined rule modifications.
     * @param IsApplied Specifies whether to apply to newly-added topics when importing predefined rule modifications.
     */
    public void setIsApplied(Long IsApplied) {
        this.IsApplied = IsApplied;
    }

    public ModifyAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAclRuleRequest(ModifyAclRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.IsApplied != null) {
            this.IsApplied = new Long(source.IsApplied);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "IsApplied", this.IsApplied);

    }
}

