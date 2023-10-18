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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupCandidate extends AbstractModel {

    /**
    * Group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Most matching candidate recognized
    */
    @SerializedName("Candidates")
    @Expose
    private Candidate [] Candidates;

    /**
     * Get Group ID. 
     * @return GroupId Group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID.
     * @param GroupId Group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Most matching candidate recognized 
     * @return Candidates Most matching candidate recognized
     */
    public Candidate [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set Most matching candidate recognized
     * @param Candidates Most matching candidate recognized
     */
    public void setCandidates(Candidate [] Candidates) {
        this.Candidates = Candidates;
    }

    public GroupCandidate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupCandidate(GroupCandidate source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Candidates != null) {
            this.Candidates = new Candidate[source.Candidates.length];
            for (int i = 0; i < source.Candidates.length; i++) {
                this.Candidates[i] = new Candidate(source.Candidates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Candidates.", this.Candidates);

    }
}

