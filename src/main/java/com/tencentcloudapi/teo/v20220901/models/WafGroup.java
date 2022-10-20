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

public class WafGroup extends AbstractModel{

    /**
    * Action to be executed. Values:
<li>`block`: Block</li>
<li>`observe: Observe</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * ID of the rule type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
     * Get Action to be executed. Values:
<li>`block`: Block</li>
<li>`observe: Observe</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action Action to be executed. Values:
<li>`block`: Block</li>
<li>`observe: Observe</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. Values:
<li>`block`: Block</li>
<li>`observe: Observe</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action Action to be executed. Values:
<li>`block`: Block</li>
<li>`observe: Observe</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level The protection level. Values:
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
<li>`custom`: Custom</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get ID of the rule type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TypeId ID of the rule type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set ID of the rule type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TypeId ID of the rule type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    public WafGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafGroup(WafGroup source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);

    }
}

