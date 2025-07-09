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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewDDoSEventListRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Filters by the attack status. `start`: The attack is ongoing; `end`: The attack ends.
    */
    @SerializedName("AttackStatus")
    @Expose
    private String AttackStatus;

    /**
    * The offset value
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Total number of records
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filters by the attack status. `start`: The attack is ongoing; `end`: The attack ends. 
     * @return AttackStatus Filters by the attack status. `start`: The attack is ongoing; `end`: The attack ends.
     */
    public String getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set Filters by the attack status. `start`: The attack is ongoing; `end`: The attack ends.
     * @param AttackStatus Filters by the attack status. `start`: The attack is ongoing; `end`: The attack ends.
     */
    public void setAttackStatus(String AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get The offset value 
     * @return Offset The offset value
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset value
     * @param Offset The offset value
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Total number of records 
     * @return Limit Total number of records
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Total number of records
     * @param Limit Total number of records
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeOverviewDDoSEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOverviewDDoSEventListRequest(DescribeOverviewDDoSEventListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AttackStatus != null) {
            this.AttackStatus = new String(source.AttackStatus);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

