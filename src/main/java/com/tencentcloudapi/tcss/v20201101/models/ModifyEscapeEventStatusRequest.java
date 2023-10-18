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

public class ModifyEscapeEventStatusRequest extends AbstractModel {

    /**
    * List of event IDs
    */
    @SerializedName("EventIdSet")
    @Expose
    private String [] EventIdSet;

    /**
    * Event status:
`EVENT_UNDEAL`: Pending (Unignored).
`EVENT_DEALED`: Processed.
`EVENT_IGNORE`: Ignored.
`EVENT_DELETE`: Deleted.
`EVENT_ADD_WHITE`: Allowed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Array of allowed image IDs
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

    /**
    * Allowed event type
   `ESCAPE_CGROUPS`: Cgroup escape.
   `ESCAPE_TAMPER_SENSITIVE_FILE`: File tamper escape.
   `ESCAPE_DOCKER_API`: Docker API access escape.
   `ESCAPE_VUL_OCCURRED`: Vulnerability exploit.
   `MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `PRIVILEGE_CONTAINER_START`: Privileged container.
   `PRIVILEGE`: Program privilege escalation escape.
    */
    @SerializedName("EventType")
    @Expose
    private String [] EventType;

    /**
     * Get List of event IDs 
     * @return EventIdSet List of event IDs
     */
    public String [] getEventIdSet() {
        return this.EventIdSet;
    }

    /**
     * Set List of event IDs
     * @param EventIdSet List of event IDs
     */
    public void setEventIdSet(String [] EventIdSet) {
        this.EventIdSet = EventIdSet;
    }

    /**
     * Get Event status:
`EVENT_UNDEAL`: Pending (Unignored).
`EVENT_DEALED`: Processed.
`EVENT_IGNORE`: Ignored.
`EVENT_DELETE`: Deleted.
`EVENT_ADD_WHITE`: Allowed. 
     * @return Status Event status:
`EVENT_UNDEAL`: Pending (Unignored).
`EVENT_DEALED`: Processed.
`EVENT_IGNORE`: Ignored.
`EVENT_DELETE`: Deleted.
`EVENT_ADD_WHITE`: Allowed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Event status:
`EVENT_UNDEAL`: Pending (Unignored).
`EVENT_DEALED`: Processed.
`EVENT_IGNORE`: Ignored.
`EVENT_DELETE`: Deleted.
`EVENT_ADD_WHITE`: Allowed.
     * @param Status Event status:
`EVENT_UNDEAL`: Pending (Unignored).
`EVENT_DEALED`: Processed.
`EVENT_IGNORE`: Ignored.
`EVENT_DELETE`: Deleted.
`EVENT_ADD_WHITE`: Allowed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Array of allowed image IDs 
     * @return ImageIDs Array of allowed image IDs
     */
    public String [] getImageIDs() {
        return this.ImageIDs;
    }

    /**
     * Set Array of allowed image IDs
     * @param ImageIDs Array of allowed image IDs
     */
    public void setImageIDs(String [] ImageIDs) {
        this.ImageIDs = ImageIDs;
    }

    /**
     * Get Allowed event type
   `ESCAPE_CGROUPS`: Cgroup escape.
   `ESCAPE_TAMPER_SENSITIVE_FILE`: File tamper escape.
   `ESCAPE_DOCKER_API`: Docker API access escape.
   `ESCAPE_VUL_OCCURRED`: Vulnerability exploit.
   `MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `PRIVILEGE_CONTAINER_START`: Privileged container.
   `PRIVILEGE`: Program privilege escalation escape. 
     * @return EventType Allowed event type
   `ESCAPE_CGROUPS`: Cgroup escape.
   `ESCAPE_TAMPER_SENSITIVE_FILE`: File tamper escape.
   `ESCAPE_DOCKER_API`: Docker API access escape.
   `ESCAPE_VUL_OCCURRED`: Vulnerability exploit.
   `MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `PRIVILEGE_CONTAINER_START`: Privileged container.
   `PRIVILEGE`: Program privilege escalation escape.
     */
    public String [] getEventType() {
        return this.EventType;
    }

    /**
     * Set Allowed event type
   `ESCAPE_CGROUPS`: Cgroup escape.
   `ESCAPE_TAMPER_SENSITIVE_FILE`: File tamper escape.
   `ESCAPE_DOCKER_API`: Docker API access escape.
   `ESCAPE_VUL_OCCURRED`: Vulnerability exploit.
   `MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `PRIVILEGE_CONTAINER_START`: Privileged container.
   `PRIVILEGE`: Program privilege escalation escape.
     * @param EventType Allowed event type
   `ESCAPE_CGROUPS`: Cgroup escape.
   `ESCAPE_TAMPER_SENSITIVE_FILE`: File tamper escape.
   `ESCAPE_DOCKER_API`: Docker API access escape.
   `ESCAPE_VUL_OCCURRED`: Vulnerability exploit.
   `MOUNT_SENSITIVE_PTAH`: Sensitive path mount.
   `PRIVILEGE_CONTAINER_START`: Privileged container.
   `PRIVILEGE`: Program privilege escalation escape.
     */
    public void setEventType(String [] EventType) {
        this.EventType = EventType;
    }

    public ModifyEscapeEventStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEscapeEventStatusRequest(ModifyEscapeEventStatusRequest source) {
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
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
        if (source.EventType != null) {
            this.EventType = new String[source.EventType.length];
            for (int i = 0; i < source.EventType.length; i++) {
                this.EventType[i] = new String(source.EventType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIdSet.", this.EventIdSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);
        this.setParamArraySimple(map, prefix + "EventType.", this.EventType);

    }
}

