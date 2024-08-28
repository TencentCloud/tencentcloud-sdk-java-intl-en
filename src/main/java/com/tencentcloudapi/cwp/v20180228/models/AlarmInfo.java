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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmInfo extends AbstractModel {

    /**
    * Table names of IDs of alarms associated with the node. Separate multiple pairs with commas. Example: t1:id1,t2:id2
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * Alarm status. This parameter takes effect when this node is an alarm node.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Table names of IDs of alarms associated with the node. Separate multiple pairs with commas. Example: t1:id1,t2:id2 
     * @return AlarmId Table names of IDs of alarms associated with the node. Separate multiple pairs with commas. Example: t1:id1,t2:id2
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set Table names of IDs of alarms associated with the node. Separate multiple pairs with commas. Example: t1:id1,t2:id2
     * @param AlarmId Table names of IDs of alarms associated with the node. Separate multiple pairs with commas. Example: t1:id1,t2:id2
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get Alarm status. This parameter takes effect when this node is an alarm node. 
     * @return Status Alarm status. This parameter takes effect when this node is an alarm node.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Alarm status. This parameter takes effect when this node is an alarm node.
     * @param Status Alarm status. This parameter takes effect when this node is an alarm node.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmInfo(AlarmInfo source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

