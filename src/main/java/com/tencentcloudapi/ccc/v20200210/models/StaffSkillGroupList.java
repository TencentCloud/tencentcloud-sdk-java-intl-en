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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffSkillGroupList extends AbstractModel {

    /**
    * Skill group ID.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * Priority of the agent in the skill group (1 is the highest, 5 is the lowest, 3 by default).
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get Skill group ID. 
     * @return SkillGroupId Skill group ID.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group ID.
     * @param SkillGroupId Skill group ID.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Priority of the agent in the skill group (1 is the highest, 5 is the lowest, 3 by default). 
     * @return Priority Priority of the agent in the skill group (1 is the highest, 5 is the lowest, 3 by default).
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority of the agent in the skill group (1 is the highest, 5 is the lowest, 3 by default).
     * @param Priority Priority of the agent in the skill group (1 is the highest, 5 is the lowest, 3 by default).
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public StaffSkillGroupList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffSkillGroupList(StaffSkillGroupList source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

