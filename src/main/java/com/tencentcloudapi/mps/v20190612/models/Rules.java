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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rules extends AbstractModel {

    /**
    * Judgment condition ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Judgment condition configuration.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Conditions")
    @Expose
    private RuleConditionItem [] Conditions;

    /**
    * Logical operator for the list of conditions. Valid values:

 - &&: logical AND
 - ||: logical OR
    */
    @SerializedName("Linker")
    @Expose
    private String Linker;

    /**
    * Indexes of the nodes to execute if the judgment conditions are met.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RearDriveIndexs")
    @Expose
    private Long [] RearDriveIndexs;

    /**
     * Get Judgment condition ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Judgment condition ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Judgment condition ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Judgment condition ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Judgment condition configuration.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Conditions Judgment condition configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleConditionItem [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Judgment condition configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Conditions Judgment condition configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConditions(RuleConditionItem [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Logical operator for the list of conditions. Valid values:

 - &&: logical AND
 - ||: logical OR 
     * @return Linker Logical operator for the list of conditions. Valid values:

 - &&: logical AND
 - ||: logical OR
     */
    public String getLinker() {
        return this.Linker;
    }

    /**
     * Set Logical operator for the list of conditions. Valid values:

 - &&: logical AND
 - ||: logical OR
     * @param Linker Logical operator for the list of conditions. Valid values:

 - &&: logical AND
 - ||: logical OR
     */
    public void setLinker(String Linker) {
        this.Linker = Linker;
    }

    /**
     * Get Indexes of the nodes to execute if the judgment conditions are met.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RearDriveIndexs Indexes of the nodes to execute if the judgment conditions are met.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getRearDriveIndexs() {
        return this.RearDriveIndexs;
    }

    /**
     * Set Indexes of the nodes to execute if the judgment conditions are met.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RearDriveIndexs Indexes of the nodes to execute if the judgment conditions are met.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRearDriveIndexs(Long [] RearDriveIndexs) {
        this.RearDriveIndexs = RearDriveIndexs;
    }

    public Rules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rules(Rules source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Conditions != null) {
            this.Conditions = new RuleConditionItem[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleConditionItem(source.Conditions[i]);
            }
        }
        if (source.Linker != null) {
            this.Linker = new String(source.Linker);
        }
        if (source.RearDriveIndexs != null) {
            this.RearDriveIndexs = new Long[source.RearDriveIndexs.length];
            for (int i = 0; i < source.RearDriveIndexs.length; i++) {
                this.RearDriveIndexs[i] = new Long(source.RearDriveIndexs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Linker", this.Linker);
        this.setParamArraySimple(map, prefix + "RearDriveIndexs.", this.RearDriveIndexs);

    }
}

