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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVirusFileStatusRequest extends AbstractModel {

    /**
    * IDs of events
    */
    @SerializedName("EventIdSet")
    @Expose
    private String [] EventIdSet;

    /**
    * Event status   
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
    `EVENT_DEL`: Deleted.
    `EVENT_ADD_WHITE`: Allowed.
    `EVENT_PENDING`: Pending.
	`EVENT_ISOLATE_CONTAINER`: Container isolated.
	`EVENT_RESOTRE_CONTAINER`: Container recovered.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Event remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether to automatically isolate files with the same MD5 checksum
    */
    @SerializedName("AutoIsolate")
    @Expose
    private Boolean AutoIsolate;

    /**
     * Get IDs of events 
     * @return EventIdSet IDs of events
     */
    public String [] getEventIdSet() {
        return this.EventIdSet;
    }

    /**
     * Set IDs of events
     * @param EventIdSet IDs of events
     */
    public void setEventIdSet(String [] EventIdSet) {
        this.EventIdSet = EventIdSet;
    }

    /**
     * Get Event status   
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
    `EVENT_DEL`: Deleted.
    `EVENT_ADD_WHITE`: Allowed.
    `EVENT_PENDING`: Pending.
	`EVENT_ISOLATE_CONTAINER`: Container isolated.
	`EVENT_RESOTRE_CONTAINER`: Container recovered. 
     * @return Status Event status   
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
    `EVENT_DEL`: Deleted.
    `EVENT_ADD_WHITE`: Allowed.
    `EVENT_PENDING`: Pending.
	`EVENT_ISOLATE_CONTAINER`: Container isolated.
	`EVENT_RESOTRE_CONTAINER`: Container recovered.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Event status   
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
    `EVENT_DEL`: Deleted.
    `EVENT_ADD_WHITE`: Allowed.
    `EVENT_PENDING`: Pending.
	`EVENT_ISOLATE_CONTAINER`: Container isolated.
	`EVENT_RESOTRE_CONTAINER`: Container recovered.
     * @param Status Event status   
    `EVENT_DEALED`: Processed.
    `EVENT_INGNORE`: Ignored.
    `EVENT_DEL`: Deleted.
    `EVENT_ADD_WHITE`: Allowed.
    `EVENT_PENDING`: Pending.
	`EVENT_ISOLATE_CONTAINER`: Container isolated.
	`EVENT_RESOTRE_CONTAINER`: Container recovered.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Event remarks 
     * @return Remark Event remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Event remarks
     * @param Remark Event remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether to automatically isolate files with the same MD5 checksum 
     * @return AutoIsolate Whether to automatically isolate files with the same MD5 checksum
     */
    public Boolean getAutoIsolate() {
        return this.AutoIsolate;
    }

    /**
     * Set Whether to automatically isolate files with the same MD5 checksum
     * @param AutoIsolate Whether to automatically isolate files with the same MD5 checksum
     */
    public void setAutoIsolate(Boolean AutoIsolate) {
        this.AutoIsolate = AutoIsolate;
    }

    public ModifyVirusFileStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirusFileStatusRequest(ModifyVirusFileStatusRequest source) {
        if (source.EventIdSet != null) {
            this.EventIdSet = new String[source.EventIdSet.length];
            for (int i = 0; i < source.EventIdSet.length; i++) {
                this.EventIdSet[i] = new String(source.EventIdSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AutoIsolate != null) {
            this.AutoIsolate = new Boolean(source.AutoIsolate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIdSet.", this.EventIdSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AutoIsolate", this.AutoIsolate);

    }
}

