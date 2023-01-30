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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddEscapeWhiteListRequest extends AbstractModel{

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
    * Array of allowed image IDs
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

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

    public AddEscapeWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEscapeWhiteListRequest(AddEscapeWhiteListRequest source) {
        if (source.EventType != null) {
            this.EventType = new String[source.EventType.length];
            for (int i = 0; i < source.EventType.length; i++) {
                this.EventType[i] = new String(source.EventType[i]);
            }
        }
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventType.", this.EventType);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);

    }
}

