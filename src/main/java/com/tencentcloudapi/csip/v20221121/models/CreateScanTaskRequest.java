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

public class CreateScanTaskRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Detection mode</p>
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * <p>Rule collection</p>
    */
    @SerializedName("RuleIDs")
    @Expose
    private String [] RuleIDs;

    /**
    * <p>Specification ID</p>
    */
    @SerializedName("StandardIDs")
    @Expose
    private Long [] StandardIDs;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Detection mode</p> 
     * @return TaskMode <p>Detection mode</p>
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set <p>Detection mode</p>
     * @param TaskMode <p>Detection mode</p>
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get <p>Rule collection</p> 
     * @return RuleIDs <p>Rule collection</p>
     */
    public String [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set <p>Rule collection</p>
     * @param RuleIDs <p>Rule collection</p>
     */
    public void setRuleIDs(String [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get <p>Specification ID</p> 
     * @return StandardIDs <p>Specification ID</p>
     */
    public Long [] getStandardIDs() {
        return this.StandardIDs;
    }

    /**
     * Set <p>Specification ID</p>
     * @param StandardIDs <p>Specification ID</p>
     */
    public void setStandardIDs(Long [] StandardIDs) {
        this.StandardIDs = StandardIDs;
    }

    public CreateScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScanTaskRequest(CreateScanTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.RuleIDs != null) {
            this.RuleIDs = new String[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new String(source.RuleIDs[i]);
            }
        }
        if (source.StandardIDs != null) {
            this.StandardIDs = new Long[source.StandardIDs.length];
            for (int i = 0; i < source.StandardIDs.length; i++) {
                this.StandardIDs[i] = new Long(source.StandardIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamArraySimple(map, prefix + "StandardIDs.", this.StandardIDs);

    }
}

