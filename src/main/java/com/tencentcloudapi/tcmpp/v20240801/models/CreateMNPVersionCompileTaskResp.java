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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMNPVersionCompileTaskResp extends AbstractModel {

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * WS address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WSUrl")
    @Expose
    private String WSUrl;

    /**
    * Room ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get WS address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WSUrl WS address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWSUrl() {
        return this.WSUrl;
    }

    /**
     * Set WS address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WSUrl WS address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWSUrl(String WSUrl) {
        this.WSUrl = WSUrl;
    }

    /**
     * Get Room ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoomId Room ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoomId Room ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public CreateMNPVersionCompileTaskResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMNPVersionCompileTaskResp(CreateMNPVersionCompileTaskResp source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.WSUrl != null) {
            this.WSUrl = new String(source.WSUrl);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "WSUrl", this.WSUrl);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

